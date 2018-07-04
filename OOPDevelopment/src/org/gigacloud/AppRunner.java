package org.gigacloud;

import java.util.logging.Logger;

import org.gigacloud.square.Square;

public class AppRunner {

	public static void main(String[] args) {

		Square square = new Square();
		
		square.setSide(25);
		
		String a = String.valueOf(square.getArea());
		
		Logger log = Logger.getLogger(Square.class.getName());
		
		public void someMethod() {
			
			log.info("Area + a");
		}
	}

}
