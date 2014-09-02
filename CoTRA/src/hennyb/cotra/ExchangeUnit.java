package hennyb.cotra;

import java.util.ArrayList;

public class ExchangeUnit implements Comparable<ExchangeUnit> {

	private String name;
	private ArrayList<CoTReport> reports;

	public ExchangeUnit(String name) {
		this.name = name;
		reports = new ArrayList<CoTReport>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<CoTReport> getReports() {
		return reports;
	}

	public void setReports(ArrayList<CoTReport> reports) {
		this.reports = reports;
	}

	@Override
	public int compareTo(ExchangeUnit o) {
		return this.getName().compareTo(o.getName());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ExchangeUnit other = (ExchangeUnit) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}
