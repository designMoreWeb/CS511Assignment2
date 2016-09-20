package Assignment2;

import java.util.*;
import java.util.Random;
/** Exercise Class **/

public class Exercise {
	

	private ApparatusType at;
	private Map<WeightPlateSize,Integer> weight;
	private int duration;

	private static final Random randomGenerator = new Random();	
	
	/** This is the constructor which was called Routine in the Assignment PDF */
	public Exercise(ApparatusType at, Map <WeightPlateSize,Integer> weight){
		this.at = at;
		this.weight = weight;
		this.duration = randomGenerator.nextInt(20);
	}
	/**
	Generate Random Exercise given the max number of plates passed
	
	public Exercise generateRandom(Map<WeightPlateSize,Integer ){
		
	}
	*/ 
}
