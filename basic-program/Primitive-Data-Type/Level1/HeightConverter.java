import java.util.Scanner;
public class HeightConverter{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	System.out.print("enter height in centimeter:");
	double cm = sc.nextDouble();
	
	double totalInches = cm/2.54;
	
	int feet=(int)(totalInches/12);
	double inches = totalInches%12;
	
	System.out.println("your height in cm is:"+cm);
	System.out.println("your height in feet:"+feet+"and inches is:"+inches);
	sc.close();
	}
	}