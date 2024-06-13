package Flight.Reservation;

import java.util.*;
 

public class TicketBooking {
	
	public static void BookTicket( pasanger p , flight f) {
		
		System.out.println("your ticket was successfully booked. \nTicket Price = "+f.price+"\nNo.of.Tickets = "+p.ticket+"\nToatal Amount = "+p.paidAmount);
		flight.updateFlight(f.flightId , p.ticket);
		pasanger.passList.add(p);
	} 
	public static void cancel(int flightId , int passId) {
		pasanger.updatePasanger(flightId , passId);
		System.out.println("your Ticket was successfully canceld.");
	}
		
	
		
	}

