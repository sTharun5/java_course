package OOP;

//import java.util.Date;

import static java.lang.Math.sqrt;

public class PackageDemo {
	
	public static void main(String args[]) {
		
		java.util.Date d = new java.util.Date();
		
		// dont confuse it with #include and import in c c++ include is important for writing a program where as in java it is optional
		
		System.out.println(Math.sqrt(3));
		
		// the sqrt method is a static method in java so we are not cereating any objects for Math to access sqrt method
		
		// this is a great example for static methods
		
		// static method vs non - static methods
		// no need of objects   - need of objects
		// class.methodname     -  object.methodname
		// Math.sqrt            -   date method accessed using objects 
		
		
		System.out.println(sqrt(3)); // static import
		
		
		// static import in the sense it is importing all the static methods / variable in the class written so please be carefull of this theory its really
		// good concept..
		
		
		
		
		
		
	}

}
