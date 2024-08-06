package first_project;

//In java we cannot innvoke methods without creating objects

public class methodsDemo {
	
 static int boxvolume(int length,int heigth,int breadth) {
		return length *heigth*breadth ;
	}
	
	public static void main(String args[]) {
		System.out.print(boxvolume(2,3,4));
	}

}


// main method is executed by jvm......