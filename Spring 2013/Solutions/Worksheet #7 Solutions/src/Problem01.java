/**
 * @author Simon
 */

import java.io.IOException;
import java.io.PrintWriter;

public class Problem01 {
	public static void main(String[] args) throws IOException {
		PrintWriter oddFile = new PrintWriter("Odd.txt");
		PrintWriter evenFile = new PrintWriter("Even.txt");
		
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0)
				evenFile.println(i);
			else
				oddFile.println(i);
		}
		
		oddFile.close();
		evenFile.close();
	}
}
