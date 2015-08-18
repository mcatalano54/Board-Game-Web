package ar.com.brave.boardgame;

public class QuadraticBoard {
	
	private static final int DEFAULT_LENGTH=0;
	private static final int DEFAULT_WIDTH=0;
	
	private Integer length;
	private Integer width;
	
	public QuadraticBoard(Integer length, Integer width) {
		super();
		this.length = length;
		this.width = width;
	}

	public Integer getLength() {
		return length;
	}
	
	public void setLength(Integer length) {
		this.length = length;
	}
	
	public Integer getWidth() {
		return width;
	}
	
	public void setWidth(Integer width) {
		this.width = width;
	}
	
}
