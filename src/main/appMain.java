package main;

import java.util.*;

public class appMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person person1 = new Person("John", 43, "Developer");
		Person person2 = new Person("Humz", 23, "Trainee");
		
		List<Person> people1 = new ArrayList<Person>();
		people1.add(person1);
		people1.add(person2);
		
		for(Person p : people1) {
				
			System.out.println("name: " + p.getName() + ", " + "Age: " + p.getAge() +" , " + "Job Title: " + p.getJobTitle());		
			
			if (p.name.equals("John")) {
				System.out.println(p.getName() + " is here");
			}	
			
		}
		
		
	
		System.out.println("");
	
		System.out.println(person1.getName());
		System.out.println(person1.getAge());
		System.out.println(person1.getJobTitle());
		

		System.out.println(person2.getName());
		System.out.println(person2.getAge());
		System.out.println(person2.getJobTitle());
	}

}
