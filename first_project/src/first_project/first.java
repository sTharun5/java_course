package first_project;

import java.io.PrintStream; // println is present

public class first {
	
	public static void main(String args[]) {
		// args === parameter
		
		// void return type
		
		// public === publicly accessible 
		
		// jvm starts its execution from the main method
		// if it is not public it cannot access no
		
		// static methods can be accessed only by objects
		// but if u want to access u need to write static
		
		System.out.println("Hello world");
		
		System.out.printf("tharun");
		
		
		int ticket = 0xa ; // hexa decimal
		
		long lng = 7l;
		
		float pi = 314159e-05f; // default value of . is double so error
		
		int n = 0b1010_1010 ;
		
		
		int n2 = 123_456_7890 ;
		
		
		
		
		// type casting
		
		
	// left side value should be large
		
		byte b = 5 ; // -128 to 127 
		
		int s = b ; // it happily and automatically converts byte intp int
		
	 // where as vice versa is not possible 
		
//		b = s;  Type mismatch: cannot convert from int to byte
		
		
	
	b = (byte)s ; //explicit type conversion 
		
		
		
		
		
		
		
		
		
	}

}


// javac filename.java  // byte coded will generate
//java filename.