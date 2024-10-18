grammar laplace;

prog:   stat+ EOF;

stat:   expr NEWLINE                #printExpr
    |   NEWLINE                     #blank
    ;

expr:   DELTA '(' T MINUS TAU ')'   #retrasoIdeal
    |   DELTA '(' T ')'             #impulsoUnitario
    |   EULER POW MINUS T           #amortiguacionExp
    |   T POW N MULT EULER POW MINUS ALPHA T #nPotenciaConDesplazamiento
    |   U '(' T ')'                 #escalonUnitario
    |   U '(' T MINUS TAU ')'       #escalonRetraso
    |   T POW N                     #nesimaPotencia
    |   T POW Q                     #qesimaPotencia
    |   SIN '('OMEGA T')'           #seno
    |   COS '('OMEGA T')'           #coseno 
    |   SINH '('ALPHA T')'          #senoHiperbolico
    |   COSH '('ALPHA T')'          #cosenoHiperbolico
    |   LOG '(' T DIV T0')'         #logaritmoNatural
    |   J   '(' OMEGA T ')'         #funcionDeBessel
    ;


DIV:    '/';
MULT:   '*';
POW:    '^';
MINUS:  '-';
DELTA:  'd';
T:      't';
T0:     't0';
Q:      'q';
EULER:  'e';
ALPHA : 'a';
U:      'u';
J:      'J';
N:      'n';
SIN:    'Sin';
COS:    'Cos';
SINH:   'Sinh';
COSH:   'Cosh';
LOG:    'log';
OMEGA:  'w';
TAU:    'tau';



NEWLINE:'\r'? '\n' ;
