import java.util.Locale;
import java.util.Scanner;

public class BitWise {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Verificar se o sexto bit de um número lido é 0 ou 1
		int mask = 0b00100000; //Informa um número no formato binário
		int n = sc.nextInt();
		
		if ((n & mask) != 0) {
			System.out.println("6th bit is true!");
		} else {
			System.out.println("6th bit is false!");
		}
		sc.close();
	}

}
