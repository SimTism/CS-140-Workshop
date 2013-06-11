/**
 * 
 * @author Simon
 * 
 */

import java.util.Scanner;

public class Problem07 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.print("How many fibonacci numbers do you want to calculate? ");
		int limit = kb.nextInt();
		
		fibonacci(limit);
	}

	public static void fibonacci(int limit) {
		if (limit <= 0) {
			return; // if limit <= 0, don't do anything
		}
		
		/* I'm just going to print each number on each line for this solution */
		if (limit <= 2){
			for (int i = 0; i < limit; i++) {
				System.out.println(1);
			}
			
			return;
		}
		
		int[] fib = new int[limit];
		fib[0] = 1;
		fib[1] = 1;
		
		for (int i = 0; i < fib.length; i++) {
			if (i > 1) { // Make calculations starting at the third element (index 2)
				fib[i] = fib[i - 1] + fib[i - 2];
			}
			
			System.out.println(fib[i]);
		}
	}
}
