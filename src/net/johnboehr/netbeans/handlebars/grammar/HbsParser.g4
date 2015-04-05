/**
 * Copyright (c) 2012-2013 Edgar Espina
 *
 * This file is part of Handlebars.java.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

parser grammar HbsParser;

options {
  tokenVocab=HbsLexer;
}

@members {
  void setStart(String start) {
  }

  void setEnd(String end) {
  }

  private String join(List<Token> tokens) {
    StringBuilder text = new StringBuilder();
    for(Token token: tokens) {
      text.append(token.getText());
    }
    return text.toString();
  }
}

template
  : body EOF
  ;

body
  : statement*
  ;

statement
  :
    spaces
  | newline
  | text
  | block
  | var
  | tvar
  | ampvar
  | unless
  | partial
  | escape
  | comment
  | delimiters
  ;

escape
  :
    ESC_VAR
  ;

text
  : TEXT
  ;

spaces
  : SPACE
  ;

newline
  : NL
  ;

block
  :
    START_BLOCK sexpr END
    thenBody=body
    elseBlock?
    END_BLOCK nameEnd=QID END
  ;

sexpr
  :
    QID param* hash*
  ;

elseBlock
  :
    (inverseToken=UNLESS | START inverseToken=ELSE) END unlessBody=body
  ;

unless
  :
    UNLESS nameStart=QID END
    body
    END_BLOCK nameEnd=QID END
  ;

tvar
  :
   START_T sexpr END_T
  ;

ampvar
  :
   START_AMP sexpr END
  ;

var
  :
   START sexpr END
  ;

delimiters
  :
    START_DELIM
    WS_DELIM*
    startDelim+=DELIM+
      {setStart(join($startDelim));}
    WS_DELIM+
    endDelim+=DELIM+
    WS_DELIM*
    END_DELIM
    {setEnd(join($endDelim));}
  ;

partial
  :
    START_PARTIAL PATH QID? END
  ;

param
  :
    DOUBLE_STRING #stringParam
  | SINGLE_STRING #charParam
  | INT           #intParam
  | BOOLEAN       #boolParam
  | QID           #refPram
  | LP sexpr RP   #subexpression
  | param WS      #wsfix1
  | WS param      #wsfix2
  ;

hash
  :
    QID EQ hashValue
  | hash WS
  | WS hash
  ;

hashValue
  :
    DOUBLE_STRING #stringHash
  | SINGLE_STRING #charHash
  | INT           #intHash
  | BOOLEAN       #boolHash
  | QID           #refHash
  ;

comment
  : COMMENT;