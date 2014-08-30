package hennyb.cotra;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;


public class CoTMatrix implements Iterable<HashMap<CoTField,Object>>{

	private ArrayList<HashMap<CoTField,Object>> matrix;
	private int size = 0;
	
	public CoTMatrix () {
		
		this.matrix = new ArrayList<HashMap<CoTField,Object>>();
		
	}
	
	
	public void add (HashMap<CoTField,Object> row) {
		
		
		
	}
	
	public int size () {
		
		return this.matrix.size();
		
	}
	
	public HashMap<CoTField,Object> row (int i) {
		
		return this.matrix.get(i);
		
	}
	
	public ArrayList<Object> col (CoTField field) {
		
		ArrayList<Object> col = new ArrayList<Object>();
		
		for (HashMap<CoTField,Object> row : this.matrix) {
			
			col.add(row.get(field));
			
		}
		
		return col;
		
	}


	
	@Override
	public Iterator<HashMap<CoTField, Object>> iterator() {
		
		return this.matrix.iterator();
		
	}
	
	
}
