/*

Introduction to Software Engineering; Task 6 (number 1)
23 August 2019; Thapelo Moshoadiba

Create a class named Secretary. It should contain:
 a. At least five attributes
 b. A constructor
 c. A toString method to display values of all the attributes of each class

*/

package school;

public class Secretary {
	
	String name;
	String lastName;
	String title;
	String days;
	String hours;
	
	public Secretary (String name, String lastName, String title, String days, String hours) {
		
		this.name = name;
	    this.lastName = lastName;
	    this.title = title;
	    this.days = days;
	    this.hours = hours;
		
	}
	
	public String toString() {
		
		String output = "The secretary " + title;
		output += " " + name + " ";
		output += lastName + " ";
		output += "works for " + hours + " on ";
		output += days;
		
		return output;
		
	}
		
}