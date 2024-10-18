# Filter and Map Functions Grammar using ANTLR4

This repository contains a custom grammar that handles `map` and `filter` functions similar to those found in Python. The grammar is designed using ANTLR4 and supports lambda expressions and basic functional programming operations such as applying functions to iterables and filtering them based on conditions.

## Features
- **Map function**: Apply a lambda function to each element of an iterable.
- **Filter function**: Filter elements of an iterable based on a lambda function condition.
- **Lambda expressions**: Simple expressions involving variables, basic arithmetic, comparisons, and string operations (`upper()`, `lower()`, `capitalize()`).

## Grammar

The grammar for the `map` and `filter` functions is defined in the `FilterMapFunctions.g4` file. The main grammar rules are as follows:

```antlr
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
```

## Installation

### Prerequisites

- **ANTLR4**: Ensure ANTLR4 is installed on your machine. You can install it by following the instructions on the [official ANTLR website](https://www.antlr.org/).
- **Python 3.x**: Make sure Python is installed.

### Steps

1. **Install pip** (if not already installed):

    ```bash
    sudo apt install python-pip
    ```

2. **Set up a virtual environment**:

    ```bash
    python3 -m venv .venv
    source .venv/bin/activate
    ```

3. **Install the required libraries and dependencies**:

    ```bash
    pip install -r requirements.txt
    ```

4. **Compile the ANTLR grammar**:
   
    Navigate to the directory containing the `.g4` grammar file and run the following command to generate the Python code:

    ```bash
    antlr4 -visitor -Dlanguage=Python3 FilterMapFunctions.g4
    ```

    This will generate the necessary Python files for the lexer and parser.

## Usage

You can run the FilterMapFunctions interpreter by using the `filter_map_calc.py` script.

### Running with test expressions

To run the interpreter with predefined test expressions:

```bash
python3 filter_map_calc.py test.expr
```

### Running interactively

To input your own expressions interactively:

```bash
python3 filter_map_calc.py
```

Once the program starts, you can enter your `map` and `filter` expressions, and it will evaluate them.

### Example Expressions

```bash
map(lambda x: x + 1, [1, 2, 3])
filter(lambda x: x > 2, [1, 2, 3])
map(lambda y: y.upper(), ["a", "b", "c"])
```
