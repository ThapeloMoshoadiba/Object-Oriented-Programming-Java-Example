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
