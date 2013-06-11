/**
 * 
 * @author Simon
 *
 */

import java.util.Scanner;

public class Problem14 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Enter a character: ");
		char ch = kb.nextLine().charAt(0);
		
		while ((ch < 'A' || ch > 'F') && (ch < 'a' || ch > 'f') || ch == 'E' || ch == 'e') {
			System.out.print("Enter the appropriate letter grade: ");
			ch = kb.nextLine().charAt(0);
		}
		
		int percentage;
		
		switch (ch) {
		case 'A':
		case 'a':
			percentage = 90;
			break;
		case 'B':
		case 'b':
			percentage = 80;
			break;
		case 'C':
		case 'c':
			percentage = 70;
			break;
		default: /* Percentage will be 60 for both 'D' and 'F' */
			percentage = 60;
			break;
		}
		
		System.out.println((ch == 'F' || ch == 'f' ? "below " : "above ") + percentage + "%");
	}
}