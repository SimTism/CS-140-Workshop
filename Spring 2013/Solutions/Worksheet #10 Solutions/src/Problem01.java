/**
 * 
 * @author Simon
 *
 */

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Problem01 {
	public static void main(String[] args) throws IOException {
		String fileName = getFileName();
		File integerFile = new File(fileName);
		
		if (!integerFile.exists()) {
			System.out.println("File does not exist!");
			return;
		}		
		sum(integerFile);
		average(integerFile);
	}
	
	public static String getFileName() {
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Enter the file name: ");
		return kb.nextLine();
	}
	
	public static void sum(File integerFile) throws IOException {
		Scanner readFile = new Scanner(integerFile);
		
		int sum = 0;
		
		while (readFile.hasNext())
			sum += readFile.nextInt();
		
		readFile.close();
		System.out.println("Sum: " + sum);
	}
	
	public static void average(File integerFile) throws IOException {
		Scanner readFile = new Scanner(integerFile);
		
		int sum = 0;
		int intCount = 0;
		
		while (readFile.hasNext()) {
			sum += readFile.nextInt();
			intCount++;
		}
		
		readFile.close();
		System.out.println("Average: " + (double)sum / intCount);
	}
}
