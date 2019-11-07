package school;

// ensure that all the files of the methods that are to be called are in the same folder as this java file

class School {
	
	public static void main (String [] args){
		
		Teacher esmalet = new Teacher ("Esmalet", "van Zyl", "Mev", "Afrikaans", 32);
		Teacher becker = new Teacher ("Avril", "Becker", "Ms", "English", 28);
		Teacher fourie = new Teacher ("Lorraine", "Fourie", "Ms", "Life Sciences", 60);
		
		Secretary chiume = new Secretary ("Edwin", "Chiume", "Mr", "Monday and Tuesday", "8 hours");
		Secretary zodwa = new Secretary ("Zodwa", "Khumalo", "Mrs", "Wednesday and Thursday", "8 hours");
		Secretary michelle = new Secretary ("Michelle", "Houser", "Ms", "Friday and Saturday", "8 hours");
		
		Student thapelo = new Student ("Thapelo Moshoadiba", 18, 12, 'N');
		Student keabecoe = new Student ("Keabecoe Moshe", 19, 12, 'N');
		Student kirston = new Student ("Kirston Richardson", 17, 12, 'R');
		
		System.out.println(esmalet);
		System.out.println(becker);
		System.out.println(fourie + "\n");
		
		System.out.println(chiume);
		System.out.println(zodwa);
		System.out.println(michelle + "\n");
		
		System.out.println(thapelo.toString());
		System.out.println(keabecoe.toString());
		System.out.println(kirston.toString());
		
	   }
}
