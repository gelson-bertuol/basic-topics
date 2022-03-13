package functional.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import functional.entities.Product;

public class Function_Example {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		//*** Primeira forma de implementar o Consumer *** Forma mais comum... ver a última...
		//--list.removeIf(p -> p.getPrice() >= 100.00);
		//++list.forEach(p -> p.setPrice(p.getPrice() * 1.1));
		//List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
		
		
		//*** Segunda forma de implementar o Consumer *** Implementação da interface
		//--list.removeIf(new ProductPredicate());
		//++list.forEach(new ProductConsumer());
		//List<String> names = list.stream().map(new ProductFunction()).collect(Collectors.toList());
		
		
		//*** Terceira forma de implementar o Consumer *** Reference method com médoto estático
		//--list.removeIf(Product::staticProductPredicate);
		//++list.forEach(Product::staticPriceUpdate);
		//List<String> names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList()); 
		
		
		//*** Quarta forma de implementar o Consumer *** Reference method com médoto não estático
		//--list.removeIf(Product::nonStaticProductPredicate);
		//++list.forEach(Product::nonStaticPriceUpdate);
		//List<String> names = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());
		
		
		//*** Quinta forma de implementar o Consumer *** Expressão lambda declarada
		//--Predicate<Product> pred = p -> p.getPrice() >= 100.00;
		//--list.removeIf(pred);
		//++Consumer<Product> cons = p -> {
		//++	p.setPrice(p.getPrice() * 1.1);
		//++};
		//++list.forEach(cons);
		//Function<Product, String> func = p -> p.getName().toUpperCase();
		//List<String> names = list.stream().map(func).collect(Collectors.toList());
		
		
		//*** Sexta forma de implementar o Predicate *** Expressão lambda inline
		//--list.removeIf(p -> p.getPrice() >= 100.00);
		//++list.forEach(p -> p.setPrice(p.getPrice() * 1.1));
		List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
		
		// Imprime a lista
		names.forEach(System.out::println);
	}

}
