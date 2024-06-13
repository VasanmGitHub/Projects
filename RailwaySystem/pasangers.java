package RailwaySystem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class pasangers {
	int id = 0 ;
	static int genarate = 0;
	String name ;	
	int age;
	char breathPreference;
	String seatNo;
	pasangers(String name , int age , char breathPreference){
		this.id = ++genarate; 
		this.name = name;
		this.age = age;
		this.breathPreference = breathPreference;
		this.seatNo = "";
	}
	 
}
