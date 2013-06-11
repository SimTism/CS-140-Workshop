/**
 * 
 * @author Simon
 * 
 */

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Problem03 {
	public static void main(String[] args) throws IOException {		
		FileWriter numbersFile = new FileWriter("Numbers.txt", true);
		PrintWriter outFile = new PrintWriter(numbersFile);
		
		for (int i = 1; i <= 10; i++)
			outFile.println(i);
		
		outFile.close();
	}
}
