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
	
	public static int arrSum(int[] arr) {
		int sum = 0;
		for(int j = 0; j < arr.length; j++) sum += arr[j];
		return sum;
	}
	
	public static int arrMaxIndex(int[] arr) {
		int maxIndex = 0;
		int maxValue = 0;
		for(int i = 0; i < arr.length; i++) { 
			if(arr[i] > maxValue) {
				maxIndex = i;
				maxValue = arr[i];
			}
		}
		return maxIndex;
	}
	
	public static void printPart1(int[][] output) {
		//Print header
		System.out.print("Part 1\t");
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
		System.out.println();
	}
	
	
	public static void printPart2(int[][] output) {
		//Print header
		System.out.print("Part 2\t");
		for(int i = 0; i < output[0].length; i++) System.out.printf("\t%s %d", "Div", i+1);
		System.out.println();
		
		//Print everything else
		for(int i = 0; i < output.length; i++) {
			System.out.printf("Quarter %d: ", i+1);
			for(int j = 0; j < output[0].length; j++) {
				if(i != 0) System.out.printf("\t%5d", output[i][j] - output[i-1][j]);
				else System.out.printf("\t%5d", 0);
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void printPart3(int[][] output) {
		System.out.println("Part 3");
		for(int i = 0; i < output.length; i++) {
			System.out.printf("Quarter %d: %d\n", i+1, arrSum(output[i]));
		}
		System.out.println();
	}
	
	public static void printPart4(int[][] output) {
		System.out.println("Part 4");
		for(int i = 0; i < output.length; i++) {
			if(i != 0) System.out.printf("Quarter %d: %d\n", i+1, arrSum(output[i]) - arrSum(output[i-1]));
			else System.out.printf("Quarter %d: %d\n", i+1, 0);
		}
		System.out.println();
	}

	public static void printPart5(int[][] output) {
		System.out.println("Part 5");
		for(int i = 0; i < output.length; i++) {
			System.out.printf("Quarter %d: %.2f\n", i+1, ((double) arrSum(output[i]))/output[i].length);
		}
		System.out.println();
	}

	public static void printPart6(int[][] output) {
		System.out.println("Part 6");
		for(int i = 0; i < output.length; i++) { 
			System.out.printf("Quarter %d: Div %d\n", i+1, arrMaxIndex(output[i])+1);
		}
	}
	
	public static void main(String[] args) {
		int[][] data = genTestData();
		printPart1(data);
		printPart2(data);
		printPart3(data);
		printPart4(data);
		printPart5(data);
		printPart6(data);
	}
}
