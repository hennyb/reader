package hennyb.cotra;


public class CoTMatrix {
	
	private final static int EXPANSION_FACTOR = 2;
	private final static int DEFAULT_CAPACITY = 1;
	private final static int DEFAULT_COLCOUNT = CoTField.values().length;
	
	private Object[][] matrix;
	private int size = 0;
	
	public CoTMatrix () {
		
		this.matrix = new Object[this.size + DEFAULT_CAPACITY][DEFAULT_COLCOUNT];
		
	}
	
	private void expand () {
		
		Object[][] old = this.matrix;
		this.matrix = new Object[this.size * EXPANSION_FACTOR][DEFAULT_COLCOUNT];
		
		for (int i=0; i < this.size; i++) {
			
			this.matrix[i] = old[i];
			
		}
		
	}
	
	public void add (Object[] row) {
		
		if (this.size == this.matrix.length) {
			
			this.expand();
			
		}
		
		this.matrix[this.size] = row;
		this.size++;
		
	}
	
	public int size () {
		
		return this.size;
		
	}
	
	public Object[] getRow (int i) {
		
		Object[] row = new Object[DEFAULT_COLCOUNT];
		
		for (int j=0; j < DEFAULT_COLCOUNT; j++) {
			
			row[j] = this.matrix[i][j];
			
		}
		
		return row;
		
	}
	
	public Object[] getRows (int from, int to) {
		
		int capacity = to - from;
		
		Object[] rows = new Object[capacity];
		
		for (int i=0; i <= capacity; i++) {
			
			rows[i] = this.matrix[from + i];
			
		}
		
		return rows;
		
	}
	
	public Object[] getCol (int i) {
		
		Object[] col = new Object[this.size];
		
		for (int j=0; j < this.size; j++) {
			
			col[j] = this.matrix[j][i];
			
		}
		
		return col;
		
	}


	
	public Object[] getCol (CoTField field) {
		
		return this.getCol(field.ordinal());
		
	}
	
	public Object getValue (int row, int col) {
		
		return this.matrix[row][col];
		
	}
	
	public Object getValue (int row, CoTField field) {
		
		return this.getValue(row, field.ordinal());
		
	}
	
	public void setValue (int row, int col, Object value) {
		
		this.matrix[row][col] = value;
		
	}
	
	public void setValue (int row, CoTField field, Object value) {
		
		this.setValue(row, field.ordinal(), value);
		
	}

		
	
}
