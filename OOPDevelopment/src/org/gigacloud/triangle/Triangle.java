package org.gigacloud.triangle;

import org.gigacloud.AbstractShape;

public class Triangle extends AbstractShape {
	
	private int base;
	
	private int height;
	
	public int getArea() {
		
		int area = base*height/2;
		return area;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	
	

}
