grammar calc;

start : strings EOF;

strings : assigning ';' strings | ;

assigning : Var '=' expr;

expr : mulexpr ((Plus | Minus) mulexpr)*;

mulexpr : powexpr ((Mul | Div) powexpr)*;

powexpr : <assoc=right> token '**' powexpr | token;

token : number | variable | left expr right;

left : '(';
right : ')';

Plus : '+';
Minus : '-';
Mul : '*';
Div : '/';
Pow : '**';

number : Num;

Num : [0-9]+;

variable : Var;
mainVar : Var;

Var : [a-zA-Z0-9]+;

WS
   : [ \n\t\r]+ -> skip;