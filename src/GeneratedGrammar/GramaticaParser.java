// Generated from C:/Users/carlo/Documents/GitHub/ProyectoCompiladores/src/Grammar/Gramatica.g4 by ANTLR 4.13.1
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
public class GramaticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, INT_VAR=2, CHAR_VAR=3, STRING_VAR=4, OR=5, AND=6, VAR=7, PROGRAM=8, 
		BEGIN=9, WHILE=10, FOR=11, IF=12, ELSE=13, READ=14, WRITE=15, FUNC=16, 
		PROC=17, DO=18, PROGRAM_END=19, END=20, TO=21, THEN=22, RET=23, STRING_TYPE=24, 
		INT_TYPE=25, CHAR_TYPE=26, BOOL_TYPE=27, ARRAY_TYPE=28, ASSIGN=29, SEMI=30, 
		COLON=31, COMMA=32, PARENTHESIS_OP=33, PARENTHESIS_CL=34, BRACKET_OP=35, 
		BRACKET_CL=36, COMP_OPERATOR=37, SUM_OPERATOR=38, MULT_OPERATOR=39, TRUE=40, 
		FALSE=41, COMM=42, ID=43, WS=44;
	public static final int
		RULE_programa = 0, RULE_code_block = 1, RULE_structure_code = 2, RULE_function_code = 3, 
		RULE_row = 4, RULE_array_id = 5, RULE_array_type = 6, RULE_expr = 7, RULE_term = 8, 
		RULE_bool_expr = 9, RULE_bool_term = 10, RULE_bool_factor = 11, RULE_bool_operation = 12, 
		RULE_id = 13, RULE_init = 14, RULE_funcs_and_procs = 15, RULE_assignation = 16, 
		RULE_return = 17, RULE_var = 18, RULE_type = 19, RULE_params_type = 20, 
		RULE_int_element = 21, RULE_element = 22, RULE_while = 23, RULE_for = 24, 
		RULE_if = 25, RULE_else = 26, RULE_function_def = 27, RULE_function = 28, 
		RULE_procedure_def = 29, RULE_procedure = 30, RULE_read = 31, RULE_write = 32, 
		RULE_params = 33;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "code_block", "structure_code", "function_code", "row", "array_id", 
			"array_type", "expr", "term", "bool_expr", "bool_term", "bool_factor", 
			"bool_operation", "id", "init", "funcs_and_procs", "assignation", "return", 
			"var", "type", "params_type", "int_element", "element", "while", "for", 
			"if", "else", "function_def", "function", "procedure_def", "procedure", 
			"read", "write", "params"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'array of'", null, null, null, "'OR'", "'AND'", "'VAR'", "'PROGRAM'", 
			"'BEGIN'", "'WHILE'", "'FOR'", "'IF'", "'ELSE'", null, null, "'FUNCTION'", 
			"'PROCEDURE'", "'DO'", "'END.'", "'END'", "'TO'", "'THEN'", "'RETURN'", 
			"'string'", null, "'char'", "'bool'", null, "':='", "';'", "':'", "','", 
			"'('", "')'", "'['", "']'", null, null, null, "'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "INT_VAR", "CHAR_VAR", "STRING_VAR", "OR", "AND", "VAR", 
			"PROGRAM", "BEGIN", "WHILE", "FOR", "IF", "ELSE", "READ", "WRITE", "FUNC", 
			"PROC", "DO", "PROGRAM_END", "END", "TO", "THEN", "RET", "STRING_TYPE", 
			"INT_TYPE", "CHAR_TYPE", "BOOL_TYPE", "ARRAY_TYPE", "ASSIGN", "SEMI", 
			"COLON", "COMMA", "PARENTHESIS_OP", "PARENTHESIS_CL", "BRACKET_OP", "BRACKET_CL", 
			"COMP_OPERATOR", "SUM_OPERATOR", "MULT_OPERATOR", "TRUE", "FALSE", "COMM", 
			"ID", "WS"
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

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(GramaticaParser.PROGRAM, 0); }
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public List<TerminalNode> SEMI() { return getTokens(GramaticaParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(GramaticaParser.SEMI, i);
		}
		public TerminalNode BEGIN() { return getToken(GramaticaParser.BEGIN, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public TerminalNode PROGRAM_END() { return getToken(GramaticaParser.PROGRAM_END, 0); }
		public List<Funcs_and_procsContext> funcs_and_procs() {
			return getRuleContexts(Funcs_and_procsContext.class);
		}
		public Funcs_and_procsContext funcs_and_procs(int i) {
			return getRuleContext(Funcs_and_procsContext.class,i);
		}
		public List<TerminalNode> COMM() { return getTokens(GramaticaParser.COMM); }
		public TerminalNode COMM(int i) {
			return getToken(GramaticaParser.COMM, i);
		}
		public TerminalNode VAR() { return getToken(GramaticaParser.VAR, 0); }
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
			setState(68);
			match(PROGRAM);
			setState(69);
			match(ID);
			setState(70);
			match(SEMI);
			{
			setState(74);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(71);
					match(COMM);
					}
					} 
				}
				setState(76);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(77);
				match(VAR);
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(78);
					init();
					}
					}
					setState(83);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMM) {
				{
				{
				setState(86);
				match(COMM);
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNC || _la==PROC) {
				{
				{
				setState(92);
				funcs_and_procs();
				setState(93);
				match(SEMI);
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100);
			match(BEGIN);
			setState(101);
			code_block();
			setState(102);
			match(PROGRAM_END);
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
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 13194139589632L) != 0)) {
				{
				{
				setState(104);
				row();
				setState(105);
				match(SEMI);
				}
				}
				setState(111);
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
	public static class Structure_codeContext extends ParserRuleContext {
		public RowContext row() {
			return getRuleContext(RowContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(GramaticaParser.BEGIN, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public TerminalNode END() { return getToken(GramaticaParser.END, 0); }
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
		enterRule(_localctx, 4, RULE_structure_code);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
			case FOR:
			case IF:
			case READ:
			case WRITE:
			case COMM:
			case ID:
				{
				setState(112);
				row();
				}
				break;
			case BEGIN:
				{
				{
				setState(113);
				match(BEGIN);
				setState(114);
				code_block();
				setState(115);
				match(END);
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
	public static class Function_codeContext extends ParserRuleContext {
		public List<TerminalNode> SEMI() { return getTokens(GramaticaParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(GramaticaParser.SEMI, i);
		}
		public List<RowContext> row() {
			return getRuleContexts(RowContext.class);
		}
		public RowContext row(int i) {
			return getRuleContext(RowContext.class,i);
		}
		public List<ReturnContext> return_() {
			return getRuleContexts(ReturnContext.class);
		}
		public ReturnContext return_(int i) {
			return getRuleContext(ReturnContext.class,i);
		}
		public Function_codeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterFunction_code(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitFunction_code(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitFunction_code(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_codeContext function_code() throws RecognitionException {
		Function_codeContext _localctx = new Function_codeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function_code);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 13194147978240L) != 0)) {
				{
				{
				setState(121);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case WHILE:
				case FOR:
				case IF:
				case READ:
				case WRITE:
				case COMM:
				case ID:
					{
					setState(119);
					row();
					}
					break;
				case RET:
					{
					setState(120);
					return_();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(123);
				match(SEMI);
				}
				}
				setState(129);
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
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public WriteContext write() {
			return getRuleContext(WriteContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public ProcedureContext procedure() {
			return getRuleContext(ProcedureContext.class,0);
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
		enterRule(_localctx, 8, RULE_row);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(130);
				assignation();
				}
				break;
			case 2:
				{
				setState(131);
				read();
				}
				break;
			case 3:
				{
				setState(132);
				write();
				}
				break;
			case 4:
				{
				setState(133);
				function();
				}
				break;
			case 5:
				{
				setState(134);
				procedure();
				}
				break;
			case 6:
				{
				setState(135);
				while_();
				}
				break;
			case 7:
				{
				setState(136);
				for_();
				}
				break;
			case 8:
				{
				setState(137);
				if_();
				}
				break;
			case 9:
				{
				setState(138);
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
	public static class Array_idContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(GramaticaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GramaticaParser.ID, i);
		}
		public TerminalNode BRACKET_OP() { return getToken(GramaticaParser.BRACKET_OP, 0); }
		public TerminalNode BRACKET_CL() { return getToken(GramaticaParser.BRACKET_CL, 0); }
		public TerminalNode INT_VAR() { return getToken(GramaticaParser.INT_VAR, 0); }
		public Array_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterArray_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitArray_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitArray_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_idContext array_id() throws RecognitionException {
		Array_idContext _localctx = new Array_idContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_array_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(ID);
			setState(142);
			match(BRACKET_OP);
			setState(143);
			_la = _input.LA(1);
			if ( !(_la==INT_VAR || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(144);
			match(BRACKET_CL);
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
	public static class Array_typeContext extends ParserRuleContext {
		public TerminalNode INT_TYPE() { return getToken(GramaticaParser.INT_TYPE, 0); }
		public TerminalNode CHAR_TYPE() { return getToken(GramaticaParser.CHAR_TYPE, 0); }
		public TerminalNode STRING_TYPE() { return getToken(GramaticaParser.STRING_TYPE, 0); }
		public Array_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterArray_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitArray_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitArray_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_typeContext array_type() throws RecognitionException {
		Array_typeContext _localctx = new Array_typeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_array_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(146);
			match(T__0);
			setState(147);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 117440512L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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
	public static class ExprContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
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
		enterRule(_localctx, 14, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			{
			setState(149);
			term();
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SUM_OPERATOR) {
				{
				{
				setState(150);
				match(SUM_OPERATOR);
				setState(151);
				term();
				}
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
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
		public Int_elementContext int_element() {
			return getRuleContext(Int_elementContext.class,0);
		}
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
		public TerminalNode PARENTHESIS_OP() { return getToken(GramaticaParser.PARENTHESIS_OP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PARENTHESIS_CL() { return getToken(GramaticaParser.PARENTHESIS_CL, 0); }
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
		enterRule(_localctx, 16, RULE_term);
		try {
			int _alt;
			setState(169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_VAR:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(157);
				int_element();
				setState(162);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(158);
						match(MULT_OPERATOR);
						setState(159);
						term();
						}
						} 
					}
					setState(164);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				}
				}
				break;
			case PARENTHESIS_OP:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(165);
				match(PARENTHESIS_OP);
				setState(166);
				expr();
				setState(167);
				match(PARENTHESIS_CL);
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
		enterRule(_localctx, 18, RULE_bool_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(171);
			bool_term();
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(172);
				match(OR);
				setState(173);
				bool_term();
				}
				}
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
		public List<Bool_factorContext> bool_factor() {
			return getRuleContexts(Bool_factorContext.class);
		}
		public Bool_factorContext bool_factor(int i) {
			return getRuleContext(Bool_factorContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(GramaticaParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(GramaticaParser.AND, i);
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
		enterRule(_localctx, 20, RULE_bool_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(179);
			bool_factor();
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(180);
				match(AND);
				setState(181);
				bool_factor();
				}
				}
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
	public static class Bool_factorContext extends ParserRuleContext {
		public Bool_operationContext bool_operation() {
			return getRuleContext(Bool_operationContext.class,0);
		}
		public Bool_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterBool_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitBool_factor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitBool_factor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_factorContext bool_factor() throws RecognitionException {
		Bool_factorContext _localctx = new Bool_factorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_bool_factor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(187);
				bool_operation();
				}
				break;
			case 2:
				{
				setState(188);
				bool_operation();
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
	public static class Bool_operationContext extends ParserRuleContext {
		public List<Int_elementContext> int_element() {
			return getRuleContexts(Int_elementContext.class);
		}
		public Int_elementContext int_element(int i) {
			return getRuleContext(Int_elementContext.class,i);
		}
		public TerminalNode COMP_OPERATOR() { return getToken(GramaticaParser.COMP_OPERATOR, 0); }
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
		enterRule(_localctx, 24, RULE_bool_operation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			int_element();
			setState(192);
			match(COMP_OPERATOR);
			setState(193);
			int_element();
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
	public static class IdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public Array_idContext array_id() {
			return getRuleContext(Array_idContext.class,0);
		}
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(195);
				match(ID);
				}
				break;
			case 2:
				{
				setState(196);
				array_id();
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
		public List<TerminalNode> COMMA() { return getTokens(GramaticaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GramaticaParser.COMMA, i);
		}
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
		enterRule(_localctx, 28, RULE_init);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(ID);
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(200);
				match(COMMA);
				setState(201);
				match(ID);
				}
				}
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(207);
			match(COLON);
			setState(208);
			type();
			setState(209);
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
	public static class Funcs_and_procsContext extends ParserRuleContext {
		public Function_defContext function_def() {
			return getRuleContext(Function_defContext.class,0);
		}
		public Procedure_defContext procedure_def() {
			return getRuleContext(Procedure_defContext.class,0);
		}
		public Funcs_and_procsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcs_and_procs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterFuncs_and_procs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitFuncs_and_procs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitFuncs_and_procs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Funcs_and_procsContext funcs_and_procs() throws RecognitionException {
		Funcs_and_procsContext _localctx = new Funcs_and_procsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_funcs_and_procs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNC:
				{
				setState(211);
				function_def();
				}
				break;
			case PROC:
				{
				setState(212);
				procedure_def();
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
	public static class AssignationContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(GramaticaParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public TerminalNode STRING_VAR() { return getToken(GramaticaParser.STRING_VAR, 0); }
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
		enterRule(_localctx, 32, RULE_assignation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(215);
			id();
			setState(216);
			match(ASSIGN);
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(217);
				expr();
				}
				break;
			case 2:
				{
				setState(218);
				function();
				}
				break;
			case 3:
				{
				setState(219);
				match(STRING_VAR);
				}
				break;
			}
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
	public static class ReturnContext extends ParserRuleContext {
		public TerminalNode RET() { return getToken(GramaticaParser.RET, 0); }
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public ReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnContext return_() throws RecognitionException {
		ReturnContext _localctx = new ReturnContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(RET);
			setState(223);
			element();
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
		public Array_idContext array_id() {
			return getRuleContext(Array_idContext.class,0);
		}
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
		enterRule(_localctx, 36, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_VAR:
				{
				setState(225);
				match(INT_VAR);
				}
				break;
			case CHAR_VAR:
				{
				setState(226);
				match(CHAR_VAR);
				}
				break;
			case STRING_VAR:
				{
				setState(227);
				match(STRING_VAR);
				}
				break;
			case ID:
				{
				setState(228);
				array_id();
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
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode STRING_TYPE() { return getToken(GramaticaParser.STRING_TYPE, 0); }
		public TerminalNode INT_TYPE() { return getToken(GramaticaParser.INT_TYPE, 0); }
		public TerminalNode CHAR_TYPE() { return getToken(GramaticaParser.CHAR_TYPE, 0); }
		public TerminalNode BOOL_TYPE() { return getToken(GramaticaParser.BOOL_TYPE, 0); }
		public TerminalNode ARRAY_TYPE() { return getToken(GramaticaParser.ARRAY_TYPE, 0); }
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
		enterRule(_localctx, 38, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 520093696L) != 0)) ) {
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
	public static class Params_typeContext extends ParserRuleContext {
		public Array_typeContext array_type() {
			return getRuleContext(Array_typeContext.class,0);
		}
		public TerminalNode INT_TYPE() { return getToken(GramaticaParser.INT_TYPE, 0); }
		public TerminalNode CHAR_TYPE() { return getToken(GramaticaParser.CHAR_TYPE, 0); }
		public TerminalNode BOOL_TYPE() { return getToken(GramaticaParser.BOOL_TYPE, 0); }
		public TerminalNode STRING_TYPE() { return getToken(GramaticaParser.STRING_TYPE, 0); }
		public Params_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterParams_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitParams_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitParams_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Params_typeContext params_type() throws RecognitionException {
		Params_typeContext _localctx = new Params_typeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_params_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(233);
				array_type();
				}
				break;
			case INT_TYPE:
				{
				setState(234);
				match(INT_TYPE);
				}
				break;
			case CHAR_TYPE:
				{
				setState(235);
				match(CHAR_TYPE);
				}
				break;
			case BOOL_TYPE:
				{
				setState(236);
				match(BOOL_TYPE);
				}
				break;
			case STRING_TYPE:
				{
				setState(237);
				match(STRING_TYPE);
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
	public static class Int_elementContext extends ParserRuleContext {
		public TerminalNode INT_VAR() { return getToken(GramaticaParser.INT_VAR, 0); }
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public Array_idContext array_id() {
			return getRuleContext(Array_idContext.class,0);
		}
		public Int_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterInt_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitInt_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitInt_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_elementContext int_element() throws RecognitionException {
		Int_elementContext _localctx = new Int_elementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_int_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(240);
				match(INT_VAR);
				}
				break;
			case 2:
				{
				setState(241);
				match(ID);
				}
				break;
			case 3:
				{
				setState(242);
				array_id();
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
	public static class ElementContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public Array_idContext array_id() {
			return getRuleContext(Array_idContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(245);
				var();
				}
				break;
			case 2:
				{
				setState(246);
				match(ID);
				}
				break;
			case 3:
				{
				setState(247);
				array_id();
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
	public static class WhileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(GramaticaParser.WHILE, 0); }
		public TerminalNode PARENTHESIS_OP() { return getToken(GramaticaParser.PARENTHESIS_OP, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public TerminalNode PARENTHESIS_CL() { return getToken(GramaticaParser.PARENTHESIS_CL, 0); }
		public TerminalNode DO() { return getToken(GramaticaParser.DO, 0); }
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
		enterRule(_localctx, 46, RULE_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(WHILE);
			setState(251);
			match(PARENTHESIS_OP);
			setState(252);
			bool_expr();
			setState(253);
			match(PARENTHESIS_CL);
			setState(254);
			match(DO);
			setState(255);
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
		public TerminalNode FOR() { return getToken(GramaticaParser.FOR, 0); }
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(GramaticaParser.ASSIGN, 0); }
		public TerminalNode INT_VAR() { return getToken(GramaticaParser.INT_VAR, 0); }
		public TerminalNode TO() { return getToken(GramaticaParser.TO, 0); }
		public Int_elementContext int_element() {
			return getRuleContext(Int_elementContext.class,0);
		}
		public TerminalNode DO() { return getToken(GramaticaParser.DO, 0); }
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
		enterRule(_localctx, 48, RULE_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(FOR);
			setState(258);
			match(ID);
			setState(259);
			match(ASSIGN);
			setState(260);
			match(INT_VAR);
			setState(261);
			match(TO);
			setState(262);
			int_element();
			setState(263);
			match(DO);
			setState(264);
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
		public TerminalNode IF() { return getToken(GramaticaParser.IF, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public TerminalNode THEN() { return getToken(GramaticaParser.THEN, 0); }
		public Structure_codeContext structure_code() {
			return getRuleContext(Structure_codeContext.class,0);
		}
		public ElseContext else_() {
			return getRuleContext(ElseContext.class,0);
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
		enterRule(_localctx, 50, RULE_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(IF);
			setState(267);
			bool_expr();
			setState(268);
			match(THEN);
			setState(269);
			structure_code();
			setState(271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(270);
				else_();
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
	public static class ElseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(GramaticaParser.ELSE, 0); }
		public Structure_codeContext structure_code() {
			return getRuleContext(Structure_codeContext.class,0);
		}
		public ElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseContext else_() throws RecognitionException {
		ElseContext _localctx = new ElseContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_else);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(ELSE);
			setState(274);
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
	public static class Function_defContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(GramaticaParser.FUNC, 0); }
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TerminalNode PARENTHESIS_OP() { return getToken(GramaticaParser.PARENTHESIS_OP, 0); }
		public TerminalNode PARENTHESIS_CL() { return getToken(GramaticaParser.PARENTHESIS_CL, 0); }
		public TerminalNode SEMI() { return getToken(GramaticaParser.SEMI, 0); }
		public TerminalNode BEGIN() { return getToken(GramaticaParser.BEGIN, 0); }
		public Function_codeContext function_code() {
			return getRuleContext(Function_codeContext.class,0);
		}
		public TerminalNode END() { return getToken(GramaticaParser.END, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode COLON() { return getToken(GramaticaParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VAR() { return getToken(GramaticaParser.VAR, 0); }
		public List<InitContext> init() {
			return getRuleContexts(InitContext.class);
		}
		public InitContext init(int i) {
			return getRuleContext(InitContext.class,i);
		}
		public Function_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterFunction_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitFunction_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitFunction_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_defContext function_def() throws RecognitionException {
		Function_defContext _localctx = new Function_defContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_function_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(FUNC);
			setState(277);
			match(ID);
			setState(278);
			match(PARENTHESIS_OP);
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(279);
				params();
				}
			}

			setState(282);
			match(PARENTHESIS_CL);
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(283);
				match(COLON);
				setState(284);
				type();
				}
			}

			setState(287);
			match(SEMI);
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(288);
				match(VAR);
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(289);
					init();
					}
					}
					setState(294);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(297);
			match(BEGIN);
			setState(298);
			function_code();
			setState(299);
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
	public static class FunctionContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(GramaticaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GramaticaParser.ID, i);
		}
		public TerminalNode PARENTHESIS_OP() { return getToken(GramaticaParser.PARENTHESIS_OP, 0); }
		public TerminalNode PARENTHESIS_CL() { return getToken(GramaticaParser.PARENTHESIS_CL, 0); }
		public List<TerminalNode> COMMA() { return getTokens(GramaticaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GramaticaParser.COMMA, i);
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
		enterRule(_localctx, 56, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(ID);
			setState(302);
			match(PARENTHESIS_OP);
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(303);
				match(ID);
				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(304);
					match(COMMA);
					setState(305);
					match(ID);
					}
					}
					setState(310);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(313);
			match(PARENTHESIS_CL);
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
	public static class Procedure_defContext extends ParserRuleContext {
		public TerminalNode PROC() { return getToken(GramaticaParser.PROC, 0); }
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TerminalNode PARENTHESIS_OP() { return getToken(GramaticaParser.PARENTHESIS_OP, 0); }
		public TerminalNode PARENTHESIS_CL() { return getToken(GramaticaParser.PARENTHESIS_CL, 0); }
		public TerminalNode SEMI() { return getToken(GramaticaParser.SEMI, 0); }
		public TerminalNode BEGIN() { return getToken(GramaticaParser.BEGIN, 0); }
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
		public TerminalNode VAR() { return getToken(GramaticaParser.VAR, 0); }
		public List<InitContext> init() {
			return getRuleContexts(InitContext.class);
		}
		public InitContext init(int i) {
			return getRuleContext(InitContext.class,i);
		}
		public Procedure_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterProcedure_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitProcedure_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitProcedure_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Procedure_defContext procedure_def() throws RecognitionException {
		Procedure_defContext _localctx = new Procedure_defContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_procedure_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(PROC);
			setState(316);
			match(ID);
			setState(317);
			match(PARENTHESIS_OP);
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(318);
				params();
				}
			}

			setState(321);
			match(PARENTHESIS_CL);
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(322);
				match(COLON);
				setState(323);
				type();
				}
			}

			setState(326);
			match(SEMI);
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(327);
				match(VAR);
				setState(331);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(328);
					init();
					}
					}
					setState(333);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(336);
			match(BEGIN);
			setState(337);
			code_block();
			setState(338);
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
	public static class ProcedureContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(GramaticaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GramaticaParser.ID, i);
		}
		public TerminalNode PARENTHESIS_OP() { return getToken(GramaticaParser.PARENTHESIS_OP, 0); }
		public TerminalNode PARENTHESIS_CL() { return getToken(GramaticaParser.PARENTHESIS_CL, 0); }
		public List<TerminalNode> COMMA() { return getTokens(GramaticaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GramaticaParser.COMMA, i);
		}
		public ProcedureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterProcedure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitProcedure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitProcedure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureContext procedure() throws RecognitionException {
		ProcedureContext _localctx = new ProcedureContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_procedure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(ID);
			setState(341);
			match(PARENTHESIS_OP);
			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(342);
				match(ID);
				setState(347);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(343);
					match(COMMA);
					setState(344);
					match(ID);
					}
					}
					setState(349);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(352);
			match(PARENTHESIS_CL);
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
	public static class ReadContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(GramaticaParser.READ, 0); }
		public TerminalNode PARENTHESIS_OP() { return getToken(GramaticaParser.PARENTHESIS_OP, 0); }
		public TerminalNode PARENTHESIS_CL() { return getToken(GramaticaParser.PARENTHESIS_CL, 0); }
		public List<TerminalNode> ID() { return getTokens(GramaticaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GramaticaParser.ID, i);
		}
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitRead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_read);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(READ);
			setState(355);
			match(PARENTHESIS_OP);
			{
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(356);
				match(ID);
				}
				}
				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(362);
			match(PARENTHESIS_CL);
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
	public static class WriteContext extends ParserRuleContext {
		public TerminalNode WRITE() { return getToken(GramaticaParser.WRITE, 0); }
		public TerminalNode PARENTHESIS_OP() { return getToken(GramaticaParser.PARENTHESIS_OP, 0); }
		public TerminalNode PARENTHESIS_CL() { return getToken(GramaticaParser.PARENTHESIS_CL, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GramaticaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GramaticaParser.COMMA, i);
		}
		public WriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitWrite(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitWrite(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteContext write() throws RecognitionException {
		WriteContext _localctx = new WriteContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_write);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(WRITE);
			setState(365);
			match(PARENTHESIS_OP);
			{
			setState(366);
			element();
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(367);
				match(COMMA);
				setState(368);
				element();
				}
				}
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(374);
			match(PARENTHESIS_CL);
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
		public Params_typeContext params_type() {
			return getRuleContext(Params_typeContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(GramaticaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GramaticaParser.COMMA, i);
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
		enterRule(_localctx, 66, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			match(ID);
			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(377);
				match(COMMA);
				setState(378);
				match(ID);
				}
				}
				setState(383);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(384);
			match(COLON);
			setState(385);
			params_type();
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
		"\u0004\u0001,\u0184\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0005\u0000I\b\u0000\n\u0000\f\u0000L\t"+
		"\u0000\u0001\u0000\u0001\u0000\u0005\u0000P\b\u0000\n\u0000\f\u0000S\t"+
		"\u0000\u0003\u0000U\b\u0000\u0001\u0000\u0005\u0000X\b\u0000\n\u0000\f"+
		"\u0000[\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000`\b\u0000"+
		"\n\u0000\f\u0000c\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001l\b\u0001\n\u0001\f\u0001"+
		"o\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002v\b\u0002\u0001\u0003\u0001\u0003\u0003\u0003z\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0005\u0003~\b\u0003\n\u0003\f\u0003\u0081\t\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u008c\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u0099\b\u0007"+
		"\n\u0007\f\u0007\u009c\t\u0007\u0001\b\u0001\b\u0001\b\u0005\b\u00a1\b"+
		"\b\n\b\f\b\u00a4\t\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00aa\b\b"+
		"\u0001\t\u0001\t\u0001\t\u0005\t\u00af\b\t\n\t\f\t\u00b2\t\t\u0001\n\u0001"+
		"\n\u0001\n\u0005\n\u00b7\b\n\n\n\f\n\u00ba\t\n\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u00be\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0003\r\u00c6\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00cb"+
		"\b\u000e\n\u000e\f\u000e\u00ce\t\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0003\u000f\u00d6\b\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00dd\b\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0003\u0012\u00e6\b\u0012\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00ef\b\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u00f4\b\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0003\u0016\u00f9\b\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0003\u0019\u0110\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0119\b\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u011e\b\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0005\u001b\u0123\b\u001b\n\u001b\f\u001b\u0126"+
		"\t\u001b\u0003\u001b\u0128\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0005\u001c\u0133\b\u001c\n\u001c\f\u001c\u0136\t\u001c\u0003\u001c\u0138"+
		"\b\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0003\u001d\u0140\b\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003"+
		"\u001d\u0145\b\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u014a"+
		"\b\u001d\n\u001d\f\u001d\u014d\t\u001d\u0003\u001d\u014f\b\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u015a\b\u001e\n\u001e\f\u001e"+
		"\u015d\t\u001e\u0003\u001e\u015f\b\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u0166\b\u001f\n\u001f\f\u001f"+
		"\u0169\t\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0005 \u0172\b \n \f \u0175\t \u0001 \u0001 \u0001!\u0001!\u0001!\u0005"+
		"!\u017c\b!\n!\f!\u017f\t!\u0001!\u0001!\u0001!\u0001!\u0000\u0000\"\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:<>@B\u0000\u0003\u0002\u0000\u0002\u0002++\u0001"+
		"\u0000\u0018\u001a\u0001\u0000\u0018\u001c\u0198\u0000D\u0001\u0000\u0000"+
		"\u0000\u0002m\u0001\u0000\u0000\u0000\u0004u\u0001\u0000\u0000\u0000\u0006"+
		"\u007f\u0001\u0000\u0000\u0000\b\u008b\u0001\u0000\u0000\u0000\n\u008d"+
		"\u0001\u0000\u0000\u0000\f\u0092\u0001\u0000\u0000\u0000\u000e\u0095\u0001"+
		"\u0000\u0000\u0000\u0010\u00a9\u0001\u0000\u0000\u0000\u0012\u00ab\u0001"+
		"\u0000\u0000\u0000\u0014\u00b3\u0001\u0000\u0000\u0000\u0016\u00bd\u0001"+
		"\u0000\u0000\u0000\u0018\u00bf\u0001\u0000\u0000\u0000\u001a\u00c5\u0001"+
		"\u0000\u0000\u0000\u001c\u00c7\u0001\u0000\u0000\u0000\u001e\u00d5\u0001"+
		"\u0000\u0000\u0000 \u00d7\u0001\u0000\u0000\u0000\"\u00de\u0001\u0000"+
		"\u0000\u0000$\u00e5\u0001\u0000\u0000\u0000&\u00e7\u0001\u0000\u0000\u0000"+
		"(\u00ee\u0001\u0000\u0000\u0000*\u00f3\u0001\u0000\u0000\u0000,\u00f8"+
		"\u0001\u0000\u0000\u0000.\u00fa\u0001\u0000\u0000\u00000\u0101\u0001\u0000"+
		"\u0000\u00002\u010a\u0001\u0000\u0000\u00004\u0111\u0001\u0000\u0000\u0000"+
		"6\u0114\u0001\u0000\u0000\u00008\u012d\u0001\u0000\u0000\u0000:\u013b"+
		"\u0001\u0000\u0000\u0000<\u0154\u0001\u0000\u0000\u0000>\u0162\u0001\u0000"+
		"\u0000\u0000@\u016c\u0001\u0000\u0000\u0000B\u0178\u0001\u0000\u0000\u0000"+
		"DE\u0005\b\u0000\u0000EF\u0005+\u0000\u0000FJ\u0005\u001e\u0000\u0000"+
		"GI\u0005*\u0000\u0000HG\u0001\u0000\u0000\u0000IL\u0001\u0000\u0000\u0000"+
		"JH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KT\u0001\u0000\u0000"+
		"\u0000LJ\u0001\u0000\u0000\u0000MQ\u0005\u0007\u0000\u0000NP\u0003\u001c"+
		"\u000e\u0000ON\u0001\u0000\u0000\u0000PS\u0001\u0000\u0000\u0000QO\u0001"+
		"\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RU\u0001\u0000\u0000\u0000"+
		"SQ\u0001\u0000\u0000\u0000TM\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000"+
		"\u0000UY\u0001\u0000\u0000\u0000VX\u0005*\u0000\u0000WV\u0001\u0000\u0000"+
		"\u0000X[\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000YZ\u0001\u0000"+
		"\u0000\u0000Za\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000\\]\u0003"+
		"\u001e\u000f\u0000]^\u0005\u001e\u0000\u0000^`\u0001\u0000\u0000\u0000"+
		"_\\\u0001\u0000\u0000\u0000`c\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000"+
		"\u0000ab\u0001\u0000\u0000\u0000bd\u0001\u0000\u0000\u0000ca\u0001\u0000"+
		"\u0000\u0000de\u0005\t\u0000\u0000ef\u0003\u0002\u0001\u0000fg\u0005\u0013"+
		"\u0000\u0000g\u0001\u0001\u0000\u0000\u0000hi\u0003\b\u0004\u0000ij\u0005"+
		"\u001e\u0000\u0000jl\u0001\u0000\u0000\u0000kh\u0001\u0000\u0000\u0000"+
		"lo\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000"+
		"\u0000n\u0003\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000pv\u0003"+
		"\b\u0004\u0000qr\u0005\t\u0000\u0000rs\u0003\u0002\u0001\u0000st\u0005"+
		"\u0014\u0000\u0000tv\u0001\u0000\u0000\u0000up\u0001\u0000\u0000\u0000"+
		"uq\u0001\u0000\u0000\u0000v\u0005\u0001\u0000\u0000\u0000wz\u0003\b\u0004"+
		"\u0000xz\u0003\"\u0011\u0000yw\u0001\u0000\u0000\u0000yx\u0001\u0000\u0000"+
		"\u0000z{\u0001\u0000\u0000\u0000{|\u0005\u001e\u0000\u0000|~\u0001\u0000"+
		"\u0000\u0000}y\u0001\u0000\u0000\u0000~\u0081\u0001\u0000\u0000\u0000"+
		"\u007f}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080"+
		"\u0007\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0082"+
		"\u008c\u0003 \u0010\u0000\u0083\u008c\u0003>\u001f\u0000\u0084\u008c\u0003"+
		"@ \u0000\u0085\u008c\u00038\u001c\u0000\u0086\u008c\u0003<\u001e\u0000"+
		"\u0087\u008c\u0003.\u0017\u0000\u0088\u008c\u00030\u0018\u0000\u0089\u008c"+
		"\u00032\u0019\u0000\u008a\u008c\u0005*\u0000\u0000\u008b\u0082\u0001\u0000"+
		"\u0000\u0000\u008b\u0083\u0001\u0000\u0000\u0000\u008b\u0084\u0001\u0000"+
		"\u0000\u0000\u008b\u0085\u0001\u0000\u0000\u0000\u008b\u0086\u0001\u0000"+
		"\u0000\u0000\u008b\u0087\u0001\u0000\u0000\u0000\u008b\u0088\u0001\u0000"+
		"\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008b\u008a\u0001\u0000"+
		"\u0000\u0000\u008c\t\u0001\u0000\u0000\u0000\u008d\u008e\u0005+\u0000"+
		"\u0000\u008e\u008f\u0005#\u0000\u0000\u008f\u0090\u0007\u0000\u0000\u0000"+
		"\u0090\u0091\u0005$\u0000\u0000\u0091\u000b\u0001\u0000\u0000\u0000\u0092"+
		"\u0093\u0005\u0001\u0000\u0000\u0093\u0094\u0007\u0001\u0000\u0000\u0094"+
		"\r\u0001\u0000\u0000\u0000\u0095\u009a\u0003\u0010\b\u0000\u0096\u0097"+
		"\u0005&\u0000\u0000\u0097\u0099\u0003\u0010\b\u0000\u0098\u0096\u0001"+
		"\u0000\u0000\u0000\u0099\u009c\u0001\u0000\u0000\u0000\u009a\u0098\u0001"+
		"\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u000f\u0001"+
		"\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009d\u00a2\u0003"+
		"*\u0015\u0000\u009e\u009f\u0005\'\u0000\u0000\u009f\u00a1\u0003\u0010"+
		"\b\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a1\u00a4\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000"+
		"\u0000\u00a3\u00aa\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a6\u0005!\u0000\u0000\u00a6\u00a7\u0003\u000e\u0007\u0000"+
		"\u00a7\u00a8\u0005\"\u0000\u0000\u00a8\u00aa\u0001\u0000\u0000\u0000\u00a9"+
		"\u009d\u0001\u0000\u0000\u0000\u00a9\u00a5\u0001\u0000\u0000\u0000\u00aa"+
		"\u0011\u0001\u0000\u0000\u0000\u00ab\u00b0\u0003\u0014\n\u0000\u00ac\u00ad"+
		"\u0005\u0005\u0000\u0000\u00ad\u00af\u0003\u0014\n\u0000\u00ae\u00ac\u0001"+
		"\u0000\u0000\u0000\u00af\u00b2\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001"+
		"\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u0013\u0001"+
		"\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b3\u00b8\u0003"+
		"\u0016\u000b\u0000\u00b4\u00b5\u0005\u0006\u0000\u0000\u00b5\u00b7\u0003"+
		"\u0016\u000b\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b7\u00ba\u0001"+
		"\u0000\u0000\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001"+
		"\u0000\u0000\u0000\u00b9\u0015\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001"+
		"\u0000\u0000\u0000\u00bb\u00be\u0003\u0018\f\u0000\u00bc\u00be\u0003\u0018"+
		"\f\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00bd\u00bc\u0001\u0000\u0000"+
		"\u0000\u00be\u0017\u0001\u0000\u0000\u0000\u00bf\u00c0\u0003*\u0015\u0000"+
		"\u00c0\u00c1\u0005%\u0000\u0000\u00c1\u00c2\u0003*\u0015\u0000\u00c2\u0019"+
		"\u0001\u0000\u0000\u0000\u00c3\u00c6\u0005+\u0000\u0000\u00c4\u00c6\u0003"+
		"\n\u0005\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c4\u0001\u0000"+
		"\u0000\u0000\u00c6\u001b\u0001\u0000\u0000\u0000\u00c7\u00cc\u0005+\u0000"+
		"\u0000\u00c8\u00c9\u0005 \u0000\u0000\u00c9\u00cb\u0005+\u0000\u0000\u00ca"+
		"\u00c8\u0001\u0000\u0000\u0000\u00cb\u00ce\u0001\u0000\u0000\u0000\u00cc"+
		"\u00ca\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd"+
		"\u00cf\u0001\u0000\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00cf"+
		"\u00d0\u0005\u001f\u0000\u0000\u00d0\u00d1\u0003&\u0013\u0000\u00d1\u00d2"+
		"\u0005\u001e\u0000\u0000\u00d2\u001d\u0001\u0000\u0000\u0000\u00d3\u00d6"+
		"\u00036\u001b\u0000\u00d4\u00d6\u0003:\u001d\u0000\u00d5\u00d3\u0001\u0000"+
		"\u0000\u0000\u00d5\u00d4\u0001\u0000\u0000\u0000\u00d6\u001f\u0001\u0000"+
		"\u0000\u0000\u00d7\u00d8\u0003\u001a\r\u0000\u00d8\u00dc\u0005\u001d\u0000"+
		"\u0000\u00d9\u00dd\u0003\u000e\u0007\u0000\u00da\u00dd\u00038\u001c\u0000"+
		"\u00db\u00dd\u0005\u0004\u0000\u0000\u00dc\u00d9\u0001\u0000\u0000\u0000"+
		"\u00dc\u00da\u0001\u0000\u0000\u0000\u00dc\u00db\u0001\u0000\u0000\u0000"+
		"\u00dd!\u0001\u0000\u0000\u0000\u00de\u00df\u0005\u0017\u0000\u0000\u00df"+
		"\u00e0\u0003,\u0016\u0000\u00e0#\u0001\u0000\u0000\u0000\u00e1\u00e6\u0005"+
		"\u0002\u0000\u0000\u00e2\u00e6\u0005\u0003\u0000\u0000\u00e3\u00e6\u0005"+
		"\u0004\u0000\u0000\u00e4\u00e6\u0003\n\u0005\u0000\u00e5\u00e1\u0001\u0000"+
		"\u0000\u0000\u00e5\u00e2\u0001\u0000\u0000\u0000\u00e5\u00e3\u0001\u0000"+
		"\u0000\u0000\u00e5\u00e4\u0001\u0000\u0000\u0000\u00e6%\u0001\u0000\u0000"+
		"\u0000\u00e7\u00e8\u0007\u0002\u0000\u0000\u00e8\'\u0001\u0000\u0000\u0000"+
		"\u00e9\u00ef\u0003\f\u0006\u0000\u00ea\u00ef\u0005\u0019\u0000\u0000\u00eb"+
		"\u00ef\u0005\u001a\u0000\u0000\u00ec\u00ef\u0005\u001b\u0000\u0000\u00ed"+
		"\u00ef\u0005\u0018\u0000\u0000\u00ee\u00e9\u0001\u0000\u0000\u0000\u00ee"+
		"\u00ea\u0001\u0000\u0000\u0000\u00ee\u00eb\u0001\u0000\u0000\u0000\u00ee"+
		"\u00ec\u0001\u0000\u0000\u0000\u00ee\u00ed\u0001\u0000\u0000\u0000\u00ef"+
		")\u0001\u0000\u0000\u0000\u00f0\u00f4\u0005\u0002\u0000\u0000\u00f1\u00f4"+
		"\u0005+\u0000\u0000\u00f2\u00f4\u0003\n\u0005\u0000\u00f3\u00f0\u0001"+
		"\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f3\u00f2\u0001"+
		"\u0000\u0000\u0000\u00f4+\u0001\u0000\u0000\u0000\u00f5\u00f9\u0003$\u0012"+
		"\u0000\u00f6\u00f9\u0005+\u0000\u0000\u00f7\u00f9\u0003\n\u0005\u0000"+
		"\u00f8\u00f5\u0001\u0000\u0000\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000"+
		"\u00f8\u00f7\u0001\u0000\u0000\u0000\u00f9-\u0001\u0000\u0000\u0000\u00fa"+
		"\u00fb\u0005\n\u0000\u0000\u00fb\u00fc\u0005!\u0000\u0000\u00fc\u00fd"+
		"\u0003\u0012\t\u0000\u00fd\u00fe\u0005\"\u0000\u0000\u00fe\u00ff\u0005"+
		"\u0012\u0000\u0000\u00ff\u0100\u0003\u0004\u0002\u0000\u0100/\u0001\u0000"+
		"\u0000\u0000\u0101\u0102\u0005\u000b\u0000\u0000\u0102\u0103\u0005+\u0000"+
		"\u0000\u0103\u0104\u0005\u001d\u0000\u0000\u0104\u0105\u0005\u0002\u0000"+
		"\u0000\u0105\u0106\u0005\u0015\u0000\u0000\u0106\u0107\u0003*\u0015\u0000"+
		"\u0107\u0108\u0005\u0012\u0000\u0000\u0108\u0109\u0003\u0004\u0002\u0000"+
		"\u01091\u0001\u0000\u0000\u0000\u010a\u010b\u0005\f\u0000\u0000\u010b"+
		"\u010c\u0003\u0012\t\u0000\u010c\u010d\u0005\u0016\u0000\u0000\u010d\u010f"+
		"\u0003\u0004\u0002\u0000\u010e\u0110\u00034\u001a\u0000\u010f\u010e\u0001"+
		"\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u01103\u0001\u0000"+
		"\u0000\u0000\u0111\u0112\u0005\r\u0000\u0000\u0112\u0113\u0003\u0004\u0002"+
		"\u0000\u01135\u0001\u0000\u0000\u0000\u0114\u0115\u0005\u0010\u0000\u0000"+
		"\u0115\u0116\u0005+\u0000\u0000\u0116\u0118\u0005!\u0000\u0000\u0117\u0119"+
		"\u0003B!\u0000\u0118\u0117\u0001\u0000\u0000\u0000\u0118\u0119\u0001\u0000"+
		"\u0000\u0000\u0119\u011a\u0001\u0000\u0000\u0000\u011a\u011d\u0005\"\u0000"+
		"\u0000\u011b\u011c\u0005\u001f\u0000\u0000\u011c\u011e\u0003&\u0013\u0000"+
		"\u011d\u011b\u0001\u0000\u0000\u0000\u011d\u011e\u0001\u0000\u0000\u0000"+
		"\u011e\u011f\u0001\u0000\u0000\u0000\u011f\u0127\u0005\u001e\u0000\u0000"+
		"\u0120\u0124\u0005\u0007\u0000\u0000\u0121\u0123\u0003\u001c\u000e\u0000"+
		"\u0122\u0121\u0001\u0000\u0000\u0000\u0123\u0126\u0001\u0000\u0000\u0000"+
		"\u0124\u0122\u0001\u0000\u0000\u0000\u0124\u0125\u0001\u0000\u0000\u0000"+
		"\u0125\u0128\u0001\u0000\u0000\u0000\u0126\u0124\u0001\u0000\u0000\u0000"+
		"\u0127\u0120\u0001\u0000\u0000\u0000\u0127\u0128\u0001\u0000\u0000\u0000"+
		"\u0128\u0129\u0001\u0000\u0000\u0000\u0129\u012a\u0005\t\u0000\u0000\u012a"+
		"\u012b\u0003\u0006\u0003\u0000\u012b\u012c\u0005\u0014\u0000\u0000\u012c"+
		"7\u0001\u0000\u0000\u0000\u012d\u012e\u0005+\u0000\u0000\u012e\u0137\u0005"+
		"!\u0000\u0000\u012f\u0134\u0005+\u0000\u0000\u0130\u0131\u0005 \u0000"+
		"\u0000\u0131\u0133\u0005+\u0000\u0000\u0132\u0130\u0001\u0000\u0000\u0000"+
		"\u0133\u0136\u0001\u0000\u0000\u0000\u0134\u0132\u0001\u0000\u0000\u0000"+
		"\u0134\u0135\u0001\u0000\u0000\u0000\u0135\u0138\u0001\u0000\u0000\u0000"+
		"\u0136\u0134\u0001\u0000\u0000\u0000\u0137\u012f\u0001\u0000\u0000\u0000"+
		"\u0137\u0138\u0001\u0000\u0000\u0000\u0138\u0139\u0001\u0000\u0000\u0000"+
		"\u0139\u013a\u0005\"\u0000\u0000\u013a9\u0001\u0000\u0000\u0000\u013b"+
		"\u013c\u0005\u0011\u0000\u0000\u013c\u013d\u0005+\u0000\u0000\u013d\u013f"+
		"\u0005!\u0000\u0000\u013e\u0140\u0003B!\u0000\u013f\u013e\u0001\u0000"+
		"\u0000\u0000\u013f\u0140\u0001\u0000\u0000\u0000\u0140\u0141\u0001\u0000"+
		"\u0000\u0000\u0141\u0144\u0005\"\u0000\u0000\u0142\u0143\u0005\u001f\u0000"+
		"\u0000\u0143\u0145\u0003&\u0013\u0000\u0144\u0142\u0001\u0000\u0000\u0000"+
		"\u0144\u0145\u0001\u0000\u0000\u0000\u0145\u0146\u0001\u0000\u0000\u0000"+
		"\u0146\u014e\u0005\u001e\u0000\u0000\u0147\u014b\u0005\u0007\u0000\u0000"+
		"\u0148\u014a\u0003\u001c\u000e\u0000\u0149\u0148\u0001\u0000\u0000\u0000"+
		"\u014a\u014d\u0001\u0000\u0000\u0000\u014b\u0149\u0001\u0000\u0000\u0000"+
		"\u014b\u014c\u0001\u0000\u0000\u0000\u014c\u014f\u0001\u0000\u0000\u0000"+
		"\u014d\u014b\u0001\u0000\u0000\u0000\u014e\u0147\u0001\u0000\u0000\u0000"+
		"\u014e\u014f\u0001\u0000\u0000\u0000\u014f\u0150\u0001\u0000\u0000\u0000"+
		"\u0150\u0151\u0005\t\u0000\u0000\u0151\u0152\u0003\u0002\u0001\u0000\u0152"+
		"\u0153\u0005\u0014\u0000\u0000\u0153;\u0001\u0000\u0000\u0000\u0154\u0155"+
		"\u0005+\u0000\u0000\u0155\u015e\u0005!\u0000\u0000\u0156\u015b\u0005+"+
		"\u0000\u0000\u0157\u0158\u0005 \u0000\u0000\u0158\u015a\u0005+\u0000\u0000"+
		"\u0159\u0157\u0001\u0000\u0000\u0000\u015a\u015d\u0001\u0000\u0000\u0000"+
		"\u015b\u0159\u0001\u0000\u0000\u0000\u015b\u015c\u0001\u0000\u0000\u0000"+
		"\u015c\u015f\u0001\u0000\u0000\u0000\u015d\u015b\u0001\u0000\u0000\u0000"+
		"\u015e\u0156\u0001\u0000\u0000\u0000\u015e\u015f\u0001\u0000\u0000\u0000"+
		"\u015f\u0160\u0001\u0000\u0000\u0000\u0160\u0161\u0005\"\u0000\u0000\u0161"+
		"=\u0001\u0000\u0000\u0000\u0162\u0163\u0005\u000e\u0000\u0000\u0163\u0167"+
		"\u0005!\u0000\u0000\u0164\u0166\u0005+\u0000\u0000\u0165\u0164\u0001\u0000"+
		"\u0000\u0000\u0166\u0169\u0001\u0000\u0000\u0000\u0167\u0165\u0001\u0000"+
		"\u0000\u0000\u0167\u0168\u0001\u0000\u0000\u0000\u0168\u016a\u0001\u0000"+
		"\u0000\u0000\u0169\u0167\u0001\u0000\u0000\u0000\u016a\u016b\u0005\"\u0000"+
		"\u0000\u016b?\u0001\u0000\u0000\u0000\u016c\u016d\u0005\u000f\u0000\u0000"+
		"\u016d\u016e\u0005!\u0000\u0000\u016e\u0173\u0003,\u0016\u0000\u016f\u0170"+
		"\u0005 \u0000\u0000\u0170\u0172\u0003,\u0016\u0000\u0171\u016f\u0001\u0000"+
		"\u0000\u0000\u0172\u0175\u0001\u0000\u0000\u0000\u0173\u0171\u0001\u0000"+
		"\u0000\u0000\u0173\u0174\u0001\u0000\u0000\u0000\u0174\u0176\u0001\u0000"+
		"\u0000\u0000\u0175\u0173\u0001\u0000\u0000\u0000\u0176\u0177\u0005\"\u0000"+
		"\u0000\u0177A\u0001\u0000\u0000\u0000\u0178\u017d\u0005+\u0000\u0000\u0179"+
		"\u017a\u0005 \u0000\u0000\u017a\u017c\u0005+\u0000\u0000\u017b\u0179\u0001"+
		"\u0000\u0000\u0000\u017c\u017f\u0001\u0000\u0000\u0000\u017d\u017b\u0001"+
		"\u0000\u0000\u0000\u017d\u017e\u0001\u0000\u0000\u0000\u017e\u0180\u0001"+
		"\u0000\u0000\u0000\u017f\u017d\u0001\u0000\u0000\u0000\u0180\u0181\u0005"+
		"\u001f\u0000\u0000\u0181\u0182\u0003(\u0014\u0000\u0182C\u0001\u0000\u0000"+
		"\u0000(JQTYamuy\u007f\u008b\u009a\u00a2\u00a9\u00b0\u00b8\u00bd\u00c5"+
		"\u00cc\u00d5\u00dc\u00e5\u00ee\u00f3\u00f8\u010f\u0118\u011d\u0124\u0127"+
		"\u0134\u0137\u013f\u0144\u014b\u014e\u015b\u015e\u0167\u0173\u017d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}