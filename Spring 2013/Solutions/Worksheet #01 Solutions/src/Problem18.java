/**
 * 
 * @author Simon
 *
 */

public class Problem18 {
	public static void main(String[] args) {
		double radius = 3;
		double pi = 3.14159;
		double diameter, circumference, area;
		
		diameter = 2 * radius;
		circumference = 2 * pi * radius;
		area = pi * radius * radius;
		
		System.out.println("Dimater: " + diameter);
		System.out.println("Circumference: " + circumference);
		System.out.println("Area: " + area);
	}
}
