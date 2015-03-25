package au.com.fujitsu.java101.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;


import junit.framework.Assert;

import org.junit.Test;

public class ListExample {

	@Test
	public void testList() {
		List<String> names = new ArrayList<String>();
		
		names.add("Seabook");
		names.add("Allen");
		names.add("Peter");
		//TODO
		// names.add("Peter");
		
		Assert.assertEquals(3, names.size());
		Assert.assertTrue("Seabook".equals(names.get(0)));
		Assert.assertTrue(names.contains("Peter"));
		
		names.remove("Peter");
		
		Assert.assertEquals(2, names.size());
		Assert.assertFalse(names.contains("Peter"));
		
		//TODO other options		
		String[] nameArr = names.toArray(new String[]{});	
	}
	
	@Test
	public void testIterationList() {
		List<String> names = new ArrayList<String>();
		
		names.add("Seabook");
		names.add("Allen");
		names.add("Peter");
		
		// Simple for loop
		System.out.println("Simple for loop: =======");
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		// for each		
		System.out.println("For Each: =======");
		for (String name : names) {
			System.out.println(name);
		}
		
		// Iterator
		System.out.println("Iterator: =======");
		Iterator<String> it = names.iterator();
		while (it.hasNext()) {
			String name = (String) it.next();
			System.out.println(name);
		}
		
		// Why Iterator???
		// TODO remove one element
		
	}
	
	@Test
	public void sortList() {
		
		// simple sort
		
		List<Integer> nums = Arrays.asList(10, 5, 1, 2, 9, 6, 3, 7, 4, 8);
		
		System.out.println("Before Sort =======");
		System.out.println(nums);
		
		Collections.sort(nums);
		
		System.out.println("After Sort =======");
		System.out.println(nums);
		
		// object sort
		List<Car> cars = Arrays.asList(
				new Car("Honda", "CRV", 30000),
				new Car("Ferrari", "458-italia-spider", 500000),
				new Car("Bugatti Veron", "xxx", 1000000)				
				);
		
		Collections.sort(cars, new Comparator<Car>() {

			@Override
			public int compare(Car o1, Car o2) {
				if (o1.price - o2.price > 0) return -1;
				if (o1.price - o2.price < 0) return 1;
				return 0;
			}
			
		});
		
		System.out.println(cars);
		
	}
	
}

class Car {
	String brand;
	String model;
	double price;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(String brand, String model, double price) {
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	
	@Override
	public String toString() {	
		return String.format("(brand: %s | model: %s | price:$%.2f)", brand, model, price);
	}
	
}

// TODO Car with Comparable