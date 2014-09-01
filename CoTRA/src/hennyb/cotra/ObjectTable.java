package hennyb.cotra;

import org.apache.commons.lang3.StringUtils;
/**
 * 
 * @author maxmeffert
 *
 */
public class ObjectTable {
	
	private final static int EXPANSION_FACTOR = 2;
	private final static int DEFAULT_CAPACITY = 1;

	private int numberOfRows;
	private int numberOfCols;
	private Object[][] storage;
	
	public ObjectTable (int numberOfCols) {
		
		this.numberOfRows = 0;
		this.numberOfCols = numberOfCols;
		this.storage = new Object[DEFAULT_CAPACITY][numberOfCols];
		
	}
	
	public int size () {
		
		return this.numberOfRows;
		
	}
	
	private void expand () {
		
		Object[][] old = this.storage;
		this.storage = new Object[this.numberOfRows * EXPANSION_FACTOR][this.numberOfCols];
		
		for (int i=0; i < this.numberOfRows; i++) {
			
			this.storage[i] = old[i];
			
		}
		
	}
	
	private Object[] normalizeRow (Object[] row) {
		
		Object[] old = row;
		row = new Object[this.numberOfCols];
		
		for (int i=0; i < this.numberOfCols; i++) {
			
			if (i < old.length) {
				
				row[i] = old[i];
				
			}
			else {
				
				row[i] = null;
				
			}
			
		}
		
		return row;
		
	}
	
	public void addRow (Object[] row) {
		
		if (this.numberOfRows == this.storage.length) {
			
			this.expand();
			
		}
		
		if (row.length != this.numberOfCols) {
			
			row = this.normalizeRow(row);
			
		}
		
		this.storage[this.numberOfRows] = row;
		this.numberOfRows++;
		
	}
	
	public Object[] getRow (int i) {
		
		Object[] row = new Object[this.numberOfCols];
		
		for (int j=0; j < this.numberOfCols; j++) {
			
			row[j] = this.storage[i][j];
			
		}
		
		return row;
		
	}
	
	public Object[] getRows (int from, int to) {
		
		int capacity = to - from;
		
		Object[] rows = new Object[capacity];
		
		for (int i=0; i <= capacity; i++) {
			
			rows[i] = this.storage[from + i];
			
		}
		
		return rows;
		
	}
	
	public Object[] getCol (int i) {
		
		Object[] col = new Object[this.numberOfRows];
		
		for (int j=0; j < this.numberOfRows; j++) {
			
			col[j] = this.storage[j][i];
			
		}
		
		return col;
		
	}

	public Object getValue (int row, int col) {
		
		return this.storage[row][col];
		
	}
	
	public void setValue (int row, int col, Object value) {
		
		this.storage[row][col] = value;
		
	}
		
	public String toString () {
		
		String result = "";
		
		for (Object[] row: this.storage) {
			
			String rowStr = "";
			
			for (int i=0; i < row.length; i++) {
				
				if (row[i] == null) {
					
					rowStr += "null";
					
				}
				else {
					
					rowStr += row[i].toString();
					
				}
				
				if (i < row.length-1) rowStr += "\t";
				
			}
			
			result += rowStr + "\n";
			
		}
		
		return result;
		
	}
	
}
