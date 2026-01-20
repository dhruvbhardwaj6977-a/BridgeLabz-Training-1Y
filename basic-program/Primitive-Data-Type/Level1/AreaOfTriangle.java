import java.util.Scanner;
public class AreaOfTriangle{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	System.out.print("enter base of triangle:");
	double base = sc.nextDouble();
	
	System.out.print("enter the height of triangle:");
	double height = sc.nextDouble();
	
	double area = 0.5*base*height;
	
	System.out.println("area of triangle is :"+area+"square units");
	
	sc.close();
	}
	}