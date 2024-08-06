package OOP;
// pass by value and pass by reference
class box{
	int length;
	int breadth;
	int heigth;
	
	box(int l,int b,int h){
		length=l;
		breadth=b;
		heigth=h;
	}
	
	boolean isequal (box b1) {
		//b1.length++; execute this line u will understand the meaning of reference
		if(length == b1.length && breadth == b1.breadth && heigth == b1.heigth)
			return true;
		return false;
	}
	
	box Double () {
		box b1 = new box(2*length,2*breadth,2*heigth); 
		return b1;
	}
}

public class PassingRefDemo {
	
	public static void main(String args[]){
		// pass by value is in stack memory..
		
		box wood = new box(5,4,3);
		box steel = new box(5,4,3);
	
		
		
		
		//learn how to return object from this example
		// jzt reference from the object is passed to the brass.. from the method double
		box brass = wood.Double();
		System.out.println(brass.length);
		
		
		// pass by reference... it is in heap memory 
		System.out.println(wood.isequal(steel));
	}

}
