package boardgame;

public class Board {
	
	private int rows;
	private int columms;
	private Piece [] [] pieces;
	
	public Board(int rows, int columms) {
		this.rows = rows;
		this.columms = columms;
		pieces = new Piece[rows][columms];
	}
	
	

}
