/**
 * 
 * @author Simon
 *
 */

public class Problem02 {
	public static void main(String[] args) {
		int[] a = {1,4,6,8,9,11,123,424};
		System.out.println("424 is at index: " + binarySearch(a, 424));
		System.out.println("0 is not in the array so index will be: " + binarySearch(a, 0));
	}
	
	public static int binarySearch(int[] array, int target) {
		int first = 0;
		int last = array.length - 1;
		
		while (first <= last) {
			int middle = (first + last) / 2;
			
			if (array[middle] == target) {
				return middle;
			}
			else if (array[middle] > target) {
				last = middle - 1;
			}
			else {
				first = middle + 1;
			}
		}
		
		return -1;
	}
}
