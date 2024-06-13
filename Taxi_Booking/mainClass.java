package Taxi_Booking;
import java.util.*;
public class mainClass {
	static int  TaxiLimit = 2 , customerId = 0;
	static ArrayList<Taxi> list = new ArrayList<>();
	static Scanner scan = new Scanner(System.in);
	
	public static void BookTaxi() throws InputMismatchException { 
		if(list.size() < TaxiLimit) {
			list.add(new Taxi()); 
		}
		char userPickupPoint = 0,userDropPoint = 0 ; int userPickupTime = 0;
		/// get input from user---------------------------------------
		
		System.out.println("Enter your pick up point :");
		  userPickupPoint = scan.next().charAt(0);
		 
		
		  try{
		System.out.println("Enter your Drop point :");
		  userDropPoint = scan.next().charAt(0);
		System.out.println("Enter your pick up time :");
		 userPickupTime = scan.nextInt(); }
		  catch(InputMismatchException e) {
				System.err.println("You are enterd a in valid input . please make sure correct");
				return;
			}
		
		//--------------------------------------------------------------
		int min = Integer.MAX_VALUE;
		Taxi taxiReady = null;
		for(Taxi t : list) {
			if(t.dropTime <= userPickupTime && Math.abs(t.currentPoint - userPickupPoint) <= min) {
				if(Math.abs(t.currentPoint - userPickupPoint) == min) {
					if(taxiReady.earnings >= t.earnings) {
						taxiReady = t;
						 
					} 
				}
				else 
				taxiReady = t;
				
				min = Math.abs(t.currentPoint - userPickupPoint);
			}
			
		}
		if(taxiReady != null) {
			taxiReady.setTaxiId(list.indexOf(taxiReady)+1);
			taxiReady.setCustomerId(++customerId);
			taxiReady.setPickupPoint(userPickupPoint);
			taxiReady.setDropPoint(userDropPoint);
			taxiReady.setCurrentPoint(userDropPoint);
			taxiReady.setPickupTime(userPickupTime);
			taxiReady.setDropTime(userPickupTime + Math.abs(userPickupPoint-userDropPoint));
			taxiReady.setEarnings(taxiReady.getEarnings() + Math.abs(userPickupPoint-userDropPoint) * 200);

			System.out.println("Taxi Number : "+ taxiReady.getTaxiId() +" is Allocated.");
		}
		else {
			System.err.println("Sorry! No Taxi Available please try again later.");
		}
	}
	
	public static void Display() {
		System.out.println("Taxi No    |     Next Available Location & Time     |    Total Earnings");
		for(Taxi m : list) {
		
			System.out.println(m.getTaxiId()+"                           "+m.getCurrentPoint()+" - "+  m.getDropTime()+"                            "+m.getEarnings());
			System.out.println("------------------------------------------------------------------------");
		}
		
	}
	 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 while(true) {
			 System.out.println("-------- Welcome to Rapido Taxi : -----------");
			 System.out.println("If you want Book a taxi Please press 1 :\nIf you want to see our taxi details press 2 :");
			 int n = scan.nextInt();
			switch(n) {
			case 1 :
				BookTaxi();
				break;
			case 2 :
				Display();
				
			}
		 }
	
	}

}
