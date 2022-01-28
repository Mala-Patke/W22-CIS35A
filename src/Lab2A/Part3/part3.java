package Lab2A.Part3;

public class part3 {	
	public static int[][] genTestData() {
		int[][] result = new int[4][6];
		for(int i = 0; i < result.length; i++) {
			for(int j = 0; j < result[0].length; j++) {
				result[i][j] = (int) (20 * Math.random());
			}
		}
		return result;
	}
	
	public static void printOutput(int[][] output) {
		//Print header
		System.out.print("\t");
		for(int i = 0; i < output[0].length; i++) System.out.printf("\t%s %d", "Div", i+1);
		System.out.println();
		
		//Print everything else
		for(int i = 0; i < output.length; i++) {
			System.out.printf("Quarter %d: ", i+1);
			for(int j = 0; j < output[0].length; j++) {
				System.out.printf("\t%5d", output[i][j]);
			}
			System.out.println();
		}

	}
	
	public static void main(String[] args) {
		printOutput(genTestData());
	}
}
