package hennyb.cotra;

import hennyb.cotra.io.csv.CoTCSVParser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

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
		
		for (CoTReport report: CoTCSVParser.DEFAULT.parse(new FileReader(TEST_CSV_FILE))) {
			
			System.out.println(report.getMarketAndExchangeNames());
			
		}
		
		ObjectTable table = new ObjectTable(5);
		Object[] row = {1,2};
		table.addRow(row);
		Object[] row1 = {1,null,4,null,6,7};
		table.addRow(row1);
		
		System.out.println(table);

		
	}

}
