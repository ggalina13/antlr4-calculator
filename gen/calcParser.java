// Generated from /home/galina13/IdeaProjects/MT/calc/src/calc.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class calcParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, Plus=5, Minus=6, Mul=7, Div=8, Pow=9, 
		Num=10, Var=11, WS=12;
	public static final int
		RULE_start = 0, RULE_strings = 1, RULE_assigning = 2, RULE_expr = 3, RULE_mulexpr = 4, 
		RULE_powexpr = 5, RULE_token = 6, RULE_left = 7, RULE_right = 8, RULE_number = 9, 
		RULE_variable = 10, RULE_mainVar = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "strings", "assigning", "expr", "mulexpr", "powexpr", "token", 
			"left", "right", "number", "variable", "mainVar"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'='", "'('", "')'", "'+'", "'-'", "'*'", "'/'", "'**'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "Plus", "Minus", "Mul", "Div", "Pow", "Num", 
			"Var", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "calc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public calcParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public StringsContext strings() {
			return getRuleContext(StringsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(calcParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			strings();
			setState(25);
			match(EOF);
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

	public static class StringsContext extends ParserRuleContext {
		public AssigningContext assigning() {
			return getRuleContext(AssigningContext.class,0);
		}
		public StringsContext strings() {
			return getRuleContext(StringsContext.class,0);
		}
		public StringsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strings; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterStrings(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitStrings(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitStrings(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringsContext strings() throws RecognitionException {
		StringsContext _localctx = new StringsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_strings);
		try {
			setState(32);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Var:
				enterOuterAlt(_localctx, 1);
				{
				setState(27);
				assigning();
				setState(28);
				match(T__0);
				setState(29);
				strings();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class AssigningContext extends ParserRuleContext {
		public TerminalNode Var() { return getToken(calcParser.Var, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssigningContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assigning; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterAssigning(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitAssigning(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitAssigning(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssigningContext assigning() throws RecognitionException {
		AssigningContext _localctx = new AssigningContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assigning);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(Var);
			setState(35);
			match(T__1);
			setState(36);
			expr();
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

	public static class ExprContext extends ParserRuleContext {
		public List<MulexprContext> mulexpr() {
			return getRuleContexts(MulexprContext.class);
		}
		public MulexprContext mulexpr(int i) {
			return getRuleContext(MulexprContext.class,i);
		}
		public List<TerminalNode> Plus() { return getTokens(calcParser.Plus); }
		public TerminalNode Plus(int i) {
			return getToken(calcParser.Plus, i);
		}
		public List<TerminalNode> Minus() { return getTokens(calcParser.Minus); }
		public TerminalNode Minus(int i) {
			return getToken(calcParser.Minus, i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			mulexpr();
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Plus || _la==Minus) {
				{
				{
				setState(39);
				_la = _input.LA(1);
				if ( !(_la==Plus || _la==Minus) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(40);
				mulexpr();
				}
				}
				setState(45);
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

	public static class MulexprContext extends ParserRuleContext {
		public List<PowexprContext> powexpr() {
			return getRuleContexts(PowexprContext.class);
		}
		public PowexprContext powexpr(int i) {
			return getRuleContext(PowexprContext.class,i);
		}
		public List<TerminalNode> Mul() { return getTokens(calcParser.Mul); }
		public TerminalNode Mul(int i) {
			return getToken(calcParser.Mul, i);
		}
		public List<TerminalNode> Div() { return getTokens(calcParser.Div); }
		public TerminalNode Div(int i) {
			return getToken(calcParser.Div, i);
		}
		public MulexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterMulexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitMulexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitMulexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulexprContext mulexpr() throws RecognitionException {
		MulexprContext _localctx = new MulexprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_mulexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			powexpr();
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Mul || _la==Div) {
				{
				{
				setState(47);
				_la = _input.LA(1);
				if ( !(_la==Mul || _la==Div) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(48);
				powexpr();
				}
				}
				setState(53);
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

	public static class PowexprContext extends ParserRuleContext {
		public TokenContext token() {
			return getRuleContext(TokenContext.class,0);
		}
		public TerminalNode Pow() { return getToken(calcParser.Pow, 0); }
		public PowexprContext powexpr() {
			return getRuleContext(PowexprContext.class,0);
		}
		public PowexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_powexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterPowexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitPowexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitPowexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PowexprContext powexpr() throws RecognitionException {
		PowexprContext _localctx = new PowexprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_powexpr);
		try {
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				token();
				setState(55);
				match(Pow);
				setState(56);
				powexpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				token();
				}
				break;
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

	public static class TokenContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public LeftContext left() {
			return getRuleContext(LeftContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public RightContext right() {
			return getRuleContext(RightContext.class,0);
		}
		public TokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_token; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitToken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TokenContext token() throws RecognitionException {
		TokenContext _localctx = new TokenContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_token);
		try {
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Num:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				number();
				}
				break;
			case Var:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				variable();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(63);
				left();
				setState(64);
				expr();
				setState(65);
				right();
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

	public static class LeftContext extends ParserRuleContext {
		public LeftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_left; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterLeft(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitLeft(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitLeft(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeftContext left() throws RecognitionException {
		LeftContext _localctx = new LeftContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_left);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(T__2);
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

	public static class RightContext extends ParserRuleContext {
		public RightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_right; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterRight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitRight(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitRight(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RightContext right() throws RecognitionException {
		RightContext _localctx = new RightContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_right);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(T__3);
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode Num() { return getToken(calcParser.Num, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(Num);
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode Var() { return getToken(calcParser.Var, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(Var);
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

	public static class MainVarContext extends ParserRuleContext {
		public TerminalNode Var() { return getToken(calcParser.Var, 0); }
		public MainVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterMainVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitMainVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitMainVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainVarContext mainVar() throws RecognitionException {
		MainVarContext _localctx = new MainVarContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_mainVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(Var);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\16R\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3#\n\3\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\7\5,\n\5\f\5\16\5/\13\5\3\6\3\6\3\6\7\6\64\n\6\f\6\16\6"+
		"\67\13\6\3\7\3\7\3\7\3\7\3\7\5\7>\n\7\3\b\3\b\3\b\3\b\3\b\3\b\5\bF\n\b"+
		"\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\2\2\16\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\2\4\3\2\7\b\3\2\t\n\2K\2\32\3\2\2\2\4\"\3\2\2\2\6$\3\2\2"+
		"\2\b(\3\2\2\2\n\60\3\2\2\2\f=\3\2\2\2\16E\3\2\2\2\20G\3\2\2\2\22I\3\2"+
		"\2\2\24K\3\2\2\2\26M\3\2\2\2\30O\3\2\2\2\32\33\5\4\3\2\33\34\7\2\2\3\34"+
		"\3\3\2\2\2\35\36\5\6\4\2\36\37\7\3\2\2\37 \5\4\3\2 #\3\2\2\2!#\3\2\2\2"+
		"\"\35\3\2\2\2\"!\3\2\2\2#\5\3\2\2\2$%\7\r\2\2%&\7\4\2\2&\'\5\b\5\2\'\7"+
		"\3\2\2\2(-\5\n\6\2)*\t\2\2\2*,\5\n\6\2+)\3\2\2\2,/\3\2\2\2-+\3\2\2\2-"+
		".\3\2\2\2.\t\3\2\2\2/-\3\2\2\2\60\65\5\f\7\2\61\62\t\3\2\2\62\64\5\f\7"+
		"\2\63\61\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\13\3\2\2"+
		"\2\67\65\3\2\2\289\5\16\b\29:\7\13\2\2:;\5\f\7\2;>\3\2\2\2<>\5\16\b\2"+
		"=8\3\2\2\2=<\3\2\2\2>\r\3\2\2\2?F\5\24\13\2@F\5\26\f\2AB\5\20\t\2BC\5"+
		"\b\5\2CD\5\22\n\2DF\3\2\2\2E?\3\2\2\2E@\3\2\2\2EA\3\2\2\2F\17\3\2\2\2"+
		"GH\7\5\2\2H\21\3\2\2\2IJ\7\6\2\2J\23\3\2\2\2KL\7\f\2\2L\25\3\2\2\2MN\7"+
		"\r\2\2N\27\3\2\2\2OP\7\r\2\2P\31\3\2\2\2\7\"-\65=E";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}