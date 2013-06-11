/**
 * 
 * @author Simon
 *
 */

public class Problem04 {
	public static void main(String[] args) {
		int[] array = new int[10]; // Create an array of size 10
		
		for (int i = 0; i < array.length; i++) { // Initialize array with elements 1 - 10
			array[i] = i + 1;
			System.out.print(array[i] + " ");
		}
		
		System.out.println();
		swap(array);
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		System.out.println();
	}
	
	public static void swap(int[] array) {
		int temp = array[0]; // Store first element in array into temporary variable
		array[0] = array[array.length - 1]; // Set first element in array to be that of
		                                    // the last element in the array
		array[array.length - 1] = temp; // Now that the first element has been overwritten
		                                // by the last element, we need to replace the
		                                // the last element with the value stored in the
		                                // temporary variable (which was the first element
		                                // initially), as shown here
	}
}
