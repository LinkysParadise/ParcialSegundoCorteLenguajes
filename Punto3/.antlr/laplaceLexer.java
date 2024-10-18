// Generated from /home/linky/Proyects/University/SextoSemestre/LenguajesDeProgramacion/Parcial2/Punto3/laplace.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class laplaceLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, DIV=3, MULT=4, POW=5, MINUS=6, DELTA=7, T=8, T0=9, Q=10, 
		EULER=11, ALPHA=12, U=13, J=14, N=15, SIN=16, COS=17, SINH=18, COSH=19, 
		LOG=20, OMEGA=21, TAU=22, NEWLINE=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "DIV", "MULT", "POW", "MINUS", "DELTA", "T", "T0", "Q", 
			"EULER", "ALPHA", "U", "J", "N", "SIN", "COS", "SINH", "COSH", "LOG", 
			"OMEGA", "TAU", "NEWLINE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'/'", "'*'", "'^'", "'-'", "'d'", "'t'", "'t0'", 
			"'q'", "'e'", "'a'", "'u'", "'J'", "'n'", "'Sin'", "'Cos'", "'Sinh'", 
			"'Cosh'", "'log'", "'w'", "'tau'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "DIV", "MULT", "POW", "MINUS", "DELTA", "T", "T0", 
			"Q", "EULER", "ALPHA", "U", "J", "N", "SIN", "COS", "SINH", "COSH", "LOG", 
			"OMEGA", "TAU", "NEWLINE"
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


	public laplaceLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "laplace.g4"; }

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
		"\u0004\u0000\u0017o\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0003\u0016l\b\u0016\u0001\u0016\u0001\u0016\u0000\u0000\u0017\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d"+
		"\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017\u0001"+
		"\u0000\u0000o\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%"+
		"\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000"+
		"\u0000\u0001/\u0001\u0000\u0000\u0000\u00031\u0001\u0000\u0000\u0000\u0005"+
		"3\u0001\u0000\u0000\u0000\u00075\u0001\u0000\u0000\u0000\t7\u0001\u0000"+
		"\u0000\u0000\u000b9\u0001\u0000\u0000\u0000\r;\u0001\u0000\u0000\u0000"+
		"\u000f=\u0001\u0000\u0000\u0000\u0011?\u0001\u0000\u0000\u0000\u0013B"+
		"\u0001\u0000\u0000\u0000\u0015D\u0001\u0000\u0000\u0000\u0017F\u0001\u0000"+
		"\u0000\u0000\u0019H\u0001\u0000\u0000\u0000\u001bJ\u0001\u0000\u0000\u0000"+
		"\u001dL\u0001\u0000\u0000\u0000\u001fN\u0001\u0000\u0000\u0000!R\u0001"+
		"\u0000\u0000\u0000#V\u0001\u0000\u0000\u0000%[\u0001\u0000\u0000\u0000"+
		"\'`\u0001\u0000\u0000\u0000)d\u0001\u0000\u0000\u0000+f\u0001\u0000\u0000"+
		"\u0000-k\u0001\u0000\u0000\u0000/0\u0005(\u0000\u00000\u0002\u0001\u0000"+
		"\u0000\u000012\u0005)\u0000\u00002\u0004\u0001\u0000\u0000\u000034\u0005"+
		"/\u0000\u00004\u0006\u0001\u0000\u0000\u000056\u0005*\u0000\u00006\b\u0001"+
		"\u0000\u0000\u000078\u0005^\u0000\u00008\n\u0001\u0000\u0000\u00009:\u0005"+
		"-\u0000\u0000:\f\u0001\u0000\u0000\u0000;<\u0005d\u0000\u0000<\u000e\u0001"+
		"\u0000\u0000\u0000=>\u0005t\u0000\u0000>\u0010\u0001\u0000\u0000\u0000"+
		"?@\u0005t\u0000\u0000@A\u00050\u0000\u0000A\u0012\u0001\u0000\u0000\u0000"+
		"BC\u0005q\u0000\u0000C\u0014\u0001\u0000\u0000\u0000DE\u0005e\u0000\u0000"+
		"E\u0016\u0001\u0000\u0000\u0000FG\u0005a\u0000\u0000G\u0018\u0001\u0000"+
		"\u0000\u0000HI\u0005u\u0000\u0000I\u001a\u0001\u0000\u0000\u0000JK\u0005"+
		"J\u0000\u0000K\u001c\u0001\u0000\u0000\u0000LM\u0005n\u0000\u0000M\u001e"+
		"\u0001\u0000\u0000\u0000NO\u0005S\u0000\u0000OP\u0005i\u0000\u0000PQ\u0005"+
		"n\u0000\u0000Q \u0001\u0000\u0000\u0000RS\u0005C\u0000\u0000ST\u0005o"+
		"\u0000\u0000TU\u0005s\u0000\u0000U\"\u0001\u0000\u0000\u0000VW\u0005S"+
		"\u0000\u0000WX\u0005i\u0000\u0000XY\u0005n\u0000\u0000YZ\u0005h\u0000"+
		"\u0000Z$\u0001\u0000\u0000\u0000[\\\u0005C\u0000\u0000\\]\u0005o\u0000"+
		"\u0000]^\u0005s\u0000\u0000^_\u0005h\u0000\u0000_&\u0001\u0000\u0000\u0000"+
		"`a\u0005l\u0000\u0000ab\u0005o\u0000\u0000bc\u0005g\u0000\u0000c(\u0001"+
		"\u0000\u0000\u0000de\u0005w\u0000\u0000e*\u0001\u0000\u0000\u0000fg\u0005"+
		"t\u0000\u0000gh\u0005a\u0000\u0000hi\u0005u\u0000\u0000i,\u0001\u0000"+
		"\u0000\u0000jl\u0005\r\u0000\u0000kj\u0001\u0000\u0000\u0000kl\u0001\u0000"+
		"\u0000\u0000lm\u0001\u0000\u0000\u0000mn\u0005\n\u0000\u0000n.\u0001\u0000"+
		"\u0000\u0000\u0002\u0000k\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}