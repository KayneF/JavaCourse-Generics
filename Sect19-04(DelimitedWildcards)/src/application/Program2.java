package application;

import java.util.ArrayList;
import java.util.List;

public class Program2 {
	
	/**
	 * No caso de "contravariância", é possível instanciar uma lista genérica de
	 * uma superclasse de uma classe wrapper, e podemos acessar os dados com
	 * o método "get()", porém, não é possível adicionar elementos nessa lista.
	 */

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		List<Integer> intList = new ArrayList<>();
		intList.add(10);
		intList.add(5);
		
		List<? extends Number> list = intList;
		
		Number x = list.get(0);
		
//		list.add(20);
	}

}
