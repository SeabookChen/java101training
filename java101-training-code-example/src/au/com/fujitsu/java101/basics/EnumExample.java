package au.com.fujitsu.java101.basics;

public class EnumExample {
	public static void main(String[] args) {
		
	}
}

enum Color {
	// TODO add a new color yellow
	// TODO and print it's color
	RED, BLUE, BLACK, PINK;
	
	public String printMyColor() {
		return this.toString();
	}
}