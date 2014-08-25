package cotreader.main;

import data.Thing;
import Input.CSV;

public class Main {
	
	
	
	public static void main(String... args){
		System.out.println("start");
		
		for(Thing thing: CSV.readInput("/Users/henny/Desktop/uni/reader/cot/Com95_13.txt")){
			System.out.println(thing);
		}
		
	}
	
}
