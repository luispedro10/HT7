import java.io.*;
import java.util.*;

public class lector {
	
	private Scanner scan;
	private Scanner scan2 ;
	
	String key;
	String value;
	
	
	
	public void abrirArchivo() {
		try {
			scan = new Scanner(new File("diccionario.txt"));
			scan2 = new Scanner(new File("texto.txt"));
		}
		 
		catch(Exception e) {
			System.out.println("No esta el diccionario o el texto.");
			
		}
	}
// Este metodo imprime todo el archivo de texto, separado por nombre y tipo

	public void  mostrar () {
		while(scan.hasNextLine()) {
		String a= (scan.nextLine());
		String[] parts = a.split(",");
		String part1= parts[0]; 
		String part2 = parts[1]; 
		System.out.println(part1);
		System.out.println(part2);
		}
		}
	
	
	
 
		public Scanner getScan() {
			return scan;
		}
		
		public Scanner getScan2() {
			return scan2;
		}
	}
	

	
	
	
			
			
		
		
	
	
	
	

