# Generated from laplace.g4 by ANTLR 4.13.2
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,23,92,2,0,7,0,2,1,7,1,2,2,7,2,1,0,4,0,8,8,0,11,0,12,0,9,1,0,
        1,0,1,1,1,1,1,1,1,1,3,1,18,8,1,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,
        2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,
        2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,
        2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,
        2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,3,2,90,8,2,
        1,2,0,0,3,0,2,4,0,0,103,0,7,1,0,0,0,2,17,1,0,0,0,4,89,1,0,0,0,6,
        8,3,2,1,0,7,6,1,0,0,0,8,9,1,0,0,0,9,7,1,0,0,0,9,10,1,0,0,0,10,11,
        1,0,0,0,11,12,5,0,0,1,12,1,1,0,0,0,13,14,3,4,2,0,14,15,5,23,0,0,
        15,18,1,0,0,0,16,18,5,23,0,0,17,13,1,0,0,0,17,16,1,0,0,0,18,3,1,
        0,0,0,19,20,5,7,0,0,20,21,5,1,0,0,21,22,5,8,0,0,22,23,5,6,0,0,23,
        24,5,22,0,0,24,90,5,2,0,0,25,26,5,7,0,0,26,27,5,1,0,0,27,28,5,8,
        0,0,28,90,5,2,0,0,29,30,5,11,0,0,30,31,5,5,0,0,31,32,5,6,0,0,32,
        90,5,8,0,0,33,34,5,8,0,0,34,35,5,5,0,0,35,36,5,15,0,0,36,37,5,4,
        0,0,37,38,5,11,0,0,38,39,5,5,0,0,39,40,5,6,0,0,40,41,5,12,0,0,41,
        90,5,8,0,0,42,43,5,13,0,0,43,44,5,1,0,0,44,45,5,8,0,0,45,90,5,2,
        0,0,46,47,5,13,0,0,47,48,5,1,0,0,48,49,5,8,0,0,49,50,5,6,0,0,50,
        51,5,22,0,0,51,90,5,2,0,0,52,53,5,8,0,0,53,54,5,5,0,0,54,90,5,15,
        0,0,55,56,5,8,0,0,56,57,5,5,0,0,57,90,5,10,0,0,58,59,5,16,0,0,59,
        60,5,1,0,0,60,61,5,21,0,0,61,62,5,8,0,0,62,90,5,2,0,0,63,64,5,17,
        0,0,64,65,5,1,0,0,65,66,5,21,0,0,66,67,5,8,0,0,67,90,5,2,0,0,68,
        69,5,18,0,0,69,70,5,1,0,0,70,71,5,12,0,0,71,72,5,8,0,0,72,90,5,2,
        0,0,73,74,5,19,0,0,74,75,5,1,0,0,75,76,5,12,0,0,76,77,5,8,0,0,77,
        90,5,2,0,0,78,79,5,20,0,0,79,80,5,1,0,0,80,81,5,8,0,0,81,82,5,3,
        0,0,82,83,5,9,0,0,83,90,5,2,0,0,84,85,5,14,0,0,85,86,5,1,0,0,86,
        87,5,21,0,0,87,88,5,8,0,0,88,90,5,2,0,0,89,19,1,0,0,0,89,25,1,0,
        0,0,89,29,1,0,0,0,89,33,1,0,0,0,89,42,1,0,0,0,89,46,1,0,0,0,89,52,
        1,0,0,0,89,55,1,0,0,0,89,58,1,0,0,0,89,63,1,0,0,0,89,68,1,0,0,0,
        89,73,1,0,0,0,89,78,1,0,0,0,89,84,1,0,0,0,90,5,1,0,0,0,3,9,17,89
    ]

class laplaceParser ( Parser ):

    grammarFileName = "laplace.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'('", "')'", "'/'", "'*'", "'^'", "'-'", 
                     "'d'", "'t'", "'t0'", "'q'", "'e'", "'a'", "'u'", "'J'", 
                     "'n'", "'Sin'", "'Cos'", "'Sinh'", "'Cosh'", "'log'", 
                     "'w'", "'tau'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "DIV", "MULT", 
                      "POW", "MINUS", "DELTA", "T", "T0", "Q", "EULER", 
                      "ALPHA", "U", "J", "N", "SIN", "COS", "SINH", "COSH", 
                      "LOG", "OMEGA", "TAU", "NEWLINE" ]

    RULE_prog = 0
    RULE_stat = 1
    RULE_expr = 2

    ruleNames =  [ "prog", "stat", "expr" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    DIV=3
    MULT=4
    POW=5
    MINUS=6
    DELTA=7
    T=8
    T0=9
    Q=10
    EULER=11
    ALPHA=12
    U=13
    J=14
    N=15
    SIN=16
    COS=17
    SINH=18
    COSH=19
    LOG=20
    OMEGA=21
    TAU=22
    NEWLINE=23

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.2")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class ProgContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def EOF(self):
            return self.getToken(laplaceParser.EOF, 0)

        def stat(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(laplaceParser.StatContext)
            else:
                return self.getTypedRuleContext(laplaceParser.StatContext,i)


        def getRuleIndex(self):
            return laplaceParser.RULE_prog

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterProg" ):
                listener.enterProg(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitProg" ):
                listener.exitProg(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitProg" ):
                return visitor.visitProg(self)
            else:
                return visitor.visitChildren(self)




    def prog(self):

        localctx = laplaceParser.ProgContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_prog)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 7 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 6
                self.stat()
                self.state = 9 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & 10447232) != 0)):
                    break

            self.state = 11
            self.match(laplaceParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class StatContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return laplaceParser.RULE_stat

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)



    class BlankContext(StatContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a laplaceParser.StatContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def NEWLINE(self):
            return self.getToken(laplaceParser.NEWLINE, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterBlank" ):
                listener.enterBlank(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitBlank" ):
                listener.exitBlank(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitBlank" ):
                return visitor.visitBlank(self)
            else:
                return visitor.visitChildren(self)


    class PrintExprContext(StatContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a laplaceParser.StatContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def expr(self):
            return self.getTypedRuleContext(laplaceParser.ExprContext,0)

        def NEWLINE(self):
            return self.getToken(laplaceParser.NEWLINE, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterPrintExpr" ):
                listener.enterPrintExpr(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitPrintExpr" ):
                listener.exitPrintExpr(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitPrintExpr" ):
                return visitor.visitPrintExpr(self)
            else:
                return visitor.visitChildren(self)



    def stat(self):

        localctx = laplaceParser.StatContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_stat)
        try:
            self.state = 17
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [7, 8, 11, 13, 14, 16, 17, 18, 19, 20]:
                localctx = laplaceParser.PrintExprContext(self, localctx)
                self.enterOuterAlt(localctx, 1)
                self.state = 13
                self.expr()
                self.state = 14
                self.match(laplaceParser.NEWLINE)
                pass
            elif token in [23]:
                localctx = laplaceParser.BlankContext(self, localctx)
                self.enterOuterAlt(localctx, 2)
                self.state = 16
                self.match(laplaceParser.NEWLINE)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExprContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return laplaceParser.RULE_expr

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)



    class AmortiguacionExpContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a laplaceParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def EULER(self):
            return self.getToken(laplaceParser.EULER, 0)
        def POW(self):
            return self.getToken(laplaceParser.POW, 0)
        def MINUS(self):
            return self.getToken(laplaceParser.MINUS, 0)
        def T(self):
            return self.getToken(laplaceParser.T, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterAmortiguacionExp" ):
                listener.enterAmortiguacionExp(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitAmortiguacionExp" ):
                listener.exitAmortiguacionExp(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitAmortiguacionExp" ):
                return visitor.visitAmortiguacionExp(self)
            else:
                return visitor.visitChildren(self)


    class SenoContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a laplaceParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def SIN(self):
            return self.getToken(laplaceParser.SIN, 0)
        def OMEGA(self):
            return self.getToken(laplaceParser.OMEGA, 0)
        def T(self):
            return self.getToken(laplaceParser.T, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterSeno" ):
                listener.enterSeno(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitSeno" ):
                listener.exitSeno(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitSeno" ):
                return visitor.visitSeno(self)
            else:
                return visitor.visitChildren(self)


    class NPotenciaConDesplazamientoContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a laplaceParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def T(self, i:int=None):
            if i is None:
                return self.getTokens(laplaceParser.T)
            else:
                return self.getToken(laplaceParser.T, i)
        def POW(self, i:int=None):
            if i is None:
                return self.getTokens(laplaceParser.POW)
            else:
                return self.getToken(laplaceParser.POW, i)
        def N(self):
            return self.getToken(laplaceParser.N, 0)
        def MULT(self):
            return self.getToken(laplaceParser.MULT, 0)
        def EULER(self):
            return self.getToken(laplaceParser.EULER, 0)
        def MINUS(self):
            return self.getToken(laplaceParser.MINUS, 0)
        def ALPHA(self):
            return self.getToken(laplaceParser.ALPHA, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterNPotenciaConDesplazamiento" ):
                listener.enterNPotenciaConDesplazamiento(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitNPotenciaConDesplazamiento" ):
                listener.exitNPotenciaConDesplazamiento(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitNPotenciaConDesplazamiento" ):
                return visitor.visitNPotenciaConDesplazamiento(self)
            else:
                return visitor.visitChildren(self)


    class NesimaPotenciaContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a laplaceParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def T(self):
            return self.getToken(laplaceParser.T, 0)
        def POW(self):
            return self.getToken(laplaceParser.POW, 0)
        def N(self):
            return self.getToken(laplaceParser.N, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterNesimaPotencia" ):
                listener.enterNesimaPotencia(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitNesimaPotencia" ):
                listener.exitNesimaPotencia(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitNesimaPotencia" ):
                return visitor.visitNesimaPotencia(self)
            else:
                return visitor.visitChildren(self)


    class EscalonUnitarioContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a laplaceParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def U(self):
            return self.getToken(laplaceParser.U, 0)
        def T(self):
            return self.getToken(laplaceParser.T, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterEscalonUnitario" ):
                listener.enterEscalonUnitario(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitEscalonUnitario" ):
                listener.exitEscalonUnitario(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitEscalonUnitario" ):
                return visitor.visitEscalonUnitario(self)
            else:
                return visitor.visitChildren(self)


    class CosenoHiperbolicoContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a laplaceParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def COSH(self):
            return self.getToken(laplaceParser.COSH, 0)
        def ALPHA(self):
            return self.getToken(laplaceParser.ALPHA, 0)
        def T(self):
            return self.getToken(laplaceParser.T, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCosenoHiperbolico" ):
                listener.enterCosenoHiperbolico(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCosenoHiperbolico" ):
                listener.exitCosenoHiperbolico(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCosenoHiperbolico" ):
                return visitor.visitCosenoHiperbolico(self)
            else:
                return visitor.visitChildren(self)


    class LogaritmoNaturalContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a laplaceParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def LOG(self):
            return self.getToken(laplaceParser.LOG, 0)
        def T(self):
            return self.getToken(laplaceParser.T, 0)
        def DIV(self):
            return self.getToken(laplaceParser.DIV, 0)
        def T0(self):
            return self.getToken(laplaceParser.T0, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterLogaritmoNatural" ):
                listener.enterLogaritmoNatural(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitLogaritmoNatural" ):
                listener.exitLogaritmoNatural(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitLogaritmoNatural" ):
                return visitor.visitLogaritmoNatural(self)
            else:
                return visitor.visitChildren(self)


    class FuncionDeBesselContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a laplaceParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def J(self):
            return self.getToken(laplaceParser.J, 0)
        def OMEGA(self):
            return self.getToken(laplaceParser.OMEGA, 0)
        def T(self):
            return self.getToken(laplaceParser.T, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFuncionDeBessel" ):
                listener.enterFuncionDeBessel(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFuncionDeBessel" ):
                listener.exitFuncionDeBessel(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFuncionDeBessel" ):
                return visitor.visitFuncionDeBessel(self)
            else:
                return visitor.visitChildren(self)


    class SenoHiperbolicoContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a laplaceParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def SINH(self):
            return self.getToken(laplaceParser.SINH, 0)
        def ALPHA(self):
            return self.getToken(laplaceParser.ALPHA, 0)
        def T(self):
            return self.getToken(laplaceParser.T, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterSenoHiperbolico" ):
                listener.enterSenoHiperbolico(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitSenoHiperbolico" ):
                listener.exitSenoHiperbolico(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitSenoHiperbolico" ):
                return visitor.visitSenoHiperbolico(self)
            else:
                return visitor.visitChildren(self)


    class QesimaPotenciaContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a laplaceParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def T(self):
            return self.getToken(laplaceParser.T, 0)
        def POW(self):
            return self.getToken(laplaceParser.POW, 0)
        def Q(self):
            return self.getToken(laplaceParser.Q, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterQesimaPotencia" ):
                listener.enterQesimaPotencia(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitQesimaPotencia" ):
                listener.exitQesimaPotencia(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitQesimaPotencia" ):
                return visitor.visitQesimaPotencia(self)
            else:
                return visitor.visitChildren(self)


    class RetrasoIdealContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a laplaceParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def DELTA(self):
            return self.getToken(laplaceParser.DELTA, 0)
        def T(self):
            return self.getToken(laplaceParser.T, 0)
        def MINUS(self):
            return self.getToken(laplaceParser.MINUS, 0)
        def TAU(self):
            return self.getToken(laplaceParser.TAU, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterRetrasoIdeal" ):
                listener.enterRetrasoIdeal(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitRetrasoIdeal" ):
                listener.exitRetrasoIdeal(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitRetrasoIdeal" ):
                return visitor.visitRetrasoIdeal(self)
            else:
                return visitor.visitChildren(self)


    class EscalonRetrasoContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a laplaceParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def U(self):
            return self.getToken(laplaceParser.U, 0)
        def T(self):
            return self.getToken(laplaceParser.T, 0)
        def MINUS(self):
            return self.getToken(laplaceParser.MINUS, 0)
        def TAU(self):
            return self.getToken(laplaceParser.TAU, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterEscalonRetraso" ):
                listener.enterEscalonRetraso(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitEscalonRetraso" ):
                listener.exitEscalonRetraso(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitEscalonRetraso" ):
                return visitor.visitEscalonRetraso(self)
            else:
                return visitor.visitChildren(self)


    class ImpulsoUnitarioContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a laplaceParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def DELTA(self):
            return self.getToken(laplaceParser.DELTA, 0)
        def T(self):
            return self.getToken(laplaceParser.T, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterImpulsoUnitario" ):
                listener.enterImpulsoUnitario(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitImpulsoUnitario" ):
                listener.exitImpulsoUnitario(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitImpulsoUnitario" ):
                return visitor.visitImpulsoUnitario(self)
            else:
                return visitor.visitChildren(self)


    class CosenoContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a laplaceParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def COS(self):
            return self.getToken(laplaceParser.COS, 0)
        def OMEGA(self):
            return self.getToken(laplaceParser.OMEGA, 0)
        def T(self):
            return self.getToken(laplaceParser.T, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCoseno" ):
                listener.enterCoseno(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCoseno" ):
                listener.exitCoseno(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCoseno" ):
                return visitor.visitCoseno(self)
            else:
                return visitor.visitChildren(self)



    def expr(self):

        localctx = laplaceParser.ExprContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_expr)
        try:
            self.state = 89
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,2,self._ctx)
            if la_ == 1:
                localctx = laplaceParser.RetrasoIdealContext(self, localctx)
                self.enterOuterAlt(localctx, 1)
                self.state = 19
                self.match(laplaceParser.DELTA)
                self.state = 20
                self.match(laplaceParser.T__0)
                self.state = 21
                self.match(laplaceParser.T)
                self.state = 22
                self.match(laplaceParser.MINUS)
                self.state = 23
                self.match(laplaceParser.TAU)
                self.state = 24
                self.match(laplaceParser.T__1)
                pass

            elif la_ == 2:
                localctx = laplaceParser.ImpulsoUnitarioContext(self, localctx)
                self.enterOuterAlt(localctx, 2)
                self.state = 25
                self.match(laplaceParser.DELTA)
                self.state = 26
                self.match(laplaceParser.T__0)
                self.state = 27
                self.match(laplaceParser.T)
                self.state = 28
                self.match(laplaceParser.T__1)
                pass

            elif la_ == 3:
                localctx = laplaceParser.AmortiguacionExpContext(self, localctx)
                self.enterOuterAlt(localctx, 3)
                self.state = 29
                self.match(laplaceParser.EULER)
                self.state = 30
                self.match(laplaceParser.POW)
                self.state = 31
                self.match(laplaceParser.MINUS)
                self.state = 32
                self.match(laplaceParser.T)
                pass

            elif la_ == 4:
                localctx = laplaceParser.NPotenciaConDesplazamientoContext(self, localctx)
                self.enterOuterAlt(localctx, 4)
                self.state = 33
                self.match(laplaceParser.T)
                self.state = 34
                self.match(laplaceParser.POW)
                self.state = 35
                self.match(laplaceParser.N)
                self.state = 36
                self.match(laplaceParser.MULT)
                self.state = 37
                self.match(laplaceParser.EULER)
                self.state = 38
                self.match(laplaceParser.POW)
                self.state = 39
                self.match(laplaceParser.MINUS)
                self.state = 40
                self.match(laplaceParser.ALPHA)
                self.state = 41
                self.match(laplaceParser.T)
                pass

            elif la_ == 5:
                localctx = laplaceParser.EscalonUnitarioContext(self, localctx)
                self.enterOuterAlt(localctx, 5)
                self.state = 42
                self.match(laplaceParser.U)
                self.state = 43
                self.match(laplaceParser.T__0)
                self.state = 44
                self.match(laplaceParser.T)
                self.state = 45
                self.match(laplaceParser.T__1)
                pass

            elif la_ == 6:
                localctx = laplaceParser.EscalonRetrasoContext(self, localctx)
                self.enterOuterAlt(localctx, 6)
                self.state = 46
                self.match(laplaceParser.U)
                self.state = 47
                self.match(laplaceParser.T__0)
                self.state = 48
                self.match(laplaceParser.T)
                self.state = 49
                self.match(laplaceParser.MINUS)
                self.state = 50
                self.match(laplaceParser.TAU)
                self.state = 51
                self.match(laplaceParser.T__1)
                pass

            elif la_ == 7:
                localctx = laplaceParser.NesimaPotenciaContext(self, localctx)
                self.enterOuterAlt(localctx, 7)
                self.state = 52
                self.match(laplaceParser.T)
                self.state = 53
                self.match(laplaceParser.POW)
                self.state = 54
                self.match(laplaceParser.N)
                pass

            elif la_ == 8:
                localctx = laplaceParser.QesimaPotenciaContext(self, localctx)
                self.enterOuterAlt(localctx, 8)
                self.state = 55
                self.match(laplaceParser.T)
                self.state = 56
                self.match(laplaceParser.POW)
                self.state = 57
                self.match(laplaceParser.Q)
                pass

            elif la_ == 9:
                localctx = laplaceParser.SenoContext(self, localctx)
                self.enterOuterAlt(localctx, 9)
                self.state = 58
                self.match(laplaceParser.SIN)
                self.state = 59
                self.match(laplaceParser.T__0)
                self.state = 60
                self.match(laplaceParser.OMEGA)
                self.state = 61
                self.match(laplaceParser.T)
                self.state = 62
                self.match(laplaceParser.T__1)
                pass

            elif la_ == 10:
                localctx = laplaceParser.CosenoContext(self, localctx)
                self.enterOuterAlt(localctx, 10)
                self.state = 63
                self.match(laplaceParser.COS)
                self.state = 64
                self.match(laplaceParser.T__0)
                self.state = 65
                self.match(laplaceParser.OMEGA)
                self.state = 66
                self.match(laplaceParser.T)
                self.state = 67
                self.match(laplaceParser.T__1)
                pass

            elif la_ == 11:
                localctx = laplaceParser.SenoHiperbolicoContext(self, localctx)
                self.enterOuterAlt(localctx, 11)
                self.state = 68
                self.match(laplaceParser.SINH)
                self.state = 69
                self.match(laplaceParser.T__0)
                self.state = 70
                self.match(laplaceParser.ALPHA)
                self.state = 71
                self.match(laplaceParser.T)
                self.state = 72
                self.match(laplaceParser.T__1)
                pass

            elif la_ == 12:
                localctx = laplaceParser.CosenoHiperbolicoContext(self, localctx)
                self.enterOuterAlt(localctx, 12)
                self.state = 73
                self.match(laplaceParser.COSH)
                self.state = 74
                self.match(laplaceParser.T__0)
                self.state = 75
                self.match(laplaceParser.ALPHA)
                self.state = 76
                self.match(laplaceParser.T)
                self.state = 77
                self.match(laplaceParser.T__1)
                pass

            elif la_ == 13:
                localctx = laplaceParser.LogaritmoNaturalContext(self, localctx)
                self.enterOuterAlt(localctx, 13)
                self.state = 78
                self.match(laplaceParser.LOG)
                self.state = 79
                self.match(laplaceParser.T__0)
                self.state = 80
                self.match(laplaceParser.T)
                self.state = 81
                self.match(laplaceParser.DIV)
                self.state = 82
                self.match(laplaceParser.T0)
                self.state = 83
                self.match(laplaceParser.T__1)
                pass

            elif la_ == 14:
                localctx = laplaceParser.FuncionDeBesselContext(self, localctx)
                self.enterOuterAlt(localctx, 14)
                self.state = 84
                self.match(laplaceParser.J)
                self.state = 85
                self.match(laplaceParser.T__0)
                self.state = 86
                self.match(laplaceParser.OMEGA)
                self.state = 87
                self.match(laplaceParser.T)
                self.state = 88
                self.match(laplaceParser.T__1)
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





