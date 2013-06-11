/**
 * 
 * @author Simon
 *
 */

import java.util.Scanner;

public class Problem19 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Enter miles driven: ");
		int milesDriven = kb.nextInt();
		
		System.out.print("Enter gallons of gas used: ");
		int gasUsed = kb.nextInt();
		
		double mpg = (double)milesDriven / gasUsed;
		
		System.out.println("MPG: " + mpg);
		
		if (mpg > 30)
			System.out.println("You have good mileage.");
	}
}
