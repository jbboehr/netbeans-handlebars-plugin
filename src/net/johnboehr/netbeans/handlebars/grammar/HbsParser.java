// Generated from C:\Users\Rin\Documents\GitHub\NetbeansHandlebars\src\net\johnboehr\netbeans\handlebars\grammar\HbsParser.g4 by ANTLR 4.3
package net.johnboehr.netbeans.handlebars.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HbsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PATH=18, LP=29, UNLESS=6, TEXT=2, WS_DELIM=16, START_PARTIAL=9, COMMENT=3, 
		INT=25, SPACE=12, ESC_VAR=1, DELIM=17, START_DELIM=8, ELSE=27, WS=31, 
		START_BLOCK=7, END_T=20, START_T=5, SINGLE_STRING=23, START_AMP=4, ERR_CHAR=14, 
		DOUBLE_STRING=22, WS_PATH=19, EQ=24, QID=28, BOOLEAN=26, START=11, END=21, 
		END_DELIM=15, END_BLOCK=10, NL=13, RP=30;
	public static final String[] tokenNames = {
		"<INVALID>", "ESC_VAR", "TEXT", "COMMENT", "START_AMP", "START_T", "UNLESS", 
		"START_BLOCK", "START_DELIM", "START_PARTIAL", "END_BLOCK", "START", "SPACE", 
		"NL", "ERR_CHAR", "END_DELIM", "WS_DELIM", "DELIM", "PATH", "WS_PATH", 
		"END_T", "END", "DOUBLE_STRING", "SINGLE_STRING", "'='", "INT", "BOOLEAN", 
		"ELSE", "QID", "'('", "')'", "WS"
	};
	public static final int
		RULE_template = 0, RULE_body = 1, RULE_statement = 2, RULE_escape = 3, 
		RULE_text = 4, RULE_spaces = 5, RULE_newline = 6, RULE_block = 7, RULE_sexpr = 8, 
		RULE_elseBlock = 9, RULE_unless = 10, RULE_tvar = 11, RULE_ampvar = 12, 
		RULE_var = 13, RULE_delimiters = 14, RULE_partial = 15, RULE_param = 16, 
		RULE_hash = 17, RULE_hashValue = 18, RULE_comment = 19;
	public static final String[] ruleNames = {
		"template", "body", "statement", "escape", "text", "spaces", "newline", 
		"block", "sexpr", "elseBlock", "unless", "tvar", "ampvar", "var", "delimiters", 
		"partial", "param", "hash", "hashValue", "comment"
	};

	@Override
	public String getGrammarFileName() { return "HbsParser.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


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

	public HbsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class TemplateContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(HbsParser.EOF, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HbsParserListener ) ((HbsParserListener)listener).enterTemplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HbsParserListener ) ((HbsParserListener)listener).exitTemplate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HbsParserVisitor ) return ((HbsParserVisitor<? extends T>)visitor).visitTemplate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateContext template() throws RecognitionException {
		TemplateContext _localctx = new TemplateContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_template);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40); body();
			setState(41); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BodyContext extends ParserRuleContext {
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HbsParserListener ) ((HbsParserListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HbsParserListener ) ((HbsParserListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HbsParserVisitor ) return ((HbsParserVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_body);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(43); statement();
					}
					} 
				}
				setState(48);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public TvarContext tvar() {
			return getRuleContext(TvarContext.class,0);
		}
		public EscapeContext escape() {
			return getRuleContext(EscapeContext.class,0);
		}
		public SpacesContext spaces() {
			return getRuleContext(SpacesContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public AmpvarContext ampvar() {
			return getRuleContext(AmpvarContext.class,0);
		}
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public PartialContext partial() {
			return getRuleContext(PartialContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public DelimitersContext delimiters() {
			return getRuleContext(DelimitersContext.class,0);
		}
		public UnlessContext unless() {
			return getRuleContext(UnlessContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HbsParserListener ) ((HbsParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HbsParserListener ) ((HbsParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HbsParserVisitor ) return ((HbsParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(61);
			switch (_input.LA(1)) {
			case SPACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(49); spaces();
				}
				break;
			case NL:
				enterOuterAlt(_localctx, 2);
				{
				setState(50); newline();
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 3);
				{
				setState(51); text();
				}
				break;
			case START_BLOCK:
				enterOuterAlt(_localctx, 4);
				{
				setState(52); block();
				}
				break;
			case START:
				enterOuterAlt(_localctx, 5);
				{
				setState(53); var();
				}
				break;
			case START_T:
				enterOuterAlt(_localctx, 6);
				{
				setState(54); tvar();
				}
				break;
			case START_AMP:
				enterOuterAlt(_localctx, 7);
				{
				setState(55); ampvar();
				}
				break;
			case UNLESS:
				enterOuterAlt(_localctx, 8);
				{
				setState(56); unless();
				}
				break;
			case START_PARTIAL:
				enterOuterAlt(_localctx, 9);
				{
				setState(57); partial();
				}
				break;
			case ESC_VAR:
				enterOuterAlt(_localctx, 10);
				{
				setState(58); escape();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 11);
				{
				setState(59); comment();
				}
				break;
			case START_DELIM:
				enterOuterAlt(_localctx, 12);
				{
				setState(60); delimiters();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EscapeContext extends ParserRuleContext {
		public TerminalNode ESC_VAR() { return getToken(HbsParser.ESC_VAR, 0); }
		public EscapeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escape; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HbsParserListener ) ((HbsParserListener)listener).enterEscape(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HbsParserListener ) ((HbsParserListener)listener).exitEscape(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HbsParserVisitor ) return ((HbsParserVisitor<? extends T>)visitor).visitEscape(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EscapeContext escape() throws RecognitionException {
		EscapeContext _localctx = new EscapeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_escape);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63); match(ESC_VAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(HbsParser.TEXT, 0); }
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HbsParserListener ) ((HbsParserListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HbsParserListener ) ((HbsParserListener)listener).exitText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HbsParserVisitor ) return ((HbsParserVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_text);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65); match(TEXT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpacesContext extends ParserRuleContext {
		public TerminalNode SPACE() { return getToken(HbsParser.SPACE, 0); }
		public SpacesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spaces; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HbsParserListener ) ((HbsParserListener)listener).enterSpaces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HbsParserListener ) ((HbsParserListener)listener).exitSpaces(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HbsParserVisitor ) return ((HbsParserVisitor<? extends T>)visitor).visitSpaces(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpacesContext spaces() throws RecognitionException {
		SpacesContext _localctx = new SpacesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_spaces);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67); match(SPACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewlineContext extends ParserRuleContext {
		public TerminalNode NL() { return getToken(HbsParser.NL, 0); }
		public NewlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HbsParserListener ) ((HbsParserListener)listener).enterNewline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HbsParserListener ) ((HbsParserListener)listener).exitNewline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HbsParserVisitor ) return ((HbsParserVisitor<? extends T>)visitor).visitNewline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewlineContext newline() throws RecognitionException {
		NewlineContext _localctx = new NewlineContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_newline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69); match(NL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public BodyContext thenBody;
		public Token nameEnd;
		public TerminalNode END(int i) {
			return getToken(HbsParser.END, i);
		}
		public TerminalNode QID() { return getToken(HbsParser.QID, 0); }
		public List<TerminalNode> END() { return getTokens(HbsParser.END); }
		public TerminalNode END_BLOCK() { return getToken(HbsParser.END_BLOCK, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ElseBlockContext elseBlock() {
			return getRuleContext(ElseBlockContext.class,0);
		}
		public TerminalNode START_BLOCK() { return getToken(HbsParser.START_BLOCK, 0); }
		public SexprContext sexpr() {
			return getRuleContext(SexprContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HbsParserListener ) ((HbsParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HbsParserListener ) ((HbsParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HbsParserVisitor ) return ((HbsParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71); match(START_BLOCK);
			setState(72); sexpr();
			setState(73); match(END);
			setState(74); ((BlockContext)_localctx).thenBody = body();
			setState(76);
			_la = _input.LA(1);
			if (_la==UNLESS || _la==START) {
				{
				setState(75); elseBlock();
				}
			}

			setState(78); match(END_BLOCK);
			setState(79); ((BlockContext)_localctx).nameEnd = match(QID);
			setState(80); match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SexprContext extends ParserRuleContext {
		public List<HashContext> hash() {
			return getRuleContexts(HashContext.class);
		}
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public HashContext hash(int i) {
			return getRuleContext(HashContext.class,i);
		}
		public TerminalNode QID() { return getToken(HbsParser.QID, 0); }
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public SexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HbsParserListener ) ((HbsParserListener)listener).enterSexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HbsParserListener ) ((HbsParserListener)listener).exitSexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HbsParserVisitor ) return ((HbsParserVisitor<? extends T>)visitor).visitSexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SexprContext sexpr() throws RecognitionException {
		SexprContext _localctx = new SexprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_sexpr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(82); match(QID);
			setState(86);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(83); param();
					}
					} 
				}
				setState(88);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==QID) {
				{
				{
				setState(89); hash();
				}
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseBlockContext extends ParserRuleContext {
		public Token inverseToken;
		public BodyContext unlessBody;
		public TerminalNode ELSE() { return getToken(HbsParser.ELSE, 0); }
		public TerminalNode END() { return getToken(HbsParser.END, 0); }
		public TerminalNode UNLESS() { return getToken(HbsParser.UNLESS, 0); }
		public TerminalNode START() { return getToken(HbsParser.START, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ElseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HbsParserListener ) ((HbsParserListener)listener).enterElseBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HbsParserListener ) ((HbsParserListener)listener).exitElseBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HbsParserVisitor ) return ((HbsParserVisitor<? extends T>)visitor).visitElseBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseBlockContext elseBlock() throws RecognitionException {
		ElseBlockContext _localctx = new ElseBlockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_elseBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			switch (_input.LA(1)) {
			case UNLESS:
				{
				setState(95); ((ElseBlockContext)_localctx).inverseToken = match(UNLESS);
				}
				break;
			case START:
				{
				setState(96); match(START);
				setState(97); ((ElseBlockContext)_localctx).inverseToken = match(ELSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(100); match(END);
			setState(101); ((ElseBlockContext)_localctx).unlessBody = body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnlessContext extends ParserRuleContext {
		public Token nameStart;
		public Token nameEnd;
		public TerminalNode END(int i) {
			return getToken(HbsParser.END, i);
		}
		public List<TerminalNode> QID() { return getTokens(HbsParser.QID); }
		public TerminalNode UNLESS() { return getToken(HbsParser.UNLESS, 0); }
		public List<TerminalNode> END() { return getTokens(HbsParser.END); }
		public TerminalNode END_BLOCK() { return getToken(HbsParser.END_BLOCK, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode QID(int i) {
			return getToken(HbsParser.QID, i);
		}
		public UnlessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unless; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HbsParserListener ) ((HbsParserListener)listener).enterUnless(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HbsParserListener ) ((HbsParserListener)listener).exitUnless(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HbsParserVisitor ) return ((HbsParserVisitor<? extends T>)visitor).visitUnless(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnlessContext unless() throws RecognitionException {
		UnlessContext _localctx = new UnlessContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_unless);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103); match(UNLESS);
			setState(104); ((UnlessContext)_localctx).nameStart = match(QID);
			setState(105); match(END);
			setState(106); body();
			setState(107); match(END_BLOCK);
			setState(108); ((UnlessContext)_localctx).nameEnd = match(QID);
			setState(109); match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TvarContext extends ParserRuleContext {
		public TerminalNode END_T() { return getToken(HbsParser.END_T, 0); }
		public TerminalNode START_T() { return getToken(HbsParser.START_T, 0); }
		public SexprContext sexpr() {
			return getRuleContext(SexprContext.class,0);
		}
		public TvarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tvar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HbsParserListener ) ((HbsParserListener)listener).enterTvar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HbsParserListener ) ((HbsParserListener)listener).exitTvar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HbsParserVisitor ) return ((HbsParserVisitor<? extends T>)visitor).visitTvar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TvarContext tvar() throws RecognitionException {
		TvarContext _localctx = new TvarContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_tvar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111); match(START_T);
			setState(112); sexpr();
			setState(113); match(END_T);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AmpvarContext extends ParserRuleContext {
		public TerminalNode START_AMP() { return getToken(HbsParser.START_AMP, 0); }
		public TerminalNode END() { return getToken(HbsParser.END, 0); }
		public SexprContext sexpr() {
			return getRuleContext(SexprContext.class,0);
		}
		public AmpvarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ampvar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HbsParserListener ) ((HbsParserListener)listener).enterAmpvar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HbsParserListener ) ((HbsParserListener)listener).exitAmpvar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HbsParserVisitor ) return ((HbsParserVisitor<? extends T>)visitor).visitAmpvar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AmpvarContext ampvar() throws RecognitionException {
		AmpvarContext _localctx = new AmpvarContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ampvar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115); match(START_AMP);
			setState(116); sexpr();
			setState(117); match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarContext extends ParserRuleContext {
		public TerminalNode END() { return getToken(HbsParser.END, 0); }
		public TerminalNode START() { return getToken(HbsParser.START, 0); }
		public SexprContext sexpr() {
			return getRuleContext(SexprContext.class,0);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HbsParserListener ) ((HbsParserListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HbsParserListener ) ((HbsParserListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HbsParserVisitor ) return ((HbsParserVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119); match(START);
			setState(120); sexpr();
			setState(121); match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DelimitersContext extends ParserRuleContext {
		public Token DELIM;
		public List<Token> startDelim = new ArrayList<Token>();
		public List<Token> endDelim = new ArrayList<Token>();
		public TerminalNode START_DELIM() { return getToken(HbsParser.START_DELIM, 0); }
		public List<TerminalNode> WS_DELIM() { return getTokens(HbsParser.WS_DELIM); }
		public List<TerminalNode> DELIM() { return getTokens(HbsParser.DELIM); }
		public TerminalNode DELIM(int i) {
			return getToken(HbsParser.DELIM, i);
		}
		public TerminalNode END_DELIM() { return getToken(HbsParser.END_DELIM, 0); }
		public TerminalNode WS_DELIM(int i) {
			return getToken(HbsParser.WS_DELIM, i);
		}
		public DelimitersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delimiters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HbsParserListener ) ((HbsParserListener)listener).enterDelimiters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HbsParserListener ) ((HbsParserListener)listener).exitDelimiters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HbsParserVisitor ) return ((HbsParserVisitor<? extends T>)visitor).visitDelimiters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DelimitersContext delimiters() throws RecognitionException {
		DelimitersContext _localctx = new DelimitersContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_delimiters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123); match(START_DELIM);
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS_DELIM) {
				{
				{
				setState(124); match(WS_DELIM);
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(131); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(130); ((DelimitersContext)_localctx).DELIM = match(DELIM);
				((DelimitersContext)_localctx).startDelim.add(((DelimitersContext)_localctx).DELIM);
				}
				}
				setState(133); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DELIM );
			setStart(join(((DelimitersContext)_localctx).startDelim));
			setState(137); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(136); match(WS_DELIM);
				}
				}
				setState(139); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WS_DELIM );
			setState(142); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(141); ((DelimitersContext)_localctx).DELIM = match(DELIM);
				((DelimitersContext)_localctx).endDelim.add(((DelimitersContext)_localctx).DELIM);
				}
				}
				setState(144); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DELIM );
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS_DELIM) {
				{
				{
				setState(146); match(WS_DELIM);
				}
				}
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(152); match(END_DELIM);
			setEnd(join(((DelimitersContext)_localctx).endDelim));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartialContext extends ParserRuleContext {
		public TerminalNode PATH() { return getToken(HbsParser.PATH, 0); }
		public TerminalNode START_PARTIAL() { return getToken(HbsParser.START_PARTIAL, 0); }
		public TerminalNode QID() { return getToken(HbsParser.QID, 0); }
		public TerminalNode END() { return getToken(HbsParser.END, 0); }
		public PartialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partial; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HbsParserListener ) ((HbsParserListener)listener).enterPartial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HbsParserListener ) ((HbsParserListener)listener).exitPartial(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HbsParserVisitor ) return ((HbsParserVisitor<? extends T>)visitor).visitPartial(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartialContext partial() throws RecognitionException {
		PartialContext _localctx = new PartialContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_partial);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155); match(START_PARTIAL);
			setState(156); match(PATH);
			setState(158);
			_la = _input.LA(1);
			if (_la==QID) {
				{
				setState(157); match(QID);
				}
			}

			setState(160); match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamContext extends ParserRuleContext {
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
	 
		public ParamContext() { }
		public void copyFrom(ParamContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StringParamContext extends ParamContext {
		public TerminalNode DOUBLE_STRING() { return getToken(HbsParser.DOUBLE_STRING, 0); }
		public StringParamContext(ParamContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HbsParserListener ) ((HbsParserListener)listener).enterStringParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HbsParserListener ) ((HbsParserListener)listener).exitStringParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HbsParserVisitor ) return ((HbsParserVisitor<? extends T>)visitor).visitStringParam(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RefPramContext extends ParamContext {
		public TerminalNode QID() { return getToken(HbsParser.QID, 0); }
		public RefPramContext(ParamContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HbsParserListener ) ((HbsParserListener)listener).enterRefPram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HbsParserListener ) ((HbsParserListener)listener).exitRefPram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HbsParserVisitor ) return ((HbsParserVisitor<? extends T>)visitor).visitRefPram(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolParamContext extends ParamContext {
		public TerminalNode BOOLEAN() { return getToken(HbsParser.BOOLEAN, 0); }
		public BoolParamContext(ParamContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HbsParserListener ) ((HbsParserListener)listener).enterBoolParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HbsParserListener ) ((HbsParserListener)listener).exitBoolParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HbsParserVisitor ) return ((HbsParserVisitor<? extends T>)visitor).visitBoolParam(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharParamContext extends ParamContext {
		public TerminalNode SINGLE_STRING() { return getToken(HbsParser.SINGLE_STRING, 0); }
		public CharParamContext(ParamContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HbsParserListener ) ((HbsParserListener)listener).enterCharParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HbsParserListener ) ((HbsParserListener)listener).exitCharParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HbsParserVisitor ) return ((HbsParserVisitor<? extends T>)visitor).visitCharParam(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubexpressionContext extends ParamContext {
		public TerminalNode RP() { return getToken(HbsParser.RP, 0); }
		public TerminalNode LP() { return getToken(HbsParser.LP, 0); }
		public SexprContext sexpr() {
			return getRuleContext(SexprContext.class,0);
		}
		public SubexpressionContext(ParamContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HbsParserListener ) ((HbsParserListener)listener).enterSubexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HbsParserListener ) ((HbsParserListener)listener).exitSubexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HbsParserVisitor ) return ((HbsParserVisitor<? extends T>)visitor).visitSubexpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntParamContext extends ParamContext {
		public TerminalNode INT() { return getToken(HbsParser.INT, 0); }
		public IntParamContext(ParamContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HbsParserListener ) ((HbsParserListener)listener).enterIntParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HbsParserListener ) ((HbsParserListener)listener).exitIntParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HbsParserVisitor ) return ((HbsParserVisitor<? extends T>)visitor).visitIntParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_param);
		try {
			setState(171);
			switch (_input.LA(1)) {
			case DOUBLE_STRING:
				_localctx = new StringParamContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(162); match(DOUBLE_STRING);
				}
				break;
			case SINGLE_STRING:
				_localctx = new CharParamContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(163); match(SINGLE_STRING);
				}
				break;
			case INT:
				_localctx = new IntParamContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(164); match(INT);
				}
				break;
			case BOOLEAN:
				_localctx = new BoolParamContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(165); match(BOOLEAN);
				}
				break;
			case QID:
				_localctx = new RefPramContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(166); match(QID);
				}
				break;
			case LP:
				_localctx = new SubexpressionContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(167); match(LP);
				setState(168); sexpr();
				setState(169); match(RP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HashContext extends ParserRuleContext {
		public HashValueContext hashValue() {
			return getRuleContext(HashValueContext.class,0);
		}
		public TerminalNode QID() { return getToken(HbsParser.QID, 0); }
		public TerminalNode EQ() { return getToken(HbsParser.EQ, 0); }
		public HashContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hash; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HbsParserListener ) ((HbsParserListener)listener).enterHash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HbsParserListener ) ((HbsParserListener)listener).exitHash(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HbsParserVisitor ) return ((HbsParserVisitor<? extends T>)visitor).visitHash(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HashContext hash() throws RecognitionException {
		HashContext _localctx = new HashContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_hash);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173); match(QID);
			setState(174); match(EQ);
			setState(175); hashValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HashValueContext extends ParserRuleContext {
		public HashValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hashValue; }
	 
		public HashValueContext() { }
		public void copyFrom(HashValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntHashContext extends HashValueContext {
		public TerminalNode INT() { return getToken(HbsParser.INT, 0); }
		public IntHashContext(HashValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HbsParserListener ) ((HbsParserListener)listener).enterIntHash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HbsParserListener ) ((HbsParserListener)listener).exitIntHash(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HbsParserVisitor ) return ((HbsParserVisitor<? extends T>)visitor).visitIntHash(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringHashContext extends HashValueContext {
		public TerminalNode DOUBLE_STRING() { return getToken(HbsParser.DOUBLE_STRING, 0); }
		public StringHashContext(HashValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HbsParserListener ) ((HbsParserListener)listener).enterStringHash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HbsParserListener ) ((HbsParserListener)listener).exitStringHash(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HbsParserVisitor ) return ((HbsParserVisitor<? extends T>)visitor).visitStringHash(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolHashContext extends HashValueContext {
		public TerminalNode BOOLEAN() { return getToken(HbsParser.BOOLEAN, 0); }
		public BoolHashContext(HashValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HbsParserListener ) ((HbsParserListener)listener).enterBoolHash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HbsParserListener ) ((HbsParserListener)listener).exitBoolHash(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HbsParserVisitor ) return ((HbsParserVisitor<? extends T>)visitor).visitBoolHash(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RefHashContext extends HashValueContext {
		public TerminalNode QID() { return getToken(HbsParser.QID, 0); }
		public RefHashContext(HashValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HbsParserListener ) ((HbsParserListener)listener).enterRefHash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HbsParserListener ) ((HbsParserListener)listener).exitRefHash(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HbsParserVisitor ) return ((HbsParserVisitor<? extends T>)visitor).visitRefHash(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharHashContext extends HashValueContext {
		public TerminalNode SINGLE_STRING() { return getToken(HbsParser.SINGLE_STRING, 0); }
		public CharHashContext(HashValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HbsParserListener ) ((HbsParserListener)listener).enterCharHash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HbsParserListener ) ((HbsParserListener)listener).exitCharHash(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HbsParserVisitor ) return ((HbsParserVisitor<? extends T>)visitor).visitCharHash(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HashValueContext hashValue() throws RecognitionException {
		HashValueContext _localctx = new HashValueContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_hashValue);
		try {
			setState(182);
			switch (_input.LA(1)) {
			case DOUBLE_STRING:
				_localctx = new StringHashContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(177); match(DOUBLE_STRING);
				}
				break;
			case SINGLE_STRING:
				_localctx = new CharHashContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(178); match(SINGLE_STRING);
				}
				break;
			case INT:
				_localctx = new IntHashContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(179); match(INT);
				}
				break;
			case BOOLEAN:
				_localctx = new BoolHashContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(180); match(BOOLEAN);
				}
				break;
			case QID:
				_localctx = new RefHashContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(181); match(QID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommentContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(HbsParser.COMMENT, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HbsParserListener ) ((HbsParserListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HbsParserListener ) ((HbsParserListener)listener).exitComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HbsParserVisitor ) return ((HbsParserVisitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184); match(COMMENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3!\u00bd\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\3\7\3/\n\3\f\3\16\3\62\13"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4@\n\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\tO\n\t\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\7\nW\n\n\f\n\16\nZ\13\n\3\n\7\n]\n\n\f\n\16\n`\13\n\3\13\3\13\3"+
		"\13\5\13e\n\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\7\20\u0080"+
		"\n\20\f\20\16\20\u0083\13\20\3\20\6\20\u0086\n\20\r\20\16\20\u0087\3\20"+
		"\3\20\6\20\u008c\n\20\r\20\16\20\u008d\3\20\6\20\u0091\n\20\r\20\16\20"+
		"\u0092\3\20\7\20\u0096\n\20\f\20\16\20\u0099\13\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\5\21\u00a1\n\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\5\22\u00ae\n\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\5\24\u00b9\n\24\3\25\3\25\3\25\2\2\26\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(\2\2\u00c7\2*\3\2\2\2\4\60\3\2\2\2\6?\3\2\2\2\bA\3\2\2\2\n"+
		"C\3\2\2\2\fE\3\2\2\2\16G\3\2\2\2\20I\3\2\2\2\22T\3\2\2\2\24d\3\2\2\2\26"+
		"i\3\2\2\2\30q\3\2\2\2\32u\3\2\2\2\34y\3\2\2\2\36}\3\2\2\2 \u009d\3\2\2"+
		"\2\"\u00ad\3\2\2\2$\u00af\3\2\2\2&\u00b8\3\2\2\2(\u00ba\3\2\2\2*+\5\4"+
		"\3\2+,\7\2\2\3,\3\3\2\2\2-/\5\6\4\2.-\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2"+
		"\60\61\3\2\2\2\61\5\3\2\2\2\62\60\3\2\2\2\63@\5\f\7\2\64@\5\16\b\2\65"+
		"@\5\n\6\2\66@\5\20\t\2\67@\5\34\17\28@\5\30\r\29@\5\32\16\2:@\5\26\f\2"+
		";@\5 \21\2<@\5\b\5\2=@\5(\25\2>@\5\36\20\2?\63\3\2\2\2?\64\3\2\2\2?\65"+
		"\3\2\2\2?\66\3\2\2\2?\67\3\2\2\2?8\3\2\2\2?9\3\2\2\2?:\3\2\2\2?;\3\2\2"+
		"\2?<\3\2\2\2?=\3\2\2\2?>\3\2\2\2@\7\3\2\2\2AB\7\3\2\2B\t\3\2\2\2CD\7\4"+
		"\2\2D\13\3\2\2\2EF\7\16\2\2F\r\3\2\2\2GH\7\17\2\2H\17\3\2\2\2IJ\7\t\2"+
		"\2JK\5\22\n\2KL\7\27\2\2LN\5\4\3\2MO\5\24\13\2NM\3\2\2\2NO\3\2\2\2OP\3"+
		"\2\2\2PQ\7\f\2\2QR\7\36\2\2RS\7\27\2\2S\21\3\2\2\2TX\7\36\2\2UW\5\"\22"+
		"\2VU\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y^\3\2\2\2ZX\3\2\2\2[]\5$\23"+
		"\2\\[\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_\23\3\2\2\2`^\3\2\2\2ae\7"+
		"\b\2\2bc\7\r\2\2ce\7\35\2\2da\3\2\2\2db\3\2\2\2ef\3\2\2\2fg\7\27\2\2g"+
		"h\5\4\3\2h\25\3\2\2\2ij\7\b\2\2jk\7\36\2\2kl\7\27\2\2lm\5\4\3\2mn\7\f"+
		"\2\2no\7\36\2\2op\7\27\2\2p\27\3\2\2\2qr\7\7\2\2rs\5\22\n\2st\7\26\2\2"+
		"t\31\3\2\2\2uv\7\6\2\2vw\5\22\n\2wx\7\27\2\2x\33\3\2\2\2yz\7\r\2\2z{\5"+
		"\22\n\2{|\7\27\2\2|\35\3\2\2\2}\u0081\7\n\2\2~\u0080\7\22\2\2\177~\3\2"+
		"\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0085"+
		"\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0086\7\23\2\2\u0085\u0084\3\2\2\2"+
		"\u0086\u0087\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089"+
		"\3\2\2\2\u0089\u008b\b\20\1\2\u008a\u008c\7\22\2\2\u008b\u008a\3\2\2\2"+
		"\u008c\u008d\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0090"+
		"\3\2\2\2\u008f\u0091\7\23\2\2\u0090\u008f\3\2\2\2\u0091\u0092\3\2\2\2"+
		"\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0097\3\2\2\2\u0094\u0096"+
		"\7\22\2\2\u0095\u0094\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2"+
		"\u0097\u0098\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009b"+
		"\7\21\2\2\u009b\u009c\b\20\1\2\u009c\37\3\2\2\2\u009d\u009e\7\13\2\2\u009e"+
		"\u00a0\7\24\2\2\u009f\u00a1\7\36\2\2\u00a0\u009f\3\2\2\2\u00a0\u00a1\3"+
		"\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\7\27\2\2\u00a3!\3\2\2\2\u00a4\u00ae"+
		"\7\30\2\2\u00a5\u00ae\7\31\2\2\u00a6\u00ae\7\33\2\2\u00a7\u00ae\7\34\2"+
		"\2\u00a8\u00ae\7\36\2\2\u00a9\u00aa\7\37\2\2\u00aa\u00ab\5\22\n\2\u00ab"+
		"\u00ac\7 \2\2\u00ac\u00ae\3\2\2\2\u00ad\u00a4\3\2\2\2\u00ad\u00a5\3\2"+
		"\2\2\u00ad\u00a6\3\2\2\2\u00ad\u00a7\3\2\2\2\u00ad\u00a8\3\2\2\2\u00ad"+
		"\u00a9\3\2\2\2\u00ae#\3\2\2\2\u00af\u00b0\7\36\2\2\u00b0\u00b1\7\32\2"+
		"\2\u00b1\u00b2\5&\24\2\u00b2%\3\2\2\2\u00b3\u00b9\7\30\2\2\u00b4\u00b9"+
		"\7\31\2\2\u00b5\u00b9\7\33\2\2\u00b6\u00b9\7\34\2\2\u00b7\u00b9\7\36\2"+
		"\2\u00b8\u00b3\3\2\2\2\u00b8\u00b4\3\2\2\2\u00b8\u00b5\3\2\2\2\u00b8\u00b6"+
		"\3\2\2\2\u00b8\u00b7\3\2\2\2\u00b9\'\3\2\2\2\u00ba\u00bb\7\5\2\2\u00bb"+
		")\3\2\2\2\20\60?NX^d\u0081\u0087\u008d\u0092\u0097\u00a0\u00ad\u00b8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}