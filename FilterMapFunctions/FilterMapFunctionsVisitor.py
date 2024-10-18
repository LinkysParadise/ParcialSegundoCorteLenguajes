# Generated from FilterMapFunctions.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .FilterMapFunctionsParser import FilterMapFunctionsParser
else:
    from FilterMapFunctionsParser import FilterMapFunctionsParser

# This class defines a complete generic visitor for a parse tree produced by FilterMapFunctionsParser.

class FilterMapFunctionsVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by FilterMapFunctionsParser#prog.
    def visitProg(self, ctx:FilterMapFunctionsParser.ProgContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FilterMapFunctionsParser#stat.
    def visitStat(self, ctx:FilterMapFunctionsParser.StatContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FilterMapFunctionsParser#map.
    def visitMap(self, ctx:FilterMapFunctionsParser.MapContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FilterMapFunctionsParser#filter.
    def visitFilter(self, ctx:FilterMapFunctionsParser.FilterContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FilterMapFunctionsParser#lambdaExpr.
    def visitLambdaExpr(self, ctx:FilterMapFunctionsParser.LambdaExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FilterMapFunctionsParser#function.
    def visitFunction(self, ctx:FilterMapFunctionsParser.FunctionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FilterMapFunctionsParser#op.
    def visitOp(self, ctx:FilterMapFunctionsParser.OpContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FilterMapFunctionsParser#iterable.
    def visitIterable(self, ctx:FilterMapFunctionsParser.IterableContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FilterMapFunctionsParser#list.
    def visitList(self, ctx:FilterMapFunctionsParser.ListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FilterMapFunctionsParser#tuple.
    def visitTuple(self, ctx:FilterMapFunctionsParser.TupleContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FilterMapFunctionsParser#elements.
    def visitElements(self, ctx:FilterMapFunctionsParser.ElementsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FilterMapFunctionsParser#var.
    def visitVar(self, ctx:FilterMapFunctionsParser.VarContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by FilterMapFunctionsParser#expr.
    def visitExpr(self, ctx:FilterMapFunctionsParser.ExprContext):
        return self.visitChildren(ctx)



del FilterMapFunctionsParser