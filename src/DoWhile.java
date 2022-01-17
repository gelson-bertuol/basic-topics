import java.util.Locale;
import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int soma = 0;
		int entrada;
		do {
			entrada = sc.nextInt();
			soma += entrada;
		} while (entrada != 0);

		System.out.println(soma);
		
		sc.close();
	}
}
