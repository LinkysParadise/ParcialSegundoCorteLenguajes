from calculadoraVisitor import calculadoraVisitor
from calculadoraParser import calculadoraParser


class MyVisitor(calculadoraVisitor):

    def visitPrintExpr(self, ctx: calculadoraParser.PrintExprContext):
        value = self.visit(ctx.expr())
        print("=" ,value)
        return value

    def visitReadFraction(self, ctx: calculadoraParser.ReadFractionContext):
        
        string:str = ctx.getText()
        
        left = int(string.split("/")[0])
        right = int(string.split("/")[1])

        return [left , right] 

    
    def visitNegative(self, ctx: calculadoraParser.NegativeContext):
        value = self.visit(ctx.expr())
        negativeValue = -value[0]
        print("Negative Number: ", f"{value[0]}/{value[1]}")
        return [negativeValue, value[1]]

    def visitMulDiv(self, ctx):
        left = self.visit(ctx.expr(0))
        right = self.visit(ctx.expr(1))
        if left[1] == 0 or right[0] == 0: return "No se permite division por Cero"

        if ctx.op.type == calculadoraParser.MUL:
            numerador = left[0]*right[0]
            denominador = left[1]*right[1]
            return f"{numerador}/{denominador}"
        else:
            numerador = left[0]*right[1]
            denominador = left[1]*right[0]
            return f"{left[0]*right[1]}/{left[1]*right[0]}"


    
    def visitAbs(self,ctx):
        value = self.visit(ctx.expr())
        return [abs(value[0]), abs(value[1])]
    

    def visitAddSub(self, ctx: calculadoraParser.AddSubContext):
        left = self.visit(ctx.expr(0))
        right = self.visit(ctx.expr(1))
        if left[1] == 0 or right[1] == 0: return "No se permite division por Cero"

        if left[1] == right[1]:
            if ctx.op.type == calculadoraParser.ADD:
                return f"{left[0]+right[0]}/{left[1]}"
            else:
                return f"{left[0]-right[0]}/{left[1]}"
        else:
            leftM = left[0]*right[1]
            rightM = left[1]*right[0]
            if ctx.op.type == calculadoraParser.ADD:
                return f"{leftM+rightM}/{left[1]*right[1]}"
            else:
                return f"{leftM-rightM}/{left[1]*right[1]}"

    def visitParens(self, ctx):
        return self.visit(ctx.expr())
