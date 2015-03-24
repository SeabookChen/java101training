package au.com.fujitsu.java101.basics;

import java.util.Date;


public class PersonExample {
	public static void main(String[] args) {
		Person person = new Person();
	}
}


class Person {
	private String name;
	private int age;
	private char gender;
	private boolean isMarried;
	
	public Date birthday;
	
	public String[] hobbies = {"Racing", "Coding", "Drinking", "Play Golf"};
	
	private int[] numbers = {1, 2, 3};
	
	
	// if - elseif - else
	public void drinkAlcohol() {
		if (this.age < 18) {
			System.out.println("Hi " + this.name + "! You are too young to drink");
		} else if (this.age > 18 && this.age < 60) {
			System.out.println("Hi " + this.name + "! Prime time to drink. Drink as much as you can");
		} else {
			System.out.println("Hi " + this.name + "! You are too old to drink.");
		}
	}
	
	// TODO: write a method marry, if married say i am married, if not married say i am available;
	public void marry() {
		
	}
	
	//loop 
	public void myHobbies() {
		// for
		for (String hobby : hobbies) {
			System.out.println(hobby);
		}
		
		for (int i = 0; i < hobbies.length; i++) {
			System.out.println(hobbies[i]);
		}
		
		// while - do
		int i = 0;
		while (i < hobbies.length) {
			System.out.println(hobbies[i]);
			i++;
		}
		
		// do-while
		int j = 0;
		do {
			if (hobbies.length == 0) {
				break;
			}
			
			System.out.println(hobbies[j]);
			j++;
		} while (j < hobbies.length);
	}
	
	//TODO sum all the numbers in the numbers array
	public int sum() {
		return 0;
	}
}