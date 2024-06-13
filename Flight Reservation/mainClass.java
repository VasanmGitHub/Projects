package Flight.Reservation;

import java.util.*;

public class mainClass {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
			 
		 flight.addflight(5);
		 
		while(true) { 
			flight currflight = null;	
			System.out.println("------------------ Welcome to our Air Line ----------------");
			System.out.println("1.Book Ticket \n2.Cancel Ticket \n3.Display");
		    int n = scan.nextInt();
		    switch(n) {
		    case 1 :
		    {
		    	//----------Book ticket start-----------
		    	//------------------------get passenger Details-------------------
				System.out.println("Enter a name :");
				String name = scan.next();
				System.out.println("Enter your age :");
				int age = 0;
				
					 age = scan.nextInt();
					while(age < 18  ) {
						System.err.println("Age Must be greather 18 . please make sure correct");
						System.out.println("Enter your age :");
						age = scan.nextInt();
					}
				
				
						
				System.out.println("How many tickets do you want :"); 
				 int ticket = scan.nextInt();
										
			
				System.out.println("\nWe have provoid a two flight services\n---------------------------------------- \n1.Flight Id = 1 , Chennai - Mumbai , 11.PM \n2.Flight Id = 2 ,Chennai - Dheli ,1.AM \n----------------------------------");
				 
				// check Valid
								 					
				while(currflight == null ) {
					System.out.println("Choose your flight");
					int flightId = scan.nextInt();
					// is Valid Flight Id ?
					while(!flight.isValidFlightId(flightId)) { 
						System.err.println("Plese Enter a valid flight ID");
						System.out.println("Choose your flight");
						 flightId = scan.nextInt();
					}
					//--------------check seat available--------------
					while(!flight.isSeatAvailable(flightId , ticket)) {
						if(flight.getCapacity(flightId) == 0) {
							System.err.println("Flights are Fulled! please check another flight");
							break;
						}
						System.err.println("Seat's are not available./n there are  "+flight.getCapacity(flightId)+" Seat's Only Available");
						System.out.println("If you want to reduioes your ticket ---- > 1\nTry another flight ----------------- > 2");
						int reply = scan.nextInt();
						if(reply == 1) {
							System.out.println("How many tickets do you want :"); 
							  ticket = scan.nextInt();						
					}
						if(reply == 2) break;
				}  
					if(flight.isSeatAvailable(flightId , ticket))
						currflight = flight.getFlight(flightId); 
					 
				}
				
				 pasanger p = new pasanger(name, age, ticket , currflight);
				TicketBooking.BookTicket(p, currflight);
				//pasanger.passList.add(p);
				break;
		       }//----------------------------Book ticket end--------------------------
		    //----------------------------------------cancel--------------------------------------------
		    case 2:
		    	boolean bool = false; int flightId = 0 , passId = 0 ;
//		    	while(!bool) {
//		    		System.out.println("Please Enter your Flight id :");
//		    		  flightId = scan.nextInt();
//		    		
//		    		 
//		    			bool = true;		    		
//		    	}
		    	bool = false;
		    	while(!bool) {
		    		System.out.println("Please Enter your Flight id :");
		    		  flightId = scan.nextInt();
		    		  if(!flight.isValidFlightId(flightId)) {
			    			System.err.println("Invalid Flight Id please make sure correct");
			    		}
		    		System.out.println("Please Enter your Passenger Id");
		    		passId = scan.nextInt();
		    		if(!pasanger.isValidPassenger(passId , flightId)) {
		    			System.err.println(" Passanger Id Not Found");
		    		}
		    		else
		    			bool = true;
		    	}
		    	
		    	TicketBooking.cancel(flightId, passId);
		    	break;
		    	
		    	//----------------------------------------------------------------------------------------
		    case 3 :
		    	System.out.println("1.Display Flight Details \n2.Display Passenger Details");
		    	int reply = scan.nextInt();
		    	if(reply == 1)
		    	flight.DisplayFlightDetails();
		    	if(reply == 2) 
		    	pasanger.DisplaypassList();
		    	break;
		    }//--- switch end
			  
		}
		 
	}
}
