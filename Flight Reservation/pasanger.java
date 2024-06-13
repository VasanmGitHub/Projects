package Flight.Reservation;

import java.util.*;

public class pasanger {
	static Scanner scan = new Scanner(System.in);
	String name ;
	int passId;
	static int i = 0;
	int age;
	int ticket;
	int paidAmount;
	int flightId ;
	pasanger(String name , int age , int ticket , flight f){
		passId = ++i;
		this.name = name;
		this.age = age;
		this.ticket = ticket;
		paidAmount = ticket*f.price;
		flightId = f.flightId;
	}
	static ArrayList<pasanger> passList = new ArrayList<>();
	
	public static void DisplaypassList() {
		System.out.println("Flight Id    | Passengr Id  |      Name    |    Age    |  Ticket  |    Paid Amount  ");
		for(pasanger p : passList) {
			System.out.println("     "+p.flightId+"               "+p.passId+"            "+p.name+"            "+p.age+"           "+p.ticket+"         "+p.paidAmount);
			System.out.println("-----------------------------------------------------------------------------------------");
		}
	}
	public static boolean isValidPassenger(int passId , int flightId) {
		for(pasanger i : pasanger.passList) {
			if(i.flightId == flightId && i.passId == passId) {
				return true; 
			}
		}
		return false;
	}
	public static void updatePasanger(int flightId , int passId) {
		int ticket = 0;pasanger temp = null;
		System.out.println("Flight Id    | Passengr Id  |      Name    |    Age    |  Ticket  |    Paid Amount  ");
		for(pasanger p : passList) {
			if(p.flightId == flightId && p.passId == passId) {
				System.out.println("     "+p.flightId+"               "+p.passId+"            "+p.name+"          "+p.age+"         "+p.ticket+"            "+p.paidAmount);
				System.out.println("-----------------------------------------------------------------------------------------");
				ticket = p.ticket;
				temp = p;
			}
		}
		passList.remove(temp);
		flight.updateFlight(flightId, -ticket); 
	}
}
