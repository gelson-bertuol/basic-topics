package matrix;

import java.util.Locale;
import java.util.Scanner;

public class MatrixExercise2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int line = sc.nextInt();
		int column = sc.nextInt();
		int[][] matrix = new int[line][column];
		
		for (int i=0; i<matrix.length; i++) {
			for (int j=0; j<matrix[i].length; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		
		int number = sc.nextInt();
		for (int i=0; i<matrix.length; i++) {
			for (int j=0; j<matrix[i].length; j++) {
				if (matrix[i][j] == number) {
					System.out.println("Position " + i + "," + j + ":");
					if (j > 0) 
						System.out.println("Left: " + matrix[i][j-1]);
					if (j < (matrix[i].length - 1))
						System.out.println("Right: " + matrix[i][j+1]);
					if (i > 0)
						System.out.println("Up: " + matrix[i-1][j]);
					if (i < matrix.length -1)
						System.out.println("Down: " + matrix[i+1][j]);
				}
			}
		}
		
		sc.close();
	}
}
