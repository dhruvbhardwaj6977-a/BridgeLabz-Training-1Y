import java.util.Scanner;

public class Palindrome {

    static String getInput(Scanner sc) {
        return sc.nextLine();
    }

    static boolean isPalindrome(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase();
        int left = 0, right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

    static void displayResult(boolean result) {
        if (result)
            System.out.println("Palindrome");
        else
            System.out.println("Not a palindrome");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String input = getInput(sc);

        displayResult(isPalindrome(input));
    }
}