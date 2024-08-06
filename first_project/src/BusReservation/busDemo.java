package BusReservation;
import java.util.*;  // nested package or hierarchical package





public class busDemo {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<bus> buses = new ArrayList<bus>();
		ArrayList<booking> books = new ArrayList<booking>();
		
		buses.add(new bus(1,false,2));
		buses.add(new bus(2,true,15));
		buses.add(new bus(3,true,5));
		
		
		for(bus b : buses) {
			b.displayBus();
		}
		
		
		
		
		// 1 means to book and 2 to exit
		
		
		int userOpt =1;
		while(userOpt==1) {
			System.out.println("enter 1 for booking or 2 to exit");
			userOpt = sc.nextInt();
			
			if(userOpt==1) {
				booking b = new booking();
				
				if(b.isavailable(buses,books)) {
					books.add(b);
					System.out.println("your booking is confirmed");
				}
				else
				{
					System.out.println("sry try another bus or date");
				}
			}
			
		}
		
		System.out.println("Visit Again!");
	}

}
