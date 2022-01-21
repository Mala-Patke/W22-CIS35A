package Lab1.Part2;

import java.util.Scanner;
import java.lang.Math;

public class part2 {
	public static double sqrt(long n) {
		double nextGuess = 1; 
		double lastGuess;

		do {
			lastGuess = nextGuess;
			nextGuess = (lastGuess + n / lastGuess) / 2;
		} while (Math.abs(nextGuess - lastGuess) > 0.0001);
		
		return nextGuess;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number to take the square root of: ");
		long input = scanner.nextLong();
		scanner.close();
		
		double result = sqrt(input);
		System.out.printf("The square root of %d is %f.\n", input, result);
	}
}