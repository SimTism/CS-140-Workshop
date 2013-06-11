/**
 * 
 * @author Simon
 *
 */

import java.util.Scanner;

public class Problem04 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Enter length in inches: ");
		int lengthInInches = kb.nextInt();
		
		while (lengthInInches < 0) {
			System.out.print("\nEnter length greater than or equal to 0: ");
			lengthInInches = kb.nextInt();
		}
		
		int feet = lengthInInches / 12;
		int inches = lengthInInches % 12;
		
		String grammarLength = lengthInInches == 1 ? " inch " : " inches ";
		String grammarFeet = feet == 1 ? " foot " : " feet ";
		String grammarInches = inches == 1 ? " inch." : " inches.";
		
		System.out.println("\n" + lengthInInches + grammarLength + "is equal to "
				+ feet + grammarFeet + inches + grammarInches);
	}
}
