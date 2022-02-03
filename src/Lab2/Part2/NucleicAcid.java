package Lab2.Part2;

public class NucleicAcid {
	private String name;
	private String chemicalFormula;
	private float molarMass;
	private float density;
	
	public NucleicAcid() {}
	
	public NucleicAcid(String name, String chemicalFormula, float molarMass, float density) {
		this.name = name;
		this.chemicalFormula = chemicalFormula;
		this.molarMass = molarMass;
		this.density = density;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getChemicalFormula() {
		return this.chemicalFormula;
	}
	
	public float getMolarMass() {
		return this.molarMass;
	}
	
	public float getDensity() {
		return this.density;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setChemicalFormula(String chemicalFormula) {
		this.chemicalFormula = chemicalFormula;
	}
	
	public void setMolarMass(float molarMass) {
		this.molarMass = molarMass;
	}
	
	public void setDensity(float density) {
		this.density = density;
	}
	
	public void print() {
		System.out.printf("\n");
		System.out.printf("Name: %s\n", this.name);
		System.out.printf("Chemical Formula: %s\n", this.chemicalFormula);
		System.out.printf("Molar Mass: %.5f g/mol\n", this.molarMass);
		System.out.printf("Density: %.5f g/cm3\n", this.density);
	}
}