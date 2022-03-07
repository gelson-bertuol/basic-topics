package generics.application;

import java.util.Arrays;
import java.util.List;

public class WildCardTypes {

	public static void main(String[] args) {
		//Tipos curingas - listas de qualquer tipo.
		
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
		
		List<String> myStrs = Arrays.asList("Maria", "Alex", "Bob");
		printList(myStrs);
	}

	private static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.println(obj);
		}
	}
}
