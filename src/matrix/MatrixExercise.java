package matrix;

import java.util.Locale;
import java.util.Scanner;

public class MatrixExercise {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		int qtdNegativeNumbers = 0;
		System.out.println("Main diagonal:");
		for (int i=0; i<mat.length; i++) {
			System.out.print(mat[i][i] + " ");
			for (int j=0; j<mat[i].length; j++) {
				if (mat[i][j] < 0) qtdNegativeNumbers++;
			}
		}
		
		System.out.println();
		System.out.println("Negative numbers = " + qtdNegativeNumbers);
		sc.close();
	}
	
}
