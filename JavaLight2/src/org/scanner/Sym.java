package org.scanner;

import java_cup.runtime.Symbol;
import JFlex.*;

public class Sym implements sym {
	
	 public static final int WORD_PRINTLN = 18;
	  public static final int WORD_TRUE = 19;
	  public static final int DEL_SEMICOLON = 36;
	  public static final int WORD_VOID = 13;
	  public static final int WORD_STATIC = 12;
	  public static final int OP_NOT = 27;
	  public static final int OP_AND = 24;
	  public static final int WORD_FALSE = 20;
	  public static final int WORD_NEW = 17;
	  public static final int DEL_LBRACK = 30;
	  public static final int WORD_RETURN = 8;
	  public static final int DEL_LBRACE = 34;
	  public static final int TYPE_INT = 3;
	  public static final int DEL_RBRACK = 31;
	  public static final int DEL_DOT = 28;
	  public static final int DEL_RBRACE = 35;
	  public static final int EOF = 0;
	  public static final int error = 1;
	  public static final int OP_LT = 25;
	  public static final int OP_MULT = 23;
	  public static final int WORD_EXTENDS = 10;
	  public static final int COND_WHILE = 7;
	  public static final int OP_MINUS = 22;
	  public static final int WORD_PUBLIC = 11;
	  public static final int WORD_CLASS = 9;
	  public static final int COND_ELSE = 6;
	  public static final int TYPE_STRING = 4;
	  public static final int WORD_LENGTH = 16;
	  public static final int DEL_LPAREN = 32;
	  public static final int OP_PLUS = 21;
	  public static final int TYPE_BOOL = 2;
	  public static final int OP_EQUAL = 26;
	  public static final int COND_IF = 5;
	  public static final int DEL_COMMA = 29;
	  public static final int DEL_RPAREN = 33;
	  public static final int WORD_MAIN = 14;
	  public static final int WORD_THIS = 15;
	  public static final int INTEGER_LITERAL = 38;
	  public static final int IDENTIFIER = 37;
	
	public static final String toString(Symbol symbol){
		switch (symbol.sym){
			case WORD_RETURN: 	  return "<RETURN>";
			case WORD_CLASS: 	  return "<CLASS>";
			case WORD_PUBLIC: 	  return "<PUBLIC>";
			case WORD_STATIC: 	  return "<STATIC>";
			case WORD_VOID: 	  return "<VOID>";
			case WORD_MAIN: 	  return "<MAIN>";
			case WORD_EXTENDS: 	  return "<EXTENDS>";
			case WORD_THIS: 	  return "<THIS>";
			case WORD_NEW:		  return "<NEW>";
			case WORD_LENGTH: 	  return "<LENGTH>";
			case WORD_PRINTLN: 	  return "<PRINTLN>";
			case TYPE_INT:		  return "<INT>";
			case TYPE_BOOL: 	  return "<BOOL>";
			case TYPE_STRING: 	  return "<STRING>";
			case COND_IF:		  return "<IF>";
			case COND_ELSE: 	  return "<ELSE>";
			case COND_WHILE: 	  return "<WHILE>";			
			case IDENTIFIER: 	  return "<ID("+(String)symbol.value+")>";
			case INTEGER_LITERAL: return "<INT("+symbol.value.toString()+")>";
			//case TRUE/FALSE...
			case WORD_TRUE:        return "<TRUE>";
			case WORD_FALSE:        return "<FALSE>";
			case OP_PLUS: 		  return "<PLUS>";
			case OP_MINUS: 		  return "<MINUS>";
			case OP_EQUAL: 	   	  return "<EQUAL>";
			case OP_NOT: 		  return "<NOT>";
			case OP_MULT: 		  return "<MULT>";
			case OP_AND: 		  return "<AND>";
			case OP_LT: 		  return "<LT>";
			case DEL_LPAREN: 	  return "<LPAREN>";
			case DEL_RPAREN: 	  return "<RPAREN>";
			case DEL_SEMICOLON:   return "<SEMICOLON>";
			case DEL_COMMA: 	  return "<COMMA>";
			case DEL_DOT : 		  return "<DOT>";
			case DEL_LBRACE: 	  return "<LBRACE>";
			case DEL_RBRACE: 	  return "<RBRACE>";
			case DEL_LBRACK: 	  return "<LBRACK>";
			case DEL_RBRACK: 	  return "<RBRACK>";
			default: return "<UNEXPECTED TOKEN " + symbol.toString() + ">";
		}
	}
}
