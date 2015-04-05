// Generated from C:\Users\Rin\Documents\GitHub\NetbeansHandlebars\src\net\johnboehr\netbeans\handlebars\grammar\HbsLexer.g4 by ANTLR 4.3
package net.johnboehr.netbeans.handlebars.grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HbsLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ESC_VAR=1, TEXT=2, COMMENT=3, START_AMP=4, START_T=5, UNLESS=6, START_BLOCK=7, 
		START_DELIM=8, START_PARTIAL=9, END_BLOCK=10, START=11, SPACE=12, NL=13, 
		ERR_CHAR=14, END_DELIM=15, WS_DELIM=16, DELIM=17, PATH=18, WS_PATH=19, 
		END_T=20, END=21, DOUBLE_STRING=22, SINGLE_STRING=23, EQ=24, INT=25, BOOLEAN=26, 
		ELSE=27, QID=28, LP=29, RP=30, WS=31;
	public static final int SET_DELIMS = 1;
	public static final int PARTIAL = 2;
	public static final int VAR = 3;
	public static String[] modeNames = {
		"DEFAULT_MODE", "SET_DELIMS", "PARTIAL", "VAR"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'"
	};
	public static final String[] ruleNames = {
		"ESC_VAR", "TEXT", "COMMENT", "START_AMP", "START_T", "UNLESS", "START_BLOCK", 
		"START_DELIM", "START_PARTIAL", "END_BLOCK", "START", "SPACE", "NL", "ERR_CHAR", 
		"END_DELIM", "WS_DELIM", "DELIM", "PATH", "PATH_SEGMENT", "WS_PATH", "END_T", 
		"END", "DOUBLE_STRING", "SINGLE_STRING", "EQ", "INT", "BOOLEAN", "ELSE", 
		"QID", "ID_SEPARATOR", "ID", "ID_START", "ID_SUFFIX", "ID_ESCAPE", "ID_PART", 
		"LP", "RP", "WS"
	};



	  // Some default values
	  String start = "{{";

	  String end = "}}";

	  boolean whiteSpaceControl;

	  public HbsLexer(CharStream input, String start, String end) {
	    this(input);
	    this.start = start;
	    this.end = end;
	  }

	  private boolean isWhite(int ch) {
	    return ch == ' ' || ch == '\t' || ch == '\r' || ch == '\n';
	  }

	  private boolean consumeUntil(final String token) {
	    int offset = 0;
	    while(!isEOF(offset) && !ahead(token, offset) &&
	      !isWhite(_input.LA(offset + 1))) {
	      offset+=1;
	    }
	    if (offset == 0) {
	      return false;
	    }
	    // Since we found the text, increase the CharStream's index.
	    _input.seek(_input.index() + offset - 1);
	    getInterpreter().setCharPositionInLine(_tokenStartCharPositionInLine + offset - 1);
	    return true;
	  }

	  private boolean comment(final String start, final String end) {
	    String commentClose;
	    if (ahead(start + "!--")) {
	      commentClose = "--" + end;
	    } else if (ahead(start + "!")) {
	      commentClose = end;
	    } else {
	      return false;
	    }

	    int offset = 0;
	    int found = 0;
	    while (!isEOF(offset)) {
	      if (ahead(commentClose, offset)) {
	        found = 1;
	        break;
	      }
	      offset += 1;
	    }
	    if( found == 1 ) {
	        offset += commentClose.length();
	    }
	    // Since we found the text, increase the CharStream's index.
	    _input.seek(_input.index() + offset - 1);
	    getInterpreter().setCharPositionInLine(_tokenStartCharPositionInLine + offset - 1);
	    return true;
	  }

	  private boolean varEscape(final String start, final String end) {
	    if (ahead("\\" + start)) {
	      int offset = start.length();
	      int found = 0;
	      while (!isEOF(offset)) {
	        if (ahead(end, offset)) {
	          found = 1;
	          break;
	        }
	        if (ahead(start, offset)) {
	          return false;
	        }
	        offset += 1;
	      }
	      if( found == 1 ) {
	        offset += end.length();
	      }
	      // Since we found the text, increase the CharStream's index.
	      _input.seek(_input.index() + offset - 1);
	      getInterpreter().setCharPositionInLine(_tokenStartCharPositionInLine + offset - 1);
	      return true;
	    }
	    return false;
	  }

	  private boolean startToken(final String delim) {
	    boolean matches = tryToken(delim + "~");
	    if (matches) {
	      whiteSpaceControl = true;
	    }
	    return matches || tryToken(delim);
	  }

	  private boolean startToken(final String delim, String subtype) {
	    boolean matches = tryToken(delim + subtype);
	    if (!matches) {
	      matches = tryToken(delim + "~" + subtype);
	      if (matches) {
	        whiteSpaceControl = true;
	      }
	    }
	    return matches;
	  }

	  private boolean endToken(final String delim) {
	    return endToken(delim, "");
	  }

	  private boolean endToken(final String delim, String subtype) {
	    boolean matches = tryToken(subtype + delim);
	    if (!matches) {
	      matches = tryToken(subtype + "~" + delim);
	      if (matches) {
	        whiteSpaceControl = true;
	      }
	    }
	    return matches;
	  }

	  private boolean tryToken(final String text) {
	    if (ahead(text)) {
	      // Since we found the text, increase the CharStream's index.
	      _input.seek(_input.index() + text.length() - 1);
	      getInterpreter().setCharPositionInLine(_tokenStartCharPositionInLine + text.length() - 1);
	      return true;
	    }
	    return false;
	  }

	  private boolean isEOF(final int offset) {
	    return _input.LA(offset + 1) == EOF;
	  }

	  private boolean ahead(final String text) {
	    return ahead(text, 0);
	  }

	  private boolean ahead(final String text, int offset) {

	    // See if `text` is ahead in the CharStream.
	    for (int i = 0; i < text.length(); i++) {
	      int ch = _input.LA(i + offset + 1);
	      if (ch != text.charAt(i)) {
	        // Nope, we didn't find `text`.
	        return false;
	      }
	    }

	    return true;
	  }


	public HbsLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "HbsLexer.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0: return ESC_VAR_sempred((RuleContext)_localctx, predIndex);

		case 1: return TEXT_sempred((RuleContext)_localctx, predIndex);

		case 2: return COMMENT_sempred((RuleContext)_localctx, predIndex);

		case 3: return START_AMP_sempred((RuleContext)_localctx, predIndex);

		case 4: return START_T_sempred((RuleContext)_localctx, predIndex);

		case 5: return UNLESS_sempred((RuleContext)_localctx, predIndex);

		case 6: return START_BLOCK_sempred((RuleContext)_localctx, predIndex);

		case 7: return START_DELIM_sempred((RuleContext)_localctx, predIndex);

		case 8: return START_PARTIAL_sempred((RuleContext)_localctx, predIndex);

		case 9: return END_BLOCK_sempred((RuleContext)_localctx, predIndex);

		case 10: return START_sempred((RuleContext)_localctx, predIndex);

		case 14: return END_DELIM_sempred((RuleContext)_localctx, predIndex);

		case 20: return END_T_sempred((RuleContext)_localctx, predIndex);

		case 21: return END_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean END_T_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12: return endToken(end, "}");
		}
		return true;
	}
	private boolean START_T_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4: return startToken(start, "{");
		}
		return true;
	}
	private boolean START_AMP_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3: return startToken(start, "&");
		}
		return true;
	}
	private boolean UNLESS_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5: return startToken(start, "^");
		}
		return true;
	}
	private boolean TEXT_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return consumeUntil(start);
		}
		return true;
	}
	private boolean START_PARTIAL_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8: return startToken(start, ">");
		}
		return true;
	}
	private boolean COMMENT_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return comment(start, end);
		}
		return true;
	}
	private boolean ESC_VAR_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return varEscape(start, end);
		}
		return true;
	}
	private boolean START_DELIM_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7: return startToken(start, "=");
		}
		return true;
	}
	private boolean START_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10: return startToken(start);
		}
		return true;
	}
	private boolean END_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13: return endToken(end);
		}
		return true;
	}
	private boolean END_DELIM_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11: return endToken("=" + end);
		}
		return true;
	}
	private boolean START_BLOCK_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6: return startToken(start, "#");
		}
		return true;
	}
	private boolean END_BLOCK_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9: return startToken(start, "/");
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2!\u0129\b\1\b\1\b"+
		"\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t"+
		"\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21"+
		"\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30"+
		"\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37"+
		"\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\6\r\u0085\n\r\r"+
		"\r\16\r\u0086\3\16\5\16\u008a\n\16\3\16\3\16\5\16\u008e\n\16\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\5\23\u00a0\n\23\3\23\3\23\3\24\6\24\u00a5\n\24\r\24\16\24\u00a6\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\7\30\u00bb\n\30\f\30\16\30\u00be\13\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\7\31\u00c6\n\31\f\31\16\31\u00c9\13\31\3\31\3\31\3\32"+
		"\3\32\3\33\5\33\u00d0\n\33\3\33\6\33\u00d3\n\33\r\33\16\33\u00d4\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u00e0\n\34\3\35\5\35\u00e3"+
		"\n\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u00eb\n\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\5\36\u0104\n\36\3\37\3\37\3 \3 \7 \u010a\n "+
		"\f \16 \u010d\13 \3!\3!\3\"\3\"\3\"\3\"\5\"\u0115\n\"\3#\3#\3#\6#\u011a"+
		"\n#\r#\16#\u011b\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\3\'\5\u00bc\u00c7"+
		"\u011b\2(\6\3\b\4\n\5\f\6\16\7\20\b\22\t\24\n\26\13\30\f\32\r\34\16\36"+
		"\17 \20\"\21$\22&\23(\24*\2,\25.\26\60\27\62\30\64\31\66\328\33:\34<\35"+
		">\36@\2B\2D\2F\2H\2J\2L\37N P!\6\2\3\4\5\n\4\2\13\13\"\"\5\2\13\f\17\17"+
		"\"\"\b\2&&))/<C\\aac|\3\2\f\f\3\2\62;\6\2&&B\\aac|\4\2\f\f\17\17\3\2\60"+
		";\u0137\2\6\3\2\2\2\2\b\3\2\2\2\2\n\3\2\2\2\2\f\3\2\2\2\2\16\3\2\2\2\2"+
		"\20\3\2\2\2\2\22\3\2\2\2\2\24\3\2\2\2\2\26\3\2\2\2\2\30\3\2\2\2\2\32\3"+
		"\2\2\2\2\34\3\2\2\2\2\36\3\2\2\2\2 \3\2\2\2\3\"\3\2\2\2\3$\3\2\2\2\3&"+
		"\3\2\2\2\4(\3\2\2\2\4,\3\2\2\2\5.\3\2\2\2\5\60\3\2\2\2\5\62\3\2\2\2\5"+
		"\64\3\2\2\2\5\66\3\2\2\2\58\3\2\2\2\5:\3\2\2\2\5<\3\2\2\2\5>\3\2\2\2\5"+
		"L\3\2\2\2\5N\3\2\2\2\5P\3\2\2\2\6R\3\2\2\2\bU\3\2\2\2\nX\3\2\2\2\f[\3"+
		"\2\2\2\16`\3\2\2\2\20e\3\2\2\2\22j\3\2\2\2\24o\3\2\2\2\26t\3\2\2\2\30"+
		"y\3\2\2\2\32~\3\2\2\2\34\u0084\3\2\2\2\36\u008d\3\2\2\2 \u008f\3\2\2\2"+
		"\"\u0091\3\2\2\2$\u0096\3\2\2\2&\u0098\3\2\2\2(\u009f\3\2\2\2*\u00a4\3"+
		"\2\2\2,\u00a8\3\2\2\2.\u00ac\3\2\2\2\60\u00b1\3\2\2\2\62\u00b6\3\2\2\2"+
		"\64\u00c1\3\2\2\2\66\u00cc\3\2\2\28\u00cf\3\2\2\2:\u00df\3\2\2\2<\u00e2"+
		"\3\2\2\2>\u0103\3\2\2\2@\u0105\3\2\2\2B\u0107\3\2\2\2D\u010e\3\2\2\2F"+
		"\u0114\3\2\2\2H\u0116\3\2\2\2J\u011f\3\2\2\2L\u0121\3\2\2\2N\u0123\3\2"+
		"\2\2P\u0125\3\2\2\2RS\6\2\2\2ST\13\2\2\2T\7\3\2\2\2UV\6\3\3\2VW\13\2\2"+
		"\2W\t\3\2\2\2XY\6\4\4\2YZ\13\2\2\2Z\13\3\2\2\2[\\\6\5\5\2\\]\13\2\2\2"+
		"]^\3\2\2\2^_\b\5\2\2_\r\3\2\2\2`a\6\6\6\2ab\13\2\2\2bc\3\2\2\2cd\b\6\2"+
		"\2d\17\3\2\2\2ef\6\7\7\2fg\13\2\2\2gh\3\2\2\2hi\b\7\2\2i\21\3\2\2\2jk"+
		"\6\b\b\2kl\13\2\2\2lm\3\2\2\2mn\b\b\2\2n\23\3\2\2\2op\6\t\t\2pq\13\2\2"+
		"\2qr\3\2\2\2rs\b\t\3\2s\25\3\2\2\2tu\6\n\n\2uv\13\2\2\2vw\3\2\2\2wx\b"+
		"\n\4\2x\27\3\2\2\2yz\6\13\13\2z{\13\2\2\2{|\3\2\2\2|}\b\13\2\2}\31\3\2"+
		"\2\2~\177\6\f\f\2\177\u0080\13\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\b"+
		"\f\2\2\u0082\33\3\2\2\2\u0083\u0085\t\2\2\2\u0084\u0083\3\2\2\2\u0085"+
		"\u0086\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\35\3\2\2"+
		"\2\u0088\u008a\7\17\2\2\u0089\u0088\3\2\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b\u008e\7\f\2\2\u008c\u008e\7\17\2\2\u008d\u0089\3"+
		"\2\2\2\u008d\u008c\3\2\2\2\u008e\37\3\2\2\2\u008f\u0090\13\2\2\2\u0090"+
		"!\3\2\2\2\u0091\u0092\6\20\r\2\u0092\u0093\13\2\2\2\u0093\u0094\3\2\2"+
		"\2\u0094\u0095\b\20\5\2\u0095#\3\2\2\2\u0096\u0097\t\3\2\2\u0097%\3\2"+
		"\2\2\u0098\u0099\13\2\2\2\u0099\'\3\2\2\2\u009a\u009b\7]\2\2\u009b\u009c"+
		"\5*\24\2\u009c\u009d\7_\2\2\u009d\u00a0\3\2\2\2\u009e\u00a0\5*\24\2\u009f"+
		"\u009a\3\2\2\2\u009f\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\b\23"+
		"\6\2\u00a2)\3\2\2\2\u00a3\u00a5\t\4\2\2\u00a4\u00a3\3\2\2\2\u00a5\u00a6"+
		"\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7+\3\2\2\2\u00a8"+
		"\u00a9\t\3\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\b\25\7\2\u00ab-\3\2\2\2"+
		"\u00ac\u00ad\6\26\16\2\u00ad\u00ae\13\2\2\2\u00ae\u00af\3\2\2\2\u00af"+
		"\u00b0\b\26\5\2\u00b0/\3\2\2\2\u00b1\u00b2\6\27\17\2\u00b2\u00b3\13\2"+
		"\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\b\27\b\2\u00b5\61\3\2\2\2\u00b6\u00bc"+
		"\7$\2\2\u00b7\u00b8\7^\2\2\u00b8\u00bb\7$\2\2\u00b9\u00bb\n\5\2\2\u00ba"+
		"\u00b7\3\2\2\2\u00ba\u00b9\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00bd\3\2"+
		"\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00bf\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf"+
		"\u00c0\7$\2\2\u00c0\63\3\2\2\2\u00c1\u00c7\7)\2\2\u00c2\u00c3\7^\2\2\u00c3"+
		"\u00c6\7)\2\2\u00c4\u00c6\n\5\2\2\u00c5\u00c2\3\2\2\2\u00c5\u00c4\3\2"+
		"\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8"+
		"\u00ca\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cb\7)\2\2\u00cb\65\3\2\2\2"+
		"\u00cc\u00cd\7?\2\2\u00cd\67\3\2\2\2\u00ce\u00d0\7/\2\2\u00cf\u00ce\3"+
		"\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00d3\t\6\2\2\u00d2"+
		"\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2"+
		"\2\2\u00d59\3\2\2\2\u00d6\u00d7\7v\2\2\u00d7\u00d8\7t\2\2\u00d8\u00d9"+
		"\7w\2\2\u00d9\u00e0\7g\2\2\u00da\u00db\7h\2\2\u00db\u00dc\7c\2\2\u00dc"+
		"\u00dd\7n\2\2\u00dd\u00de\7u\2\2\u00de\u00e0\7g\2\2\u00df\u00d6\3\2\2"+
		"\2\u00df\u00da\3\2\2\2\u00e0;\3\2\2\2\u00e1\u00e3\7\u0080\2\2\u00e2\u00e1"+
		"\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\7g\2\2\u00e5"+
		"\u00e6\7n\2\2\u00e6\u00e7\7u\2\2\u00e7\u00e8\7g\2\2\u00e8\u00ea\3\2\2"+
		"\2\u00e9\u00eb\7\u0080\2\2\u00ea\u00e9\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb"+
		"=\3\2\2\2\u00ec\u00ed\7\60\2\2\u00ed\u00ee\7\60\2\2\u00ee\u00ef\7\61\2"+
		"\2\u00ef\u00f0\3\2\2\2\u00f0\u0104\5>\36\2\u00f1\u00f2\7\60\2\2\u00f2"+
		"\u0104\7\60\2\2\u00f3\u0104\7\60\2\2\u00f4\u00f5\7]\2\2\u00f5\u00f6\5"+
		"B \2\u00f6\u00f7\7_\2\2\u00f7\u00f8\5@\37\2\u00f8\u00f9\5>\36\2\u00f9"+
		"\u0104\3\2\2\2\u00fa\u00fb\7]\2\2\u00fb\u00fc\5B \2\u00fc\u00fd\7_\2\2"+
		"\u00fd\u0104\3\2\2\2\u00fe\u00ff\5B \2\u00ff\u0100\5@\37\2\u0100\u0101"+
		"\5>\36\2\u0101\u0104\3\2\2\2\u0102\u0104\5B \2\u0103\u00ec\3\2\2\2\u0103"+
		"\u00f1\3\2\2\2\u0103\u00f3\3\2\2\2\u0103\u00f4\3\2\2\2\u0103\u00fa\3\2"+
		"\2\2\u0103\u00fe\3\2\2\2\u0103\u0102\3\2\2\2\u0104?\3\2\2\2\u0105\u0106"+
		"\4/\61\2\u0106A\3\2\2\2\u0107\u010b\5D!\2\u0108\u010a\5F\"\2\u0109\u0108"+
		"\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c"+
		"C\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u010f\t\7\2\2\u010fE\3\2\2\2\u0110"+
		"\u0115\5H#\2\u0111\u0115\5D!\2\u0112\u0115\5J$\2\u0113\u0115\7/\2\2\u0114"+
		"\u0110\3\2\2\2\u0114\u0111\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0113\3\2"+
		"\2\2\u0115G\3\2\2\2\u0116\u0117\7\60\2\2\u0117\u0119\7]\2\2\u0118\u011a"+
		"\n\b\2\2\u0119\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\3\2\2\2\u011b"+
		"\u0119\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011e\7_\2\2\u011eI\3\2\2\2\u011f"+
		"\u0120\t\t\2\2\u0120K\3\2\2\2\u0121\u0122\7*\2\2\u0122M\3\2\2\2\u0123"+
		"\u0124\7+\2\2\u0124O\3\2\2\2\u0125\u0126\t\3\2\2\u0126\u0127\3\2\2\2\u0127"+
		"\u0128\b\'\7\2\u0128Q\3\2\2\2\30\2\3\4\5\u0086\u0089\u008d\u009f\u00a6"+
		"\u00ba\u00bc\u00c5\u00c7\u00cf\u00d4\u00df\u00e2\u00ea\u0103\u010b\u0114"+
		"\u011b\t\7\5\2\7\3\2\7\4\2\6\2\2\4\5\2\b\2\2\4\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}