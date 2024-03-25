// Generated from C:/Users/carlo/Documents/GitHub/ProyectoCompiladores/src/Grammar/Gramatica.g4 by ANTLR 4.13.1
package GeneratedGrammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class GramaticaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, INT_VAR=2, CHAR_VAR=3, STRING_VAR=4, OR=5, AND=6, VAR=7, PROGRAM=8, 
		BEGIN=9, WHILE=10, FOR=11, IF=12, ELSE=13, READ=14, WRITE=15, FUNC=16, 
		PROC=17, DO=18, PROGRAM_END=19, END=20, FOR_ORDER=21, DOWNTO=22, TO=23, 
		THEN=24, RET=25, STRING_TYPE=26, INT_TYPE=27, CHAR_TYPE=28, BOOL_TYPE=29, 
		ARRAY_TYPE=30, D_ARRAY_TYPE=31, ASSIGN=32, SEMI=33, COLON=34, COMMA=35, 
		PARENTHESIS_OP=36, PARENTHESIS_CL=37, BRACKET_OP=38, BRACKET_CL=39, COMP_OPERATOR=40, 
		SUM_OPERATOR=41, MULT_OPERATOR=42, TRUE=43, FALSE=44, COMM=45, ID=46, 
		WS=47;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "INT_VAR", "CHAR_VAR", "STRING_VAR", "OR", "AND", "VAR", "PROGRAM", 
			"BEGIN", "WHILE", "FOR", "IF", "ELSE", "READ", "WRITE", "FUNC", "PROC", 
			"DO", "PROGRAM_END", "END", "FOR_ORDER", "DOWNTO", "TO", "THEN", "RET", 
			"STRING_TYPE", "INT_TYPE", "CHAR_TYPE", "BOOL_TYPE", "ARRAY_TYPE", "D_ARRAY_TYPE", 
			"ASSIGN", "SEMI", "COLON", "COMMA", "PARENTHESIS_OP", "PARENTHESIS_CL", 
			"BRACKET_OP", "BRACKET_CL", "COMP_OPERATOR", "SUM_OPERATOR", "MULT_OPERATOR", 
			"TRUE", "FALSE", "COMM", "ID", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'array of'", null, null, null, "'OR'", "'AND'", "'VAR'", "'PROGRAM'", 
			"'BEGIN'", "'WHILE'", "'FOR'", "'IF'", "'ELSE'", null, null, "'FUNCTION'", 
			"'PROCEDURE'", "'DO'", "'END.'", "'END'", null, "'DOWNTO'", "'TO'", "'THEN'", 
			"'RETURN'", "'string'", null, "'char'", "'bool'", null, null, "':='", 
			"';'", "':'", "','", "'('", "')'", "'['", "']'", null, null, null, "'true'", 
			"'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "INT_VAR", "CHAR_VAR", "STRING_VAR", "OR", "AND", "VAR", 
			"PROGRAM", "BEGIN", "WHILE", "FOR", "IF", "ELSE", "READ", "WRITE", "FUNC", 
			"PROC", "DO", "PROGRAM_END", "END", "FOR_ORDER", "DOWNTO", "TO", "THEN", 
			"RET", "STRING_TYPE", "INT_TYPE", "CHAR_TYPE", "BOOL_TYPE", "ARRAY_TYPE", 
			"D_ARRAY_TYPE", "ASSIGN", "SEMI", "COLON", "COMMA", "PARENTHESIS_OP", 
			"PARENTHESIS_CL", "BRACKET_OP", "BRACKET_CL", "COMP_OPERATOR", "SUM_OPERATOR", 
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


	public GramaticaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Gramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000/\u018c\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0004\u0001j\b\u0001\u000b\u0001\f\u0001k\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002r\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003x\b\u0003\n\u0003\f\u0003"+
		"{\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00b4\b\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u00c2\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0003\u0014\u00e5"+
		"\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u010e\b\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0003\u001d\u012a\b\u001d\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0003\u001e\u0142\b\u001e\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001 \u0001 \u0001!\u0001!\u0001\"\u0001\"\u0001#\u0001#\u0001"+
		"$\u0001$\u0001%\u0001%\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0003\'\u015c\b\'\u0001(\u0001(\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0003)\u0167\b)\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001,\u0001,\u0005"+
		",\u0176\b,\n,\f,\u0179\t,\u0001,\u0001,\u0001,\u0001,\u0001-\u0001-\u0005"+
		"-\u0181\b-\n-\f-\u0184\t-\u0001.\u0004.\u0187\b.\u000b.\f.\u0188\u0001"+
		".\u0001.\u0001\u0177\u0000/\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b"+
		"\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013"+
		"\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d"+
		";\u001e=\u001f? A!C\"E#G$I%K&M\'O(Q)S*U+W,Y-[.]/\u0001\u0000\u001d\u0002"+
		"\u0000AAaa\u0002\u0000RRrr\u0002\u0000YYyy\u0002\u0000OOoo\u0002\u0000"+
		"FFff\u0001\u000009\u0002\u0000AZaz\u0003\u0000\n\n\r\r\"\"\u0002\u0000"+
		"NNnn\u0002\u0000DDdd\u0002\u0000VVvv\u0002\u0000PPpp\u0002\u0000GGgg\u0002"+
		"\u0000MMmm\u0002\u0000BBbb\u0002\u0000EEee\u0002\u0000IIii\u0002\u0000"+
		"WWww\u0002\u0000HHhh\u0002\u0000LLll\u0002\u0000SSss\u0002\u0000TTtt\u0002"+
		"\u0000UUuu\u0002\u0000CCcc\u0002\u0000++--\u0002\u0000**//\u0003\u0000"+
		"AZ__az\u0004\u000009AZ__az\u0002\u0000\t\n  \u019f\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000"+
		"\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000"+
		"#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001"+
		"\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000"+
		"\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u0000"+
		"1\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001"+
		"\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000"+
		"\u0000\u0000;\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000"+
		"?\u0001\u0000\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C\u0001"+
		"\u0000\u0000\u0000\u0000E\u0001\u0000\u0000\u0000\u0000G\u0001\u0000\u0000"+
		"\u0000\u0000I\u0001\u0000\u0000\u0000\u0000K\u0001\u0000\u0000\u0000\u0000"+
		"M\u0001\u0000\u0000\u0000\u0000O\u0001\u0000\u0000\u0000\u0000Q\u0001"+
		"\u0000\u0000\u0000\u0000S\u0001\u0000\u0000\u0000\u0000U\u0001\u0000\u0000"+
		"\u0000\u0000W\u0001\u0000\u0000\u0000\u0000Y\u0001\u0000\u0000\u0000\u0000"+
		"[\u0001\u0000\u0000\u0000\u0000]\u0001\u0000\u0000\u0000\u0001_\u0001"+
		"\u0000\u0000\u0000\u0003i\u0001\u0000\u0000\u0000\u0005q\u0001\u0000\u0000"+
		"\u0000\u0007s\u0001\u0000\u0000\u0000\t~\u0001\u0000\u0000\u0000\u000b"+
		"\u0081\u0001\u0000\u0000\u0000\r\u0085\u0001\u0000\u0000\u0000\u000f\u0089"+
		"\u0001\u0000\u0000\u0000\u0011\u0091\u0001\u0000\u0000\u0000\u0013\u0097"+
		"\u0001\u0000\u0000\u0000\u0015\u009d\u0001\u0000\u0000\u0000\u0017\u00a1"+
		"\u0001\u0000\u0000\u0000\u0019\u00a4\u0001\u0000\u0000\u0000\u001b\u00b3"+
		"\u0001\u0000\u0000\u0000\u001d\u00c1\u0001\u0000\u0000\u0000\u001f\u00c3"+
		"\u0001\u0000\u0000\u0000!\u00cc\u0001\u0000\u0000\u0000#\u00d6\u0001\u0000"+
		"\u0000\u0000%\u00d9\u0001\u0000\u0000\u0000\'\u00de\u0001\u0000\u0000"+
		"\u0000)\u00e4\u0001\u0000\u0000\u0000+\u00e6\u0001\u0000\u0000\u0000-"+
		"\u00ed\u0001\u0000\u0000\u0000/\u00f0\u0001\u0000\u0000\u00001\u00f5\u0001"+
		"\u0000\u0000\u00003\u00fc\u0001\u0000\u0000\u00005\u010d\u0001\u0000\u0000"+
		"\u00007\u010f\u0001\u0000\u0000\u00009\u0114\u0001\u0000\u0000\u0000;"+
		"\u0119\u0001\u0000\u0000\u0000=\u012b\u0001\u0000\u0000\u0000?\u0143\u0001"+
		"\u0000\u0000\u0000A\u0146\u0001\u0000\u0000\u0000C\u0148\u0001\u0000\u0000"+
		"\u0000E\u014a\u0001\u0000\u0000\u0000G\u014c\u0001\u0000\u0000\u0000I"+
		"\u014e\u0001\u0000\u0000\u0000K\u0150\u0001\u0000\u0000\u0000M\u0152\u0001"+
		"\u0000\u0000\u0000O\u015b\u0001\u0000\u0000\u0000Q\u015d\u0001\u0000\u0000"+
		"\u0000S\u0166\u0001\u0000\u0000\u0000U\u0168\u0001\u0000\u0000\u0000W"+
		"\u016d\u0001\u0000\u0000\u0000Y\u0173\u0001\u0000\u0000\u0000[\u017e\u0001"+
		"\u0000\u0000\u0000]\u0186\u0001\u0000\u0000\u0000_`\u0007\u0000\u0000"+
		"\u0000`a\u0007\u0001\u0000\u0000ab\u0007\u0001\u0000\u0000bc\u0007\u0000"+
		"\u0000\u0000cd\u0007\u0002\u0000\u0000de\u0005 \u0000\u0000ef\u0007\u0003"+
		"\u0000\u0000fg\u0007\u0004\u0000\u0000g\u0002\u0001\u0000\u0000\u0000"+
		"hj\u0007\u0005\u0000\u0000ih\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000"+
		"\u0000ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000l\u0004\u0001"+
		"\u0000\u0000\u0000mn\u0005\'\u0000\u0000no\u0007\u0006\u0000\u0000or\u0005"+
		"\'\u0000\u0000pr\u0003\u0003\u0001\u0000qm\u0001\u0000\u0000\u0000qp\u0001"+
		"\u0000\u0000\u0000r\u0006\u0001\u0000\u0000\u0000sy\u0005\'\u0000\u0000"+
		"tx\b\u0007\u0000\u0000uv\u0005\'\u0000\u0000vx\u0005\'\u0000\u0000wt\u0001"+
		"\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000x{\u0001\u0000\u0000\u0000"+
		"yw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z|\u0001\u0000\u0000"+
		"\u0000{y\u0001\u0000\u0000\u0000|}\u0005\'\u0000\u0000}\b\u0001\u0000"+
		"\u0000\u0000~\u007f\u0007\u0003\u0000\u0000\u007f\u0080\u0007\u0001\u0000"+
		"\u0000\u0080\n\u0001\u0000\u0000\u0000\u0081\u0082\u0007\u0000\u0000\u0000"+
		"\u0082\u0083\u0007\b\u0000\u0000\u0083\u0084\u0007\t\u0000\u0000\u0084"+
		"\f\u0001\u0000\u0000\u0000\u0085\u0086\u0007\n\u0000\u0000\u0086\u0087"+
		"\u0007\u0000\u0000\u0000\u0087\u0088\u0007\u0001\u0000\u0000\u0088\u000e"+
		"\u0001\u0000\u0000\u0000\u0089\u008a\u0007\u000b\u0000\u0000\u008a\u008b"+
		"\u0007\u0001\u0000\u0000\u008b\u008c\u0007\u0003\u0000\u0000\u008c\u008d"+
		"\u0007\f\u0000\u0000\u008d\u008e\u0007\u0001\u0000\u0000\u008e\u008f\u0007"+
		"\u0000\u0000\u0000\u008f\u0090\u0007\r\u0000\u0000\u0090\u0010\u0001\u0000"+
		"\u0000\u0000\u0091\u0092\u0007\u000e\u0000\u0000\u0092\u0093\u0007\u000f"+
		"\u0000\u0000\u0093\u0094\u0007\f\u0000\u0000\u0094\u0095\u0007\u0010\u0000"+
		"\u0000\u0095\u0096\u0007\b\u0000\u0000\u0096\u0012\u0001\u0000\u0000\u0000"+
		"\u0097\u0098\u0007\u0011\u0000\u0000\u0098\u0099\u0007\u0012\u0000\u0000"+
		"\u0099\u009a\u0007\u0010\u0000\u0000\u009a\u009b\u0007\u0013\u0000\u0000"+
		"\u009b\u009c\u0007\u000f\u0000\u0000\u009c\u0014\u0001\u0000\u0000\u0000"+
		"\u009d\u009e\u0007\u0004\u0000\u0000\u009e\u009f\u0007\u0003\u0000\u0000"+
		"\u009f\u00a0\u0007\u0001\u0000\u0000\u00a0\u0016\u0001\u0000\u0000\u0000"+
		"\u00a1\u00a2\u0007\u0010\u0000\u0000\u00a2\u00a3\u0007\u0004\u0000\u0000"+
		"\u00a3\u0018\u0001\u0000\u0000\u0000\u00a4\u00a5\u0007\u000f\u0000\u0000"+
		"\u00a5\u00a6\u0007\u0013\u0000\u0000\u00a6\u00a7\u0007\u0014\u0000\u0000"+
		"\u00a7\u00a8\u0007\u000f\u0000\u0000\u00a8\u001a\u0001\u0000\u0000\u0000"+
		"\u00a9\u00aa\u0007\u0001\u0000\u0000\u00aa\u00ab\u0007\u000f\u0000\u0000"+
		"\u00ab\u00ac\u0007\u0000\u0000\u0000\u00ac\u00b4\u0007\t\u0000\u0000\u00ad"+
		"\u00ae\u0007\u0001\u0000\u0000\u00ae\u00af\u0007\u000f\u0000\u0000\u00af"+
		"\u00b0\u0007\u0000\u0000\u0000\u00b0\u00b1\u0007\t\u0000\u0000\u00b1\u00b2"+
		"\u0007\u0013\u0000\u0000\u00b2\u00b4\u0007\b\u0000\u0000\u00b3\u00a9\u0001"+
		"\u0000\u0000\u0000\u00b3\u00ad\u0001\u0000\u0000\u0000\u00b4\u001c\u0001"+
		"\u0000\u0000\u0000\u00b5\u00b6\u0007\u0011\u0000\u0000\u00b6\u00b7\u0007"+
		"\u0001\u0000\u0000\u00b7\u00b8\u0007\u0010\u0000\u0000\u00b8\u00b9\u0007"+
		"\u0015\u0000\u0000\u00b9\u00c2\u0007\u000f\u0000\u0000\u00ba\u00bb\u0007"+
		"\u0011\u0000\u0000\u00bb\u00bc\u0007\u0001\u0000\u0000\u00bc\u00bd\u0007"+
		"\u0010\u0000\u0000\u00bd\u00be\u0007\u0015\u0000\u0000\u00be\u00bf\u0007"+
		"\u000f\u0000\u0000\u00bf\u00c0\u0007\u0013\u0000\u0000\u00c0\u00c2\u0007"+
		"\b\u0000\u0000\u00c1\u00b5\u0001\u0000\u0000\u0000\u00c1\u00ba\u0001\u0000"+
		"\u0000\u0000\u00c2\u001e\u0001\u0000\u0000\u0000\u00c3\u00c4\u0007\u0004"+
		"\u0000\u0000\u00c4\u00c5\u0007\u0016\u0000\u0000\u00c5\u00c6\u0007\b\u0000"+
		"\u0000\u00c6\u00c7\u0007\u0017\u0000\u0000\u00c7\u00c8\u0007\u0015\u0000"+
		"\u0000\u00c8\u00c9\u0007\u0010\u0000\u0000\u00c9\u00ca\u0007\u0003\u0000"+
		"\u0000\u00ca\u00cb\u0007\b\u0000\u0000\u00cb \u0001\u0000\u0000\u0000"+
		"\u00cc\u00cd\u0007\u000b\u0000\u0000\u00cd\u00ce\u0007\u0001\u0000\u0000"+
		"\u00ce\u00cf\u0007\u0003\u0000\u0000\u00cf\u00d0\u0007\u0017\u0000\u0000"+
		"\u00d0\u00d1\u0007\u000f\u0000\u0000\u00d1\u00d2\u0007\t\u0000\u0000\u00d2"+
		"\u00d3\u0007\u0016\u0000\u0000\u00d3\u00d4\u0007\u0001\u0000\u0000\u00d4"+
		"\u00d5\u0007\u000f\u0000\u0000\u00d5\"\u0001\u0000\u0000\u0000\u00d6\u00d7"+
		"\u0007\t\u0000\u0000\u00d7\u00d8\u0007\u0003\u0000\u0000\u00d8$\u0001"+
		"\u0000\u0000\u0000\u00d9\u00da\u0007\u000f\u0000\u0000\u00da\u00db\u0007"+
		"\b\u0000\u0000\u00db\u00dc\u0007\t\u0000\u0000\u00dc\u00dd\u0005.\u0000"+
		"\u0000\u00dd&\u0001\u0000\u0000\u0000\u00de\u00df\u0007\u000f\u0000\u0000"+
		"\u00df\u00e0\u0007\b\u0000\u0000\u00e0\u00e1\u0007\t\u0000\u0000\u00e1"+
		"(\u0001\u0000\u0000\u0000\u00e2\u00e5\u0003-\u0016\u0000\u00e3\u00e5\u0003"+
		"+\u0015\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e4\u00e3\u0001\u0000"+
		"\u0000\u0000\u00e5*\u0001\u0000\u0000\u0000\u00e6\u00e7\u0007\t\u0000"+
		"\u0000\u00e7\u00e8\u0007\u0003\u0000\u0000\u00e8\u00e9\u0007\u0011\u0000"+
		"\u0000\u00e9\u00ea\u0007\b\u0000\u0000\u00ea\u00eb\u0007\u0015\u0000\u0000"+
		"\u00eb\u00ec\u0007\u0003\u0000\u0000\u00ec,\u0001\u0000\u0000\u0000\u00ed"+
		"\u00ee\u0007\u0015\u0000\u0000\u00ee\u00ef\u0007\u0003\u0000\u0000\u00ef"+
		".\u0001\u0000\u0000\u0000\u00f0\u00f1\u0007\u0015\u0000\u0000\u00f1\u00f2"+
		"\u0007\u0012\u0000\u0000\u00f2\u00f3\u0007\u000f\u0000\u0000\u00f3\u00f4"+
		"\u0007\b\u0000\u0000\u00f40\u0001\u0000\u0000\u0000\u00f5\u00f6\u0007"+
		"\u0001\u0000\u0000\u00f6\u00f7\u0007\u000f\u0000\u0000\u00f7\u00f8\u0007"+
		"\u0015\u0000\u0000\u00f8\u00f9\u0007\u0016\u0000\u0000\u00f9\u00fa\u0007"+
		"\u0001\u0000\u0000\u00fa\u00fb\u0007\b\u0000\u0000\u00fb2\u0001\u0000"+
		"\u0000\u0000\u00fc\u00fd\u0007\u0014\u0000\u0000\u00fd\u00fe\u0007\u0015"+
		"\u0000\u0000\u00fe\u00ff\u0007\u0001\u0000\u0000\u00ff\u0100\u0007\u0010"+
		"\u0000\u0000\u0100\u0101\u0007\b\u0000\u0000\u0101\u0102\u0007\f\u0000"+
		"\u0000\u01024\u0001\u0000\u0000\u0000\u0103\u0104\u0007\u0010\u0000\u0000"+
		"\u0104\u0105\u0007\b\u0000\u0000\u0105\u010e\u0007\u0015\u0000\u0000\u0106"+
		"\u0107\u0007\u0010\u0000\u0000\u0107\u0108\u0007\b\u0000\u0000\u0108\u0109"+
		"\u0007\u0015\u0000\u0000\u0109\u010a\u0007\u000f\u0000\u0000\u010a\u010b"+
		"\u0007\f\u0000\u0000\u010b\u010c\u0007\u000f\u0000\u0000\u010c\u010e\u0007"+
		"\u0001\u0000\u0000\u010d\u0103\u0001\u0000\u0000\u0000\u010d\u0106\u0001"+
		"\u0000\u0000\u0000\u010e6\u0001\u0000\u0000\u0000\u010f\u0110\u0007\u0017"+
		"\u0000\u0000\u0110\u0111\u0007\u0012\u0000\u0000\u0111\u0112\u0007\u0000"+
		"\u0000\u0000\u0112\u0113\u0007\u0001\u0000\u0000\u01138\u0001\u0000\u0000"+
		"\u0000\u0114\u0115\u0007\u000e\u0000\u0000\u0115\u0116\u0007\u0003\u0000"+
		"\u0000\u0116\u0117\u0007\u0003\u0000\u0000\u0117\u0118\u0007\u0013\u0000"+
		"\u0000\u0118:\u0001\u0000\u0000\u0000\u0119\u011a\u0003[-\u0000\u011a"+
		"\u011b\u0005[\u0000\u0000\u011b\u011c\u0003\u0003\u0001\u0000\u011c\u011d"+
		"\u0005.\u0000\u0000\u011d\u011e\u0005.\u0000\u0000\u011e\u011f\u0001\u0000"+
		"\u0000\u0000\u011f\u0120\u0003\u0003\u0001\u0000\u0120\u0121\u0005]\u0000"+
		"\u0000\u0121\u0122\u0005 \u0000\u0000\u0122\u0123\u0007\u0003\u0000\u0000"+
		"\u0123\u0124\u0007\u0004\u0000\u0000\u0124\u0125\u0005 \u0000\u0000\u0125"+
		"\u0129\u0001\u0000\u0000\u0000\u0126\u012a\u00035\u001a\u0000\u0127\u012a"+
		"\u00037\u001b\u0000\u0128\u012a\u00033\u0019\u0000\u0129\u0126\u0001\u0000"+
		"\u0000\u0000\u0129\u0127\u0001\u0000\u0000\u0000\u0129\u0128\u0001\u0000"+
		"\u0000\u0000\u012a<\u0001\u0000\u0000\u0000\u012b\u012c\u0003[-\u0000"+
		"\u012c\u012d\u0005[\u0000\u0000\u012d\u012e\u0003\u0003\u0001\u0000\u012e"+
		"\u012f\u0005.\u0000\u0000\u012f\u0130\u0005.\u0000\u0000\u0130\u0131\u0001"+
		"\u0000\u0000\u0000\u0131\u0132\u0003\u0003\u0001\u0000\u0132\u0133\u0005"+
		",\u0000\u0000\u0133\u0134\u0003\u0003\u0001\u0000\u0134\u0135\u0005.\u0000"+
		"\u0000\u0135\u0136\u0005.\u0000\u0000\u0136\u0137\u0001\u0000\u0000\u0000"+
		"\u0137\u0138\u0003\u0003\u0001\u0000\u0138\u0139\u0005]\u0000\u0000\u0139"+
		"\u013a\u0005 \u0000\u0000\u013a\u013b\u0007\u0003\u0000\u0000\u013b\u013c"+
		"\u0007\u0004\u0000\u0000\u013c\u013d\u0005 \u0000\u0000\u013d\u0141\u0001"+
		"\u0000\u0000\u0000\u013e\u0142\u00035\u001a\u0000\u013f\u0142\u00037\u001b"+
		"\u0000\u0140\u0142\u00033\u0019\u0000\u0141\u013e\u0001\u0000\u0000\u0000"+
		"\u0141\u013f\u0001\u0000\u0000\u0000\u0141\u0140\u0001\u0000\u0000\u0000"+
		"\u0142>\u0001\u0000\u0000\u0000\u0143\u0144\u0005:\u0000\u0000\u0144\u0145"+
		"\u0005=\u0000\u0000\u0145@\u0001\u0000\u0000\u0000\u0146\u0147\u0005;"+
		"\u0000\u0000\u0147B\u0001\u0000\u0000\u0000\u0148\u0149\u0005:\u0000\u0000"+
		"\u0149D\u0001\u0000\u0000\u0000\u014a\u014b\u0005,\u0000\u0000\u014bF"+
		"\u0001\u0000\u0000\u0000\u014c\u014d\u0005(\u0000\u0000\u014dH\u0001\u0000"+
		"\u0000\u0000\u014e\u014f\u0005)\u0000\u0000\u014fJ\u0001\u0000\u0000\u0000"+
		"\u0150\u0151\u0005[\u0000\u0000\u0151L\u0001\u0000\u0000\u0000\u0152\u0153"+
		"\u0005]\u0000\u0000\u0153N\u0001\u0000\u0000\u0000\u0154\u0155\u0005<"+
		"\u0000\u0000\u0155\u015c\u0005>\u0000\u0000\u0156\u015c\u0002<>\u0000"+
		"\u0157\u0158\u0005>\u0000\u0000\u0158\u015c\u0005=\u0000\u0000\u0159\u015a"+
		"\u0005<\u0000\u0000\u015a\u015c\u0005=\u0000\u0000\u015b\u0154\u0001\u0000"+
		"\u0000\u0000\u015b\u0156\u0001\u0000\u0000\u0000\u015b\u0157\u0001\u0000"+
		"\u0000\u0000\u015b\u0159\u0001\u0000\u0000\u0000\u015cP\u0001\u0000\u0000"+
		"\u0000\u015d\u015e\u0007\u0018\u0000\u0000\u015eR\u0001\u0000\u0000\u0000"+
		"\u015f\u0167\u0007\u0019\u0000\u0000\u0160\u0161\u0007\t\u0000\u0000\u0161"+
		"\u0162\u0007\u0010\u0000\u0000\u0162\u0167\u0007\n\u0000\u0000\u0163\u0164"+
		"\u0007\r\u0000\u0000\u0164\u0165\u0007\u0003\u0000\u0000\u0165\u0167\u0007"+
		"\t\u0000\u0000\u0166\u015f\u0001\u0000\u0000\u0000\u0166\u0160\u0001\u0000"+
		"\u0000\u0000\u0166\u0163\u0001\u0000\u0000\u0000\u0167T\u0001\u0000\u0000"+
		"\u0000\u0168\u0169\u0007\u0015\u0000\u0000\u0169\u016a\u0007\u0001\u0000"+
		"\u0000\u016a\u016b\u0007\u0016\u0000\u0000\u016b\u016c\u0007\u000f\u0000"+
		"\u0000\u016cV\u0001\u0000\u0000\u0000\u016d\u016e\u0007\u0004\u0000\u0000"+
		"\u016e\u016f\u0007\u0000\u0000\u0000\u016f\u0170\u0007\u0013\u0000\u0000"+
		"\u0170\u0171\u0007\u0014\u0000\u0000\u0171\u0172\u0007\u000f\u0000\u0000"+
		"\u0172X\u0001\u0000\u0000\u0000\u0173\u0177\u0005{\u0000\u0000\u0174\u0176"+
		"\t\u0000\u0000\u0000\u0175\u0174\u0001\u0000\u0000\u0000\u0176\u0179\u0001"+
		"\u0000\u0000\u0000\u0177\u0178\u0001\u0000\u0000\u0000\u0177\u0175\u0001"+
		"\u0000\u0000\u0000\u0178\u017a\u0001\u0000\u0000\u0000\u0179\u0177\u0001"+
		"\u0000\u0000\u0000\u017a\u017b\u0005}\u0000\u0000\u017b\u017c\u0001\u0000"+
		"\u0000\u0000\u017c\u017d\u0006,\u0000\u0000\u017dZ\u0001\u0000\u0000\u0000"+
		"\u017e\u0182\u0007\u001a\u0000\u0000\u017f\u0181\u0007\u001b\u0000\u0000"+
		"\u0180\u017f\u0001\u0000\u0000\u0000\u0181\u0184\u0001\u0000\u0000\u0000"+
		"\u0182\u0180\u0001\u0000\u0000\u0000\u0182\u0183\u0001\u0000\u0000\u0000"+
		"\u0183\\\u0001\u0000\u0000\u0000\u0184\u0182\u0001\u0000\u0000\u0000\u0185"+
		"\u0187\u0007\u001c\u0000\u0000\u0186\u0185\u0001\u0000\u0000\u0000\u0187"+
		"\u0188\u0001\u0000\u0000\u0000\u0188\u0186\u0001\u0000\u0000\u0000\u0188"+
		"\u0189\u0001\u0000\u0000\u0000\u0189\u018a\u0001\u0000\u0000\u0000\u018a"+
		"\u018b\u0006.\u0000\u0000\u018b^\u0001\u0000\u0000\u0000\u0010\u0000k"+
		"qwy\u00b3\u00c1\u00e4\u010d\u0129\u0141\u015b\u0166\u0177\u0182\u0188"+
		"\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}