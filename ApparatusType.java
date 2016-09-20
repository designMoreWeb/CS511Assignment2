package Assignment2;

import java.util.*;
import java.util.Random;
/** ApparatusType class **/
public enum ApparatusType{
		LEGPRESSMACHINE , BARBELL , HACKSQUATMACHINE , LEGEXTENSIONMACHINE , LEGCURLMACHINE , LATPULLDOWNMACHINE , PECDECKMACHINE , CABLECROSSOVERMACHINE;


	private static final List<ApparatusType> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
	private static final int SIZE = VALUES.size();
	private static final Random RANDOM = new Random();

	public static ApparatusType randomApparatustype(){
		return VALUES.get(RANDOM.nextInt(SIZE));
		}
}


	/** Generate Random ApparatusType **/




