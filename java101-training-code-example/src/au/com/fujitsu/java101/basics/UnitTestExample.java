package au.com.fujitsu.java101.basics;

import junit.framework.Assert;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class UnitTestExample {
	
	ExceptionExample exceptionExample;
	
	@BeforeClass
	public static void beforeClass() {
		
	}
	
	@Before
	public void before() {
		System.out.println("Before running the test");
		
		if (exceptionExample == null) {
			exceptionExample = new ExceptionExample();
		}
	}
	
	@After
	public void after() {
		System.out.println("After running the test");
	}
	
	@AfterClass
	public static void afterClass() {
		
	}
	
	@Test
	public void test101() {
		System.out.println("This is my first test");
	}

	@Test
	@Ignore
	public void testReadSimpleFile() {
		String file = "";
		String result = exceptionExample.readSimpleFile(file);
		Assert.assertTrue("Test passed with expected result", result.contains("I am charlie"));
	}
	
	@Test(expected=ArrayIndexOutOfBoundsException.class)
	public void testArrayOutOfBound() {
		exceptionExample.arrayOutOfBound(3);
	}
}
