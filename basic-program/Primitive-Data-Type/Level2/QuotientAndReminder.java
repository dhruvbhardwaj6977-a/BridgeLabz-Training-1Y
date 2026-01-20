import java.util.Scanner;
public class QuotientAndReminder{
	public static void main(String[] args){
	Scanner sc = new Scanner (System.in);
	
	System.out.print("enter first number:");
	int number1 = sc.nextInt();
	
	System.out.print("enter second number:");
	int number2 = sc.nextInt();
	
	int quotient = number1/number2;
	int reminder = number1%number2;
	
	System.out.println("the quotient is"+quotient+
	"and reminder is " +reminder+
	"of two number" +number1+"and"+number2);
	
	sc.close();
	}
	}
	