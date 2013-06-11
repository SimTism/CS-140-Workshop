/**
 * 
 * @author Simon
 * 
 */

import java.util.Scanner;

public class Problem08 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Enter min range: ");
		int min = kb.nextInt();
		
		while (min <= 1) {
			System.out.println("\nEnter a min range greater than 1: ");
			min = kb.nextInt();
		}
		
		System.out.print("Enter max range: ");
		int max = kb.nextInt();
		
		while (max < min) {
			System.out.println("\nMax must be greater than min.");
			System.out.print("Please enter max range again: ");
			max = kb.nextInt();
		}
		
		findPrimes(min, max);
	}
	
	public static void findPrimes(int min, int max) {
		for (int i = min; i <= max; i++) {
			if (isPrime(i))
				System.out.println(i);
		}
	}
	
	public static boolean isPrime(int target) {
		for (int i = 2; i <= target / 2; i++)
			if (target % i == 0)
				return false;
		
		return true;
	}
}
