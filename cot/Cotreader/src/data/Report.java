package data;

import java.text.ParseException;
import java.util.Date;

import org.apache.commons.lang3.time.DateUtils;

public class Report implements Comparable<Report> {

	private double openInterest;
	private double nonCommercialPositionsLong;
	private double nonCommercialPositionShort;

	private double commercialPositionLong;
	private double commercialPositionShort;

	private Date date;

	public Report(String date, double openInterest, double nonCommercialPositionsLong,
			double nonCommercialPositionShort, double commercialPositionLong,
			double commercialPositionShort) {
		super();
		this.openInterest = openInterest;
		this.nonCommercialPositionsLong = nonCommercialPositionsLong;
		this.nonCommercialPositionShort = nonCommercialPositionShort;
		this.commercialPositionLong = commercialPositionLong;
		this.commercialPositionShort = commercialPositionShort;

		this.date = parseDate(date);

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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	private static Date parseDate(String date) {
		try {

			return DateUtils.parseDateStrictly(date, "yyyy-mm-dd");

		} catch (ParseException e) {
			System.err.println("non parseable Date");
			return new Date(0);
		}
	}

	@Override
	public int compareTo(Report o) {
		if (this.date.after(o.getDate()))
			return 1;
		else if (this.date.before(o.getDate()))
			return -1;
		return 0;
	}

}
