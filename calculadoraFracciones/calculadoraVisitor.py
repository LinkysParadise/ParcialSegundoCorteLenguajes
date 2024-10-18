# Generated from calculadora.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .calculadoraParser import calculadoraParser
else:
    from calculadoraParser import calculadoraParser

# This class defines a complete generic visitor for a parse tree produced by calculadoraParser.

class calculadoraVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by calculadoraParser#prog.
    def visitProg(self, ctx:calculadoraParser.ProgContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by calculadoraParser#printExpr.
    def visitPrintExpr(self, ctx:calculadoraParser.PrintExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by calculadoraParser#blank.
    def visitBlank(self, ctx:calculadoraParser.BlankContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by calculadoraParser#AbsExpr.
    def visitAbsExpr(self, ctx:calculadoraParser.AbsExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by calculadoraParser#parens.
    def visitParens(self, ctx:calculadoraParser.ParensContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by calculadoraParser#Negative.
    def visitNegative(self, ctx:calculadoraParser.NegativeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by calculadoraParser#readFraction.
    def visitReadFraction(self, ctx:calculadoraParser.ReadFractionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by calculadoraParser#MulDiv.
    def visitMulDiv(self, ctx:calculadoraParser.MulDivContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by calculadoraParser#AddSub.
    def visitAddSub(self, ctx:calculadoraParser.AddSubContext):
        return self.visitChildren(ctx)



del calculadoraParser