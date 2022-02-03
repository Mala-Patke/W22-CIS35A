package Lab2.Part2;

import java.util.Scanner;

public class GenoNucleicAcid {
	static Scanner scanner = new Scanner(System.in);
	
	public GenoNucleicAcid() {}
	
	public NucleicAcid read() {
		NucleicAcid acid = new NucleicAcid();

		System.out.printf("What is this nucleic acid's name? ");
		acid.setName(scanner.nextLine());
		
		System.out.printf("What is %s's chemical formula? ", acid.getName());
		acid.setChemicalFormula(scanner.nextLine()); 
		
		System.out.printf("What is %s's molar mass? ", acid.getName());
		acid.setMolarMass(Float.parseFloat(scanner.nextLine())); 

		System.out.printf("What is %s's density? ", acid.getName());
		acid.setDensity(Float.parseFloat(scanner.nextLine())); 

		System.out.printf("\n");
		
		return acid;
	}
	
	public static void main(String[] args) {
		GenoNucleicAcid driver = new GenoNucleicAcid();
		
		NucleicAcid acid1 = driver.read();
		NucleicAcid acid2 = driver.read(); 
		NucleicAcid acid3 = driver.read();
		NucleicAcid acid4 = driver.read();
		NucleicAcid acid5 = driver.read();
		
		scanner.close();
		
		acid1.print();
		acid2.print();
		acid3.print();
		acid4.print();
		acid5.print();

	}
}