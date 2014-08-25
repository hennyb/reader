package data;

import java.util.ArrayList;

public class Thing {
	
	String name;
	ArrayList<Report> reports = new ArrayList<>();
		
	@Override 
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append(name);
		
		
		return (sb.toString());
	}

}
