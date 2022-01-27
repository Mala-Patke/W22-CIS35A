package Lab2A.Part1;

public class part1 {
	public static final int decimalInput = 1101110;
	public static final int[] binaryInput = {0, 1, 1, 1, 0, 1, 1}; //Read backwards
	
	public static int[] decimalToBinary(int decimal) {
		int[] remainders = new int[(int) Math.floor(Math.log(decimal)/Math.log(2))+1];
		int quotient = decimal;
		int iter = 0;
		
		while(quotient != 0) {
			remainders[iter++] = quotient % 2;
			quotient /= 2;
		}
		
		return remainders;
	}
	
	public static int binaryToDecimal(int[] binary) {
		int result = 0;
		for(int i = 0; i <= binary.length-1; i++) {
			result += binary[i] * Math.pow(2, i);
		}
		return result;
	}
	
	public static void main(String[] args) {
		System.out.printf("%d in binary is ", decimalInput);
		int[] d2b = decimalToBinary(decimalInput);
		for(int i = d2b.length-1; i >= 0; i--) System.out.printf("%d", d2b[i]);
		System.out.println("\n");
		
		for(int i = binaryInput.length-1; i >= 0; i--) System.out.printf("%d", binaryInput[i]);
		System.out.printf(" in decimal is %d\n", binaryToDecimal(binaryInput));
	}
}
