import sys
from antlr4 import *
from FilterMapFunctionsLexer import FilterMapFunctionsLexer
from FilterMapFunctionsParser import FilterMapFunctionsParser
from FilterMapFunctionsVisitor import FilterMapFunctionsVisitor

from MyVisitor import MyVisitor

if __name__ == '__main__':
    if len(sys.argv) > 1:
        input_stream = FileStream(sys.argv[1])
    else:
        input_stream = InputStream(sys.stdin.readline())

    lexer = FilterMapFunctionsLexer(input_stream)
    token_stream = CommonTokenStream(lexer)
    parser = FilterMapFunctionsParser(token_stream)
    tree = parser.prog()

    visitor = MyVisitor()
    visitor.visit(tree)
