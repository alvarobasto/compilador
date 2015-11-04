package org.tests;

import java.io.*;

import org.scanner.Scanner;

import java_cup.runtime.Symbol;
import JFlex.sym;

public class ScannerTest {

	private Reader reader;

	public ScannerTest(String filepath) {
		this.reader = new java.io.StringReader(filepath);
	}

	public ScannerTest(File file) {
		try {
			this.reader = new FileReader(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void run() {		
		println("---> Scanner: Iniciado");
		try {
			 
			Scanner s = new Scanner(this.reader);
			Symbol t = s.next_token();
			while (t.sym != sym.EOF) {				
				println("  " + s.symbolToString(t));
				t = s.next_token();
			}
			
		} catch (Exception e) {
			System.err.println("Erro inesperado no scanner: " + 
                    e.toString());
		}
		println("---> Scanner: Finalizado");
	}

	private void print(String stream) {
		System.out.print(stream + " ");	
	}

	private void println(String stream) {
		print(stream);
		print("\n");
	}
}
