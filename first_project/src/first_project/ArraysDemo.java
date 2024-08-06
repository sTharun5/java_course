package first_project;

public class ArraysDemo {
	
	public static void main(String args[]) {
		
	/*	
	 // basics
	  
	    int marks[];  // space is not allocated
	 	
		marks = new int[6] ; // this is how u allocate memory
		
		marks[0] = 95;
		marks[1] = 76 ;
		marks[2] = 84 ;
		
		System.out.println(marks[4]); // output will be zero because whenever we use new keyword the memory is intialise with 0
		
	*/
		
	/*
	 
		int marks[] = {1,2,3,4,5,6} ; // automatically it will alocate memory to marks array
	
	*/
		
		// two dimensional array
		
		int a[][] = new int[3][4];
		
		char [] c1,c2,c3; // another way of declaring
		
		
		int b[][] = new int[4][];
		
		b[0] = new int[100];
		b[1] = new int[50];
		b[2] = new int[25];
		b[3] = new int[12];
		
		
	}

}
