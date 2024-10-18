grammar calculadora;

prog:   stat+ EOF;

stat:   expr NEWLINE                # printExpr
    |   NEWLINE                     # blank
    ;

expr:   '-' expr                    # Negative
    |   expr op=('*'|'/') expr      # MulDiv 
    |   expr op=('+'|'-') expr      # AddSub
    |   ABS expr ABS                # AbsExpr
    |   INT '/' INT                 # readFraction
    |   '(' expr ')'                # parens
    ;


MUL :   '*' ;
DIV :   '/' ;
ADD :   '+' ;
SUB :   '-' ;
ABS :   '|' ;
INT :   [0-9]+ ;                      
NEWLINE:'\r'? '\n' ;
WS  :   [ \t]+ -> skip ;
