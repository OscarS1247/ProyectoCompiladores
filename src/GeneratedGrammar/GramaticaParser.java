// Generated from C:/Users/bernardo08/IdeaProjects/ProyectoCompiladores_Oscar/src/Grammar/Gramatica.g4 by ANTLR 4.13.1
package GeneratedGrammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public abstract class GramaticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, INT_VAR=15, CHAR_VAR=16, 
		STRING_VAR=17, ARRAY_VAR=18, OR=19, AND=20, WHILE=21, STRING_TYPE=22, 
		PROGRAM_END=23, END=24, INT_TYPE=25, CHAR_TYPE=26, BOOL_TYPE=27, ASSIGN=28, 
		SEMI=29, EQUAL=30, COLON=31, COMP_OPERATOR=32, SUM_OPERATOR=33, MULT_OPERATOR=34, 
		TRUE=35, FALSE=36, COMM=37, ID=38, WS=39;
	public static final int
		RULE_programa = 0, RULE_code_block = 1, RULE_row = 2, RULE_init = 3, RULE_assignation = 4, 
		RULE_expr = 5, RULE_term = 6, RULE_bool_expr = 7, RULE_bool_term = 8, 
		RULE_bool_operation = 9, RULE_var = 10, RULE_type = 11, RULE_while = 12, 
		RULE_for = 13, RULE_if = 14, RULE_structure_code = 15, RULE_function = 16, 
		RULE_params = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "code_block", "row", "init", "assignation", "expr", "term", 
			"bool_expr", "bool_term", "bool_operation", "var", "type", "while", "for", 
			"if", "structure_code", "function", "params"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'PROGRAM'", "'VAR'", "'BEGIN'", "','", "'('", "')'", "'['", "']'", 
			"'FOR'", "'TO'", "'IF'", "'THEN'", "'DO'", "'END'", null, null, null, 
			null, "'OR'", "'AND'", "'WHILE'", "'string'", "'END.'", "'END;'", null, 
			"'char'", "'bool'", "':='", "';'", "'='", "':'", null, null, null, "'true'", 
			"'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "INT_VAR", "CHAR_VAR", "STRING_VAR", "ARRAY_VAR", "OR", 
			"AND", "WHILE", "STRING_TYPE", "PROGRAM_END", "END", "INT_TYPE", "CHAR_TYPE", 
			"BOOL_TYPE", "ASSIGN", "SEMI", "EQUAL", "COLON", "COMP_OPERATOR", "SUM_OPERATOR", 
			"MULT_OPERATOR", "TRUE", "FALSE", "COMM", "ID", "WS"
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
	public String getGrammarFileName() { return "Gramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	protected abstract void sync(Parser recognizer);

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TerminalNode SEMI() { return getToken(GramaticaParser.SEMI, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public TerminalNode END() { return getToken(GramaticaParser.END, 0); }
		public List<TerminalNode> COMM() { return getTokens(GramaticaParser.COMM); }
		public TerminalNode COMM(int i) {
			return getToken(GramaticaParser.COMM, i);
		}
		public List<InitContext> init() {
			return getRuleContexts(InitContext.class);
		}
		public InitContext init(int i) {
			return getRuleContext(InitContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(T__0);
			setState(37);
			match(ID);
			setState(38);
			match(SEMI);
			{
			setState(42);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(39);
					match(COMM);
					}
					} 
				}
				setState(44);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(45);
				match(T__1);
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(46);
					init();
					}
					}
					setState(51);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMM) {
				{
				{
				setState(54);
				match(COMM);
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(60);
			match(T__2);
			setState(61);
			code_block();
			setState(62);
			match(END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Code_blockContext extends ParserRuleContext {
		public List<RowContext> row() {
			return getRuleContexts(RowContext.class);
		}
		public RowContext row(int i) {
			return getRuleContext(RowContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(GramaticaParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(GramaticaParser.SEMI, i);
		}
		public Code_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterCode_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitCode_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitCode_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Code_blockContext code_block() throws RecognitionException {
		Code_blockContext _localctx = new Code_blockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_code_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 412319222272L) != 0)) {
				{
				{
				setState(64);
				row();
				setState(65);
				match(SEMI);
				}
				}
				setState(71);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RowContext extends ParserRuleContext {
		public AssignationContext assignation() {
			return getRuleContext(AssignationContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public WhileContext while_() {
			return getRuleContext(WhileContext.class,0);
		}
		public ForContext for_() {
			return getRuleContext(ForContext.class,0);
		}
		public IfContext if_() {
			return getRuleContext(IfContext.class,0);
		}
		public TerminalNode COMM() { return getToken(GramaticaParser.COMM, 0); }
		public RowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterRow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitRow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitRow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowContext row() throws RecognitionException {
		RowContext _localctx = new RowContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_row);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(72);
				assignation();
				}
				break;
			case 2:
				{
				setState(73);
				function();
				}
				break;
			case 3:
				{
				setState(74);
				while_();
				}
				break;
			case 4:
				{
				setState(75);
				for_();
				}
				break;
			case 5:
				{
				setState(76);
				if_();
				}
				break;
			case 6:
				{
				setState(77);
				match(COMM);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class InitContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(GramaticaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GramaticaParser.ID, i);
		}
		public TerminalNode COLON() { return getToken(GramaticaParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(GramaticaParser.SEMI, 0); }
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_init);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(ID);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(81);
				match(T__3);
				setState(82);
				match(ID);
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(88);
			match(COLON);
			setState(89);
			type();
			setState(90);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(GramaticaParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ARRAY_VAR() { return getToken(GramaticaParser.ARRAY_VAR, 0); }
		public AssignationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterAssignation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitAssignation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitAssignation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignationContext assignation() throws RecognitionException {
		AssignationContext _localctx = new AssignationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignation);
		try {
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(92);
				match(ID);
				setState(93);
				match(ASSIGN);
				{
				setState(94);
				expr();
				}
				}
				}
				break;
			case ARRAY_VAR:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(95);
				match(ARRAY_VAR);
				setState(96);
				match(ASSIGN);
				{
				setState(97);
				expr();
				}
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ARRAY_VAR() { return getToken(GramaticaParser.ARRAY_VAR, 0); }
		public List<TerminalNode> SUM_OPERATOR() { return getTokens(GramaticaParser.SUM_OPERATOR); }
		public TerminalNode SUM_OPERATOR(int i) {
			return getToken(GramaticaParser.SUM_OPERATOR, i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				{
				setState(100);
				term();
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SUM_OPERATOR) {
					{
					{
					setState(101);
					match(SUM_OPERATOR);
					setState(102);
					term();
					}
					}
					setState(107);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 2:
				{
				{
				setState(108);
				match(T__4);
				setState(109);
				expr();
				setState(110);
				match(T__5);
				}
				}
				break;
			case 3:
				{
				{
				setState(112);
				match(ARRAY_VAR);
				setState(113);
				match(T__6);
				setState(114);
				expr();
				setState(115);
				match(T__7);
				}
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public List<TerminalNode> MULT_OPERATOR() { return getTokens(GramaticaParser.MULT_OPERATOR); }
		public TerminalNode MULT_OPERATOR(int i) {
			return getToken(GramaticaParser.MULT_OPERATOR, i);
		}
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_term);
		try {
			int _alt;
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_VAR:
			case CHAR_VAR:
			case STRING_VAR:
			case ARRAY_VAR:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(121);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT_VAR:
				case CHAR_VAR:
				case STRING_VAR:
				case ARRAY_VAR:
					{
					setState(119);
					var();
					}
					break;
				case ID:
					{
					setState(120);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(127);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(123);
						match(MULT_OPERATOR);
						setState(124);
						term();
						}
						} 
					}
					setState(129);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				}
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(130);
				match(T__4);
				setState(131);
				expr();
				setState(132);
				match(T__5);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Bool_exprContext extends ParserRuleContext {
		public List<Bool_termContext> bool_term() {
			return getRuleContexts(Bool_termContext.class);
		}
		public Bool_termContext bool_term(int i) {
			return getRuleContext(Bool_termContext.class,i);
		}
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public List<TerminalNode> OR() { return getTokens(GramaticaParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(GramaticaParser.OR, i);
		}
		public Bool_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterBool_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitBool_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitBool_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_exprContext bool_expr() throws RecognitionException {
		Bool_exprContext _localctx = new Bool_exprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_bool_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				{
				setState(136);
				bool_term();
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OR) {
					{
					{
					setState(137);
					match(OR);
					setState(138);
					bool_term();
					}
					}
					setState(143);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 2:
				{
				{
				setState(144);
				match(T__4);
				setState(145);
				bool_expr();
				setState(146);
				match(T__5);
				}
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class Bool_termContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public Bool_operationContext bool_operation() {
			return getRuleContext(Bool_operationContext.class,0);
		}
		public List<TerminalNode> AND() { return getTokens(GramaticaParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(GramaticaParser.AND, i);
		}
		public List<Bool_termContext> bool_term() {
			return getRuleContexts(Bool_termContext.class);
		}
		public Bool_termContext bool_term(int i) {
			return getRuleContext(Bool_termContext.class,i);
		}
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Bool_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterBool_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitBool_term(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitBool_term(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_termContext bool_term() throws RecognitionException {
		Bool_termContext _localctx = new Bool_termContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_bool_term);
		try {
			int _alt;
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_VAR:
			case CHAR_VAR:
			case STRING_VAR:
			case ARRAY_VAR:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(152);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(150);
					match(ID);
					}
					break;
				case 2:
					{
					setState(151);
					bool_operation();
					}
					break;
				}
				setState(158);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(154);
						match(AND);
						setState(155);
						bool_term();
						}
						} 
					}
					setState(160);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				}
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(161);
				match(T__4);
				setState(162);
				bool_expr();
				setState(163);
				match(T__5);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Bool_operationContext extends ParserRuleContext {
		public TerminalNode COMP_OPERATOR() { return getToken(GramaticaParser.COMP_OPERATOR, 0); }
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(GramaticaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GramaticaParser.ID, i);
		}
		public List<TerminalNode> ARRAY_VAR() { return getTokens(GramaticaParser.ARRAY_VAR); }
		public TerminalNode ARRAY_VAR(int i) {
			return getToken(GramaticaParser.ARRAY_VAR, i);
		}
		public Bool_operationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterBool_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitBool_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitBool_operation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_operationContext bool_operation() throws RecognitionException {
		Bool_operationContext _localctx = new Bool_operationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_bool_operation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(167);
				var();
				}
				break;
			case 2:
				{
				setState(168);
				match(ID);
				}
				break;
			case 3:
				{
				setState(169);
				match(ARRAY_VAR);
				}
				break;
			}
			setState(172);
			match(COMP_OPERATOR);
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(173);
				var();
				}
				break;
			case 2:
				{
				setState(174);
				match(ID);
				}
				break;
			case 3:
				{
				setState(175);
				match(ARRAY_VAR);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarContext extends ParserRuleContext {
		public TerminalNode INT_VAR() { return getToken(GramaticaParser.INT_VAR, 0); }
		public TerminalNode CHAR_VAR() { return getToken(GramaticaParser.CHAR_VAR, 0); }
		public TerminalNode STRING_VAR() { return getToken(GramaticaParser.STRING_VAR, 0); }
		public TerminalNode ARRAY_VAR() { return getToken(GramaticaParser.ARRAY_VAR, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 491520L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode STRING_TYPE() { return getToken(GramaticaParser.STRING_TYPE, 0); }
		public TerminalNode INT_TYPE() { return getToken(GramaticaParser.INT_TYPE, 0); }
		public TerminalNode CHAR_TYPE() { return getToken(GramaticaParser.CHAR_TYPE, 0); }
		public TerminalNode BOOL_TYPE() { return getToken(GramaticaParser.BOOL_TYPE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 239075328L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(GramaticaParser.WHILE, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Structure_codeContext structure_code() {
			return getRuleContext(Structure_codeContext.class,0);
		}
		public WhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileContext while_() throws RecognitionException {
		WhileContext _localctx = new WhileContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(WHILE);
			setState(183);
			match(T__4);
			setState(184);
			bool_expr();
			setState(185);
			match(T__5);
			setState(186);
			structure_code();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(GramaticaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GramaticaParser.ID, i);
		}
		public TerminalNode ASSIGN() { return getToken(GramaticaParser.ASSIGN, 0); }
		public List<TerminalNode> INT_VAR() { return getTokens(GramaticaParser.INT_VAR); }
		public TerminalNode INT_VAR(int i) {
			return getToken(GramaticaParser.INT_VAR, i);
		}
		public Structure_codeContext structure_code() {
			return getRuleContext(Structure_codeContext.class,0);
		}
		public ForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForContext for_() throws RecognitionException {
		ForContext _localctx = new ForContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(T__8);
			setState(189);
			match(ID);
			setState(190);
			match(ASSIGN);
			setState(191);
			match(INT_VAR);
			setState(192);
			match(T__9);
			setState(193);
			_la = _input.LA(1);
			if ( !(_la==INT_VAR || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(194);
			structure_code();
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfContext extends ParserRuleContext {
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Structure_codeContext structure_code() {
			return getRuleContext(Structure_codeContext.class,0);
		}
		public IfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfContext if_() throws RecognitionException {
		IfContext _localctx = new IfContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(T__10);
			setState(197);
			match(T__4);
			setState(198);
			bool_expr();
			setState(199);
			match(T__5);
			setState(200);
			match(T__11);
			setState(201);
			structure_code();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Structure_codeContext extends ParserRuleContext {
		public RowContext row() {
			return getRuleContext(RowContext.class,0);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Structure_codeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structure_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterStructure_code(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitStructure_code(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitStructure_code(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Structure_codeContext structure_code() throws RecognitionException {
		Structure_codeContext _localctx = new Structure_codeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_structure_code);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
			case T__10:
			case ARRAY_VAR:
			case WHILE:
			case COMM:
			case ID:
				{
				setState(203);
				row();
				}
				break;
			case T__12:
				{
				{
				setState(204);
				match(T__12);
				setState(205);
				code_block();
				setState(206);
				match(T__13);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TerminalNode SEMI() { return getToken(GramaticaParser.SEMI, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public TerminalNode END() { return getToken(GramaticaParser.END, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode COLON() { return getToken(GramaticaParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(ID);
			setState(211);
			match(T__4);
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(212);
				params();
				}
			}

			setState(215);
			match(T__5);
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(216);
				match(COLON);
				setState(217);
				type();
				}
			}

			setState(220);
			match(SEMI);
			setState(221);
			code_block();
			setState(222);
			match(END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParamsContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(GramaticaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GramaticaParser.ID, i);
		}
		public TerminalNode COLON() { return getToken(GramaticaParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(ID);
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(225);
				match(T__3);
				setState(226);
				match(ID);
				}
				}
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(232);
			match(COLON);
			setState(233);
			type();
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
		"\u0004\u0001\'\u00ec\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0005\u0000)\b\u0000\n\u0000\f\u0000,\t\u0000"+
		"\u0001\u0000\u0001\u0000\u0005\u00000\b\u0000\n\u0000\f\u00003\t\u0000"+
		"\u0003\u00005\b\u0000\u0001\u0000\u0005\u00008\b\u0000\n\u0000\f\u0000"+
		";\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u0001D\b\u0001\n\u0001\f\u0001G\t\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002O\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003"+
		"T\b\u0003\n\u0003\f\u0003W\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004c\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005h\b\u0005\n\u0005\f\u0005k\t\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005v\b\u0005\u0001\u0006\u0001\u0006\u0003\u0006"+
		"z\b\u0006\u0001\u0006\u0001\u0006\u0005\u0006~\b\u0006\n\u0006\f\u0006"+
		"\u0081\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u0087\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u008c\b"+
		"\u0007\n\u0007\f\u0007\u008f\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u0095\b\u0007\u0001\b\u0001\b\u0003\b\u0099\b"+
		"\b\u0001\b\u0001\b\u0005\b\u009d\b\b\n\b\f\b\u00a0\t\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0003\b\u00a6\b\b\u0001\t\u0001\t\u0001\t\u0003\t\u00ab"+
		"\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00b1\b\t\u0001\n\u0001\n"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u00d1\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00d6"+
		"\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00db\b\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0005\u0011\u00e4\b\u0011\n\u0011\f\u0011\u00e7\t\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0000\u0000\u0012\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"\u0000\u0003\u0001\u0000\u000f\u0012\u0002\u0000\u0016\u0016\u0019"+
		"\u001b\u0002\u0000\u000f\u000f&&\u00f8\u0000$\u0001\u0000\u0000\u0000"+
		"\u0002E\u0001\u0000\u0000\u0000\u0004N\u0001\u0000\u0000\u0000\u0006P"+
		"\u0001\u0000\u0000\u0000\bb\u0001\u0000\u0000\u0000\nu\u0001\u0000\u0000"+
		"\u0000\f\u0086\u0001\u0000\u0000\u0000\u000e\u0094\u0001\u0000\u0000\u0000"+
		"\u0010\u00a5\u0001\u0000\u0000\u0000\u0012\u00aa\u0001\u0000\u0000\u0000"+
		"\u0014\u00b2\u0001\u0000\u0000\u0000\u0016\u00b4\u0001\u0000\u0000\u0000"+
		"\u0018\u00b6\u0001\u0000\u0000\u0000\u001a\u00bc\u0001\u0000\u0000\u0000"+
		"\u001c\u00c4\u0001\u0000\u0000\u0000\u001e\u00d0\u0001\u0000\u0000\u0000"+
		" \u00d2\u0001\u0000\u0000\u0000\"\u00e0\u0001\u0000\u0000\u0000$%\u0005"+
		"\u0001\u0000\u0000%&\u0005&\u0000\u0000&*\u0005\u001d\u0000\u0000\')\u0005"+
		"%\u0000\u0000(\'\u0001\u0000\u0000\u0000),\u0001\u0000\u0000\u0000*(\u0001"+
		"\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+4\u0001\u0000\u0000\u0000"+
		",*\u0001\u0000\u0000\u0000-1\u0005\u0002\u0000\u0000.0\u0003\u0006\u0003"+
		"\u0000/.\u0001\u0000\u0000\u000003\u0001\u0000\u0000\u00001/\u0001\u0000"+
		"\u0000\u000012\u0001\u0000\u0000\u000025\u0001\u0000\u0000\u000031\u0001"+
		"\u0000\u0000\u00004-\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u0000"+
		"59\u0001\u0000\u0000\u000068\u0005%\u0000\u000076\u0001\u0000\u0000\u0000"+
		"8;\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u00009:\u0001\u0000\u0000"+
		"\u0000:<\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000<=\u0005\u0003"+
		"\u0000\u0000=>\u0003\u0002\u0001\u0000>?\u0005\u0018\u0000\u0000?\u0001"+
		"\u0001\u0000\u0000\u0000@A\u0003\u0004\u0002\u0000AB\u0005\u001d\u0000"+
		"\u0000BD\u0001\u0000\u0000\u0000C@\u0001\u0000\u0000\u0000DG\u0001\u0000"+
		"\u0000\u0000EC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000F\u0003"+
		"\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000HO\u0003\b\u0004\u0000"+
		"IO\u0003 \u0010\u0000JO\u0003\u0018\f\u0000KO\u0003\u001a\r\u0000LO\u0003"+
		"\u001c\u000e\u0000MO\u0005%\u0000\u0000NH\u0001\u0000\u0000\u0000NI\u0001"+
		"\u0000\u0000\u0000NJ\u0001\u0000\u0000\u0000NK\u0001\u0000\u0000\u0000"+
		"NL\u0001\u0000\u0000\u0000NM\u0001\u0000\u0000\u0000O\u0005\u0001\u0000"+
		"\u0000\u0000PU\u0005&\u0000\u0000QR\u0005\u0004\u0000\u0000RT\u0005&\u0000"+
		"\u0000SQ\u0001\u0000\u0000\u0000TW\u0001\u0000\u0000\u0000US\u0001\u0000"+
		"\u0000\u0000UV\u0001\u0000\u0000\u0000VX\u0001\u0000\u0000\u0000WU\u0001"+
		"\u0000\u0000\u0000XY\u0005\u001f\u0000\u0000YZ\u0003\u0016\u000b\u0000"+
		"Z[\u0005\u001d\u0000\u0000[\u0007\u0001\u0000\u0000\u0000\\]\u0005&\u0000"+
		"\u0000]^\u0005\u001c\u0000\u0000^c\u0003\n\u0005\u0000_`\u0005\u0012\u0000"+
		"\u0000`a\u0005\u001c\u0000\u0000ac\u0003\n\u0005\u0000b\\\u0001\u0000"+
		"\u0000\u0000b_\u0001\u0000\u0000\u0000c\t\u0001\u0000\u0000\u0000di\u0003"+
		"\f\u0006\u0000ef\u0005!\u0000\u0000fh\u0003\f\u0006\u0000ge\u0001\u0000"+
		"\u0000\u0000hk\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000ij\u0001"+
		"\u0000\u0000\u0000jv\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000"+
		"lm\u0005\u0005\u0000\u0000mn\u0003\n\u0005\u0000no\u0005\u0006\u0000\u0000"+
		"ov\u0001\u0000\u0000\u0000pq\u0005\u0012\u0000\u0000qr\u0005\u0007\u0000"+
		"\u0000rs\u0003\n\u0005\u0000st\u0005\b\u0000\u0000tv\u0001\u0000\u0000"+
		"\u0000ud\u0001\u0000\u0000\u0000ul\u0001\u0000\u0000\u0000up\u0001\u0000"+
		"\u0000\u0000v\u000b\u0001\u0000\u0000\u0000wz\u0003\u0014\n\u0000xz\u0005"+
		"&\u0000\u0000yw\u0001\u0000\u0000\u0000yx\u0001\u0000\u0000\u0000z\u007f"+
		"\u0001\u0000\u0000\u0000{|\u0005\"\u0000\u0000|~\u0003\f\u0006\u0000}"+
		"{\u0001\u0000\u0000\u0000~\u0081\u0001\u0000\u0000\u0000\u007f}\u0001"+
		"\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0087\u0001"+
		"\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0082\u0083\u0005"+
		"\u0005\u0000\u0000\u0083\u0084\u0003\n\u0005\u0000\u0084\u0085\u0005\u0006"+
		"\u0000\u0000\u0085\u0087\u0001\u0000\u0000\u0000\u0086y\u0001\u0000\u0000"+
		"\u0000\u0086\u0082\u0001\u0000\u0000\u0000\u0087\r\u0001\u0000\u0000\u0000"+
		"\u0088\u008d\u0003\u0010\b\u0000\u0089\u008a\u0005\u0013\u0000\u0000\u008a"+
		"\u008c\u0003\u0010\b\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008c\u008f"+
		"\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008d\u008e"+
		"\u0001\u0000\u0000\u0000\u008e\u0095\u0001\u0000\u0000\u0000\u008f\u008d"+
		"\u0001\u0000\u0000\u0000\u0090\u0091\u0005\u0005\u0000\u0000\u0091\u0092"+
		"\u0003\u000e\u0007\u0000\u0092\u0093\u0005\u0006\u0000\u0000\u0093\u0095"+
		"\u0001\u0000\u0000\u0000\u0094\u0088\u0001\u0000\u0000\u0000\u0094\u0090"+
		"\u0001\u0000\u0000\u0000\u0095\u000f\u0001\u0000\u0000\u0000\u0096\u0099"+
		"\u0005&\u0000\u0000\u0097\u0099\u0003\u0012\t\u0000\u0098\u0096\u0001"+
		"\u0000\u0000\u0000\u0098\u0097\u0001\u0000\u0000\u0000\u0099\u009e\u0001"+
		"\u0000\u0000\u0000\u009a\u009b\u0005\u0014\u0000\u0000\u009b\u009d\u0003"+
		"\u0010\b\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009d\u00a0\u0001\u0000"+
		"\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000"+
		"\u0000\u0000\u009f\u00a6\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000"+
		"\u0000\u0000\u00a1\u00a2\u0005\u0005\u0000\u0000\u00a2\u00a3\u0003\u000e"+
		"\u0007\u0000\u00a3\u00a4\u0005\u0006\u0000\u0000\u00a4\u00a6\u0001\u0000"+
		"\u0000\u0000\u00a5\u0098\u0001\u0000\u0000\u0000\u00a5\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a6\u0011\u0001\u0000\u0000\u0000\u00a7\u00ab\u0003\u0014"+
		"\n\u0000\u00a8\u00ab\u0005&\u0000\u0000\u00a9\u00ab\u0005\u0012\u0000"+
		"\u0000\u00aa\u00a7\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000\u0000"+
		"\u0000\u00aa\u00a9\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000"+
		"\u0000\u00ac\u00b0\u0005 \u0000\u0000\u00ad\u00b1\u0003\u0014\n\u0000"+
		"\u00ae\u00b1\u0005&\u0000\u0000\u00af\u00b1\u0005\u0012\u0000\u0000\u00b0"+
		"\u00ad\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b0"+
		"\u00af\u0001\u0000\u0000\u0000\u00b1\u0013\u0001\u0000\u0000\u0000\u00b2"+
		"\u00b3\u0007\u0000\u0000\u0000\u00b3\u0015\u0001\u0000\u0000\u0000\u00b4"+
		"\u00b5\u0007\u0001\u0000\u0000\u00b5\u0017\u0001\u0000\u0000\u0000\u00b6"+
		"\u00b7\u0005\u0015\u0000\u0000\u00b7\u00b8\u0005\u0005\u0000\u0000\u00b8"+
		"\u00b9\u0003\u000e\u0007\u0000\u00b9\u00ba\u0005\u0006\u0000\u0000\u00ba"+
		"\u00bb\u0003\u001e\u000f\u0000\u00bb\u0019\u0001\u0000\u0000\u0000\u00bc"+
		"\u00bd\u0005\t\u0000\u0000\u00bd\u00be\u0005&\u0000\u0000\u00be\u00bf"+
		"\u0005\u001c\u0000\u0000\u00bf\u00c0\u0005\u000f\u0000\u0000\u00c0\u00c1"+
		"\u0005\n\u0000\u0000\u00c1\u00c2\u0007\u0002\u0000\u0000\u00c2\u00c3\u0003"+
		"\u001e\u000f\u0000\u00c3\u001b\u0001\u0000\u0000\u0000\u00c4\u00c5\u0005"+
		"\u000b\u0000\u0000\u00c5\u00c6\u0005\u0005\u0000\u0000\u00c6\u00c7\u0003"+
		"\u000e\u0007\u0000\u00c7\u00c8\u0005\u0006\u0000\u0000\u00c8\u00c9\u0005"+
		"\f\u0000\u0000\u00c9\u00ca\u0003\u001e\u000f\u0000\u00ca\u001d\u0001\u0000"+
		"\u0000\u0000\u00cb\u00d1\u0003\u0004\u0002\u0000\u00cc\u00cd\u0005\r\u0000"+
		"\u0000\u00cd\u00ce\u0003\u0002\u0001\u0000\u00ce\u00cf\u0005\u000e\u0000"+
		"\u0000\u00cf\u00d1\u0001\u0000\u0000\u0000\u00d0\u00cb\u0001\u0000\u0000"+
		"\u0000\u00d0\u00cc\u0001\u0000\u0000\u0000\u00d1\u001f\u0001\u0000\u0000"+
		"\u0000\u00d2\u00d3\u0005&\u0000\u0000\u00d3\u00d5\u0005\u0005\u0000\u0000"+
		"\u00d4\u00d6\u0003\"\u0011\u0000\u00d5\u00d4\u0001\u0000\u0000\u0000\u00d5"+
		"\u00d6\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7"+
		"\u00da\u0005\u0006\u0000\u0000\u00d8\u00d9\u0005\u001f\u0000\u0000\u00d9"+
		"\u00db\u0003\u0016\u000b\u0000\u00da\u00d8\u0001\u0000\u0000\u0000\u00da"+
		"\u00db\u0001\u0000\u0000\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc"+
		"\u00dd\u0005\u001d\u0000\u0000\u00dd\u00de\u0003\u0002\u0001\u0000\u00de"+
		"\u00df\u0005\u0018\u0000\u0000\u00df!\u0001\u0000\u0000\u0000\u00e0\u00e5"+
		"\u0005&\u0000\u0000\u00e1\u00e2\u0005\u0004\u0000\u0000\u00e2\u00e4\u0005"+
		"&\u0000\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e4\u00e7\u0001\u0000"+
		"\u0000\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000"+
		"\u0000\u0000\u00e6\u00e8\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000"+
		"\u0000\u0000\u00e8\u00e9\u0005\u001f\u0000\u0000\u00e9\u00ea\u0003\u0016"+
		"\u000b\u0000\u00ea#\u0001\u0000\u0000\u0000\u0018*149ENUbiuy\u007f\u0086"+
		"\u008d\u0094\u0098\u009e\u00a5\u00aa\u00b0\u00d0\u00d5\u00da\u00e5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}