package ba.codecentric.financial_analysis;

import org.junit.Test;

import ba.codecentric.financial_analysis.util.Geometry;
import junit.framework.Assert;
import junit.framework.TestCase;

public class GeometryTest extends TestCase {

	@Test
    public void testCircleCircumference_testCase1() {
		double radius = 1;
		double circumference = Geometry.circleCircumference(radius);

		Assert.assertEquals(circumference, 6.28);

		//Assert.assertEquals(expected, actual); 
        
		//6.28: we know that if the radius is 1, the circumference 
		//will be 6.28, which is the actual result
		//if the method for racunanje obima is correctly written, the
		//assertEquals method will check if the actual and expected
		//results are equal - if not, the test will fail, 
		//meaning something is wrong with the method
		
    }
	
	@Test 
	public void testCircleArea_testCase1(){
		double radius = 2;
		double area = Geometry.circleArea(radius);
		Assert.assertEquals(area, 12.56);
		//this test will fail because the circleArea() method
		//was poorly written:
		//the formula is radius * PI
		//however the actual formula is radius * radius * PI

		//usually it is good to write multiple tests for
		//a method, i.e for this poorly written method, 
		//if radius was 1, actual area would be 3.14
		
		//so in that case this test would pass,
		//because 1 * 1 * PI = 1 * PI
		//even though the formula is not correctly written
		
		
		
	}
	
}
