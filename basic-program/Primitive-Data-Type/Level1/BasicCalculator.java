import java.util.Scanner;
public class BasicCalculator{
	public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	
	System.out.print("enter the first number:");
	double number1 = sc.nextDouble();
	
	System.out.print("enter the second number:");
	double number2 = sc.nextDouble();
	
	double addition = number1 + number2;
	double subtraction = number1-number2;
	double multipication = number1*number2;
	double division = number1/number2;
	
	System.out.println("addition is :"+addition);
	System.out.println("subtraction is:"+subtraction);
	System.out.println("multipication is:"+multipication);
	System.out.println("division is:"+division);
	
	sc.close();
	}
	}
	
	