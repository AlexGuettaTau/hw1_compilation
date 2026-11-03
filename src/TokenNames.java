public interface TokenNames {
  /* terminals */
  public static final int EOF = 0;

  /* Arithmetic operators */
  public static final int PLUS = 1;
  public static final int MINUS = 2;
  public static final int TIMES = 3;
  public static final int DIVIDE = 4;

  /* Parentheses */
  public static final int LPAREN = 5;
  public static final int RPAREN = 6;

  /* Values */
  public static final int INT = 7;
  public static final int NUMBER = INT;
  public static final int ID = 8;
  public static final int STRING = 9;

  /* Comparison operators */
  public static final int EQ = 10;
  public static final int LT = 11;
  public static final int GT = 12;

  /* Logical operators */
  public static final int AND = 13;
  public static final int OR = 14;

  /* Brackets */
  public static final int LBRACK = 15;
  public static final int RBRACK = 16;

  /* Braces */
  public static final int LBRACE = 17;
  public static final int RBRACE = 18;

  /* Other symbols */
  public static final int COMMA = 19;
  public static final int DOT = 20;
  public static final int SEMICOLON = 21;
  public static final int ASSIGN = 22;

  /* Keywords */
  public static final int CLASS = 23;
  public static final int NIL = 24;
  public static final int ARRAY = 25;
  public static final int WHILE = 26;
  public static final int TYPE_INT = 27;
  public static final int TYPE_VOID = 28;
  public static final int EXTENDS = 29;
  public static final int RETURN = 30;
  public static final int NEW = 31;
  public static final int IF = 32;
  public static final int ELSE = 33;
  public static final int TYPE_STRING = 34;
}