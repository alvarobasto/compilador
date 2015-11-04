import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.tests.*;

public class Program {	

	public static void main(String[] args) {
		
		String FileComp = "C:\\Users\\c3po\\Desktop\\Projeto\\JavaLight2\\JavaLight2\\examples\\sucess\\Factorial.java";
		
		//entrega do scanner (antes da prova)
		/*
		String CodeText = openFile(FileComp);
		ScannerTest scanner = new ScannerTest(CodeText);
		scanner.run();
		*/
		
		//entrega do scanner + parser (depois da prova)
		/*
		String CodeText = openFile(FileComp);
		ParserTest parser = new ParserTest(CodeText);
		parser.run(); 
		*/
		
		//entrega da analise semantica		
		String CodeText = openFile(FileComp);
		SemanticTest semantic = new SemanticTest(CodeText);
		semantic.run(); 
		
	}
	
	private static String openFile(String Path){
		String Result  ="";
		try {			
			
			FileReader reader = new FileReader(new File(Path));
	        BufferedReader bufRdr = new BufferedReader(reader);
	        
	        String line = null;
	        while ((line = bufRdr.readLine()) != null)
	        	Result += line+"\n";
	        bufRdr.close();
	        reader.close();
	        
		}catch (IOException e) {
			e.printStackTrace();
		}
		return Result;
	}
		

}
