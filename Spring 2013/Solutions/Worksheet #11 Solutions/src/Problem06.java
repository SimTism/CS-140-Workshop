/**
 * 
 * @author Simon
 * 
 */

import java.util.Scanner;

public class Problem06 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Enter number of ages: ");
		int[] ages = new int[kb.nextInt()]; // Get number of ages and initialize array w/ that amount
		
		/* Get the ages from the user */
		for (int i = 0; i < ages.length; i++) {
			System.out.print("Enter age " + (i + 1) + ": ");
			ages[i] = kb.nextInt();
		}
		
		int[] maxMin = findMaxMin(ages); // Get the max and min ages and store in maxMin array
		                                 // Note that findMaxMin(ages) returns an array containing
		                                 // the max at index 0, and min at index 1
		
		System.out.println("Max: " + maxMin[0]);
		System.out.println("Min: " + maxMin[1]);
	}

	private static int[] findMaxMin(int[] arr) {
		int[] maxMin = new int[2]; // Array holding max at index 0 and min at index 1
		maxMin[0] = arr[0]; // Index 0 = max
		maxMin[1] = arr[0]; // Index 1 = min
		
		/* Compare each element in arr to find new max or new min */
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > maxMin[0]) {
				maxMin[0] = arr[i];
			}
			else if (arr[i] < maxMin[1]) {
				maxMin[1] = arr[1];
			}
		}
		
		return maxMin; // Return the maxMin array
	}
}
