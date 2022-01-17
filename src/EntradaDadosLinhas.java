import java.util.Locale;
import java.util.Scanner;

public class EntradaDadosLinhas {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x;
		String s1, s2, s3;
		
		System.out.print("Digite um inteiro: ");
		x = sc.nextInt();
		System.out.println(x);
		
		
		//Qualquer entrada DIFERENTE do nextLine() deixará uma quebra de linha pendente.
		//Para resolver, fazer um novo nextLine()
		sc.nextLine();
		System.out.println("Digite as strings...");
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.printf("Dados digitados: \n%s\n%s\n%s", s1, s2, s3);
				
		sc.close();
	}

}
