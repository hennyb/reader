package hennyb.cotra.io;

import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import java.util.List;

import hennyb.cotra.*;

public interface CoTParser {

	public List<CoTReport> parse (Reader reader) throws IOException;
	
}
