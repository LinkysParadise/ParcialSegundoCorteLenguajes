// Generated from /home/linky/Proyects/University/SextoSemestre/LenguajesDeProgramacion/ParcialSegundoCorte/Punto3/laplace.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link laplaceParser}.
 */
public interface laplaceListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link laplaceParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(laplaceParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link laplaceParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(laplaceParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link laplaceParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpr(laplaceParser.PrintExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link laplaceParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpr(laplaceParser.PrintExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blank}
	 * labeled alternative in {@link laplaceParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterBlank(laplaceParser.BlankContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link laplaceParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitBlank(laplaceParser.BlankContext ctx);
	/**
	 * Enter a parse tree produced by the {@code retrasoIdeal}
	 * labeled alternative in {@link laplaceParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRetrasoIdeal(laplaceParser.RetrasoIdealContext ctx);
	/**
	 * Exit a parse tree produced by the {@code retrasoIdeal}
	 * labeled alternative in {@link laplaceParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRetrasoIdeal(laplaceParser.RetrasoIdealContext ctx);
	/**
	 * Enter a parse tree produced by the {@code impulsoUnitario}
	 * labeled alternative in {@link laplaceParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterImpulsoUnitario(laplaceParser.ImpulsoUnitarioContext ctx);
	/**
	 * Exit a parse tree produced by the {@code impulsoUnitario}
	 * labeled alternative in {@link laplaceParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitImpulsoUnitario(laplaceParser.ImpulsoUnitarioContext ctx);
	/**
	 * Enter a parse tree produced by the {@code amortiguacionExp}
	 * labeled alternative in {@link laplaceParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAmortiguacionExp(laplaceParser.AmortiguacionExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code amortiguacionExp}
	 * labeled alternative in {@link laplaceParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAmortiguacionExp(laplaceParser.AmortiguacionExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nPotenciaConDesplazamiento}
	 * labeled alternative in {@link laplaceParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNPotenciaConDesplazamiento(laplaceParser.NPotenciaConDesplazamientoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nPotenciaConDesplazamiento}
	 * labeled alternative in {@link laplaceParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNPotenciaConDesplazamiento(laplaceParser.NPotenciaConDesplazamientoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code escalonUnitario}
	 * labeled alternative in {@link laplaceParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEscalonUnitario(laplaceParser.EscalonUnitarioContext ctx);
	/**
	 * Exit a parse tree produced by the {@code escalonUnitario}
	 * labeled alternative in {@link laplaceParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEscalonUnitario(laplaceParser.EscalonUnitarioContext ctx);
	/**
	 * Enter a parse tree produced by the {@code escalonRetraso}
	 * labeled alternative in {@link laplaceParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEscalonRetraso(laplaceParser.EscalonRetrasoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code escalonRetraso}
	 * labeled alternative in {@link laplaceParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEscalonRetraso(laplaceParser.EscalonRetrasoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nesimaPotencia}
	 * labeled alternative in {@link laplaceParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNesimaPotencia(laplaceParser.NesimaPotenciaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nesimaPotencia}
	 * labeled alternative in {@link laplaceParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNesimaPotencia(laplaceParser.NesimaPotenciaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code qesimaPotencia}
	 * labeled alternative in {@link laplaceParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterQesimaPotencia(laplaceParser.QesimaPotenciaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code qesimaPotencia}
	 * labeled alternative in {@link laplaceParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitQesimaPotencia(laplaceParser.QesimaPotenciaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code seno}
	 * labeled alternative in {@link laplaceParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSeno(laplaceParser.SenoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code seno}
	 * labeled alternative in {@link laplaceParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSeno(laplaceParser.SenoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code coseno}
	 * labeled alternative in {@link laplaceParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCoseno(laplaceParser.CosenoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code coseno}
	 * labeled alternative in {@link laplaceParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCoseno(laplaceParser.CosenoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code senoHiperbolico}
	 * labeled alternative in {@link laplaceParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSenoHiperbolico(laplaceParser.SenoHiperbolicoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code senoHiperbolico}
	 * labeled alternative in {@link laplaceParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSenoHiperbolico(laplaceParser.SenoHiperbolicoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cosenoHiperbolico}
	 * labeled alternative in {@link laplaceParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCosenoHiperbolico(laplaceParser.CosenoHiperbolicoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cosenoHiperbolico}
	 * labeled alternative in {@link laplaceParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCosenoHiperbolico(laplaceParser.CosenoHiperbolicoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logaritmoNatural}
	 * labeled alternative in {@link laplaceParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLogaritmoNatural(laplaceParser.LogaritmoNaturalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logaritmoNatural}
	 * labeled alternative in {@link laplaceParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLogaritmoNatural(laplaceParser.LogaritmoNaturalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcionDeBessel}
	 * labeled alternative in {@link laplaceParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFuncionDeBessel(laplaceParser.FuncionDeBesselContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcionDeBessel}
	 * labeled alternative in {@link laplaceParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFuncionDeBessel(laplaceParser.FuncionDeBesselContext ctx);
}