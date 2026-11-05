import java.io.*;

import java_cup.runtime.Symbol;

public class Main {
	static public void main(String argv[]) {
		Lexer l;
		Symbol s;
		FileReader fileReader;
		PrintWriter fileWriter;
		String inputFileName = argv[0];
		String outputFileName = argv[1];

		try {
			/********************************/
			/* [1] Initialize a file reader */
			/********************************/
			fileReader = new FileReader(inputFileName);

			/********************************/
			/* [2] Initialize a file writer */
			/********************************/
			fileWriter = new PrintWriter(outputFileName);

			/******************************/
			/* [3] Initialize a new lexer */
			/******************************/
			l = new Lexer(fileReader);

			/***********************/
			/* [4] Read next token */
			/***********************/
			s = l.next_token();

			/********************************/
			/* [5] Main reading tokens loop */
			/********************************/
			while (s.sym != TokenNames.EOF) {
				String tokenName = getTokenName(s.sym);
				/************************/
				/* [6] Print to console */
				/************************/
				String tokenOutput = tokenName;
				if (s.sym == TokenNames.INT || s.sym == TokenNames.STRING || s.sym == TokenNames.ID) {
					tokenOutput += " (" + s.value + ")";
				}
				tokenOutput += " [" + l.getLine() + "," + l.getTokenStartPosition() + "]";

				// הדפסה לקונסול
				System.out.println(tokenOutput);

				// הדפסה לקובץ הפלט לפי הפורמט המדויק של המטלה
				fileWriter.println(tokenOutput);

				s = l.next_token();
			}

			/******************************/
			/* [9] Close lexer input file */
			/******************************/
			l.yyclose();

			/**************************/
			/* [10] Close output file */
			/**************************/
			fileWriter.close();
		} catch (LexicalException e) {
			PrintWriter writer = new PrintWriter(outputFileName);
			writer.print("ERROR");
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static String getTokenName(int sym) {
		switch (sym) {
			case TokenNames.EOF:
				return "EOF";
			case TokenNames.PLUS:
				return "PLUS";
			case TokenNames.MINUS:
				return "MINUS";
			case TokenNames.TIMES:
				return "TIMES";
			case TokenNames.DIVIDE:
				return "DIVIDE";
			case TokenNames.LPAREN:
				return "LPAREN";
			case TokenNames.RPAREN:
				return "RPAREN";
			case TokenNames.INT:
				return "INT";
			case TokenNames.ID:
				return "ID";
			case TokenNames.STRING:
				return "STRING";
			case TokenNames.EQ:
				return "EQ";
			case TokenNames.LT:
				return "LT";
			case TokenNames.GT:
				return "GT";
			case TokenNames.AND:
				return "AND";
			case TokenNames.OR:
				return "OR";
			case TokenNames.LBRACK:
				return "LBRACK";
			case TokenNames.RBRACK:
				return "RBRACK";
			case TokenNames.LBRACE:
				return "LBRACE";
			case TokenNames.RBRACE:
				return "RBRACE";
			case TokenNames.COMMA:
				return "COMMA";
			case TokenNames.DOT:
				return "DOT";
			case TokenNames.SEMICOLON:
				return "SEMICOLON";
			case TokenNames.ASSIGN:
				return "ASSIGN";
			case TokenNames.CLASS:
				return "CLASS";
			case TokenNames.NIL:
				return "NIL";
			case TokenNames.ARRAY:
				return "ARRAY";
			case TokenNames.WHILE:
				return "WHILE";
			case TokenNames.TYPE_INT:
				return "TYPE_INT";
			case TokenNames.TYPE_VOID:
				return "TYPE_VOID";
			case TokenNames.EXTENDS:
				return "EXTENDS";
			case TokenNames.RETURN:
				return "RETURN";
			case TokenNames.NEW:
				return "NEW";
			case TokenNames.IF:
				return "IF";
			case TokenNames.ELSE:
				return "ELSE";
			case TokenNames.TYPE_STRING:
				return "TYPE_STRING";
			default:
				return "UNKNOWN";
		}
	}
}
