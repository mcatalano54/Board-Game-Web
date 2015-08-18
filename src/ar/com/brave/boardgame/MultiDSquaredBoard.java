package ar.com.brave.boardgame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MultiDSquaredBoard {

	private List<Integer> dimensions;
	
	public MultiDSquaredBoard() {
		this.dimensions=new ArrayList<Integer>();
	}
	
	public MultiDSquaredBoard(List<Integer> dimensions) {
		super();
		this.dimensions = dimensions;
	}
	
	public MultiDSquaredBoard(Integer... dimensions){
		this.dimensions= Arrays.asList(dimensions);
	}

	public List<Integer> getDimensions() {
		return dimensions;
	}

	public void setDimensions(List<Integer> dimensions) {
		this.dimensions = dimensions;
	}
	
}
