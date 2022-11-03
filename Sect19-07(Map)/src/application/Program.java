package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {
		
		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("username", "Maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "987456123");
		
		cookies.remove("email");
		cookies.put("phone", "11977441123");
		// Em map, quando um valor chave é repetido, o valor é sobreescrito
		
		System.out.println("Contains key: " + cookies.containsKey("phone"));
		System.out.println("Phone number: " + cookies.get("phone"));
		
		System.out.println("\nAll cookies: ");
		for (String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}
	}
}
