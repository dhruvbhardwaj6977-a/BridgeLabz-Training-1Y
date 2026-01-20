import java.util.Scanner;

public class DistanceConversion{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	System.out.print("enter distance in feet:");
	double distanceInFeet = sc.nextDouble();
	
	double distanceInYards= distanceInFeet/3;
	double distanceInMiles= distanceInYards/1760;
	
	System.out.println("distance in yards is " +distanceInYards);
	System.out.println("distance in miles is " +distanceInMiles);
	
	sc.close();
	}
	}