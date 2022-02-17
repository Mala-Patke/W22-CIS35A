package Lab3;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileIO a1 = new FileIO("C:/Users/Administrator/eclipse-workspace/Win2235A/src/Lab3/Salesdat.txt", false);
		Franchise f = a1.readData();
		
		UI ui = new UI(f);
		ui.drive();
	} 

}
