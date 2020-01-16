grammar calc;

start : strings EOF;

strings : assigning ';' strings | ;

assigning : Var '=' expr;

expr : expr op expr
        | number
        | variable
        | left expr right;


left : '(';
right : ')';

op :  '+'
    | '-'
    | '/'
    | '*'
    ;

number : Num;

Num : [0-9]+;

variable : Var;
mainVar : Var;

Var : [a-zA-Z0-9]+;

WS
   : [ \n\t\r]+ -> skip;