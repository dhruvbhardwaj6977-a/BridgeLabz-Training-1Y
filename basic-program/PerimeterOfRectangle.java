import java.util.Scanner;

public class PerimeterOfRectangle{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter the length:");
		double length = sc.nextDouble();
		
		System.out.print("enter the width:");
		double width = sc.nextDouble();
		
		
		
		double perimeter = 2*(length + width);
		 
		 System.out.println("perimeter of the rectangle" +perimeter);
		 
		 sc.close();
		}
	}
		
	
	