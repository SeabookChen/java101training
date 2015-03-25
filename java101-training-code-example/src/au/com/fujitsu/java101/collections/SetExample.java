package au.com.fujitsu.java101.collections;


import java.util.HashSet;
import java.util.Set;

import junit.framework.Assert;

import org.junit.Test;

public class SetExample {

	@Test
	public void testSet() {

		Set<String> names = new HashSet<String>();

		names.add("Seabook");
		names.add("Allen");
		names.add("Peter");
		// TODO
		// names.add("Peter");

		Assert.assertEquals(3, names.size());
		Assert.assertTrue(names.contains("Peter"));

		names.remove("Peter");

		Assert.assertEquals(2, names.size());
		Assert.assertFalse(names.contains("Peter"));

		// TODO other options
		String[] nameArr = names.toArray(new String[] {});

	}
	
	@Test
	public void testStudent() {
		Student student1 = new Student("Seabook", "Chen", 10, 1);
		Student student2 = new Student("Seabook", "Chen", 100, 10);
		Student student3 = new Student("Wann", "Tan", 100, 10);
		
		Set<Student> classroom = new HashSet<Student>();
		
		classroom.add(student1);
		classroom.add(student2);
		classroom.add(student3);
		
		Assert.assertEquals(2, classroom.size());
		
	}

}

class Student {
	String firstname;
	String lastname;
	int age;
	int grade;
	
	public Student() {}
	
	public Student(String firstname, String lastname, int age, int grade){
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.grade = grade;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((firstname == null) ? 0 : firstname.hashCode());
		result = prime * result
				+ ((lastname == null) ? 0 : lastname.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (firstname == null) {
			if (other.firstname != null)
				return false;
		} else if (!firstname.equals(other.firstname))
			return false;
		if (lastname == null) {
			if (other.lastname != null)
				return false;
		} else if (!lastname.equals(other.lastname))
			return false;
		return true;
	}
	
	
	
}
