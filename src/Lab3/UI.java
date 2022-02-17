package Lab3;

import java.util.Scanner;

public class UI {
	private Franchise franchise;
	
	//UI(Franchise franchise)
	public UI(Franchise franchise) {
		this.franchise = franchise;
	}
	
	//int prompt()
	public int prompt() {
		System.out.println("1. Total Sales per each week");
		System.out.println("2. Average daily sales for each week");
		System.out.println("3. Total sales for all the weeks");
		System.out.println("4. Average weekly sales");
		System.out.println("5. Week with the highest amount in sales");
		System.out.println("6. Week with the lowest amount in sales");
		System.out.print("Enter a number for analytics on all stores (1-6): ");
		
		Scanner scanner = new Scanner(System.in);
		int ret = scanner.nextInt();
		scanner.close();
		
		return ret;
	}
	
	//woid drive
	public void drive() {
		int selection = this.prompt();
		System.out.println();
		
		
		switch (selection){
			//Total Sales for Week
			case 1: 
				for(int i = 0; i < this.franchise.numberofstores(); i++) {
					System.out.printf("Store %d:\n", i+1);
					for(int j = 0; j < 5; j++)
						System.out.printf("\tWeek %d: %.2f\n", j+1, this.franchise.getStores(i).totalSalesForWeek(j));
				}
				break;
			//Average sales per week
			case 2: 
				for(int i = 0; i < this.franchise.numberofstores(); i++) {
					System.out.printf("Store %d:\n", i+1);
					for(int j = 0; j < 5; j++)
						System.out.printf("\tWeek %d: %.2f\n", j+1, this.franchise.getStores(i).avgSalesForWeek(j)); 
				}
				break;
			//Total Sales for all weeks
			case 3: 
				for(int i = 0; i < this.franchise.numberofstores(); i++)
					System.out.printf("Store %d: %.2f\n", i+1, this.franchise.getStores(i).totalSalesForAllWeeks());
				break;
			//Average sales for all weeks
			case 4:
				for(int i = 0; i < this.franchise.numberofstores(); i++)
					System.out.printf("Store %d: %.2f\n", i+1, this.franchise.getStores(i).avgWeeklySales());
				break;
			//Highest total week sale
			case 5:
				for(int i = 0; i < this.franchise.numberofstores(); i++)
					System.out.printf("Store %d: Week %d had the highest sales.\n", i+1, this.franchise.getStores(i).weekWithHighestSale()+1);
				break;
			//Lowest total week sale
			case 6:
				for(int i = 0; i < this.franchise.numberofstores(); i++)
					System.out.printf("Store %d: Week %d had the lowest sales.\n", i+1, this.franchise.getStores(i).weekWithLowestSale()+1);
				break;
			default:
				System.out.printf("ERROR: %d is not a number between 1 and 6.\n", selection);
				break;
		}
	}
}
