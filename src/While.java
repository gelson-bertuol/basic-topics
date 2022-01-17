import java.util.Locale;
import java.util.Scanner;

public class While {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int entrada = -1;
		int soma = 0;
		while (entrada != 0) {
			entrada = sc.nextInt();
			soma += entrada;
		}
		System.out.println("A soma é: " + soma);
		
		sc.close();
	}

}
