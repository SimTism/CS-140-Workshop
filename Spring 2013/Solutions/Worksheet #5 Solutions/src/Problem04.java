import java.util.Scanner;

/**
 * 
 * @author Simon
 *
 */

public class Problem04 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int x = kb.nextInt();
		
		if (x > 1 && x < 10)
			System.out.println("This is true.");
	}
}
