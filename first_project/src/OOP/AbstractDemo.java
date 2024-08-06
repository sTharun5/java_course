package OOP;

abstract class member{
	private String name;
	abstract void welcomeMessage();
	
	public String getname(){
		return name;
	}
}

class student extends member{
	void welcomeMessage() {
		System.out.println("welcome student");	
	}
}

class teacher extends member{
	void welcomeMessage() {
		System.out.println("welcome teacher");	
	}
}

public class AbstractDemo {
	
	public static void main(String args[]) {
		student s1 = new student();
		teacher t1 = new teacher();
		
//		member m1 = new member(); Cannot instantiate the type member ...error because abstract
		
		member m1 = new student();
		m1.welcomeMessage(); // this is possible because m1 has abstract method in it... of welcome message
		// just because it is abstract we can access it
		System.out.println();
		
		// but if abstract is not given this is not possible
		member database[] = new member[4];
		database[0] = new teacher();
		database[1] = new student();
		database[2] = new teacher();
		database[3] = new student();
		
		for(member m:database) {
			m.welcomeMessage();
		}
		
 	}

}
