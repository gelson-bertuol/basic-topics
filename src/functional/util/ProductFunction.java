package functional.util;

import java.util.function.Function;

import functional.entities.Product;

public class ProductFunction implements Function<Product, String> {

	@Override
	public String apply(Product p) {
		return p.getName().toUpperCase();
	}

}
