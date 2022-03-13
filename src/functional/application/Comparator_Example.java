package functional.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import functional.entities.Product;

public class Comparator_Example {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<>();
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook",1200.00));
		list.add(new Product("Tablet", 450.00));
		
		// ** Primeira forma de criar o sort. Via uma classe MyComparator que implementa a Comparator -- Comparator objeto de classe separada
		//list.sort(new MyComparator());
		
		// ** Segunda forma de fazer. Via uma sintaxe de classe anônima -- Comparator objeto de classe anônima
		//Comparator<Product> comp = new Comparator<Product>() {
		//	@Override
		//	public int compare(Product p1, Product p2) {
		//		return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		//	}
		//};
		//list.sort(comp);
		
		// ** Terceira forma de fazer. Via expressão lambda -- Comparator objeto de expressão lambda com chaves
		//Comparator<Product> comp = (p1, p2) -> {
		//	return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		//};
		//list.sort(comp);
		
		// ** Quarta forma de fazer. Também via expressão lambda, mas com sintaxe mais enxuta. -- Comparator objeto de expressão lambda sem chaves
		//Comparator<Product> comp = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		//list.sort(comp);
		
		// ** Quinta forma de fazer. Idem. Só mais enxuta ainda... -- Comparator expressão lambda "direto no argumento"
		list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		
		//*******************************************************************************************
		for (Product p : list) {
			System.out.println(p);
		}
	}
}
