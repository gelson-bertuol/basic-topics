package arrays;

import java.util.Locale;
import java.util.Scanner;

public class ArrayPrimitivos {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] vect = new double[n];
		double soma = 0;
		
		for (int i=0; i<n; i++) {
			vect[i] = sc.nextDouble();
			soma += vect[i];
		}
		
		System.out.printf("The average is: %.2f", soma/n);
		
		sc.close();
	}
}
