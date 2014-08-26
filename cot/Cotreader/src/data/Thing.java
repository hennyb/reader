package data;

import java.util.ArrayList;

public class Thing {
	
	String name;
	ArrayList<Report> reports;
	
	public Thing(String name){
		this.name=name;
		reports = new ArrayList<>();
	}

	@Override 
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append(name);
		
		for(Report report:reports){
			sb.append(" ");
			sb.append("Open Interest: "+report.getOpenInterest());
		}
		
		return (sb.toString());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Report> getReports() {
		return reports;
	}

	public void setReports(ArrayList<Report> reports) {
		this.reports = reports;
	}

	
	
}
