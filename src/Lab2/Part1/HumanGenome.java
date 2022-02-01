package Lab2.Part1;

public class HumanGenome {
	//Instance Variables
	private String name;
	private int numGenes;
	private int numChromosomes;
	private int numCells;
	
	//Constructor
	public HumanGenome() {}
	public HumanGenome(String name, int numGenes, int numChromosomes, int numCells) {
		this.name = name;
		this.numGenes = numGenes;
		this.numChromosomes = numChromosomes;
		this.numCells = numCells;
		
	}
	
	//Getters
	public String getName() {
		return this.name;
	}
	
	public int getNumGenes() {
		return this.numGenes;
	}
	
	public int getNumChromosomes() {
		return this.numChromosomes;
	}
	
	public int getNumCells() {
		return this.numCells;
	}
	
	//Setters
	public void setName(String name) {
		this.name = name;
	}
	
	public void setNumGenes(int numGenes) {
		this.numGenes = numGenes;
	}
	
	public void setNumChromosomes(int numChromosomes) {
		this.numChromosomes = numChromosomes;
	}
	
	public void setNumCells(int numCells) {
		this.numCells = numCells;
	}
	
	//Printer
	public void print() {
		System.out.printf("Name: %s\n", this.name);
		System.out.printf("Number of genes: %s\n", this.numGenes);
		System.out.printf("Number of Chromosomes: %s\n", this.numChromosomes);
		System.out.printf("Number of Cells (trillions): %s\n", this.numCells);

	}
}