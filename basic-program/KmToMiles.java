import java.util.Scanner;

public class KmToMiles{
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

		System.out.print("enter distance in kilometer");
		double kilometer = sc.nextDouble();
		
		double miles = kilometer *0.621371;
		 
		 System.out.println("distance in miles:"+miles);
		 
		 sc.close();
		 
		 }
		 }