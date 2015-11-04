package org.tests;

import org.parser.Parser;
import org.scanner.Scanner;

import AST.*;
import AST.Visitor.*;
import Throwables.*;
import java_cup.runtime.Symbol;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class ParserTest {
	
	private Reader reader;

	public ParserTest(String filepath) {
		this.reader = new java.io.StringReader(filepath);
	}

	public ParserTest(File file) {
		try {
			this.reader = new FileReader(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void run(){
		try {
			            
            Scanner s = new Scanner(this.reader);
            Parser p = new Parser(s);
            Symbol root = p.parse();

            Program prog = (Program)root.value;
            prog.accept(new PrettyPrintVisitor());

            System.out.print("Parser rodou com sucesso!"); 
            
        } catch (CompilerException e) {
            //erro de compilação do arquivo de entrada
            System.err.println(e.getMessage());
        } catch (Exception e) {
            //erro do compilador
            System.err.println("Erro inesperado no parser: " + 
                               e.toString());
            e.printStackTrace();
        }	
	}
	
}
