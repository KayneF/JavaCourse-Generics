package application;

import java.util.ArrayList;
import java.util.List;

public class Program3 {
	
	/**
	 * No caso de "covariância", é possível instanciar uma lista genérica de
	 * uma classe wrapper de uma superclasse, e podemos adicionar elementos com
	 * o método "add()", porém, não é possível acessar, ou copiar elementos 
	 * dessa lista em uma variável, mesmo que ela seja do tipo correto.
	 */

	public static void main(String[] args) {

		List<Object> myObjs = new ArrayList<>();
		myObjs.add("Maria");
		myObjs.add("Alex");
		
		List<? super Number> myNums = myObjs;
		
		myNums.add(10);
		myNums.add(3.14);
		
//		Number x = myNums.get(0);
	}
}
