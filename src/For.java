import java.util.Locale;
import java.util.Scanner;

public class For {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int soma = 0;
		System.out.print("Digite o número de iterações: ");
		int i = sc.nextInt();
		
		for (int j = 0; j < i; j++) {
			int entrada = sc.nextInt();
			soma += entrada;
		}
		System.out.println("\nA soma é: " + soma);
		
		sc.close();
	}

}
