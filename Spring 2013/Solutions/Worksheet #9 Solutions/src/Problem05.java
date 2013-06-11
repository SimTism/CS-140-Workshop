/**
 * 
 * @author Simon
 * 
 */

import java.util.Scanner;

public class Problem05 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter 3 numbers...");
		int num1 = kb.nextInt();
		int num2 = kb.nextInt();
		int num3 = kb.nextInt();
		
		System.out.println("Sum: " + sum(num1, num2, num3));
	}
	
	public static int sum(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
}
