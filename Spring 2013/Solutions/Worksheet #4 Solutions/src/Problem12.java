/**
 * 
 * @author Simon
 *
 */

import java.util.Scanner;

public class Problem12 {
	public static void main(String[] args) {
		final String username = "name";
		final String password = "pass";
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Enter your username: ");
		String clientUsername = kb.nextLine();
		
		System.out.print("Enter your password: ");
		String clientPassword = kb.nextLine();
		
		if (clientUsername.equals(username)) {
			if (clientPassword.equals(password)) {
				System.out.println("Access granted!");
			}
			else {
				System.out.println("Access denied!");
			}
		}
		else {
			System.out.println("Access denied!");
		}
	}
}
