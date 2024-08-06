package OOP;


class Employee{       
	// base , parent , super class has less power
	private String name; 
	private Double salary;

	Employee(String name,double salary){
		this.salary = salary;
		this.name = name;
		
	}
	Employee(){
		this.salary = 0.0;
		this.name = "";
	}
	
	public void setName(String name) {
		this.name = name; 
	}
	
	
	public void setSalary(double salary) {
		this.salary = salary; 
	
	}
	
	public double getSalary() {
		return salary;
	}
	
	public String getName() {
		return name;
	}
	
	public void raiseSalary(double percent) {
		salary = salary + (salary * percent * 0.01) ; 
	}
}


class manager extends Employee{ // derived , sub , child class this has more power
	
	private double bonus ;
	manager(String name,double salary,double bonus){
		
//		this.salary = salary;
//		this.name = name;
//      this is private so , we cant access dierectly we should use methods but we have a beautifull way of doing it 
		
		super(name,salary); // super refers to the parent class.
		this.bonus = bonus;
	}
	
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	
	// method overriding
	public double getSalary() {
		
		return super.getSalary() + bonus;
	}
	
	
}


public class InheritanceDemo {

	public static void main(String args[]) {
		
		Employee e1 = new Employee("thaurn",100000);
		
		System.out.println(e1.getSalary());
		
		e1.raiseSalary(10);
		
		System.out.println(e1.getSalary());
		
		manager m1  = new manager("naman",100000,0);
		
		System.out.println(m1.getSalary());
		
		m1.setBonus(20000);
		
		System.out.println(m1.getSalary());
		
		Employee e = new manager("akash",10000,0); // parent class can hold child references...// polymorphism
		
		// but manager m = new employee(); this is not possible
		
		Employee []arr = new Employee[4];
		
		arr[0]=m1;
		arr[1]=new Employee("thaurn",100000);
		arr[2]=new Employee("amutha",120000);
		arr[3]=new manager("akash",10000,0);
	
		
		
		manager dummy = (manager)arr[3];
		dummy.setBonus(0);
		
	
		manager dumb;
		
		for(Employee t : arr) {  // dynamic binding...
			System.out.println(t.getName() +" "+ t.getSalary());
			
			if(t instanceof manager) {
				dumb = (manager)t;
				dumb.setBonus(12);
				System.out.println("manager");
				System.out.println(t.getName() +" "+ t.getSalary());
				
			}
			
		}
		
		
	}

}
