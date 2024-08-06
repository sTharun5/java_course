package OOP;

public class methodOverloadingDemo {
	
	
	// this is the same method but for integer
	
	static int max(int a,int b) {
		if(a>=b)
			return a;
		else
			return b;
	}
	
	// this is the same method but for double 
	static double max(double a,double b) {
		if(a>=b)
			return a;
		else
			return b;
	}
	
	public static void main(String args[]) {
		
		System.out.println(max(2,7));
		
		// implicit type conversion is happening
		System.out.println(max(6.7,7));
		
		// here char is converted into integer because it comes first and it is ok 
		// if ineger method was not there then double method would have been executed so we can conclude that double method is ok
		
		
		System.out.println(max('a','b'));
	}

}
