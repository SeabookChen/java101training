package au.com.fujitsu.java101.basics;


public class HelloWorld {
	private String name = "Neal";
	
	public HelloWorld() {
		
	}
	
	public void sayHello() {
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		
		System.out.println("Hello World");
		
		HelloWorld helloWorld = new HelloWorld();
		helloWorld.name = "Wan";
		
		helloWorld.sayHello();
	}
}
