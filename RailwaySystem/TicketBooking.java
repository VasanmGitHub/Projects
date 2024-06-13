package RailwaySystem;
import java.util.*;
public class TicketBooking {
	static Scanner scan = new Scanner(System.in);
	 static List<pasangers> pasangerList = new ArrayList<>();
	 static List<Integer> LowerList = new ArrayList<>(Arrays.asList(1));
	 static List<Integer> UperList = new ArrayList<>(Arrays.asList());
	 static List<Integer> MiddleList = new ArrayList<>(Arrays.asList(1));
	 static List<pasangers> RTCList = new ArrayList<>();  
	 static List<pasangers> WaitingList = new ArrayList<>();
	 static int RtcCount = 2 , WaitingCount = 2;
	public static void BookTicket(pasangers p) {
		//--------------Lower---------------------
		if(p.breathPreference == 'L' && LowerList.size() > 0) {
		 
				p.seatNo =  LowerList.get(0)+""+p.breathPreference;/// alloted seat No
				 LowerList.remove(0);
				
				pasangerList.add(p); /// Add a new Pasanger1
			 System.out.println("Ticket Was succesfully booked id = "+p.id +" seat No = "+p.seatNo);
			 return;
		} //------------------------middle -----------------
		else if(p.breathPreference == 'M' && MiddleList.size() > 0) {
			p.seatNo =  MiddleList.get(0)+""+p.breathPreference;/// alloted seat No
			 MiddleList.remove(0);
			
			pasangerList.add(p);
			 System.out.println("Ticket Was succesfully booked id = "+p.id +" seat No = "+p.seatNo);
			 return;
		} // ----------------------------upper -----------------------------
		else if(p.breathPreference == 'U' && UperList.size() > 0) {

			 
			p.seatNo =  UperList.get(0)+""+p.breathPreference;/// alloted seat No
			 UperList.remove(0);
			
			pasangerList.add(p); /// Add a new Pasanger1
			 System.out.println("Ticket Was succesfully booked id = "+p.id +" seat No = "+p.seatNo);
			 return;
	
		} //----------------------------------------any one----- ----------------
		else if(LowerList.size() > 0 || MiddleList.size() > 0 || UperList.size() > 0) {
			System.out.println("Your Seelcted breath is fulled . if you are ok for anothar breath type please select \n( Yes / No )");
			String confarmation = scan.next();
			if(!confarmation.equals("No")  && !confarmation.equals("no")) {
			if(LowerList.size() > 0) {
				p.seatNo =  LowerList.get(0)+"L";/// alloted seat No
				p.breathPreference = 'L';
			 LowerList.remove(0);
				
				pasangerList.add(p); /// Add a new Pasanger1
				 System.out.println("Ticket Was succesfully booked id = "+p.id +" seat No = "+p.seatNo);
				 return;
			}
			else if( MiddleList.size() > 0) {
				p.seatNo =  MiddleList.get(0)+"M";/// alloted seat No
				p.breathPreference = 'M';
				 MiddleList.remove(0);
				
				pasangerList.add(p);
				 System.out.println("Ticket Was succesfully booked id = "+p.id +" seat No = "+p.seatNo);
				 return;
			}
			else if( UperList.size() > 0){
				p.seatNo =  UperList.get(0)+"U";/// alloted seat No
				p.breathPreference = 'U';
				 UperList.remove(0);
				
				pasangerList.add(p); /// Add a new Pasanger1
				 System.out.println("Ticket Was succesfully booked id = "+p.id +" seat No = "+p.seatNo);
				 return;
			}
			return;
			}
			else {
				System.out.println("If you want you be add RAC please select \n(Yes / No)");
				String confarmation1 = scan.next();
				if(!confarmation1.equals("Yes")  && !confarmation1.equals("yes")) return;
			}
				
		}
		//-------------------------- RTC & Waiting List --------------------------------
		  if(RtcCount > 0) {
			p.seatNo = null;
			RtcCount--;
			RTCList.add(p);
			System.out.println("You are added a RTC");
			 return;
		}
		  if(WaitingCount > 0) {
			p.seatNo = null;
			WaitingCount--;
			WaitingList.add(p);
			System.out.println("You are added a Waiting List");
			 return;
		} //----------------------------------------------------------------------------------
		else {
			System.err.println("We sorry for that No Tickets Available Now! please try again later");
		}
	} 
	
	//-----------------------------------------------Cancel-----------------------------------------------------------
	public static void Cancel(int n) {
		String seatNo = "";boolean bool = false;
		for(pasangers p : pasangerList) {
			if(p.id == n) {
				seatNo = p.seatNo;
				pasangerList.remove(pasangerList.indexOf(p));
				if(p.breathPreference == 'L') {
					LowerList.add(Integer.parseInt(p.seatNo.charAt(0)+"")); 
					
				}
					
				
				else if(p.breathPreference == 'M') {
					MiddleList.add(Integer.parseInt(p.seatNo.charAt(0)+"")); 
					
				}
					
				
				else if(p.breathPreference == 'U') {
					UperList.add(Integer.parseInt(p.seatNo.charAt(0)+"")); 
					
				}
					
				
				System.err.println("Your ticket was cancel successfully");
				bool = true;
				
				break;
			}
		}
		if(RTCList.size() > 0 && bool) {
			pasangers p = RTCList.get(0);
			RTCList.remove(0);
			p.seatNo = seatNo;
			pasangerList.add(p);
			
			if(LowerList.size() > 0 )
				LowerList.remove(0);
			else if(MiddleList.size() > 0)
				MiddleList.remove(0);
			else if( UperList.size() > 0)
				UperList.remove(0);
			
			System.out.println("Passenger Id : "+p.id +"  your ticket was booked succssfully seat No : "+p.seatNo );
			RtcCount += 1;
		 if(WaitingList.size() > 0 ) {
			 pasangers p1 = WaitingList.get(0);
			 WaitingList.remove(0);
			 RTCList.add(p1);
			 System.out.println();
			 System.out.println("Passenger Id : "+p1.id +"  you are added RAC List");
			 WaitingCount += 1;
			 RtcCount -= 1;
			 
		 }
		}
		else if(!bool){
			System.err.println("Your ticket was cancel successfully");
		}
	}
	//----------------------------------Display----------------------------------------------------------------
	public static void Display() {
		boolean bool = true;
		while(bool) {
		System.out.println("1.Display available Ticket \n2.Display Booked Ticket \n3.Exit");
		int n  = scan.nextInt();
		
		if(n == 2) {
			System.out.println("1.Lower Breath Ticket \n2.Middle Breath Ticket \n3.Uper Breath Ticket \n4.RAC Ticket \n5.Waiting List Ticket");
			int choise = scan.nextInt();
			switch(choise) {
			case 0 :
				System.out.println("Passenger Id  |  Passenger Name  |  Passenger Age  | Breath Preference");
				for(pasangers p : pasangerList) 
					 {
 						System.out.println("       "+p.id+"      " +"        "+p.name+"          "+"         "+p.age+"          "+"        "+p.breathPreference+"         ");
 						System.out.println("------------------------------------------------------------------------");
					 }
				break;
			case 1 :
				System.out.println("Passenger Id  |  Passenger Name  |  Passenger Age  | Breath Preference");
				for(pasangers p : pasangerList) 
					if(p.breathPreference == 'L') {
 						System.out.println("       "+p.id+"      " +"        "+p.name+"          "+"         "+p.age+"          "+"        "+p.breathPreference+"         ");
 						System.out.println("------------------------------------------------------------------------");

					}
				break;
			case 2 :
				System.out.println("Passenger Id  |  Passenger Name  |  Passenger Age  | Breath Preference");
				for(pasangers p : pasangerList) 
					if(p.breathPreference == 'M') {
 						System.out.println("       "+p.id+"      " +"        "+p.name+"          "+"         "+p.age+"          "+"        "+p.breathPreference+"         ");
 						System.out.println("------------------------------------------------------------------------");

					}
				break;
			case 3 :
				System.out.println("Passenger Id  |  Passenger Name  |  Passenger Age  | Breath Preference");
				for(pasangers p : pasangerList) 
					if(p.breathPreference == 'U') {
 						System.out.println("       "+p.id+"      " +"        "+p.name+"          "+"         "+p.age+"          "+"        "+p.breathPreference+"         ");
 						System.out.println("-----------------------------------------------------------------------");

					}
				break;
			case 4 :
				System.out.println("Passenger Id  |  Passenger Name  |  Passenger Age  | Breath Preference");
				for(pasangers p : RTCList) 
					 {
						
						System.out.println("       "+p.id+"      " +"        "+p.name+"          "+"         "+p.age+"          "+"        "+p.breathPreference+"         ");
 						System.out.println("-----------------------------------------------------------------------");

					 }
				break;
			case 5 :
				System.out.println("Passenger Id  |  Passenger Name  |  Passenger Age  | Breath Preference");
				for(pasangers p : WaitingList) 
					 {
 						System.out.println("       "+p.id+"      " +"        "+p.name+"          "+"         "+p.age+"          "+"        "+p.breathPreference+"         ");				
 						System.out.println("------------------------------------------------------------------------");
					 }
				break;
			}
		}
		else if(n == 1) {
			System.out.println("1.Lower Breath Ticket \n2.Middle Breath Ticket \n3.Uper Breath Ticket \n4.RAC Ticket \n5.Waiting List Ticket");
			int choise = scan.nextInt();
			switch(choise) {
			case 1 :
				System.out.println("Seat No & Breath ");  
				for(int k : LowerList) {
					System.out.println("   "+k+"L");
				if(LowerList.size() <= 0)
					System.err.println("Lower Breath is fulled. No seat available!");
				System.out.println("------------------");

				}
				break;
			case 2 :
				System.out.println("Seat No & Breath ");  
				for(int k : MiddleList) {
					System.out.println("   "+k+"M");
				if(MiddleList.size() <= 0)
						System.err.println("Middle Breath is fulled. No seat available!");
					System.out.println("------------------");
				}
				break;
			case 3 :
				System.out.println("Seat No & Breath ");  
				for(int k : UperList) {
					System.out.println("   "+k+"U");
					if(UperList.size() <= 0)
						System.err.println("Uper Breath is fulled. No seat available!");
					System.out.println("------------------");
				}
				break;
			case 4 :
				if(RtcCount <= 0)
					System.err.println(" RAC List is Full !");
				else
				System.out.println("Available RAC List is \n        "+RtcCount);
				System.out.println("------------------");
				break;
			case 5 :
				if(WaitingCount <= 0)
					System.err.println(" Waiting List is Full !");
				else
				System.out.println("Available Waiting List is \n     "+WaitingCount);
				System.out.println("------------------");
				break;
				
			}
		}
		else if(n >= 3) bool = false;
		}
	}
}
