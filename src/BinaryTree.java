/**
 * 
 * @author LUIS PEDRO Garcia 19344
 *
 */
// Se ubtuvo ayuda del siguiente link: https://www.baeldung.com/java-binary-tree
// y de https://www.youtube.com/watch?v=M6lYob8STMI
public class BinaryTree {
	
	Nodo raiz ;
	
	public void agregarNodo(String key, String value) {
		Nodo nuevoNodo= new Nodo(key, value);
		
		//Si no existe raiz, el nodo insertado será la raíz. 
		if (raiz == null) {
			raiz = nuevoNodo;
		}
		else {
			Nodo nodoActual = raiz;
			Nodo Padre;
			
			while(true) {
				Padre = nodoActual;
				// si la palabra es de 4 o menos letras, es el hijo izquierdo.
				if(key.length()<= 4) {
					nodoActual = nodoActual.hijoI;
					//Si el hijo izquierdo no tiene hijo
					if(nodoActual == null) {
						Padre.hijoI = nuevoNodo;
						return;
						
					} }else {
						nodoActual = nodoActual.hijoD;
						// Si no tiene hijo derecho
						if (nodoActual == null) {
							Padre.hijoD= nuevoNodo;
							return;
						}
					}
				
			
			}
		}
	}
	
	public void RecorerIN(Nodo nodoActual) {
		//Recursion
		if(nodoActual != null) {
			RecorerIN(nodoActual.hijoI);
			//Se imprime el nodo de la izquierda
			System.out.println(nodoActual);
			
			RecorerIN(nodoActual.hijoD);
		}
	}
		
	
	
	
	
	
	
	
	
	
	

}
