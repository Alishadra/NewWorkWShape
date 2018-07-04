package org.gigacloud;

import java.util.logging.Logger;

import org.gigacloud.circle.Circle;
import org.gigacloud.square.Square;
import org.gigacloud.triangle.Triangle;

public class AppRunner {

	public static void main(String[] args) {

		Square square = new Square();
		
		square.setSide(25);
		
		Triangle triangle = new Triangle ();
		
		triangle.setHeight(12);
		
		triangle.setBase(10);
		
		Circle circle = new Circle();
		
		circle.setRadius(15);
		
		Logger log = Logger.getLogger(AppRunner.class.getName());
		
			
			log.info("" + square.getArea() + triangle.getArea() + circle.getArea());
			
			
			
			
			

	
	}
}
