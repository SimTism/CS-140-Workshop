/**
 * @author Simon
 */

import java.util.Scanner;

public class Problem02 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String userString = kb.nextLine();
		
		while (userString.length() == 0) {
			System.out.print("\nMust enter a string with a length greater than 0: ");
			userString = kb.nextLine();
		}
		
		System.out.print("\nEnter a character to replace: ");
		String tempChar = kb.nextLine();
		
		while (tempChar.length() != 1) {
			System.out.print("\nMust enter a character: ");
			tempChar = kb.nextLine();
		}
		
		char replaceChar = tempChar.charAt(0);
		
		System.out.print("\nEnter character to fill: ");
		tempChar = kb.nextLine();
		
		while (tempChar.length() != 1) {
			System.out.print("\nMust enter a character: ");
			tempChar = kb.nextLine();
		}
		
		char fillChar = tempChar.charAt(0);
		
		System.out.println("\nOriginal String: " + userString);
		
		String tempString = "";
		
		for (int i = 0; i < userString.length(); i++) {
			char ch = userString.charAt(i);
			tempString += ch == replaceChar ? fillChar : ch;
		}
		
		userString = tempString;
		
		System.out.println("String after modification: " + userString);
	}
}
