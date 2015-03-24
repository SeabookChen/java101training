package au.com.fujitsu.java101.oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class ProductExample {
	public static void main(String[] args) {
		Product p = new Product();
		p.name = "Sony TV";
		p.desc = "One of the best brand in the world";
		
		System.out.println(p.toString());				
	}
	
	@Test
	public void testCountAllVariants() {
		System.out.println("Let's do the test");
	}
}

class Product {
	String id;
	String name;
	String desc;

	private List<Variant> variants = new ArrayList<Variant>();
	
	@Override
	public String toString() {
		return String.format("I am a product[name=%s, desc=%s]", name, desc );
	}
}

class Variant extends Product {
	private Size size;
	private Color color;
	private int stockLevel;
	private Price price;
	
	
	@Override
	public String toString() {
		return String.format("I am a variant[name=%s, desc=%s, size=%s, color=%s, stock=%d, price=%d]"
				, name, desc, size, color, stockLevel, price.value );
	}
}


class Price {
	char currencySymbol;
	double value;
}

enum Size {
	LARGE, MEDIUM, SMALL
}

enum Color {
	RED, BLUE, YELLOW
}

interface ProductService {
	public int countAllVariants(Product product);
	
	//TODO
	public List<Variant> findAllVariantsWithInPriceRange(Product product, Price from, Price to);
	
	//TODO
	public Map<String, List<Variant>> findAndArrangeVariantsByCurrency(Product product);

}

class ProductServiceImpl implements ProductService {

	@Override
	public int countAllVariants(Product product) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Variant> findAllVariantsWithInPriceRange(Product product,
			Price from, Price to) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, List<Variant>> findAndArrangeVariantsByCurrency(
			Product product) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

