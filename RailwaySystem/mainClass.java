package RailwaySystem;

import java.util.Scanner;

public class mainClass {   

	public static void main(String[] args) { 
		Scanner scan = new Scanner(System.in);
		 while(true) {
			 System.out.println("-------------- Welcome to Railway Ticket Booking ------------------");
			 System.out.println("1.Book Ticket \n2.Cancel Ticket \n3.Display");
			 int n = scan.nextInt();
			 switch(n) {
			 case 1 :
			  { //------------------------- Book Ticket -----------------------------------
				//------------------------ get passenger details --------------------------
				 System.out.println("Enter a Name");
				 String name = scan.next();
				 
				 System.out.println("Enter a Age");
				 int age = scan.nextInt();
				 System.out.println("Enter your Breath preference ( L / M / U )");
				 char breathPreference = scan.next().charAt(0);
				 
				pasangers p = new pasangers(name, age, breathPreference);
				TicketBooking.BookTicket(p);
				break;
			  }
			 case 2 :
			 {
				 System.out.println("If you want to cancel your Ticket ? please enter your Passenger Id :");
				 int id = scan.nextInt();
				 TicketBooking. Cancel(id);
				 break;
			 }
			 case 3 :
				 TicketBooking.Display();
				 break;
				default :
					System.err.println("You are enterd a inValid input , please make sure correct");
			}
			  
			 System.out.println("---------------------------------------------------------------------");
		 
		 }
	}

}
