package school;

public class Teacher {
	
	String name;
	String lastName;
	String title;
	String subject;
	int age;
	
	public Teacher (String name, String lastName, String title, String subject, int age) {
	
		this.name = name;
	    this.lastName = lastName;
	    this.title = title;
	    this.subject = subject;
	    this.age = age;
		
	}
	
	public String toString() {
		
		String output = title;
		output += " " + name + " ";
		output += lastName + " ";
		output += "is " + age + " years old";
		output += " and she teaches " + subject + ".";
		
		return output;
		
	}
		
}
