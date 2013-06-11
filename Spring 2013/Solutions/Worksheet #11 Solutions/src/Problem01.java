/**
 * 
 * @author Simon
 *
 */

public class Problem01 {
	public static void main(String[] args) {
		int[] studentGrades = {90, 45, 13, 78, 99, 64, 86};
		
		System.out.println("Array length: " + studentGrades.length); // Part a
		System.out.println("Value stored in studentGrades[6]: " + studentGrades[6]); // Part b
		
		int sum = 0;
		
		/* Part c */
		for (int i = 0; i < studentGrades.length; i++)
			sum += studentGrades[i];
		
		System.out.println("Sum of values in array: " + sum);
	}
}
