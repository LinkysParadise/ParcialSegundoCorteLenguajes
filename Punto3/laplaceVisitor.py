# Generated from laplace.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .laplaceParser import laplaceParser
else:
    from laplaceParser import laplaceParser

# This class defines a complete generic visitor for a parse tree produced by laplaceParser.

class laplaceVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by laplaceParser#prog.
    def visitProg(self, ctx:laplaceParser.ProgContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by laplaceParser#printExpr.
    def visitPrintExpr(self, ctx:laplaceParser.PrintExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by laplaceParser#blank.
    def visitBlank(self, ctx:laplaceParser.BlankContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by laplaceParser#retrasoIdeal.
    def visitRetrasoIdeal(self, ctx:laplaceParser.RetrasoIdealContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by laplaceParser#impulsoUnitario.
    def visitImpulsoUnitario(self, ctx:laplaceParser.ImpulsoUnitarioContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by laplaceParser#amortiguacionExp.
    def visitAmortiguacionExp(self, ctx:laplaceParser.AmortiguacionExpContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by laplaceParser#nPotenciaConDesplazamiento.
    def visitNPotenciaConDesplazamiento(self, ctx:laplaceParser.NPotenciaConDesplazamientoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by laplaceParser#escalonUnitario.
    def visitEscalonUnitario(self, ctx:laplaceParser.EscalonUnitarioContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by laplaceParser#escalonRetraso.
    def visitEscalonRetraso(self, ctx:laplaceParser.EscalonRetrasoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by laplaceParser#nesimaPotencia.
    def visitNesimaPotencia(self, ctx:laplaceParser.NesimaPotenciaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by laplaceParser#qesimaPotencia.
    def visitQesimaPotencia(self, ctx:laplaceParser.QesimaPotenciaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by laplaceParser#seno.
    def visitSeno(self, ctx:laplaceParser.SenoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by laplaceParser#coseno.
    def visitCoseno(self, ctx:laplaceParser.CosenoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by laplaceParser#senoHiperbolico.
    def visitSenoHiperbolico(self, ctx:laplaceParser.SenoHiperbolicoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by laplaceParser#cosenoHiperbolico.
    def visitCosenoHiperbolico(self, ctx:laplaceParser.CosenoHiperbolicoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by laplaceParser#logaritmoNatural.
    def visitLogaritmoNatural(self, ctx:laplaceParser.LogaritmoNaturalContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by laplaceParser#funcionDeBessel.
    def visitFuncionDeBessel(self, ctx:laplaceParser.FuncionDeBesselContext):
        return self.visitChildren(ctx)



del laplaceParser