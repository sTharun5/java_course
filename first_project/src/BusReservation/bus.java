package BusReservation;

public class bus {
	
	private int bus_no;
	private boolean ac ;
	private int capacity;
	
	bus(int bus_no,boolean ac,int capacity){
		this.bus_no = bus_no;
		this.ac = ac;
		this.capacity = capacity;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public void setCapacity(int set) {
		capacity = set;
	}
	
	public boolean getAc() {
		return ac;
	}
	
	public void setCapacity(boolean set) {
		ac = set;
	}
	
	public int getBusno() {
		return bus_no;
	}
	
	public void displayBus() {
		System.out.println("bus no : " + bus_no + " capacity : " + capacity + " Ac : " + ac);
	}
	
	
	

}
