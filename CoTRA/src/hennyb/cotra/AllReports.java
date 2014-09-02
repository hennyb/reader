package hennyb.cotra;

import java.util.ArrayList;

public class AllReports {
	
	private ArrayList<ExchangeUnit> exchangeUnits;
	
	AllReports(){
		exchangeUnits = new ArrayList<>();
	}

	public ArrayList<ExchangeUnit> getExchangeUnits() {
		return exchangeUnits;
	}

	public void setExchangeUnits(ArrayList<ExchangeUnit> exchangeUnits) {
		this.exchangeUnits = exchangeUnits;
	}
	
}
