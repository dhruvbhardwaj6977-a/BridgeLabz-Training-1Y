import java.util.Scanner;
public class HandshakeCount{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	System.out.print("enter number of students:");
	int numberOfStudents = sc.nextInt();
	
	int handshakes = (numberOfStudents*(numberOfStudents-1))/2;
	
	System.out.println("the minimum number of possible hand shake is "+handshakes);
	
	sc.close();
	}
	}
	