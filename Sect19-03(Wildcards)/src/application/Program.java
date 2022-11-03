package application;

import java.util.Arrays;
import java.util.List;

public class Program {

	/**
	 * Apesar de Object ser a superclasse geral, e poder ser convertida de
	 * qualquer outra classe para Object, esse não é o caso em Listas.
	 * Nesse caso, utilizamos o wildcard "List<?>", que nesse caso, seria 
	 * considerado como a superclasse das listas, e assim, uma lista de 
	 * algum tipo, poderá ser convertida para uma lista genérica.
	 * Apesar da versatilidade, não é possível adicionar elementos em uma lista
	 * wildcard, pois o compilador não sabe, se o elemento adicionado, faz
	 * parte do mesmo tipo das listas compatíveis.
	 */
	
	public static void main(String[] args) {
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
		
		List<String> myStrs = Arrays.asList("Maria", "Alex", "Bob");
		printList(myStrs);
	}
	
	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.println(obj);
		}
	}
}
