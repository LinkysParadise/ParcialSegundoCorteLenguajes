import sys
from antlr4 import *
from antlr4.InputStream import InputStream
from laplaceLexer import laplaceLexer
from laplaceParser import laplaceParser
from MyVisitor import LaplaceTransformVisitor

if __name__ == '__main__':
    if len(sys.argv) > 1:
        input_stream = FileStream(sys.argv[1])
    else:
        input_stream = InputStream(sys.stdin.readline())

    lexer = laplaceLexer(input_stream)
    token_stream = CommonTokenStream(lexer)
    parser = laplaceParser(token_stream)
    tree = parser.prog()

    visitor = LaplaceTransformVisitor()
    visitor.visit(tree)
