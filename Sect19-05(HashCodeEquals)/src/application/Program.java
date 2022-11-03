package application;

import entities.Client;

public class Program {

	public static void main(String[] args) {
		
		/**
		 * Existem 2 métodos que podem ser usados para se comparar objetos, são 
		 * o "hashCode()" e "equals()". Esses métodos são criados dentro da 
		 * classe do objeto para gerar os dados comparativos.
		 * No caso de "equals()", é um método mais lento, porém é mais eficaz
		 * e que garante 100% de que os objetos comparados são ou não iguais.
		 * Já o hashCode(), é muito mais rápido e eficiente do que o método 
		 * equals(), porém existe uma remota chance dos códigos hash gerados 
		 * serem iguais.
		 * Os métodos comparativos servem para comparar objetos, já que o 
		 * comando de comparação "==" não funciona corretamente com objetos,
		 * somente com dados de tipo primitivo.
		 */
		
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Alex", "alex@gmail.com");
		Client c3 = new Client("Rongo", "rongo@gmail.com");
		Client c4 = new Client("Rongo", "rongo@gmail.com");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println(c1 == c2);
		
		System.out.println(c3.hashCode());
		System.out.println(c4.hashCode());
		System.out.println(c3.equals(c4));
		System.out.println(c3 == c4);
		/**
		 * Note que, os objetos "c3" e "c4" são exatamente iguais, porém, o 
		 * comando comparativo, considera que, como eles são encontrados em 
		 * posições diferentes na memória heap, são considerados objetos 
		 * distintoso (assim como duas canetas podem ser iguais, cada uma é um 
		 * objeto diferente, apesar de semelhantes) o que resulta com que a 
		 * comparação seja falsa. 
		 * Já os métodos comparativos, comparam apenas os dados contidos no 
		 * objeto, portanto, ele consegue constar que os objetos em sí, são 
		 * iguais.
		 */
	}
}
