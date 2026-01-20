import java.util.Scanner;

	public class KmToMile{
		public static void main(String[] args){
		
		double km;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("enter distance in kilometer:");
		km = input.nextDouble();
		
		double miles = km/1.6;
		
		System.out.println("the total miles is "+miles+"miles for the given"+km+"km");
		
		input.close();
		}
		}