/**
 * 
 * @author Simon
 *
 */

import java.util.Scanner;

public class Problem17 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Enter city name: ");
		String city = kb.nextLine();
		
		System.out.println("Number of characters in " + city + ": " + city.length());
		System.out.println(city.toUpperCase());
		System.out.println(city.toLowerCase());
		System.out.println("First letter of " + city + ": " + city.charAt(0));
		System.out.println("Last letter of " + city + ": " + city.charAt(city.length() - 1));
	}
}
