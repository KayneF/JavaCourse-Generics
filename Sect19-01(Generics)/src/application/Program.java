package application;

import java.util.Scanner;

import services.PrintService;

public class Program {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		PrintService<Integer> ps = new PrintService<>();
		
		System.out.print("How many values? ");
		int n = scan.nextInt();
		
		for (int i=0; i<n; i++) {
			int value = scan.nextInt();
			ps.addValue(value);
		}
		
		ps.print();
		System.out.println("\nFirst: " + ps.first());
		
		scan.close();
	}
}
