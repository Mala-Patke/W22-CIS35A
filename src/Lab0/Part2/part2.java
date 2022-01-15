package Lab0.Part2;

import java.util.Scanner;

public class part2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the temperature Centigrade: ");
		float c = scanner.nextFloat();
		float calcf = c * 9/5 + 32;
		System.out.printf("%.2f degrees Centigrade is %.2f degrees Fahrenheit.\n\n", c, calcf);
		
		System.out.print("Enter the temperature Fahrenheit: ");
		float f = scanner.nextFloat();
		float calcc = (f - 32) * 5/9;
		System.out.printf("%.2f degrees Fahrenheit is %.2f degrees Centigrade.", f, calcc);
		
		scanner.close();
	}
}