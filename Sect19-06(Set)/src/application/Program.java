package application;

import java.util.LinkedHashSet;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		
		/**
		 * A interface "Set<T>", assim como a lista (List<T>), é do tipo 
		 * genérico.
		 * Ela representa um conjunto de elementos que:
		 * 		Não admite repetições
		 * 		Elementos não possuem posição (como um Array)
		 * 		Acesso, inserção e remoção de elementos são rápidos
		 * 		Oferece operações eficientes de conjunto: interseção, união, 
		 * 			diferença
		 * 		E as princpais implementaçẽs são:
		 * 			HashSet - mais rápido e não ordenado
		 * 			TreeSet - mais lento e ordenado pelo "compareTo()" do objeto
		 * 			LinkedHashSet - veloocidade intermediária e elementos na
		 * 				orderm em que são adicionados
		 */
		
//		Set<String> set = new HashSet<>();
//		Set<String> set = new TreeSet<>();
		Set<String> set = new LinkedHashSet<>();
		
		set.add("TV");
		set.add("Laptop");
		set.add("Tablet");
		set.add("Casette");
		
		// Remove um elemento se a condiçã for satisfeita
		set.removeIf(x -> x.length() >= 3);
		
		// Verifica se o conjunto contém o elemento solicitado
		System.out.println(set.contains("Laptop"));
		
		for (String p : set) {
			System.out.println(p);
		}
	}
}
