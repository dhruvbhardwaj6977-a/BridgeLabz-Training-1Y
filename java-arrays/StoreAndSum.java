import java.util.Scanner;

public class StoreAndSum {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double[] numbers = new double[10];   // a. Array of 10
        double total = 0.0;
        int index = 0;
        
        // b. Infinite loop
        while (true) {
            
            System.out.print("Enter a positive number (0 or negative to stop): ");
            double input = sc.nextDouble();
            
            // c. Stop if 0 or negative
            if (input <= 0) {
                break;
            }
            
            // d. Stop if array is full
            if (index == 10) {
                break;
            }
            
            // e. Store value
            numbers[index] = input;
            index++;
        }
        
        // f. Calculate total
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }
        
        // Show all numbers
        System.out.println("\nNumbers Entered:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
        }
        
        // g. Display total
        System.out.println("Total = " + total);
        
        sc.close();
    }
}
