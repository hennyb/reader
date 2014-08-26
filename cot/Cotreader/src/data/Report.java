package data;

public class Report {
	
	private double openInterest;
	private double nonCommercialPositionsLong;
	private double nonCommercialPositionShort;
	
	private double commercialPositionLong;
	private double commercialPositionShort;
	
	
	
	public Report(double openInterest, double nonCommercialPositionsLong,
			double nonCommercialPositionShort, double commercialPositionLong,
			double commercialPositionShort) {
		super();
		this.openInterest = openInterest;
		this.nonCommercialPositionsLong = nonCommercialPositionsLong;
		this.nonCommercialPositionShort = nonCommercialPositionShort;
		this.commercialPositionLong = commercialPositionLong;
		this.commercialPositionShort = commercialPositionShort;
	}
	public double getOpenInterest() {
		return openInterest;
	}
	public void setOpenInterest(double openInterest) {
		this.openInterest = openInterest;
	}
	public double getNonCommercialPositionsLong() {
		return nonCommercialPositionsLong;
	}
	public void setNonCommercialPositionsLong(double nonCommercialPositionsLong) {
		this.nonCommercialPositionsLong = nonCommercialPositionsLong;
	}
	public double getNonCommercialPositionShort() {
		return nonCommercialPositionShort;
	}
	public void setNonCommercialPositionShort(double nonCommercialPositionShort) {
		this.nonCommercialPositionShort = nonCommercialPositionShort;
	}
	public double getCommercialPositionLong() {
		return commercialPositionLong;
	}
	public void setCommercialPositionLong(double commercialPositionLong) {
		this.commercialPositionLong = commercialPositionLong;
	}
	public double getCommercialPositionShort() {
		return commercialPositionShort;
	}
	public void setCommercialPositionShort(double commercialPositionShort) {
		this.commercialPositionShort = commercialPositionShort;
	}
	
	
}
