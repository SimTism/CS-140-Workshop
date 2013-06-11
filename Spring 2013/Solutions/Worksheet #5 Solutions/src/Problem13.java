/**
 * 
 * @author Simon
 *
 */

import java.util.Scanner;

public class Problem13 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int x = kb.nextInt();
		
		while (x <= 0) {
			System.out.print("You must enter an integer greater than 0: ");
			x = kb.nextInt();
		}
		
		while (x < 100)
			x *= 2;
		
		System.out.println("x: " + x);
	}
}
