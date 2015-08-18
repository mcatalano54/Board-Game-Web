package ar.com.brave.boardgame;

public class CubicBoard extends QuadraticBoard {

	private Integer height;

	public CubicBoard(Integer length, Integer width, Integer height) {
		super(length, width);
		this.height = height;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}
	
}
