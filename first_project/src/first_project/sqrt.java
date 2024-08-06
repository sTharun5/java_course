package first_project;
import java.lang.Math;

// program to write sqrt function

public class sqrt {
	
	public static void main(String args[]) {
		double num = 4;
		double sqrt = num/2 ; 
		double temp = 0;
		
		
		while(temp!=sqrt) {
			
			temp = sqrt;
			sqrt = (num/temp + temp)/2;
		}
		
		System.out.println(sqrt);
		System.out.println(Math.sqrt(4));
	}

}
