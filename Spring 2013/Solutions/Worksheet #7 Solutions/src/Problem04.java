/**
 * 
 * @author Simon
 * 
 */

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Problem04 {
	public static void main(String[] args) throws IOException {
		
		File copyFromFile = new File(getCopyFromFile()); // Get name of file to copy from
		
		if (copyFromFile.exists()) {
			File copyToFile = new File(getCopyToFile()); // Get name of file to copy to
			
			if (!copyToFile.exists()) {
				copyAction(copyFromFile, copyToFile); // Execute the process to copy from one file to the other
			}
			else {				
				/*
				 * Being in the "else" portion of this if-else statement means that the copyToFile does exist.
				 * This while loop is basically used for choice #2, when the user wants to rename the copyToFile.
				 */
				while (copyToFile.exists()) {
					displayFileExistsWarning(); // Displays the warning if a file exists
					System.out.println(); // Print an extra line between the warning and choices for aesthetics
					displayChoices(); // Display the choices
					int userSelection = getFileExistsSelection(); // Gets the 1, 2, or 3 choice from the user
					
					if (userSelection == 1) { // Overwrite if user says 1
						copyAction(copyFromFile, copyToFile); // Execute the process to copy from one file to the other
						return; // We are done.  Without this, we would continue looping when we don't want to.
					}
					else if (userSelection  == 2) { // Choose another filename
						System.out.println(); // Print an extra line for aesthetics
						copyToFile = new File(getCopyToFile()); // Get the new copyToFile name
						
						/*
						 * If this new filename doesn't exist, then copy the contents.  We are done.
						 */
						if (!copyToFile.exists()) {
							copyAction(copyFromFile, copyToFile);
							return;
						}
					}
					else {
						System.out.println("\nEnding program.");
						return; // We are done.  Without this, we would continue looping when we don't want to.
					}
				}
			}
		}
		else {
			System.out.println("That file doesn't exist!");
		}
	}
	
	/**
	 * Get the name of the file to copy from
	 * @return The name of the file to copy from
	 */
	public static String getCopyFromFile() {
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the name of file to copy: ");
		return kb.nextLine();
	}
	
	/**
	 * Get the name of the file to copy to
	 * @return The name of the file to copy to
	 */
	public static String getCopyToFile() {
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the name of file to copy to: ");
		return kb.nextLine();
	}
	
	/**
	 * Executes the process to copy from one file to the other
	 * @param copyFromFile the file to copy from
	 * @param copyToFile the file to copy to
	 * @throws IOException if there is a problem with the input/output
	 */
	public static void copyAction(File copyFromFile, File copyToFile) throws IOException {
		Scanner readFile = new Scanner(copyFromFile);
		PrintWriter outFile = new PrintWriter(copyToFile);
		
		while (readFile.hasNextLine())
			outFile.println(readFile.nextLine());
		
		readFile.close();
		outFile.close();
		
		System.out.println("\nSuccessfully copied!");
	}
	
	/**
	 * Displays the warning if a file already exists
	 */
	public static void displayFileExistsWarning() {
		System.out.println("\nThis file already exists!");
	}
	
	/**
	 * Displays the choices the user has if a file already exists
	 */
	public static void displayChoices() {
		System.out.println("You have 3 options");
		System.out.println("------------------");
		System.out.println("1) Overwrite existing file.");
		System.out.println("2) Use another name.");
		System.out.println("3) Exit program.");
		System.out.print("Enter your selection: ");
	}
	
	/**
	 * Returns 1, 2, or 3 as specified in the displayChoices() method
	 * @return the choice of 1, 2, or 3 as specified in the displayChoices() method
	 */
	public static int getFileExistsSelection() {
		Scanner kb = new Scanner(System.in);
		
		int userSelection = kb.nextInt();
		
		while (userSelection != 1 && userSelection != 2 && userSelection != 3) {
			System.out.println("\nMust enter 1, 2, or 3!");
			displayChoices();
			userSelection = kb.nextInt();
		}
		
		return userSelection;
	}
}
