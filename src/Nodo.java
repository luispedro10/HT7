// Se ubtuvo ayuda del siguiente link: https://www.baeldung.com/java-binary-tree
public class Nodo {
	String key;
	String value;
	
	Nodo hijoI;
	Nodo hijoD;
	
	Nodo(String key, String value) {
		this.key = key;
		this.value = value;
	}
	
	
	public String toString() {
		
		return "Ingles: " + key +" |"+ " Espanol: " + value;
	}
}
