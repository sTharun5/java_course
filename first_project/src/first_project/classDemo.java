package first_project;


class box{
	private int length; // instance variables
	private int breadth;
	private int heigth;
	
	
    static int boxCount; /// only one memory is created.. only one is created for all because 
    
    
    static {
    	
    	// the purpose of this block is defining meaning to the the static intialised variables and static intialised methods
    	// when the static block is executed?
    	// the static block is executed when the first object is created for the class box...
    	// this block can only access static variables and static methods.. it cannot access non-static variables that are defined inside the class
    	
  	
//    	length = 2 ;  Cannot make a static reference to the non-static field length.this is the error if we try to access a non static variable
    	
    	System.out.println("from the static block...");
        boxCount=0;
    	 
    	
    }
	

	
	// constructor can also be overloaded...
	
	box(int l,int b,int h){
		length = l;
	    breadth = b;
		heigth = h ;
		boxCount++;
	}
	
   box(){
		length=-1;
	    breadth = -1;
		heigth = -1;
	    boxCount++;
	}

	box(int l){
	length = breadth = heigth = l ;
	boxCount++;
	}
	
	// copy constructor
	
	box(box b1){
		length = b1.length;
		breadth = b1.breadth;
		heigth = b1.heigth;
		boxCount++;
	}
	
	
	
	void setDim(int l,int b,int h) {
		length = l;
		breadth = b;
		heigth = h ;
	}
	
	int volume() {
		return length*breadth*heigth ;
	}
	
	boolean isEqual(box b1) {
		if(length == b1.length && breadth == b1.breadth && heigth == b1.heigth)
			return true;
		
		return false;
	}
	
	static void printCount() {
		
		// here we can access box count because it is static variable
		System.out.println(boxCount);
	}
}

public class classDemo {
	public static void main(String args[]) {
	
		System.out.println("tharun main method starts");
		
		box black; // no memory is allocated for this object
		
		System.out.println("tharun before 1st object creation");
		black = new box(2,3,4);
		
		System.out.println("tharun after box object creation");
		
		// we should not allow the user to change the dimension in the main method
		
		// we need to set the dimensions through a method because we need to check whether the give value is the perfecr parameter or not
		// for that u need this method it will be easy
		
		
        // black = null ;   1. dereference
		
	
		
		
		
		box brown = new box(4,3,5);
		// memory is allocated for the wood box three dimensions
		
		brown = black; // brown is dereference
		
		
		new box(1,2,3); /// anonymous object.
		
		
		System.out.println(black.volume());
		
		
		/*
		   void protected finaalize{
		   
		   garbage collector in side jvm has this method...
		   
		   before deallocationg the memory or closing the file if you have any work please finish it and go..
		   
		   so this method is defined
		   
		   we need to write closing method seperately because we cant trust this blindfoldedly
		   
		   suppose if there is no dereferencing done then ptoblem will arise
		   
		 */
		
		
		// write isequals method this is passing obejects write down
		
       
		
         
         box grey = new box(brown);
         
         System.out.println(brown.isEqual(grey));
         
         System.out.println(box.boxCount);	// static variable or methods are accessed with the name of the class this are important points they are enitierely different 
         // from object they are not related to objects thats the point i want to make clear
         
         box.printCount(); // simple as it
		
	}
	
	

}
