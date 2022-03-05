package generics.application;

import java.util.Locale;
import java.util.Scanner;

import generics.services.PrintService;

public class Normal {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		PrintService<Integer> ps = new PrintService<>();
		System.out.print("How many values? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int value = sc.nextInt();
			ps.addValue(value);
		}
		ps.print();
		System.out.println("First: " + ps.first());

		//*************************************************
		PrintService<String> pss = new PrintService<>();
		System.out.print("How many values? ");
		n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			String value = sc.next();
			pss.addValue(value);
		}
		pss.print();
		System.out.println("First: " + pss.first());

		
		sc.close();
	}

}
