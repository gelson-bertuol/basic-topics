package generics.application;

import java.util.Locale;

import generics.entities.Client;

public class EqualsAndHashCode {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Maria", "maria@gmail.com");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		
		System.out.println(c1.equals(c2));
		System.out.println(c1 == c2);
		
		//Strings têm um tratamento especial na comparação
		String s1 = "Test";
		String s2 = "Test";
		System.out.println(s1 == s2);
	}
}
