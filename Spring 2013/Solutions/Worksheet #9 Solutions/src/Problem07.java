/**
 * 
 * @author Simon
 * 
 */

import java.util.Scanner;

public class Problem07 {
	public static void main(String[] args) {
		String userString = getString();
		printBackwards(userString);
	}
	
	public static String getString() {
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		return kb.nextLine();
	}
	
	public static void printBackwards(String target) {
		if (target.length() == 0) {
			System.out.println("You didn't enter anything!");
			return;
		}
		
		for (int i = target.length() - 1; i >= 0; i--)
			System.out.print(target.charAt(i));
		
		System.out.println();
	}
}
