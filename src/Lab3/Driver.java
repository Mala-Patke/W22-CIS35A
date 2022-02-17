package Lab3;

public class Driver {
	
	static final String PATHNAME = "C:/Users/Administrator/eclipse-workspace/Win2235A/src/Lab3/Salesdat.txt";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileIO a1 = new FileIO(PATHNAME, false);
		Franchise f = a1.readData();
		
		UI ui = new UI(f);
		ui.drive();
	} 

}
