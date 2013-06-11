/**
 * 
 * @author Simon
 *
 */

public class Problem02 {
	public static void main(String[] args) {
		System.out.println("Number of right triangles in 1 - 30 range: " + calculateRightTriangles());
	}
	
	public static int calculateRightTriangles() {
		int rightTriangleCount = 0;
		
		for (int i = 1; i <= 30; i++) {
			for (int j = 1; j <= 30; j++) {
				for (int k = 1; k <= 30; k++) {
					if (i * i + j * j == k * k) {
						rightTriangleCount++;
						System.out.println("(" + i + ", " + j + ", " + k + ")");
					}
				}
			}
		}
		
		return rightTriangleCount;
	}
}
