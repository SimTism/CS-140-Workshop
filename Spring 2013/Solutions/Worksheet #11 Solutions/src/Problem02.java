/**
 * 
 * @author Simon
 * 
 */

import java.util.Scanner;

public class Problem02 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Enter number of heights: ");
		double[] height = new double[kb.nextInt()]; // Get number of heights and initialize
		                                            // array with that amount
		double sum = 0;
		
		/* Calculate total of all heights */
		for (int i = 0; i < height.length; i++) {
			sum += height[i];
		}
		
		double average = sum / height.length; // Calculate average height
		System.out.println("Average: " + average);
	}
}
