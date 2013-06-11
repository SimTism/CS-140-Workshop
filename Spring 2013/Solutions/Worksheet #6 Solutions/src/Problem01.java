/**
 * 
 * @author Simon
 * 
 */

import java.util.Scanner;

public class Problem01 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String input = kb.nextLine();
		
		while (input.length() == 0) {
			System.out.print("\nEnter a string with a length greater than 0: ");
			input = kb.nextLine();
		}
		
		System.out.println("\nNow printing reverse...");
		
		for (int i = input.length() - 1; i >= 0; i--) {
			System.out.print(input.charAt(i));
		}
		
		System.out.println();
	}
}
