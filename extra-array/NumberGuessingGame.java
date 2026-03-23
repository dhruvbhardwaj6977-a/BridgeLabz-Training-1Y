import java.util.Scanner;

public class NumberGuessingGame {

    static int getNextGuess(int low, int high) {
        return (low + high) / 2; // binary search approach
    }

    static String getFeedback(Scanner sc) {
        System.out.print("Enter feedback (high/low/correct): ");
        return sc.next().toLowerCase();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = 1, high = 100;

        while (true) {
            int guess = getNextGuess(low, high);
            System.out.println("Computer guesses: " + guess);

            String feedback = getFeedback(sc);

            if (feedback.equals("correct")) {
                System.out.println("Yay! Computer guessed correctly.");
                break;
            } else if (feedback.equals("high")) {
                high = guess - 1;
            } else if (feedback.equals("low")) {
                low = guess + 1;
            }
        }
    }
}