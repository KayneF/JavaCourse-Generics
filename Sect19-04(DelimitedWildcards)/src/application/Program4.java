package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program4 {
	
	/**
	 * Caso seja necessário gerar uma cópia de uma lista wildcard, criamos um
	 * método com uma estrutura que copia cada elemento e joga em uma nova
	 * lista, por exemplo. 
	 */

	public static void main(String[] args) {
		
		List<Integer> myInts = Arrays.asList(1,2,3,4);
		List<Double> myDoubles = Arrays.asList(3.14, 6.28);
		List<Object> myObjs = new ArrayList<>();
		
		copy(myInts, myObjs);
		printList(myObjs);
		copy(myDoubles, myObjs);
		printList(myObjs);
	}
	
	public static void copy(List<? extends Number> source, List<? super Number> copy) {
		for (Number number : source) {
			copy.add(number);
		}
	}
	
	public static void printList(List<?> list) {
		System.out.print("[  ");
		for (Object obj : list) {
			System.out.print(obj + "  ");
		}
		System.out.print("]");
		System.out.println();
	}
}
