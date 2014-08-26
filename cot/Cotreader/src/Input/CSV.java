package Input;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import data.Report;
import data.Thing;

public class CSV {

	public static ArrayList<Thing> readInput(String filename) {

		ArrayList<Thing> result = new ArrayList<>();
		CSVFormat format = CSVFormat.RFC4180.withHeader().withDelimiter(',');
		
		try (CSVParser parser = new CSVParser(new FileReader(filename), format)) {

			for (CSVRecord record : parser) {
				Thing t = new Thing(record.get("Market and Exchange Names"));

				double openInterest = Double.parseDouble(record
						.get("Open Interest (All)"));
				double nonCommercialPositionsLong = Double.parseDouble(record
						.get("Noncommercial Positions-Long (All)"));
				double nonCommercialPositionShort = Double.parseDouble(record
						.get("Noncommercial Positions-Short (All)"));

				double commercialPositionLong = Double.parseDouble(record
						.get("Commercial Positions-Long (All)"));
				double commercialPositionShort = Double.parseDouble(record
						.get("Commercial Positions-Short (All)"));

				t.getReports()
						.add(new Report(openInterest,
								nonCommercialPositionsLong,
								nonCommercialPositionShort,
								commercialPositionLong, commercialPositionShort));
				result.add(t);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;
	}
}
