import java.util.Scanner;

/**
 * 
 * @author Simon
 *
 */

public class Problem03 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String s1 = kb.nextLine();
		
		/*
		 * There's actually a String method that converts a String
		 * into a character array, as shown here.  If asked to do
		 * something like this on a quiz or final, just do it the
		 * long way to be safe.
		 */
		/* char[] s1Array = s1.toCharArray(); */
		
		/* Long way of converting a String to a character array */
		char[] s1Array = new char[s1.length()]; // Create array with a size equal to length of String s1
		
		/* Take each character in the s1 String and place in s1Array */
		for (int i = 0; i < s1.length(); i++)
			s1Array[i] = s1.charAt(i);
		
		/* Print out contents of s1Array backwards */
		for (int i = s1Array.length - 1; i >= 0; i--) {
			System.out.print(s1Array[i]);
		}
		
		System.out.println();
	}
}
