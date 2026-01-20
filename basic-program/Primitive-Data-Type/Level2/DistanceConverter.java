import java.util.Scanner;

public class DistanceConverter{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	
	System.out.print("enter distance in feet;");
	double distanceinfeet = sc.nextDouble();
	
	double distanceinyards = distanceinfeet/3;
	double distanceinmiles = distanceinyards/1760;
	
	System.out.println("the distance in yard is"+distanceinyards+"while the distance in miles is"+distanceinmiles);
	
	sc.close();
	}
	}