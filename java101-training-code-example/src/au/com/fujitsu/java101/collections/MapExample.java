package au.com.fujitsu.java101.collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import junit.framework.Assert;

import org.junit.Ignore;
import org.junit.Test;

public class MapExample {
	
	@Test
	public void testMap() {
		Map<String, String> testMap = new HashMap<>();
		
		testMap.put("key1", "value1");
		testMap.put("key2", "value2");
		
		// testMap.put("key1", "value3");
		
		Assert.assertEquals(2, testMap.size());
		
		Assert.assertTrue(testMap.containsKey("key1"));
		Assert.assertTrue(testMap.containsValue("value2"));
		
		testMap.remove("key1");
		
		Assert.assertEquals(1, testMap.size());
		
		
		
		Set<Map.Entry<String, String>> entrySet = testMap.entrySet();
		
		for (Map.Entry<String, String> entry : entrySet) {
			System.out.println(String.format("Key: %s, Value: %s", entry.getKey(), entry.getValue()));
		}
	}
	
	@Test
	public void testCountingMap() {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 3, 2, 2, 6, 5);
		
		//TODO
		Map<Integer, Integer> countingMap = new HashMap<>();
		
	}

	@Test
	@Ignore
	public void testGroupShippingAddress() {
		Map<String, List<ShippingAddress>> nameAndAddressMap = new HashMap<>();
	}
}


class ShippingAddress {
	String addr1;
	String addr2;
	String suburb;
	String postcode;
	String state;
	
	public ShippingAddress() {
		// TODO Auto-generated constructor stub
	}

	public ShippingAddress(String addr1, String addr2, String suburb,
			String postcode, String state) {
		this.addr1 = addr1;
		this.addr2 = addr2;
		this.suburb = suburb;
		this.postcode = postcode;
		this.state = state;
	}
	
	
}
