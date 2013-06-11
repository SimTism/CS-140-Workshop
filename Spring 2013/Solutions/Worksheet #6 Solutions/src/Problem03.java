/**
 * 
 * @author Simon
 *
 */

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Problem03 {
	public static void main(String[] args) throws IOException {
		File file = new File("Lincoln.txt");
		
		if (!file.exists()) {
			System.out.println("File does not exist!");
			return;
		}
		
		Scanner readFile = new Scanner(file);
		int theCount = 0;
		int aCount = 0;
		
		while (readFile.hasNext()) {
			String temp = readFile.next();
			
			if (temp.equals("the"))
				theCount++;
			else if (temp.equals("a"))
				aCount++;
		}
		
		System.out.println("Number of \"the\": " + theCount);
		System.out.println("Number of \"a\": " + aCount);
	}
}
