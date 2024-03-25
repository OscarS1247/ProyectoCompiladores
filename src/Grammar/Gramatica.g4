grammar Gramatica;
options { caseInsensitive = true; }

// tokens

INT_VAR         : [0-9]+ ;
CHAR_VAR        : ( '\'' [a-z] '\'' | INT_VAR ) ;
STRING_VAR      : '\'' (~["\r\n] | '\'\'')* '\'' ;
OR              : 'OR' ;
AND             : 'AND' ;
VAR             : 'VAR';
PROGRAM         : 'PROGRAM';
BEGIN           : 'BEGIN';
WHILE           : 'WHILE' ;
FOR             : 'FOR';
IF              : 'IF';
ELSE            : 'ELSE' ;
READ            : 'READ' | 'READLN' ;
WRITE           : 'WRITE' | 'WRITELN' ;
FUNC            : 'FUNCTION' ;
PROC            : 'PROCEDURE' ;
DO              : 'DO';
PROGRAM_END     : 'END.' ;
END             : 'END' ;
FOR_ORDER       : TO | DOWNTO ;
DOWNTO          : 'DOWNTO' ;
TO              : 'TO';
THEN            : 'THEN';
RET             : 'RETURN' ;
STRING_TYPE     : 'string' ;
INT_TYPE        : 'int' | 'integer' ;
CHAR_TYPE       : 'char' ;
BOOL_TYPE       : 'bool' ;
ARRAY_TYPE      : ID '[' INT_VAR '..' INT_VAR '] of ' ( INT_TYPE | CHAR_TYPE | STRING_TYPE ) ;
D_ARRAY_TYPE    : ID '[' INT_VAR '..' INT_VAR ',' INT_VAR '..' INT_VAR '] of ' ( INT_TYPE | CHAR_TYPE | STRING_TYPE ) ;
ASSIGN          : ':=' ;
SEMI            : ';' ;
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
COMM            : '{' .*? '}' -> skip ;
ID              : [a-z_][a-z0-9_]* ;
WS              : [ \n\t]+ -> skip ;


//rules

programa: PROGRAM ID SEMI ( COMM* ( VAR ( init )* )? COMM* ) ( funcs_and_procs SEMI )* BEGIN code_block PROGRAM_END;

code_block: ( row SEMI )* ;
structure_code: ( row | ( BEGIN code_block END ) ) ;
function_code: ( ( row | return ) SEMI  ) * ;
row: ( assignation | read | write | function | procedure | while | for | if ) ;

// Arrays
array_id: ID '[' ( int_element ) ( ',' int_element )? ']' ;
array_type: ( 'array of' ( INT_TYPE | CHAR_TYPE | STRING_TYPE ) ) ;


// Expresiones aritmeticas
expr: ( ( term ( SUM_OPERATOR term )* ) ) ;
term: ( factor ( MULT_OPERATOR term )* ) ;
factor: ( PARENTHESIS_OP expr PARENTHESIS_CL ) | int_element ;

// Expresiones booleanas
bool_expr: ( bool_term ( OR bool_term )* ) ;
bool_term: ( bool_factor ( AND bool_factor )* ) ;
bool_factor: ( bool_operation | PARENTHESIS_OP bool_operation PARENTHESIS_CL ) ;
bool_operation: expr COMP_OPERATOR expr ;

// Manejo de variables
id: ( ID | array_id ) ;
init: ID ( ',' ID )* COLON type SEMI ;
funcs_and_procs: ( function_def | procedure_def ) ;
assignation: ( id ASSIGN ( expr | function | STRING_VAR ) ) ;
return: RET element ;

// Definiciones

    // Defincion de variables y tipo
var: ( INT_VAR | CHAR_VAR | STRING_VAR | array_id ) ;
type: ( STRING_TYPE | INT_TYPE | CHAR_TYPE | BOOL_TYPE | ARRAY_TYPE | D_ARRAY_TYPE ) ;
params_type: ( array_type | INT_TYPE | CHAR_TYPE | BOOL_TYPE | STRING_TYPE );

int_element: ( INT_VAR | ID | array_id | function );
element: ( var | ID | int_element | expr );

    // Estructuras
while: WHILE PARENTHESIS_OP bool_expr PARENTHESIS_CL DO structure_code ;
for: FOR ID ASSIGN int_element FOR_ORDER int_element DO structure_code ;
if: IF bool_expr THEN structure_code else? ;
else: ELSE structure_code ;

    // Funciones y procedimientos junto con sus definiciones
function_def:
FUNC ID PARENTHESIS_OP ( params )? PARENTHESIS_CL ( COLON type )? SEMI ( VAR ( init )* )?
BEGIN function_code END;
function: ID PARENTHESIS_OP ( element ( COMMA element )* )? PARENTHESIS_CL ;

procedure_def:
PROC ID PARENTHESIS_OP ( params )? PARENTHESIS_CL ( COLON type )? SEMI ( VAR ( init )* )?
BEGIN code_block END;
procedure: ID PARENTHESIS_OP ( element ( COMMA element )* )? PARENTHESIS_CL ;
    // Funciones de read y de write
read: READ PARENTHESIS_OP ( ID* ) PARENTHESIS_CL ;
write: WRITE PARENTHESIS_OP ( element ( COMMA element )* ) PARENTHESIS_CL ;

    // Definicion de los parametros
params: ID ( COMMA ID )* COLON params_type ;

