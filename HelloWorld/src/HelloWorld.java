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
		
		
	}

}
