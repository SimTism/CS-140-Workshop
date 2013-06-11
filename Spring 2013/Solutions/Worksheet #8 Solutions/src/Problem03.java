/**
 * 
 * @author Simon
 *
 */

public class Problem03 {
	public static void main(String[] args) {
		printTableOfConversions();
	}
	
	public static void printTableOfConversions() {
		System.out.printf("%7s%17s\n\n", "Celcius", "Fahrenheit");
		
		for (int c = 0; c <= 50; c++) {
			System.out.printf("%7d%17.1f\n", c, celsiusToFahrenheit(c));
		}
	}
	
	public static double celsiusToFahrenheit(int c) {
		return (9.0 / 5) * c + 32;
	}
}
