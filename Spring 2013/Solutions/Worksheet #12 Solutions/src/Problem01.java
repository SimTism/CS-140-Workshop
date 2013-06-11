/**
 * 
 * @author Simon
 *
 */

public class Problem01 {
	public static void main(String[] args) {
		int[] array = {5,2,1231,3,32,623,2,1};
		selectionSort(array);
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		System.out.println();
	}
	
	public static void selectionSort(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			int min = i;
			
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[min])
					min = j;
			}
			
			if (min != i)
				swap(a, i, min);
		}
	}
	
	public static void swap(int[] a, int x, int y) {
		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}
}
