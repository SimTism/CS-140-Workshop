/**
 * 
 * @author Simon
 *
 */

import java.util.Scanner;

public class Problem02 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Enter a radius: ");
		int radius = kb.nextInt();
		
		while (radius <= 0 && radius != -1) {
			System.out.print("\nRadius must be positive: ");
			radius = kb.nextInt();
		}
		
		while (radius != -1) {
			double area = Math.PI * radius * radius;
			System.out.println("\nArea: " + area);
			
			System.out.print("\nEnter a new radius: ");
			radius = kb.nextInt();
			
			while (radius <= 0 && radius != -1) {
				System.out.print("\nRadius must be positive: ");
				radius = kb.nextInt();
			}
		}
		
		System.out.println("\nThank you for using this program.");
	}
}
