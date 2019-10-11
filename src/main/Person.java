package main;

public class Person {

	int age;
	String name;
	String jobTitle;
	
	public Person(String name, int age, String jobTitle) {
		this.age = age;
		this.name = name;
		this.jobTitle = jobTitle;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getJobTitle() {
		return jobTitle;
	}
	
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", jobTitle=" + jobTitle + "]";
	}
	
	
	
	
	
	
}

