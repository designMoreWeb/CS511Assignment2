package Assignment2;

import java.util.*;


public class test{

	public static void main (String args[]){
	
	//	ApparatusType at = new ApparatusType();
	//	at = ApparatusType.randomApparatustype();
	for( ApparatusType at1 : EnumSet.allOf(ApparatusType.class)){
		System.out.println(at1);
		}	

	
		System.exit(0);
	}
}
