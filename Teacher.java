/*

Introduction to Software Engineering; Task 6 (number 1)
21 August 2019; Thapelo Moshoadiba

Create a class named Teacher. It should contain:
 a. At least five attributes
 b. A constructor
 c. A toString method to display values of all the attributes of each class

*/

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
