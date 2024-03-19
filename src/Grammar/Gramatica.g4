grammar Gramatica;
options { caseInsensitive = true; }

// tokens

INT_VAR         : [0-9]+ ;
CHAR_VAR        : ( '\'' [a-z] '\'' | INT_VAR ) ;
STRING_VAR      : '\'' (~["\r\n] | '\'\'')* '\'' ;
ARRAY_VAR       : ID '[' INT_VAR ']' ;
OR              : 'OR' ;
AND             : 'AND' ;
VAR             : 'VAR';
PROGRAM         : 'PROGRAM';
BEGIN           : 'BEGIN';
WHILE           : 'WHILE' ;
FOR             : 'FOR';
IF              : 'IF';
DO              : 'DO';
STRING_TYPE     : 'string' ;
PROGRAM_END     : 'END.' ;
END             : 'END;' ;
TO              : 'TO';
THEN            : 'THEN';
INT_TYPE        : 'int' | 'integer' ;
CHAR_TYPE       : 'char' ;
BOOL_TYPE       : 'bool' ;
ASSIGN          : ':=' ;
SEMI            : ';' ;
EQUAL           : '=' ;
COLON           : ':' ;
COMMA           : ',';
PARENTHESIS_OP  : '(';
PARENTHESIS_CL  : ')';
BRACKET_OP      : '[';
BRACKET_CL      : ']';
COMP_OPERATOR   : ( '<>' | '=' | '>' | '<' | '>=' | '<=' ) ;
SUM_OPERATOR    : ( '+' | '-' ) ;
MULT_OPERATOR   : ( '*' | '/' | 'div' | 'mod' ) ;
TRUE            : 'true' ;
FALSE           : 'false' ;
COMM            : '{' .*? '}';
ID              : [a-z_][a-z0-9_]* ;
WS              : [ \n\t]+ -> skip ;


//rules

programa: PROGRAM ID SEMI ( COMM* ( VAR ( init )* )? COMM* ) BEGIN code_block END;

code_block: ( row SEMI )* ;
row: ( assignation | function | while | for | if | COMM ) ;

// Manejo de variables
init: ID ( ',' ID )* COLON type SEMI ;
assignation: ( ID ASSIGN ( expr ) ) | ( ARRAY_VAR ASSIGN ( expr ) )  ;

// Expresiones aritmeticas
expr: ( ( term ( SUM_OPERATOR term)* ) | ( PARENTHESIS_OP expr PARENTHESIS_CL ) | ( ARRAY_VAR BRACKET_OP expr BRACKET_CL ) ) ;
term: ( ( var | ID ) ( MULT_OPERATOR term )* ) | ( PARENTHESIS_OP expr PARENTHESIS_CL )  ;

// Expresiones booleanas
bool_expr: ( ( bool_term ( OR bool_term )* ) | ( PARENTHESIS_OP bool_expr PARENTHESIS_CL ) );
bool_term: ( ( ID | bool_operation ) ( AND bool_term )* ) | ( PARENTHESIS_OP bool_expr PARENTHESIS_CL ) ;
bool_operation: ( var | ID | ARRAY_VAR ) COMP_OPERATOR ( var | ID | ARRAY_VAR ) ;

// Definiciones

    // Defincion de variables y tipo
var: ( INT_VAR | CHAR_VAR | STRING_VAR | ARRAY_VAR ) ;
type: ( STRING_TYPE | INT_TYPE | CHAR_TYPE | BOOL_TYPE ) ;

    // Estructuras
while: WHILE PARENTHESIS_OP bool_expr PARENTHESIS_CL structure_code ;
for: FOR ID ASSIGN INT_VAR TO ( ID | INT_VAR ) structure_code ;
if: IF PARENTHESIS_OP bool_expr PARENTHESIS_CL THEN structure_code ;

structure_code: ( row | ( DO code_block END ) ) ;

function: ID PARENTHESIS_OP ( params )? PARENTHESIS_CL ( COLON type )? SEMI code_block END ;

params: ID ( COMMA ID )* COLON type ;

