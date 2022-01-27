package Lab2A.Part3;

public class part3 {	
	public static int[][] genTestData() {
		int[][] result = new int[4][6];
		for(int i = 0; i <= result.length-1; i++) {
			for(int j = 0; j <= result[0].length-1; j++) {
				result[i][j] = (int) (20 * Math.random());
			}
		}
		return result;
	}
	
	public static void printOutput(int[][] output) {
		for(int i = 0; i < output.length-1; i++) {
			for(int j = 0; j < output[0].length-1; j++) {
				System.out.printf("%2d  ", output[i][j]);
			}
			System.out.println();
		}

	}
	
	public static void main(String[] args) {
		printOutput(genTestData());
	}
}
