package first_project;

public class Operators {

	public static void main(String[] args) {
		
		int a=3,b=4,c;
		c  = a + b + a++ + b++ + ++a + ++b;
		
		System.out.println(c);
		
		
		int q = 4 ;
		System.out.print(q<<34);	
		
		// there is a beautifull thing in this bitwise operator left shift oncle the one is gone it comes back one day
		
		byte th = 3 ;
		System.out.println(th<<28);
		// here the byte or short  variable will be promoted to int 
		
		
		//so if i want to keep it in byte the  then type cast
		
		System.out.println((byte)th<<28);
		
		
		// rigth shift operators and rigth shift zero fill operators...
		
		int thaurn = -5 ;
		
		System.out.print(thaurn>>2);
		// 1 0 1 1
		// 1 1 0 1
		// 1 1 1 0
		
		System.out.print((thaurn>>>2));
		// fill the rigth  shift with zeroes
	}

}
