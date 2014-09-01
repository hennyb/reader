package hennyb.cotra;

import hennyb.cotra.io.csv.CoTCSVParser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;

/**
 * 
 * Main class for the CoTRA project
 * 
 * @author maxmeffert
 *
 */
public class CoTRA {

	private static String TEST_CSV_FILE = "./data/Com95_13.csv";

	public static void main(String[] args) throws FileNotFoundException,
			IOException {

		AllReports aReports = new AllReports();

		for (CoTReport report : CoTCSVParser.DEFAULT.parse(new FileReader(
				TEST_CSV_FILE))) {

			ExchangeUnit eu = new ExchangeUnit(
					report.getMarketAndExchangeNames());
			
			if (aReports.getExchangeUnits().contains(eu)) {
				int index = aReports.getExchangeUnits().indexOf(eu);
				eu = aReports.getExchangeUnits().get(index);
				eu.getReports().add(report);
				
			}else{
				eu.getReports().add(report);
				aReports.getExchangeUnits().add(eu);
			}
			
		}
		System.out.println(aReports.getExchangeUnits().size());
		
		for(int i = 0 ; i<aReports.getExchangeUnits().size();i++){
			
			
			
			ExchangeUnit e = aReports.getExchangeUnits().get(i);
			System.out.println(i + " " +e.getReports().size());
			System.out.println(e.getName()+" :");
			//Collections.sort(e.getReports());
			for(CoTReport report: e.getReports()){
				System.out.print(report.getAsOfDateInFormYYYYMMDD()+" ");
			}
			
			System.out.println();
			
			
		}

		// Object[][] xs = new Object[3][3];
		//
		// Object[] x = {1,2};
		// xs[0] = x;
		//
		// System.out.println(xs[0][2]);

	}

}
