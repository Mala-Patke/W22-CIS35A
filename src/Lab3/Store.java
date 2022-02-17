package Lab3;

public class Store {
	private float salesByWeek[][];

	Store() {
		salesByWeek = new float[5][7];
	}

	// getter and setters
	// void setsaleforweekday(int week, int day, float sale)
	public void setSaleForWeekDay(int week, int day, float sale) {
		this.salesByWeek[week][day] = sale;
	}
	
	//float getSaleForWeekDay(int week, int day)
	public float getSaleForWeekDay(int week, int day) {
		return this.salesByWeek[week][day];
	}

	//void printdata
	public void printdata() {
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 7; j++)
			{
				System.out.print(salesByWeek[i][j] + " ");
			}
			System.out.println("");
		}
	}
	
	//BusinessMethods
	//float totalSalesForWeek(int week)
	public float totalSalesForWeek(int week) {
		float sum = 0;
		for(int i = 0; i < this.salesByWeek[week].length; i++)
			sum += this.salesByWeek[week][i];
		return sum;
	}
	
	//float avgSalesForWeek(int week)
	public float avgSalesForWeek(int week) {
		return this.totalSalesForWeek(week) / this.salesByWeek[week].length;
	}
	
	//float totalSalesForAllWeeks()
	public float totalSalesForAllWeeks() {
		float total = 0;
		for(int i = 0; i < this.salesByWeek.length; i++)
			total += this.totalSalesForWeek(i);
		return total;
	}
	
	//float avgWeeklySales
	public float avgWeeklySales() {
		return this.totalSalesForAllWeeks() / this.salesByWeek.length;
	}
	
	//int weekWithHighestSale()
	public int weekWithHighestSale() {
		int ret = 0;
		float highest = 0;
		for(int i = 0; i < this.salesByWeek.length; i++) {
			if(this.totalSalesForWeek(i) > highest) {
				ret = i;
				highest = this.totalSalesForWeek(i);
			}
		}
		return ret;
	}
	
	//int weekWithLowestSale
	public int weekWithLowestSale() {
		int ret = 0;
		float lowest = 0;
		for(int i = 0; i < this.salesByWeek.length; i++) {
			if(lowest != 0 && this.totalSalesForWeek(i) < lowest) {
				ret = i;
				lowest = this.totalSalesForWeek(i);
			}
		}
		return ret;
	}
	
	// float [] getsalesforentireweek(int week)
	// float getsaleforweekdayintersection(int week, int day)
	// businessmethod
	// a. totalsalesforweek
	// b. avgsalesforweek
	// c. totalsalesforallweeks
	// d. averageweeklysales
	// e. weekwithhighestsaleamt
	// f. weekwithlowestsaleamt
	// analyzeresults //call a through f
	// print()
}
