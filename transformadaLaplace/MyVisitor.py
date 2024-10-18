from laplaceParser import laplaceParser
from laplaceVisitor import laplaceVisitor

class LaplaceTransformVisitor(laplaceVisitor):
    
    def visitPrintExpr(self, ctx: laplaceParser.PrintExprContext):
        value = self.visit(ctx.expr())
        print("= ",value)
        return value

    def visitRetrasoIdeal(self, ctx: laplaceParser.RetrasoIdealContext):
        tau = ctx.TAU().getText()
        return f"e^(-{tau}*s)"  

    def visitImpulsoUnitario(self, ctx: laplaceParser.ImpulsoUnitarioContext):
        return "1"  

    def visitAmortiguacionExp(self, ctx: laplaceParser.AmortiguacionExpContext):
        return "1/(s + a)"

    def visitNPotenciaConDesplazamiento(self, ctx: laplaceParser.NPotenciaConDesplazamientoContext):
        n = int(ctx.N().getText())
        return f"{n}!/(s^{n+1})" 

    def visitQesimaPotencia(self, ctx: laplaceParser.QesimaPotenciaContext):
        q = ctx.Q().getText()
        return f"Γ({q}+1)/s^{q+1}"  

    def visitEscalonUnitario(self, ctx: laplaceParser.EscalonUnitarioContext):
        return "1/s"

    def visitEscalonRetraso(self, ctx: laplaceParser.EscalonRetrasoContext):
        tau = ctx.TAU().getText()
        return f"e^(-{tau}*s)/s"  

    def visitSeno(self, ctx: laplaceParser.SenoContext):
        omega = ctx.OMEGA().getText()
        return f"{omega}/(s^2 + {omega}^2)" 

    def visitCoseno(self, ctx: laplaceParser.CosenoContext):
        omega = ctx.OMEGA().getText()
        return f"s/(s^2 + {omega}^2)"  # Transformada de Cos(omega * t)

    def visitSenoHiperbolico(self, ctx: laplaceParser.SenoHiperbolicoContext):
        alpha = ctx.alpha().getText()
        return f"{alpha}/(s^2 - {alpha}^2)"  # Transformada de Sinh(alpha * t)

    def visitCosenoHiperbolico(self, ctx: laplaceParser.CosenoHiperbolicoContext):
        alpha = ctx.alpha().getText()
        return f"s/(s^2 - {alpha}^2)"  # Transformada de Cosh(alpha * t)

    def visitLogaritmoNatural(self, ctx: laplaceParser.LogaritmoNaturalContext):
        t0 = ctx.T0().getText()
        log = ctx.LOG().getText()
        return f"(-{log}({t0}*s) + gamma) / s"  # Transformada de log(t/t0)

    def visitFuncionDeBessel(self, ctx: laplaceParser.FuncionDeBesselContext):
        omega = ctx.OMEGA().getText()
        return f"({omega}^n * (s + (s^2+{omega}^2)^1/2)^-n)/ s^2+{omega}^2)^1/2 "  # Placeholder para función de Bessel

    def visitProg(self, ctx: laplaceParser.ProgContext):
        results = []
        for stat in ctx.stat():
            results.append(self.visit(stat))
        return results
