/**
 * 
 * @author Simon
 *
 */

import java.util.Scanner;

public class Problem11 {
	public static void main(String[] args) {
		int x, y, z;
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter 3 integers...");
		x = kb.nextInt();
		y = kb.nextInt();
		z = kb.nextInt();
		
		int sum, product, min, max;
		double average;
		
		sum = x + y + z;
		product = x * y * z;
		average = sum / 3.0;
		
		min = x;
		max = x;
		
		if (y < min)
			min = y;
		else if (y > max)
			max = y;
		
		if (z < min)
			min = z;
		else if (z > max)
			max = z;
		
		System.out.println("Sum: " + sum);
		System.out.println("Product: " + product);
		System.out.println("Average: " + average);
		System.out.println("Min: " + min);
		System.out.println("Max: " + max);
	}
}
