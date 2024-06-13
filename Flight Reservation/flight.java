package Flight.Reservation;

import java.util.*;
 

public class flight {
	int flightId ;
	static int j = 0;
	 int capacity = 50;
	  int price;
	
	static ArrayList<flight> flightList = new ArrayList<>();
	flight(){
		flightId = ++j;
		capacity = 50;
		price = 5000;
	}
	 public static  void addflight(int maxFlightLimit) {
		 for(int i = 0; i < maxFlightLimit; i++)
			 flightList.add(new flight());
	 }
	 public static void updateFlight(int flightId , int ticket) {
				 for(flight f : flightList) {
					 if(f.flightId == flightId) {
						 f.price = ticket * 200 + f.price ;
				    	 f. capacity = f.capacity - ticket; 
					 }
				 }		  
	 } //-------------------------------------------------------------------------------
	public static boolean isValidFlightId(int id){
		 for(flight f : flightList) {
			 if(f.flightId == id )
				 return true; 
		 }
		 return false; 
	 } //--------------------------------------------------------------
	 public static boolean isSeatAvailable(int id , int ticket) {
		 for(flight f : flightList) {
			 if(f.flightId == id && f.capacity >= ticket) {
				 return true;
			 }
		 }
		 return false; 
	 }
	 //-------------------------------------------------------------------
	 
	public static flight getFlight(int flightId) {
		for(flight f : flightList) {
			if(f.flightId == flightId)
				return f;
		}
		return null;
	}
	//-------------------------------------------------------------------
	public static int getCapacity(int flightId) {
		for(flight f : flightList) {
			if(f.flightId == flightId)
				return f.capacity;
		}
		return 0;
	}
	public static void DisplayFlightDetails() { 
		System.out.println("Flight Id     |   Capacity    |  Price");
		for(flight f : flightList) {
			System.out.println("     "+f.flightId+"                "+f.capacity+"         "+f.price);
			System.out.println("----------------------------------------------");
		}
	}
//	public static void main(String arg[]) {
//		
//		//addflight(12);
//		DisplayFlightDetails();
//	}
	 
}
