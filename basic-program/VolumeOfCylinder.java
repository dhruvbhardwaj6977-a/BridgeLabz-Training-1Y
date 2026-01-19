import java.util.Scanner;
    

public class VolumeOfCylinder{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the radius of cylinder:");
		double radius = sc.nextDouble();
		
		System.out.println("enter the height of the cyclinder:");
		double height = sc.nextDouble();
		
		double volume = Math.PI * radius * radius * height;
		System.out.printf(" The volume of cyclinder is %.3f%n", volume);
		
		
		sc.close();
		
		}
			}
		