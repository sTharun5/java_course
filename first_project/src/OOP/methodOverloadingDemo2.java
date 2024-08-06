package OOP;
import java.math.*;

public class methodOverloadingDemo2 {
	static void method1() {
		System.out.println("method number 1");
	}
	
	static void method2(int a,int b) {
		System.out.println("method number 2");
	
	}
	
	static void method3(int a ,int b,int c) {
		System.out.println("method number 3");
	
	}
 public static void main(String args[]) {
	 method1();
	 method2(1,2);
	 method3(1,2,3);
	 
	 // method overloaded examples
	 System.out.print(Math.abs(-2.5));
	 System.out.print(Math.abs(2.5));
 }
}
