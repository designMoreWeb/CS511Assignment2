package Assignment2;
import java.util.*;
/** Client Class **/

public class Client{
	/** Class Variables **/
	
	private int id;
	private List<Exercise> routine;
	
	/** Class Methods **/

	public Client(int id){
		if( id < 0 ){
		System.out.println("Error: ID is less than 0");
		System.exit(1);
		}
		else{ 	
		this.id = id;
		}
	}
	
	public void addExercise(Exercise e){
		routine.add(e);
		}
	

	public Client generateRandom(int id){	
		Client c = new Client(id);
		return c;
	}

}
