package minesweeper;

public class Pair {
	
	// Variable definitions
	private int row;
	private int column;

	// Pair Object
	public Pair(int row, int column) {
		this.row = row;
		this.column = column;
	}
	
	// Returns the row
	public int getRow() {
		return row;
	}
	
	// Returns the column
	public int getColumn() {
		return column;
	}
}