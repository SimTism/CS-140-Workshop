/**
 * 
 * @author Simon
 *
 */

public class Problem10 {
	public static void main(String[] args) {
		int x = 100, y = 200;
		
		if (x < 100 && y > 150)
			y = 500;
		else
			System.out.println("Either x or y does not met its required condition.");
		
		System.out.println("y: " + y);
	}
}
