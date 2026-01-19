import java.util.Scanner;

public class SimpleIntrest{
	public static void main(String[] args){
	Scanner sc = new Scanner (System.in);
	
	System.out.println("Enter the principalvalue: ");
	double principal = sc.nextDouble();
	
	System.out.println("Enter the rate:");
	double rate = sc.nextDouble();
	
	System.out.println("Enter the time:");
	double time = sc.nextDouble();
	
	double simple_interest = (principal * rate * time) / 100;
	
	System.out.printf("The simple intrest is %.3f%n", simple_interest);
	
	sc.close();
	}
		}