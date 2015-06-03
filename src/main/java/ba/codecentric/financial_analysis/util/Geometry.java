package ba.codecentric.financial_analysis.util;

public class Geometry {
	
	//remember to keep constants in this format
	//
	public static final double PI = 3.14;
	
	public static double circleArea(double radius){
		//Area (povrsina) of a circle - formula not correct
		return radius * PI;
	}
	
	public static double circleCircumference(double radius){
		//formula for obim za krug, dobro napisana
		return 2 * radius * PI;
	}
}
