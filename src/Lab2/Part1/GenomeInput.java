package Lab2.Part1;

import java.util.Scanner;

public class GenomeInput {
	public GenomeInput() {}
		
	public HumanGenome read() {
		Scanner scanner = new Scanner(System.in);
		HumanGenome genome = new HumanGenome();
		
		System.out.printf("What is this Genome's name? ");
		genome.setName(scanner.nextLine()); //Fix this
		System.out.printf("How many genes does %s have? ", genome.getName());
		genome.setNumGenes(scanner.nextInt());
		System.out.printf("How many genes does %s have? ", genome.getName());
		genome.setNumChromosomes(scanner.nextInt());
		System.out.printf("How many genes does %s have? ", genome.getName());
		genome.setNumCells(scanner.nextInt());
		
		scanner.close();
		return genome;
	}
	
	public static void main(String[] args) {
		GenomeInput driver = new GenomeInput();
		
		HumanGenome lilo = driver.read();
		HumanGenome stitch = driver.read();
		HumanGenome jumba = driver.read();
		
		lilo.print();
		stitch.print();
		jumba.print();
	}
}
