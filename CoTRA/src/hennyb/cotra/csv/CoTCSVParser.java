package hennyb.cotra.csv;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class CoTCSVParser implements Iterable<Map<CoTCSVHeader,String>> {

	public static final CSVFormat DEFAULT_CoT_CSVFormat = CSVFormat.RFC4180.withHeader().withDelimiter(',');
	
	private ArrayList<Map<CoTCSVHeader,String>> reports;
	
	public CoTCSVParser (Reader reader) throws IOException {
		
		this.reports = new ArrayList<Map<CoTCSVHeader,String>>();
		
		@SuppressWarnings("resource")
		CSVParser parser = new CSVParser(reader,DEFAULT_CoT_CSVFormat);
		
		for (CSVRecord record : parser) {
			
			Map<CoTCSVHeader,String> report = new HashMap<CoTCSVHeader,String>();
			for (CoTCSVHeader header : CoTCSVHeader.values()) {
				
				report.put(header, record.get(header));
				
			}
			
			this.reports.add(report);
			
		}
		
	}

	@Override
	public Iterator<Map<CoTCSVHeader, String>> iterator() {
		
		return this.reports.iterator();
		
	}

	

	
	
}
