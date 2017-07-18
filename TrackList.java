package hash;

import java.util.*;
public class TrackList {

	public static void main(String[] args) {
		//creating an empty HashMap, not synchronized 
		HashMap<String, String> trackList = new HashMap<>();
		//add the songs as tack title as key and lyrics as value
		String Chris = "Who am I, That the lord of all the earth\n"
				+ "would care to know my name, would\n"
				+ "would care to feel my heart..";
		String Story ="What if my greatest disapointments\n"
				+ "or the aching of this life are the \n"
				+ "revealing of the greatest thirst...";
		//adding track tile with lyrics as in key value pair
		trackList.put("who am I", Chris);
		trackList.put("blessings", Story);
		
		//displaying our structure
		System.out.println(trackList.get("who am I"));
		System.out.println();
		System.out.println(trackList.get("blessings"));
	}

}
