package OOP;

public class variablelengthArgs {
	
	
	// the purpose is getting multiple arguments when we dont know the exact number of parameters that need to be send
	
	// so there are some ways you can do these
	static int minValue(int...values) {
		
		int min = 2147483647;
		
		for(int x:values) {
			if(x<min)
				min=x;
		}
		
		return min;
	}
	
	// multiple datatypes and then a vararg is allowed but first var arg then dataypes are not allowed let me show
	
	//  static void NotAllowed(int x,int...val,char s) {
	//   System.out.println(s);
//   }
	
	static void allowed(int x,char s,int...val) {
		System.out.println(s);
	}
	
	
	// multiple varargs are not allowed in an parameter
	
//	static void notAllowed(int..x,char..x) {
//		not allowed
//	}
	
	public static void main(String args[]) {
		
	System.out.println(minValue(-1,-2,-3,4));
		
	}

}
