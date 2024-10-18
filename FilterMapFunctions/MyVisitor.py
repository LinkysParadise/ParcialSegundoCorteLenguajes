from FilterMapFunctionsVisitor import FilterMapFunctionsVisitor
from FilterMapFunctionsParser import FilterMapFunctionsParser
import ast


class MyVisitor(FilterMapFunctionsVisitor):
    def visitMap(self, ctx):
        function_expr = ctx.lambdaExpr().getText()


        iterable_elements = ast.literal_eval(ctx.iterable().getText())

        #Just in case has spaces
        function_expr = function_expr.replace("lambda", "lambda ")

        result = [eval(function_expr)(args) for args in iterable_elements]
        print(result)
        return result



    def visitFilter(self, ctx):
        function_expr = ctx.lambdaExpr().getText()

        iterable_elements = ast.literal_eval(ctx.iterable().getText())

        #Just in case has spaces
        function_expr = function_expr.replace("lambda", "lambda ")

        result = [eval(function_expr)(args) for args in iterable_elements]
        print(result)
        return result


    def visitList(self, ctx):
        elements = ctx.elements().accept(self)
        return elements

    def visitElements(self, ctx):
        if ctx.expr():
            return [ctx.expr(i).accept(self) for i in range(len(ctx.expr()))]
        else:
            return [ctx.iterable(i).accept(self) for i in range(len(ctx.iterable()))]

    def visitExpr(self, ctx):
        # Convertir la expresión a su tipo correspondiente
        if ctx.INT():
            return int(ctx.INT().getText())
        elif ctx.FLOAT():
            return float(ctx.FLOAT().getText())
        elif ctx.STRING():
            return ctx.STRING().getText().strip('"')

