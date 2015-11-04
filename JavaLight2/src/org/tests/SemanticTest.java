package org.tests;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

import org.parser.Parser;
import org.scanner.Scanner;

import AST.Program;
import AST.Visitor.*;
import Throwables.CompilerException;
import java_cup.runtime.Symbol;

public class SemanticTest {
	
	private Reader reader;

	public SemanticTest(String filepath) {
		this.reader = new java.io.StringReader(filepath);
	}

	public SemanticTest(File file) {
		try {
			this.reader = new FileReader(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void run(){
		try {
			   
			/*
            Scanner s = new Scanner(this.reader);
            Parser p = new Parser(s);
            Symbol root = p.parse();

            Program prog = (Program)root.value;
            prog.accept(new PrettyPrintVisitor());
			*/
            
			Parser p = new Parser(new Scanner(this.reader));
            Program prog = (Program)(p.parse().value);

            TypeVisitor typeInfo = new TypeVisitor();
            prog.accept(typeInfo);

            typeInfo.printTypes();

            VerifyTypeVisitor verifyTypeInfo = new VerifyTypeVisitor(typeInfo);
            prog.accept(verifyTypeInfo);

            int returnValue = verifyTypeInfo.getReturnValue();
            if (returnValue != 0) {
            	System.out.print("Erro na análise semântica: " + returnValue);
            }else{                        
            	System.out.print("Análise semantica rodou com sucesso!"); 
            }
            
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
