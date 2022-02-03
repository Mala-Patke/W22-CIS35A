package Lab2.Part1;

import java.util.Scanner;

public class GenomeInput {
	public GenomeInput() {}
	
	static Scanner scanner = new Scanner(System.in);
		
	public HumanGenome read() {
		HumanGenome genome = new HumanGenome();
		
		System.out.printf("What is this Genome's name? ");
		genome.setName(scanner.nextLine()); 

		System.out.printf("How many genes does %s have? ", genome.getName());
		genome.setNumGenes(Integer.parseInt(scanner.nextLine())); //Got errors using nextInt()
		
		System.out.printf("How many chromosomes does %s have? ", genome.getName());
		genome.setNumChromosomes(Integer.parseInt(scanner.nextLine()));
		
		System.out.printf("How many cells does %s have (in trillions)? ", genome.getName());
		genome.setNumCells(Integer.parseInt(scanner.nextLine()));

		System.out.printf("\n");
		return genome;
	}
	
	public static void main(String[] args) {
		GenomeInput driver = new GenomeInput();
		
		HumanGenome genome1 = driver.read();
		HumanGenome genome2 = driver.read();
		HumanGenome genome3 = driver.read();
		
		scanner.close();
		
		System.out.printf("Name\t\tGene Count\tChromosomes\tCell Count (in trillions)");
		genome1.print();
		genome2.print();
		genome3.print();
	}
}
