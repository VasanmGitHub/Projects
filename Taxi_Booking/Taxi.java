package Taxi_Booking;

public class Taxi {
	char currentPoint = 'A';
	int customerId;
	int taxiId;
	char pickupPoint;
	char dropPoint;
	int pickupTime;
	int dropTime;
	int earnings;



	public void setTaxiId(int i) {
		 this.taxiId = i;
		
	}



	public void setCustomerId(int i) {
		this.customerId = i;
		
	}


	public void setPickupPoint(char userPickupPoint) {
		this.pickupPoint = userPickupPoint;
		
	}

	public void setDropPoint(char userDropPoint) {
		this.dropTime = userDropPoint;
		
	}

	public void setPickupTime(int userPickupTime) {
		this.pickupTime = userPickupTime;
		
	}

	public void setDropTime(int i) {
		this.dropTime = i;
		
	}

	public void setEarnings(int i) {
		this.earnings = i;
		
	}


	public int getEarnings() {	 
		return this.earnings;
	}



	public int getTaxiId() {	 
		return this.taxiId;
	}



	public void setCurrentPoint(char userDropPoint) {
		this.currentPoint = userDropPoint;
		
	}
	public char getCurrentPoint() {
		return this.currentPoint;
	}
	public int getDropTime() {
		return this.dropTime;
	}
	
	


	

}
