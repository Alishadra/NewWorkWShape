package org.gigacloud.square;

import java.awt.geom.Area;
import java.util.logging.Logger;

import org.gigacloud.AbstractShape;

public class Square extends AbstractShape {
	
	private int side;
	
	public int getArea() {
		
		int area = side*side;
		
		return area;
	}
	

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}
	
	

}
