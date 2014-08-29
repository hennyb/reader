package hennyb.cotra;

import hennyb.cotra.csv.CoTCSVHeader;
import hennyb.cotra.csv.CoTCSVParser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

/**
 * 
 * Main class for the CoTRA project
 * 
 * @author maxmeffert
 *
 */
public class CoTRA {

	private static String TEST_CSV_FILE = "./data/Com95_13.csv";
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		CoTCSVParser parser = new CoTCSVParser(new FileReader(TEST_CSV_FILE));
		
		for (Map<CoTCSVHeader,String> report: parser) {
			
			System.out.println(report.get(CoTCSVHeader.ChangeInOpenInterestAll));
			CoTReport cot = new CoTReport();
			cot.fromCSVHeaderMap(report);
			System.out.println(cot);
			
		}
		
	}

}
