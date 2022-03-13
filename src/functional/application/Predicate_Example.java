package functional.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import functional.entities.Product;

public class Predicate_Example {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		//*** Primeira forma de implementar o Predicate *** Forma mais comum... ver a última...
		//list.removeIf(p -> p.getPrice() >= 100.00);

		//*** Segunda forma de implementar o Predicate *** Implementação da interface
		//list.removeIf(new ProductPredicate());
		
		//*** Terceira forma de implementar o Predicate *** Reference method com médoto estático
		//list.removeIf(Product::staticProductPredicate);
		
		//*** Quarta forma de implementar o Predicate *** Reference method com médoto não estático
		//list.removeIf(Product::nonStaticProductPredicate);
		
		//*** Quinta forma de implementar o Predicate *** Expressão lambda declarada
		//Predicate<Product> pred = p -> p.getPrice() >= 100.00;
		//list.removeIf(pred);
		
		//*** Sexta forma de implementar o Predicate *** Expressão lambda inline
		list.removeIf(p -> p.getPrice() >= 100.00);

		for (Product p : list) {
			System.out.println(p);
		}
		
		//list.forEach(System.out::println);
	}
}
