package ar.com.brave.boardgame;

public class QuadraticBoard {
	
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
