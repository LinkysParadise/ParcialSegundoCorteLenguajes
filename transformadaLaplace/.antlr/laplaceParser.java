// Generated from /home/linky/Proyects/University/SextoSemestre/LenguajesDeProgramacion/ParcialSegundoCorte/Punto3/laplace.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class laplaceParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, DIV=3, MULT=4, POW=5, MINUS=6, DELTA=7, T=8, T0=9, Q=10, 
		EULER=11, ALPHA=12, U=13, J=14, N=15, SIN=16, COS=17, SINH=18, COSH=19, 
		LOG=20, OMEGA=21, TAU=22, NEWLINE=23;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_expr = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stat", "expr"
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

	@Override
	public String getGrammarFileName() { return "laplace.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public laplaceParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(laplaceParser.EOF, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(7); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(6);
				stat();
				}
				}
				setState(9); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 10447232L) != 0) );
			setState(11);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatContext extends ParserRuleContext {
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlankContext extends StatContext {
		public TerminalNode NEWLINE() { return getToken(laplaceParser.NEWLINE, 0); }
		public BlankContext(StatContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintExprContext extends StatContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(laplaceParser.NEWLINE, 0); }
		public PrintExprContext(StatContext ctx) { copyFrom(ctx); }
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(17);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DELTA:
			case T:
			case EULER:
			case U:
			case J:
			case SIN:
			case COS:
			case SINH:
			case COSH:
			case LOG:
				_localctx = new PrintExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(13);
				expr();
				setState(14);
				match(NEWLINE);
				}
				break;
			case NEWLINE:
				_localctx = new BlankContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(16);
				match(NEWLINE);
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
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AmortiguacionExpContext extends ExprContext {
		public TerminalNode EULER() { return getToken(laplaceParser.EULER, 0); }
		public TerminalNode POW() { return getToken(laplaceParser.POW, 0); }
		public TerminalNode MINUS() { return getToken(laplaceParser.MINUS, 0); }
		public TerminalNode T() { return getToken(laplaceParser.T, 0); }
		public AmortiguacionExpContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SenoContext extends ExprContext {
		public TerminalNode SIN() { return getToken(laplaceParser.SIN, 0); }
		public TerminalNode OMEGA() { return getToken(laplaceParser.OMEGA, 0); }
		public TerminalNode T() { return getToken(laplaceParser.T, 0); }
		public SenoContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NPotenciaConDesplazamientoContext extends ExprContext {
		public List<TerminalNode> T() { return getTokens(laplaceParser.T); }
		public TerminalNode T(int i) {
			return getToken(laplaceParser.T, i);
		}
		public List<TerminalNode> POW() { return getTokens(laplaceParser.POW); }
		public TerminalNode POW(int i) {
			return getToken(laplaceParser.POW, i);
		}
		public TerminalNode N() { return getToken(laplaceParser.N, 0); }
		public TerminalNode MULT() { return getToken(laplaceParser.MULT, 0); }
		public TerminalNode EULER() { return getToken(laplaceParser.EULER, 0); }
		public TerminalNode MINUS() { return getToken(laplaceParser.MINUS, 0); }
		public TerminalNode ALPHA() { return getToken(laplaceParser.ALPHA, 0); }
		public NPotenciaConDesplazamientoContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NesimaPotenciaContext extends ExprContext {
		public TerminalNode T() { return getToken(laplaceParser.T, 0); }
		public TerminalNode POW() { return getToken(laplaceParser.POW, 0); }
		public TerminalNode N() { return getToken(laplaceParser.N, 0); }
		public NesimaPotenciaContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EscalonUnitarioContext extends ExprContext {
		public TerminalNode U() { return getToken(laplaceParser.U, 0); }
		public TerminalNode T() { return getToken(laplaceParser.T, 0); }
		public EscalonUnitarioContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CosenoHiperbolicoContext extends ExprContext {
		public TerminalNode COSH() { return getToken(laplaceParser.COSH, 0); }
		public TerminalNode ALPHA() { return getToken(laplaceParser.ALPHA, 0); }
		public TerminalNode T() { return getToken(laplaceParser.T, 0); }
		public CosenoHiperbolicoContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogaritmoNaturalContext extends ExprContext {
		public TerminalNode LOG() { return getToken(laplaceParser.LOG, 0); }
		public TerminalNode T() { return getToken(laplaceParser.T, 0); }
		public TerminalNode DIV() { return getToken(laplaceParser.DIV, 0); }
		public TerminalNode T0() { return getToken(laplaceParser.T0, 0); }
		public LogaritmoNaturalContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FuncionDeBesselContext extends ExprContext {
		public TerminalNode J() { return getToken(laplaceParser.J, 0); }
		public TerminalNode OMEGA() { return getToken(laplaceParser.OMEGA, 0); }
		public TerminalNode T() { return getToken(laplaceParser.T, 0); }
		public FuncionDeBesselContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SenoHiperbolicoContext extends ExprContext {
		public TerminalNode SINH() { return getToken(laplaceParser.SINH, 0); }
		public TerminalNode ALPHA() { return getToken(laplaceParser.ALPHA, 0); }
		public TerminalNode T() { return getToken(laplaceParser.T, 0); }
		public SenoHiperbolicoContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class QesimaPotenciaContext extends ExprContext {
		public TerminalNode T() { return getToken(laplaceParser.T, 0); }
		public TerminalNode POW() { return getToken(laplaceParser.POW, 0); }
		public TerminalNode Q() { return getToken(laplaceParser.Q, 0); }
		public QesimaPotenciaContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RetrasoIdealContext extends ExprContext {
		public TerminalNode DELTA() { return getToken(laplaceParser.DELTA, 0); }
		public TerminalNode T() { return getToken(laplaceParser.T, 0); }
		public TerminalNode MINUS() { return getToken(laplaceParser.MINUS, 0); }
		public TerminalNode TAU() { return getToken(laplaceParser.TAU, 0); }
		public RetrasoIdealContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EscalonRetrasoContext extends ExprContext {
		public TerminalNode U() { return getToken(laplaceParser.U, 0); }
		public TerminalNode T() { return getToken(laplaceParser.T, 0); }
		public TerminalNode MINUS() { return getToken(laplaceParser.MINUS, 0); }
		public TerminalNode TAU() { return getToken(laplaceParser.TAU, 0); }
		public EscalonRetrasoContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImpulsoUnitarioContext extends ExprContext {
		public TerminalNode DELTA() { return getToken(laplaceParser.DELTA, 0); }
		public TerminalNode T() { return getToken(laplaceParser.T, 0); }
		public ImpulsoUnitarioContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CosenoContext extends ExprContext {
		public TerminalNode COS() { return getToken(laplaceParser.COS, 0); }
		public TerminalNode OMEGA() { return getToken(laplaceParser.OMEGA, 0); }
		public TerminalNode T() { return getToken(laplaceParser.T, 0); }
		public CosenoContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expr);
		try {
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new RetrasoIdealContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(19);
				match(DELTA);
				setState(20);
				match(T__0);
				setState(21);
				match(T);
				setState(22);
				match(MINUS);
				setState(23);
				match(TAU);
				setState(24);
				match(T__1);
				}
				break;
			case 2:
				_localctx = new ImpulsoUnitarioContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(25);
				match(DELTA);
				setState(26);
				match(T__0);
				setState(27);
				match(T);
				setState(28);
				match(T__1);
				}
				break;
			case 3:
				_localctx = new AmortiguacionExpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(29);
				match(EULER);
				setState(30);
				match(POW);
				setState(31);
				match(MINUS);
				setState(32);
				match(T);
				}
				break;
			case 4:
				_localctx = new NPotenciaConDesplazamientoContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(33);
				match(T);
				setState(34);
				match(POW);
				setState(35);
				match(N);
				setState(36);
				match(MULT);
				setState(37);
				match(EULER);
				setState(38);
				match(POW);
				setState(39);
				match(MINUS);
				setState(40);
				match(ALPHA);
				setState(41);
				match(T);
				}
				break;
			case 5:
				_localctx = new EscalonUnitarioContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(42);
				match(U);
				setState(43);
				match(T__0);
				setState(44);
				match(T);
				setState(45);
				match(T__1);
				}
				break;
			case 6:
				_localctx = new EscalonRetrasoContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(46);
				match(U);
				setState(47);
				match(T__0);
				setState(48);
				match(T);
				setState(49);
				match(MINUS);
				setState(50);
				match(TAU);
				setState(51);
				match(T__1);
				}
				break;
			case 7:
				_localctx = new NesimaPotenciaContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(52);
				match(T);
				setState(53);
				match(POW);
				setState(54);
				match(N);
				}
				break;
			case 8:
				_localctx = new QesimaPotenciaContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(55);
				match(T);
				setState(56);
				match(POW);
				setState(57);
				match(Q);
				}
				break;
			case 9:
				_localctx = new SenoContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(58);
				match(SIN);
				setState(59);
				match(T__0);
				setState(60);
				match(OMEGA);
				setState(61);
				match(T);
				setState(62);
				match(T__1);
				}
				break;
			case 10:
				_localctx = new CosenoContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(63);
				match(COS);
				setState(64);
				match(T__0);
				setState(65);
				match(OMEGA);
				setState(66);
				match(T);
				setState(67);
				match(T__1);
				}
				break;
			case 11:
				_localctx = new SenoHiperbolicoContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(68);
				match(SINH);
				setState(69);
				match(T__0);
				setState(70);
				match(ALPHA);
				setState(71);
				match(T);
				setState(72);
				match(T__1);
				}
				break;
			case 12:
				_localctx = new CosenoHiperbolicoContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(73);
				match(COSH);
				setState(74);
				match(T__0);
				setState(75);
				match(ALPHA);
				setState(76);
				match(T);
				setState(77);
				match(T__1);
				}
				break;
			case 13:
				_localctx = new LogaritmoNaturalContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(78);
				match(LOG);
				setState(79);
				match(T__0);
				setState(80);
				match(T);
				setState(81);
				match(DIV);
				setState(82);
				match(T0);
				setState(83);
				match(T__1);
				}
				break;
			case 14:
				_localctx = new FuncionDeBesselContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(84);
				match(J);
				setState(85);
				match(T__0);
				setState(86);
				match(OMEGA);
				setState(87);
				match(T);
				setState(88);
				match(T__1);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0017\\\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0001\u0000\u0004\u0000\b\b\u0000\u000b\u0000\f\u0000"+
		"\t\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001\u0012\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002Z\b\u0002\u0001\u0002\u0000\u0000\u0003\u0000\u0002\u0004"+
		"\u0000\u0000g\u0000\u0007\u0001\u0000\u0000\u0000\u0002\u0011\u0001\u0000"+
		"\u0000\u0000\u0004Y\u0001\u0000\u0000\u0000\u0006\b\u0003\u0002\u0001"+
		"\u0000\u0007\u0006\u0001\u0000\u0000\u0000\b\t\u0001\u0000\u0000\u0000"+
		"\t\u0007\u0001\u0000\u0000\u0000\t\n\u0001\u0000\u0000\u0000\n\u000b\u0001"+
		"\u0000\u0000\u0000\u000b\f\u0005\u0000\u0000\u0001\f\u0001\u0001\u0000"+
		"\u0000\u0000\r\u000e\u0003\u0004\u0002\u0000\u000e\u000f\u0005\u0017\u0000"+
		"\u0000\u000f\u0012\u0001\u0000\u0000\u0000\u0010\u0012\u0005\u0017\u0000"+
		"\u0000\u0011\r\u0001\u0000\u0000\u0000\u0011\u0010\u0001\u0000\u0000\u0000"+
		"\u0012\u0003\u0001\u0000\u0000\u0000\u0013\u0014\u0005\u0007\u0000\u0000"+
		"\u0014\u0015\u0005\u0001\u0000\u0000\u0015\u0016\u0005\b\u0000\u0000\u0016"+
		"\u0017\u0005\u0006\u0000\u0000\u0017\u0018\u0005\u0016\u0000\u0000\u0018"+
		"Z\u0005\u0002\u0000\u0000\u0019\u001a\u0005\u0007\u0000\u0000\u001a\u001b"+
		"\u0005\u0001\u0000\u0000\u001b\u001c\u0005\b\u0000\u0000\u001cZ\u0005"+
		"\u0002\u0000\u0000\u001d\u001e\u0005\u000b\u0000\u0000\u001e\u001f\u0005"+
		"\u0005\u0000\u0000\u001f \u0005\u0006\u0000\u0000 Z\u0005\b\u0000\u0000"+
		"!\"\u0005\b\u0000\u0000\"#\u0005\u0005\u0000\u0000#$\u0005\u000f\u0000"+
		"\u0000$%\u0005\u0004\u0000\u0000%&\u0005\u000b\u0000\u0000&\'\u0005\u0005"+
		"\u0000\u0000\'(\u0005\u0006\u0000\u0000()\u0005\f\u0000\u0000)Z\u0005"+
		"\b\u0000\u0000*+\u0005\r\u0000\u0000+,\u0005\u0001\u0000\u0000,-\u0005"+
		"\b\u0000\u0000-Z\u0005\u0002\u0000\u0000./\u0005\r\u0000\u0000/0\u0005"+
		"\u0001\u0000\u000001\u0005\b\u0000\u000012\u0005\u0006\u0000\u000023\u0005"+
		"\u0016\u0000\u00003Z\u0005\u0002\u0000\u000045\u0005\b\u0000\u000056\u0005"+
		"\u0005\u0000\u00006Z\u0005\u000f\u0000\u000078\u0005\b\u0000\u000089\u0005"+
		"\u0005\u0000\u00009Z\u0005\n\u0000\u0000:;\u0005\u0010\u0000\u0000;<\u0005"+
		"\u0001\u0000\u0000<=\u0005\u0015\u0000\u0000=>\u0005\b\u0000\u0000>Z\u0005"+
		"\u0002\u0000\u0000?@\u0005\u0011\u0000\u0000@A\u0005\u0001\u0000\u0000"+
		"AB\u0005\u0015\u0000\u0000BC\u0005\b\u0000\u0000CZ\u0005\u0002\u0000\u0000"+
		"DE\u0005\u0012\u0000\u0000EF\u0005\u0001\u0000\u0000FG\u0005\f\u0000\u0000"+
		"GH\u0005\b\u0000\u0000HZ\u0005\u0002\u0000\u0000IJ\u0005\u0013\u0000\u0000"+
		"JK\u0005\u0001\u0000\u0000KL\u0005\f\u0000\u0000LM\u0005\b\u0000\u0000"+
		"MZ\u0005\u0002\u0000\u0000NO\u0005\u0014\u0000\u0000OP\u0005\u0001\u0000"+
		"\u0000PQ\u0005\b\u0000\u0000QR\u0005\u0003\u0000\u0000RS\u0005\t\u0000"+
		"\u0000SZ\u0005\u0002\u0000\u0000TU\u0005\u000e\u0000\u0000UV\u0005\u0001"+
		"\u0000\u0000VW\u0005\u0015\u0000\u0000WX\u0005\b\u0000\u0000XZ\u0005\u0002"+
		"\u0000\u0000Y\u0013\u0001\u0000\u0000\u0000Y\u0019\u0001\u0000\u0000\u0000"+
		"Y\u001d\u0001\u0000\u0000\u0000Y!\u0001\u0000\u0000\u0000Y*\u0001\u0000"+
		"\u0000\u0000Y.\u0001\u0000\u0000\u0000Y4\u0001\u0000\u0000\u0000Y7\u0001"+
		"\u0000\u0000\u0000Y:\u0001\u0000\u0000\u0000Y?\u0001\u0000\u0000\u0000"+
		"YD\u0001\u0000\u0000\u0000YI\u0001\u0000\u0000\u0000YN\u0001\u0000\u0000"+
		"\u0000YT\u0001\u0000\u0000\u0000Z\u0005\u0001\u0000\u0000\u0000\u0003"+
		"\t\u0011Y";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}