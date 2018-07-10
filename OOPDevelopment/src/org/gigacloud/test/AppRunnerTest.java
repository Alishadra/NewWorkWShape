package org.gigacloud.test;

import static org.junit.Assert.*;

import java.awt.List;

import org.gigacloud.circle.Circle;
import org.gigacloud.square.Square;
import org.gigacloud.triangle.Triangle;
import org.junit.Test;

import src.test.java.org.itstep.dao.After;
import src.test.java.org.itstep.dao.ApplicationRunner;
import src.test.java.org.itstep.dao.Autowired;
import src.test.java.org.itstep.dao.Before;
import src.test.java.org.itstep.dao.ContextConfiguration;
import src.test.java.org.itstep.dao.RunWith;
import src.test.java.org.itstep.dao.SpringBootTest;
import src.test.java.org.itstep.dao.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ApplicationRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class AppRunnerTest {

	
	Square squareInDB;
	
	Triangle triangleInDB;
	
	Circle circleInDB;
	
	@Autowired
	SquareDAO squareDAO;
	
	@Autowired
	TriangleDAO triangleDAO;
	
	@Autowired
	CircleDAO circleDAO;
	
	@Before
	public void setPreData() {
		
		Square testSquare = new Square();
		
		testSquare.setSide(25);
		
		squareInDB = squareDAO.save(testSquare);
		
		Triangle testTriangle = new Triangle();
		
		testTriangle.setBase(32);
		testTriangle.setHeight(18);
		
		triangleInDB = triangleDAO.save(testTriangle);
		
		Circle testCircle = new Circle();
		
		testCircle.setRadius(23);
		
		circleInDB = circleDAO.save(testCircle);
		
	}
	
	@Test
	public void testGetArea() {
		
		List<Square> square = squareDAO.getArea(squareInDB.getSide());
		
		assertNotNull(square);
		
		assertEquals(square.getSide(25).getArea());


	}
	
	@After
	public void cleanDB() {
		circleDAO.delete(circleInDB);
		triangleDAO.delete(triangleInDB);
		squareDAO.delete(circleInDB);
		
	}

}
