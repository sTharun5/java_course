package BusReservation;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class booking {
	
	
private String passengerName;
private int busNo;
Date date;

booking(){
	
	
	Scanner sc = new Scanner(System.in);

	System.out.println("enter your name: ");
    passengerName = sc.next() ;
    
    System.out.println("enter your bus no: ");
    busNo = sc.nextInt();
   
    System.out.println("Enter the date:(12-01-2024): ");
    String dateinput = sc.next();
    
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yy");
    
    try {
		date = dateFormat.parse(dateinput);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  
	
} 

public boolean isavailable(ArrayList<bus> buses,ArrayList<booking> books) {
	int capacity =0;
	
	for(bus b:buses) {
		if(b.getBusno()==busNo )
			capacity = b.getCapacity();
	}
	int booked=0;
	
	for(booking b:books) {
		if(b.busNo == busNo && b.date.equals(date))
			booked++;
			
	}
	
	
	return booked<capacity ? true : false;
}






}
