import java.util.Locale;
import java.util.Scanner;

public class EntradaDados {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite uma string: ");
		String s = sc.next();
		System.out.println("Você digitou: " + s);
		
		System.out.print("Digite um inteiro: ");
		int i = sc.nextInt();
		System.out.println("Você digitou: " + i);
		
		System.out.print("Digite um double: ");
		double d = sc.nextDouble();
		System.out.println("Você digitou: " + d);
		
		System.out.print("Digite um character: ");
		char c = sc.next().charAt(0);
		System.out.println("Você digitou: " + c);
		
		//Ler vários dados na mesma linha -- na hora de digitar, colocar espaço. Ex.: Teste 20 4.5
		String x;
		int y;
		double z;
		System.out.print("Digite uma String, um inteiro e um double: ");
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		System.out.println("Dados digitados: ");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

		
		sc.close();
	}

}
