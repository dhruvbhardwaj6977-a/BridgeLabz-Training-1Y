import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];   // a. Define array
        
        // Take user input
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }
        
        System.out.println("\nNumber Analysis:");
        
        // b & c. Loop and check conditions
        for (int i = 0; i < numbers.length; i++) {
            
            if (numbers[i] > 0) {
                if (numbers[i] % 2 == 0) {
                    System.out.println(numbers[i] + " is Positive and Even.");
                } else {
                    System.out.println(numbers[i] + " is Positive and Odd.");
                }
            } 
            else if (numbers[i] < 0) {
                System.out.println(numbers[i] + " is Negative.");
            } 
            else {
                System.out.println(numbers[i] + " is Zero.");
            }
        }
        
        // d. Compare first and last element
        if (numbers[0] == numbers[4]) {
            System.out.println("\nFirst and Last elements are Equal.");
        } 
        else if (numbers[0] > numbers[4]) {
            System.out.println("\nFirst element is Greater than Last element.");
        } 
        else {
            System.out.println("\nFirst element is Less than Last element.");
        }
        
        sc.close();
    }
}