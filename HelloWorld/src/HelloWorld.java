import java.util.Scanner;

public class HelloWorld 

{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		/*	
		byte myByte = 100;			// byte
		short myShort = 5000;		// short
		int myInt = 65000;			// integer
		long myLong = 1000000;		// long
		float myFloat = 10.034f;	// float
		double myDouble = 3.14159;	// double 
		boolean myBoolean = true;	// boolean (true or false)
		char myChar = 'm';			// character 
		
		System.out.println(myByte);
		System.out.println(myShort);
		System.out.println(myInt);
		System.out.println(myLong);
		System.out.println(myFloat);
		System.out.println(myDouble);
		System.out.println(myBoolean);
		System.out.println(myChar);
		*/

		/*
		System.out.println("Please enter a number followed by a double then a float then a word then true or false.");
				
		int num = scanner.nextInt();					// Obtain integer
		double decimalNum = scanner.nextDouble();		// Obtain double
		float floatNum = scanner.nextFloat();			// Obtain float
		String text = scanner.next();					// Obtain string (Text)
		Boolean b = scanner.nextBoolean();				// Obtain boolean (True or False)
		
		System.out.println(num);
		System.out.println(decimalNum);
		System.out.println(floatNum);
		System.out.println(text);
		System.out.println(b);
		*/
		
		/*
		String courseCode = "BIT504";
		
		System.out.println("The course code is " + courseCode);
		System.out.println("The length is " + courseCode.length());
		System.out.println("The character in the second index is " + courseCode.charAt(2));	// index start at 0 (so 0=1 1=2 2=3 and so on)
		*/
		
		
		
		String firstName, middleName, lastName;
		
		System.out.println("Please enter first name: ");
		firstName = scanner.next();			// uses scanner to take user input
		System.out.println("Please enter middle name: ");
		middleName = scanner.next();
		System.out.println("Please enter last name: ");
		lastName = scanner.next();
		
		System.out.println("Full name is: " + firstName + " " + middleName + " " + lastName);
		
		
		
		/*	
		// use a tab with \t
		
		String tabs = "Name\t\tSurename\t\tAge\tHeight";
		String data = "John\t\tSmith\t\t\t20\t169cm";
		
		System.out.println(tabs);
		System.out.println(data);
		
		//create a new line using \n
		
		System.out.println("\n\n");
		String hello = "Hello\nWorld!";
		System.out.println(hello);
		*/
		
		
	
				
		
		
		
		
		
				
		
	}

}
