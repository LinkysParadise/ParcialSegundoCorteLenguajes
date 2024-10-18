grammar FilterMapFunctions;

prog:   stat+ EOF;

stat:   map NEWLINE
    |   filter NEWLINE
    |   NEWLINE
    ;

map: 'map' '(' lambdaExpr ',' iterable ')' ;

filter: 'filter' '(' lambdaExpr ',' iterable ')' ;

lambdaExpr: 'lambda' ID ':' function;

function: ID op var | ID'.upper()' | ID'.lower()' | ID'.capitalize()' | ID op var op var (' and '|' or ')? function? | ID'['INT']' (op var)?;

op:   '+' | '-' | '*' | '/' | '%' | '**' | '.'ID'()' | '==' | '!=' | '<' | '>' | '<=' | '>=' ;

iterable: list | tuple | ID ;

list: '[' elements? ']' ;

tuple: '(' elements? ')' ;

elements: expr (',' expr)* ;

var:  ID | INT | FLOAT ;

expr: INT | FLOAT | STRING ;

INT: [0-9]+;
ID: [a-zA-Z][a-zA-Z0-9_]*;
FLOAT: [0-9]+'.'[0-9]+;
STRING: '"' .*? '"';
MUL :   '*' ;
DIV :   '/' ;
ADD :   '+' ;
SUB :   '-' ;
NEWLINE:'\r'? '\n' ;
WS  :   [ \t]+ -> skip ;
