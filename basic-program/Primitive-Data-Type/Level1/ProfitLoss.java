class ProfitLoss{
public static void main(String[] args) {
	int costPrice =129;
	int sellingPrice =191;
	
	int profit = sellingPrice-costPrice;
	double profitPercentage = (profit*100.0)/costPrice;
	
	System.out.println(
	"the cost price in INR"+costPrice+"and selling price INR" +sellingPrice+"\n"+
	"the profit is INR "+profit+"and the profit percentage is "+profitPercentage
	);
	}
	}
	