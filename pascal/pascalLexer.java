// Generated from pascal.g4 by ANTLR 4.5
package pascal;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class pascalLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, WS=50, COMMENT_1=51, COMMENT_2=52, 
		IDENT=53, STRING_LITERAL=54, NUM_INT=55, NUM_REAL=56, EXPONENT=57, PLUS=58, 
		MINUS=59, STAR=60, SLASH=61, ASSIGN=62, COMMA=63, SEMI=64, COLON=65, EQUAL=66, 
		NOT_EQUAL=67, LT=68, LE=69, GE=70, GT=71, LPAREN=72, RPAREN=73, LBRACK=74, 
		LBRACK2=75, RBRACK=76, RBRACK2=77, POINTER=78, AT=79, DOT=80, DOTDOT=81, 
		LCURLY=82, RCURLY=83;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
		"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
		"T__41", "T__42", "T__43", "T__44", "T__45", "T__46", "T__47", "T__48", 
		"WS", "COMMENT_1", "COMMENT_2", "IDENT", "STRING_LITERAL", "NUM_INT", 
		"NUM_REAL", "EXPONENT", "PLUS", "MINUS", "STAR", "SLASH", "ASSIGN", "COMMA", 
		"SEMI", "COLON", "EQUAL", "NOT_EQUAL", "LT", "LE", "GE", "GT", "LPAREN", 
		"RPAREN", "LBRACK", "LBRACK2", "RBRACK", "RBRACK2", "POINTER", "AT", "DOT", 
		"DOTDOT", "LCURLY", "RCURLY"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'INTERFACE'", "'PROGRAM'", "'UNIT'", "'IMPLEMENTATION'", "'USES'", 
		"'LABEL'", "'CONST'", "'CHR'", "'TYPE '", "'FUNCTION'", "'PROCEDURE'", 
		"'CHAR'", "'BOOLEAN'", "'INTEGER'", "'REAL'", "'STRING'", "'PACKED'", 
		"'ARRAY'", "'OF'", "'RECORD'", "'END'", "'CASE'", "'SET'", "'FILE'", "'POINTER'", 
		"'VAR'", "'FORWARD'", "'EXIT'", "'AT'", "'IN'", "'OR'", "'DIV'", "'MOD'", 
		"'AND'", "'NOT'", "'NIL'", "'GOTO'", "'BEGIN'", "'IF'", "'THEN'", "'ELSE'", 
		"'WHILE'", "'DO'", "'REPEAT'", "'UNTIL'", "'FOR'", "'TO'", "'DOWNTO'", 
		"'WITH'", null, null, null, null, null, null, null, null, "'+'", "'-'", 
		"'*'", "'/'", "':='", "','", "';'", "':'", "'='", "'<>'", "'<'", "'<='", 
		"'>='", "'>'", "'('", "')'", "'['", "'(.'", "']'", "'.)'", "'^'", "'@'", 
		"'.'", "'..'", "'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "WS", "COMMENT_1", "COMMENT_2", "IDENT", "STRING_LITERAL", 
		"NUM_INT", "NUM_REAL", "EXPONENT", "PLUS", "MINUS", "STAR", "SLASH", "ASSIGN", 
		"COMMA", "SEMI", "COLON", "EQUAL", "NOT_EQUAL", "LT", "LE", "GE", "GT", 
		"LPAREN", "RPAREN", "LBRACK", "LBRACK2", "RBRACK", "RBRACK2", "POINTER", 
		"AT", "DOT", "DOTDOT", "LCURLY", "RCURLY"
	};
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


	public pascalLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "pascal.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2U\u0242\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3"+
		"#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3,\3,\3,\3-\3"+
		"-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3\60\3\60\3\60\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\63\6\63\u01c0\n\63"+
		"\r\63\16\63\u01c1\3\63\3\63\3\64\3\64\3\64\7\64\u01c9\n\64\f\64\16\64"+
		"\u01cc\13\64\3\64\3\64\3\64\3\65\3\65\7\65\u01d3\n\65\f\65\16\65\u01d6"+
		"\13\65\3\65\3\65\3\66\3\66\7\66\u01dc\n\66\f\66\16\66\u01df\13\66\3\67"+
		"\3\67\3\67\3\67\7\67\u01e5\n\67\f\67\16\67\u01e8\13\67\3\67\3\67\38\6"+
		"8\u01ed\n8\r8\168\u01ee\39\69\u01f2\n9\r9\169\u01f3\39\39\69\u01f8\n9"+
		"\r9\169\u01f9\39\59\u01fd\n9\3:\3:\5:\u0201\n:\3:\6:\u0204\n:\r:\16:\u0205"+
		"\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3D\3E"+
		"\3E\3F\3F\3F\3G\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K\3L\3L\3L\3M\3M\3N\3N\3N"+
		"\3O\3O\3P\3P\3Q\3Q\3R\3R\3R\3S\3S\3T\3T\4\u01ca\u01d4\2U\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{"+
		"?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091"+
		"J\u0093K\u0095L\u0097M\u0099N\u009bO\u009dP\u009fQ\u00a1R\u00a3S\u00a5"+
		"T\u00a7U\3\2\b\5\2\13\f\17\17\"\"\4\2C\\c|\6\2\62;C\\aac|\3\2))\3\2\62"+
		";\4\2--//\u024d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2"+
		"\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2"+
		"_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3"+
		"\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2"+
		"\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083"+
		"\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2"+
		"\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095"+
		"\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2"+
		"\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7"+
		"\3\2\2\2\3\u00a9\3\2\2\2\5\u00b3\3\2\2\2\7\u00bb\3\2\2\2\t\u00c0\3\2\2"+
		"\2\13\u00cf\3\2\2\2\r\u00d4\3\2\2\2\17\u00da\3\2\2\2\21\u00e0\3\2\2\2"+
		"\23\u00e4\3\2\2\2\25\u00ea\3\2\2\2\27\u00f3\3\2\2\2\31\u00fd\3\2\2\2\33"+
		"\u0102\3\2\2\2\35\u010a\3\2\2\2\37\u0112\3\2\2\2!\u0117\3\2\2\2#\u011e"+
		"\3\2\2\2%\u0125\3\2\2\2\'\u012b\3\2\2\2)\u012e\3\2\2\2+\u0135\3\2\2\2"+
		"-\u0139\3\2\2\2/\u013e\3\2\2\2\61\u0142\3\2\2\2\63\u0147\3\2\2\2\65\u014f"+
		"\3\2\2\2\67\u0153\3\2\2\29\u015b\3\2\2\2;\u0160\3\2\2\2=\u0163\3\2\2\2"+
		"?\u0166\3\2\2\2A\u0169\3\2\2\2C\u016d\3\2\2\2E\u0171\3\2\2\2G\u0175\3"+
		"\2\2\2I\u0179\3\2\2\2K\u017d\3\2\2\2M\u0182\3\2\2\2O\u0188\3\2\2\2Q\u018b"+
		"\3\2\2\2S\u0190\3\2\2\2U\u0195\3\2\2\2W\u019b\3\2\2\2Y\u019e\3\2\2\2["+
		"\u01a5\3\2\2\2]\u01ab\3\2\2\2_\u01af\3\2\2\2a\u01b2\3\2\2\2c\u01b9\3\2"+
		"\2\2e\u01bf\3\2\2\2g\u01c5\3\2\2\2i\u01d0\3\2\2\2k\u01d9\3\2\2\2m\u01e0"+
		"\3\2\2\2o\u01ec\3\2\2\2q\u01f1\3\2\2\2s\u01fe\3\2\2\2u\u0207\3\2\2\2w"+
		"\u0209\3\2\2\2y\u020b\3\2\2\2{\u020d\3\2\2\2}\u020f\3\2\2\2\177\u0212"+
		"\3\2\2\2\u0081\u0214\3\2\2\2\u0083\u0216\3\2\2\2\u0085\u0218\3\2\2\2\u0087"+
		"\u021a\3\2\2\2\u0089\u021d\3\2\2\2\u008b\u021f\3\2\2\2\u008d\u0222\3\2"+
		"\2\2\u008f\u0225\3\2\2\2\u0091\u0227\3\2\2\2\u0093\u0229\3\2\2\2\u0095"+
		"\u022b\3\2\2\2\u0097\u022d\3\2\2\2\u0099\u0230\3\2\2\2\u009b\u0232\3\2"+
		"\2\2\u009d\u0235\3\2\2\2\u009f\u0237\3\2\2\2\u00a1\u0239\3\2\2\2\u00a3"+
		"\u023b\3\2\2\2\u00a5\u023e\3\2\2\2\u00a7\u0240\3\2\2\2\u00a9\u00aa\7K"+
		"\2\2\u00aa\u00ab\7P\2\2\u00ab\u00ac\7V\2\2\u00ac\u00ad\7G\2\2\u00ad\u00ae"+
		"\7T\2\2\u00ae\u00af\7H\2\2\u00af\u00b0\7C\2\2\u00b0\u00b1\7E\2\2\u00b1"+
		"\u00b2\7G\2\2\u00b2\4\3\2\2\2\u00b3\u00b4\7R\2\2\u00b4\u00b5\7T\2\2\u00b5"+
		"\u00b6\7Q\2\2\u00b6\u00b7\7I\2\2\u00b7\u00b8\7T\2\2\u00b8\u00b9\7C\2\2"+
		"\u00b9\u00ba\7O\2\2\u00ba\6\3\2\2\2\u00bb\u00bc\7W\2\2\u00bc\u00bd\7P"+
		"\2\2\u00bd\u00be\7K\2\2\u00be\u00bf\7V\2\2\u00bf\b\3\2\2\2\u00c0\u00c1"+
		"\7K\2\2\u00c1\u00c2\7O\2\2\u00c2\u00c3\7R\2\2\u00c3\u00c4\7N\2\2\u00c4"+
		"\u00c5\7G\2\2\u00c5\u00c6\7O\2\2\u00c6\u00c7\7G\2\2\u00c7\u00c8\7P\2\2"+
		"\u00c8\u00c9\7V\2\2\u00c9\u00ca\7C\2\2\u00ca\u00cb\7V\2\2\u00cb\u00cc"+
		"\7K\2\2\u00cc\u00cd\7Q\2\2\u00cd\u00ce\7P\2\2\u00ce\n\3\2\2\2\u00cf\u00d0"+
		"\7W\2\2\u00d0\u00d1\7U\2\2\u00d1\u00d2\7G\2\2\u00d2\u00d3\7U\2\2\u00d3"+
		"\f\3\2\2\2\u00d4\u00d5\7N\2\2\u00d5\u00d6\7C\2\2\u00d6\u00d7\7D\2\2\u00d7"+
		"\u00d8\7G\2\2\u00d8\u00d9\7N\2\2\u00d9\16\3\2\2\2\u00da\u00db\7E\2\2\u00db"+
		"\u00dc\7Q\2\2\u00dc\u00dd\7P\2\2\u00dd\u00de\7U\2\2\u00de\u00df\7V\2\2"+
		"\u00df\20\3\2\2\2\u00e0\u00e1\7E\2\2\u00e1\u00e2\7J\2\2\u00e2\u00e3\7"+
		"T\2\2\u00e3\22\3\2\2\2\u00e4\u00e5\7V\2\2\u00e5\u00e6\7[\2\2\u00e6\u00e7"+
		"\7R\2\2\u00e7\u00e8\7G\2\2\u00e8\u00e9\7\"\2\2\u00e9\24\3\2\2\2\u00ea"+
		"\u00eb\7H\2\2\u00eb\u00ec\7W\2\2\u00ec\u00ed\7P\2\2\u00ed\u00ee\7E\2\2"+
		"\u00ee\u00ef\7V\2\2\u00ef\u00f0\7K\2\2\u00f0\u00f1\7Q\2\2\u00f1\u00f2"+
		"\7P\2\2\u00f2\26\3\2\2\2\u00f3\u00f4\7R\2\2\u00f4\u00f5\7T\2\2\u00f5\u00f6"+
		"\7Q\2\2\u00f6\u00f7\7E\2\2\u00f7\u00f8\7G\2\2\u00f8\u00f9\7F\2\2\u00f9"+
		"\u00fa\7W\2\2\u00fa\u00fb\7T\2\2\u00fb\u00fc\7G\2\2\u00fc\30\3\2\2\2\u00fd"+
		"\u00fe\7E\2\2\u00fe\u00ff\7J\2\2\u00ff\u0100\7C\2\2\u0100\u0101\7T\2\2"+
		"\u0101\32\3\2\2\2\u0102\u0103\7D\2\2\u0103\u0104\7Q\2\2\u0104\u0105\7"+
		"Q\2\2\u0105\u0106\7N\2\2\u0106\u0107\7G\2\2\u0107\u0108\7C\2\2\u0108\u0109"+
		"\7P\2\2\u0109\34\3\2\2\2\u010a\u010b\7K\2\2\u010b\u010c\7P\2\2\u010c\u010d"+
		"\7V\2\2\u010d\u010e\7G\2\2\u010e\u010f\7I\2\2\u010f\u0110\7G\2\2\u0110"+
		"\u0111\7T\2\2\u0111\36\3\2\2\2\u0112\u0113\7T\2\2\u0113\u0114\7G\2\2\u0114"+
		"\u0115\7C\2\2\u0115\u0116\7N\2\2\u0116 \3\2\2\2\u0117\u0118\7U\2\2\u0118"+
		"\u0119\7V\2\2\u0119\u011a\7T\2\2\u011a\u011b\7K\2\2\u011b\u011c\7P\2\2"+
		"\u011c\u011d\7I\2\2\u011d\"\3\2\2\2\u011e\u011f\7R\2\2\u011f\u0120\7C"+
		"\2\2\u0120\u0121\7E\2\2\u0121\u0122\7M\2\2\u0122\u0123\7G\2\2\u0123\u0124"+
		"\7F\2\2\u0124$\3\2\2\2\u0125\u0126\7C\2\2\u0126\u0127\7T\2\2\u0127\u0128"+
		"\7T\2\2\u0128\u0129\7C\2\2\u0129\u012a\7[\2\2\u012a&\3\2\2\2\u012b\u012c"+
		"\7Q\2\2\u012c\u012d\7H\2\2\u012d(\3\2\2\2\u012e\u012f\7T\2\2\u012f\u0130"+
		"\7G\2\2\u0130\u0131\7E\2\2\u0131\u0132\7Q\2\2\u0132\u0133\7T\2\2\u0133"+
		"\u0134\7F\2\2\u0134*\3\2\2\2\u0135\u0136\7G\2\2\u0136\u0137\7P\2\2\u0137"+
		"\u0138\7F\2\2\u0138,\3\2\2\2\u0139\u013a\7E\2\2\u013a\u013b\7C\2\2\u013b"+
		"\u013c\7U\2\2\u013c\u013d\7G\2\2\u013d.\3\2\2\2\u013e\u013f\7U\2\2\u013f"+
		"\u0140\7G\2\2\u0140\u0141\7V\2\2\u0141\60\3\2\2\2\u0142\u0143\7H\2\2\u0143"+
		"\u0144\7K\2\2\u0144\u0145\7N\2\2\u0145\u0146\7G\2\2\u0146\62\3\2\2\2\u0147"+
		"\u0148\7R\2\2\u0148\u0149\7Q\2\2\u0149\u014a\7K\2\2\u014a\u014b\7P\2\2"+
		"\u014b\u014c\7V\2\2\u014c\u014d\7G\2\2\u014d\u014e\7T\2\2\u014e\64\3\2"+
		"\2\2\u014f\u0150\7X\2\2\u0150\u0151\7C\2\2\u0151\u0152\7T\2\2\u0152\66"+
		"\3\2\2\2\u0153\u0154\7H\2\2\u0154\u0155\7Q\2\2\u0155\u0156\7T\2\2\u0156"+
		"\u0157\7Y\2\2\u0157\u0158\7C\2\2\u0158\u0159\7T\2\2\u0159\u015a\7F\2\2"+
		"\u015a8\3\2\2\2\u015b\u015c\7G\2\2\u015c\u015d\7Z\2\2\u015d\u015e\7K\2"+
		"\2\u015e\u015f\7V\2\2\u015f:\3\2\2\2\u0160\u0161\7C\2\2\u0161\u0162\7"+
		"V\2\2\u0162<\3\2\2\2\u0163\u0164\7K\2\2\u0164\u0165\7P\2\2\u0165>\3\2"+
		"\2\2\u0166\u0167\7Q\2\2\u0167\u0168\7T\2\2\u0168@\3\2\2\2\u0169\u016a"+
		"\7F\2\2\u016a\u016b\7K\2\2\u016b\u016c\7X\2\2\u016cB\3\2\2\2\u016d\u016e"+
		"\7O\2\2\u016e\u016f\7Q\2\2\u016f\u0170\7F\2\2\u0170D\3\2\2\2\u0171\u0172"+
		"\7C\2\2\u0172\u0173\7P\2\2\u0173\u0174\7F\2\2\u0174F\3\2\2\2\u0175\u0176"+
		"\7P\2\2\u0176\u0177\7Q\2\2\u0177\u0178\7V\2\2\u0178H\3\2\2\2\u0179\u017a"+
		"\7P\2\2\u017a\u017b\7K\2\2\u017b\u017c\7N\2\2\u017cJ\3\2\2\2\u017d\u017e"+
		"\7I\2\2\u017e\u017f\7Q\2\2\u017f\u0180\7V\2\2\u0180\u0181\7Q\2\2\u0181"+
		"L\3\2\2\2\u0182\u0183\7D\2\2\u0183\u0184\7G\2\2\u0184\u0185\7I\2\2\u0185"+
		"\u0186\7K\2\2\u0186\u0187\7P\2\2\u0187N\3\2\2\2\u0188\u0189\7K\2\2\u0189"+
		"\u018a\7H\2\2\u018aP\3\2\2\2\u018b\u018c\7V\2\2\u018c\u018d\7J\2\2\u018d"+
		"\u018e\7G\2\2\u018e\u018f\7P\2\2\u018fR\3\2\2\2\u0190\u0191\7G\2\2\u0191"+
		"\u0192\7N\2\2\u0192\u0193\7U\2\2\u0193\u0194\7G\2\2\u0194T\3\2\2\2\u0195"+
		"\u0196\7Y\2\2\u0196\u0197\7J\2\2\u0197\u0198\7K\2\2\u0198\u0199\7N\2\2"+
		"\u0199\u019a\7G\2\2\u019aV\3\2\2\2\u019b\u019c\7F\2\2\u019c\u019d\7Q\2"+
		"\2\u019dX\3\2\2\2\u019e\u019f\7T\2\2\u019f\u01a0\7G\2\2\u01a0\u01a1\7"+
		"R\2\2\u01a1\u01a2\7G\2\2\u01a2\u01a3\7C\2\2\u01a3\u01a4\7V\2\2\u01a4Z"+
		"\3\2\2\2\u01a5\u01a6\7W\2\2\u01a6\u01a7\7P\2\2\u01a7\u01a8\7V\2\2\u01a8"+
		"\u01a9\7K\2\2\u01a9\u01aa\7N\2\2\u01aa\\\3\2\2\2\u01ab\u01ac\7H\2\2\u01ac"+
		"\u01ad\7Q\2\2\u01ad\u01ae\7T\2\2\u01ae^\3\2\2\2\u01af\u01b0\7V\2\2\u01b0"+
		"\u01b1\7Q\2\2\u01b1`\3\2\2\2\u01b2\u01b3\7F\2\2\u01b3\u01b4\7Q\2\2\u01b4"+
		"\u01b5\7Y\2\2\u01b5\u01b6\7P\2\2\u01b6\u01b7\7V\2\2\u01b7\u01b8\7Q\2\2"+
		"\u01b8b\3\2\2\2\u01b9\u01ba\7Y\2\2\u01ba\u01bb\7K\2\2\u01bb\u01bc\7V\2"+
		"\2\u01bc\u01bd\7J\2\2\u01bdd\3\2\2\2\u01be\u01c0\t\2\2\2\u01bf\u01be\3"+
		"\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2"+
		"\u01c3\3\2\2\2\u01c3\u01c4\b\63\2\2\u01c4f\3\2\2\2\u01c5\u01c6\5\u0091"+
		"I\2\u01c6\u01ca\5y=\2\u01c7\u01c9\13\2\2\2\u01c8\u01c7\3\2\2\2\u01c9\u01cc"+
		"\3\2\2\2\u01ca\u01cb\3\2\2\2\u01ca\u01c8\3\2\2\2\u01cb\u01cd\3\2\2\2\u01cc"+
		"\u01ca\3\2\2\2\u01cd\u01ce\5y=\2\u01ce\u01cf\5\u0093J\2\u01cfh\3\2\2\2"+
		"\u01d0\u01d4\5\u00a5S\2\u01d1\u01d3\13\2\2\2\u01d2\u01d1\3\2\2\2\u01d3"+
		"\u01d6\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d5\u01d7\3\2"+
		"\2\2\u01d6\u01d4\3\2\2\2\u01d7\u01d8\5\u00a7T\2\u01d8j\3\2\2\2\u01d9\u01dd"+
		"\t\3\2\2\u01da\u01dc\t\4\2\2\u01db\u01da\3\2\2\2\u01dc\u01df\3\2\2\2\u01dd"+
		"\u01db\3\2\2\2\u01dd\u01de\3\2\2\2\u01del\3\2\2\2\u01df\u01dd\3\2\2\2"+
		"\u01e0\u01e6\7)\2\2\u01e1\u01e2\7)\2\2\u01e2\u01e5\7)\2\2\u01e3\u01e5"+
		"\n\5\2\2\u01e4\u01e1\3\2\2\2\u01e4\u01e3\3\2\2\2\u01e5\u01e8\3\2\2\2\u01e6"+
		"\u01e4\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e9\3\2\2\2\u01e8\u01e6\3\2"+
		"\2\2\u01e9\u01ea\7)\2\2\u01ean\3\2\2\2\u01eb\u01ed\4\62;\2\u01ec\u01eb"+
		"\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef"+
		"p\3\2\2\2\u01f0\u01f2\t\6\2\2\u01f1\u01f0\3\2\2\2\u01f2\u01f3\3\2\2\2"+
		"\u01f3\u01f1\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f7"+
		"\5\u00a1Q\2\u01f6\u01f8\t\6\2\2\u01f7\u01f6\3\2\2\2\u01f8\u01f9\3\2\2"+
		"\2\u01f9\u01f7\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01fc\3\2\2\2\u01fb\u01fd"+
		"\5s:\2\u01fc\u01fb\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fdr\3\2\2\2\u01fe\u0200"+
		"\7g\2\2\u01ff\u0201\t\7\2\2\u0200\u01ff\3\2\2\2\u0200\u0201\3\2\2\2\u0201"+
		"\u0203\3\2\2\2\u0202\u0204\4\62;\2\u0203\u0202\3\2\2\2\u0204\u0205\3\2"+
		"\2\2\u0205\u0203\3\2\2\2\u0205\u0206\3\2\2\2\u0206t\3\2\2\2\u0207\u0208"+
		"\7-\2\2\u0208v\3\2\2\2\u0209\u020a\7/\2\2\u020ax\3\2\2\2\u020b\u020c\7"+
		",\2\2\u020cz\3\2\2\2\u020d\u020e\7\61\2\2\u020e|\3\2\2\2\u020f\u0210\7"+
		"<\2\2\u0210\u0211\7?\2\2\u0211~\3\2\2\2\u0212\u0213\7.\2\2\u0213\u0080"+
		"\3\2\2\2\u0214\u0215\7=\2\2\u0215\u0082\3\2\2\2\u0216\u0217\7<\2\2\u0217"+
		"\u0084\3\2\2\2\u0218\u0219\7?\2\2\u0219\u0086\3\2\2\2\u021a\u021b\7>\2"+
		"\2\u021b\u021c\7@\2\2\u021c\u0088\3\2\2\2\u021d\u021e\7>\2\2\u021e\u008a"+
		"\3\2\2\2\u021f\u0220\7>\2\2\u0220\u0221\7?\2\2\u0221\u008c\3\2\2\2\u0222"+
		"\u0223\7@\2\2\u0223\u0224\7?\2\2\u0224\u008e\3\2\2\2\u0225\u0226\7@\2"+
		"\2\u0226\u0090\3\2\2\2\u0227\u0228\7*\2\2\u0228\u0092\3\2\2\2\u0229\u022a"+
		"\7+\2\2\u022a\u0094\3\2\2\2\u022b\u022c\7]\2\2\u022c\u0096\3\2\2\2\u022d"+
		"\u022e\7*\2\2\u022e\u022f\7\60\2\2\u022f\u0098\3\2\2\2\u0230\u0231\7_"+
		"\2\2\u0231\u009a\3\2\2\2\u0232\u0233\7\60\2\2\u0233\u0234\7+\2\2\u0234"+
		"\u009c\3\2\2\2\u0235\u0236\7`\2\2\u0236\u009e\3\2\2\2\u0237\u0238\7B\2"+
		"\2\u0238\u00a0\3\2\2\2\u0239\u023a\7\60\2\2\u023a\u00a2\3\2\2\2\u023b"+
		"\u023c\7\60\2\2\u023c\u023d\7\60\2\2\u023d\u00a4\3\2\2\2\u023e\u023f\7"+
		"}\2\2\u023f\u00a6\3\2\2\2\u0240\u0241\7\177\2\2\u0241\u00a8\3\2\2\2\17"+
		"\2\u01c1\u01ca\u01d4\u01dd\u01e4\u01e6\u01ee\u01f3\u01f9\u01fc\u0200\u0205"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}