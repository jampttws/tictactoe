package tictactoe;

import javafx.scene.shape.Rectangle;

/**
 * A single square on the game board.
 * @author Tanasorn Tritawisup
 * 
 */
public class BoardSquare extends Rectangle {
	/** square knows its own row and column. */
	private int row;
	private int column;
	
	/** Create a board. */
	public BoardSquare(int row, int col, int size){
		super(size, size);
        this.row = row;
        this.column = col;
	}
	
	public int getRow() {
		return this.row;
	}
	
	public int getColumn() {
		return this.column;
	}
	
}