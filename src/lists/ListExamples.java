package lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class ListExamples {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add("Jade");
		list.add("Amelia");

		showList(list, "Original list");

		//Inserir elemento no meio da lista
		list.add(2, "Marco");
		showList(list, "Add 'Marco'");
		
		//Remover elemento da lista
		list.remove("Anna");
		list.remove(0);
		showList(list, "Remove 'Anna' and item 0");
		
		//Remover elemento por predicado (lambda)
		list.removeIf(x -> x.charAt(0) == 'M'); //Exclui todos que começam com 'M'
		showList(list, "Remove all itens starting with 'M'");
		
		//Encontrar um elemento na lista
		System.out.println("Index of Jade: " + list.indexOf("Jade"));
		
		//Procurar alguém que não está na lista
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		System.out.println("--------------------------------");
		
		//Filtrar todos que começam com 'A'
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		showList(result, "Filtering all elements starting with 'A'");
		
		//Encontar um elemento que atenda a algum predicado específico
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
		System.out.println("--------------------------------");
		
		//System.out.println(list.size());
	}
	
	public static void showList(List<String> list, String comment) {
		System.out.println("----- " + comment + " ---------------------------");
		for (String item : list) {
			System.out.println(item);
		}
		System.out.println("--------------------------------");
	}

}
