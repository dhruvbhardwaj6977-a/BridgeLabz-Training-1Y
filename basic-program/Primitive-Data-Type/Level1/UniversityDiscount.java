import java.util.Scanner;
	public class UniversityDiscount{
	public static void main(String[] args){
	
	double fee;
	double discountPercent;
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("enter student fee:");
	
	fee = input.nextDouble();
	
	System.out.print("enter discount percent:");
	discountPercent =input.nextDouble();
	
	double discount =(fee*discountPercent)/100;
	
	double finalFee = fee-discount;
	
	System.out.println("the discount amount is INR"+discount);
	System.out.print("the final discounted fee is INR"+finalFee);
	
	input.close();
	}
	}
	

	