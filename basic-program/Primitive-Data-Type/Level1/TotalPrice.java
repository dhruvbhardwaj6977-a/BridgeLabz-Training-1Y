import java.util.Scanner;

public class TotalPrice{
	public static void main(String[] args){
	Scanner sc = new Scanner (System.in);
	
	System.out.print("enter unit price:");
	double unitPrice=sc.nextDouble();
	
	System.out.print("enter quantity");
	int quantity = sc.nextInt();
	
	double totalPrice = unitPrice*quantity;
	System.out.println("the total purchase price in INR"+totalPrice+
	"if the quantity"+quantity+"and unit price in INR"+unitPrice);
	
	sc.close();
	}
	}
	
	
	