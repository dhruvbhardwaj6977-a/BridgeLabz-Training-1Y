import java.util.Scanner;

public class DoubleOpt{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	System.out.print("enter value of a :");
	double a = sc.nextDouble();
	
	System.out.print("enter value of b:");
	double b = sc.nextDouble();
	
	System.out.print("enter value of c:");
	double c = sc.nextDouble();
	
	double result1 = a+b*c;
	double result2 = a*b+c;
	double result3 = c+a/b;
	double result4 = a%b+c;
	
	System.out.println("thr result of double operation are"+result1+","+result2+","+result3+",and"+result4);
	
	sc.close();
	}
	}