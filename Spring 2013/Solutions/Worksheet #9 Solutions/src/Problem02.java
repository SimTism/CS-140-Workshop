/**
 * 
 * @author Simon
 *
 */

public class Problem02 {
	public static void main(String[] args) {
		for (int i = 1; i <= 30; i++) {
			
			if (i > 16 && i % 2 == 0)
				continue;
			
			System.out.println(i);
			
			
			/* Another implementation */
			/*
			if (i <= 16) {
				System.out.println(i);
			} else if (i % 2 == 1) {
				System.out.println(i);
			}
			*/
		}
	}
}
