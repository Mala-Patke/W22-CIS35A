package Lab1.Part1;

import java.util.Scanner;

public class part1 {
	
	public static double monthlyPaymentCalc(int loanAmount, int numberOfYears, double monthlyInterestRate) {
		double i = monthlyInterestRate;
		int n = numberOfYears * 12;
		double monthlyPayment = (loanAmount * i * Math.pow(i + 1, n)) / (Math.pow(i + 1, n) - 1);
		return monthlyPayment;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Loan amount: ");
		int balance = scanner.nextInt();
		System.out.print("Number of Years: ");
		int years = scanner.nextInt();
		System.out.print("Annual Interest rate: ");
		int interestRate = scanner.nextInt();
		
		double monthlyInterestRate = interestRate / 100.0 / 12.0;
		double monthlyPayment = monthlyPaymentCalc(balance, years, monthlyInterestRate);
		System.out.printf("\nMonthly payment: %.2f\n", monthlyPayment);
		System.out.printf("Interest amount: %.2f\n\n", monthlyPayment * 12);
		
		double interest;
		double principal;
		System.out.println("Payment#\tInterest\tPrincipal\tBalance");
		for(int i = 1; i <= years * 12; i++) {
			interest = balance * monthlyInterestRate;
			principal = monthlyPayment - interest;
			balance -= principal;
			System.out.printf("%d\t\t%.2f\t\t%.2f\t\t%.2f\t\t\n", i, interest, principal, balance);
		}
		
		scanner.close();
	}
}