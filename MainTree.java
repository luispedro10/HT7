import java.io.*;
import java.util.*;
public class MainTree {
	public static void main(String[] args) {
	lector lector = new lector();
	Scanner scan = new Scanner(System.in);
	
	//Para que el lector pueda ver los archivos
	lector.abrirArchivo();
	
	//Guardar el diccionario en el Arbol.
	BinaryTree Tree = new BinaryTree();
	while(lector.getScan().hasNextLine()) {
		String a= (lector.getScan().nextLine());
		String[] parts = a.split(",");
		Tree.agregarNodo(parts[0], parts[1]);
	}
	
	//Menu Principal
	System.out.println("Bienvenido. Que desea hacer?\n1. Recorrer el arbol por In-Order y observarlo\n2. Traducir el texto.txt");
	int decision = scan.nextInt();
	
	if(decision == 1) {
		
		Tree.RecorerIN(Tree.raiz);
	}
	
	else if (decision == 2) {
		
	}
	
	
	
	
	
		
	
	
	
	
	
	
	
	
	
	
	}
	}

