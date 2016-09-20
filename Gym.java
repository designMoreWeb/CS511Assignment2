package Assignment2;
import java.util.*;
import java.util.concurrent.*;

public class Gym implements Runnable{
	/** Class Variables for the Gym */
	private static final int GYM_Size = 30;
	private static final int GYM_REGISTERED_CLIENTS = 1000;
	private Map<WeightPlateSize,Integer> noOfWeightPlates = new HashMap<>();
	private Set<Integer> clients; 
	private ExecutorService executor;
	/* various semaphore */
	
	// Fixed with http://stackoverflow.com/questions/8822762/java-hashtable-errors-identifier-expected-and-illegal-start-of-type

	{noOfWeightPlates.put(WeightPlateSize.SMALL_3KG,40);}
	
	{noOfWeightPlates.put(WeightPlateSize.MEDIUM_5KG,30);}
	
	
	{noOfWeightPlates.put(WeightPlateSize.LARGE_10KG,20);}
	

	public void run(){
	
	}
}
