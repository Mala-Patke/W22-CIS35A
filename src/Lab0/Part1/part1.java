package Lab0.Part1;

import java.util.Scanner;

public class part1 {
	public static void main(String[] args) {
		//Initialize cost of each unit
		final float TVCost = 400f;
		final float VCRCost = 220f;
		final float RemoteCost = 35.20f;
		final float CDCost = 300f;
		final float TapeCost = 150f;
		final float taxRate = 0.0875f;
		
		//Prompt for each element
		Scanner scanner = new Scanner(System.in);
		System.out.print("How many TV's were sold? ");
		int TVCount =  scanner.nextInt();
		System.out.print("How many VCR's were sold? ");
		int VCRCount =  scanner.nextInt();
		System.out.print("How many remote controllers were sold? ");
		int RemoteCount =  scanner.nextInt();
		System.out.print("How many CD's were sold? ");
		int CDCount =  scanner.nextInt();
		System.out.print("How many Tape Recorders were sold? ");
		int TapeCount =  scanner.nextInt();
		scanner.close();
		
		//Calculate total cost
		float totalTVCost = TVCost * TVCount;
		float totalVCRCost = VCRCost * VCRCount;
		float totalRemoteCost = RemoteCost * RemoteCount;
		float totalCDCost = CDCost * CDCount;
		float totalTapeCost = TapeCost * TapeCount;
		
		float subtotal = totalTVCost + totalVCRCost + totalRemoteCost + totalCDCost + totalTapeCost;
		float tax = subtotal * taxRate;
		float taxedTotal = subtotal + tax;
		
		//Print the output
		System.out.printf("\t%2s\t%-30s\t\t%15s\t\t%15s\n","#","Description", "Unit Price", "Total Price");
		
		System.out.printf("\t%2d\t%-30s\t\t%15.2f\t\t%15.2f\n",TVCount, "TV", TVCost, totalTVCost);
		System.out.printf("\t%2d\t%-30s\t\t%15.2f\t\t%15.2f\n",VCRCount, "VCR", VCRCost, totalVCRCost);
		System.out.printf("\t%2d\t%-30s\t\t%15.2f\t\t%15.2f\n",RemoteCount, "Remote Control", RemoteCost, totalRemoteCost);
		System.out.printf("\t%2d\t%-30s\t\t%15.2f\t\t%15.2f\n",CDCount, "CD", CDCost, totalCDCost);
		System.out.printf("\t%2d\t%-30s\t\t%15.2f\t\t%15.2f\n",TapeCount, "Tape Recorder", TapeCost, totalTapeCost);
		
		System.out.printf("%10s%15.2f\n", "SUBTOTAL", subtotal);
		System.out.printf("%10s%15.2f\n", "TAX", tax);
		System.out.printf("%10s%15.2f\n", "TOTAL", taxedTotal);
	}
}
