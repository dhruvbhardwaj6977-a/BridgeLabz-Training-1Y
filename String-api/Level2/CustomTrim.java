import java.util.Scanner;

public class CustomTrim {

    public static int[] findTrimIndexes(String text) {
        int start = 0, end = text.length() - 1;

        while (start <= end && text.charAt(start) == ' ')
            start++;

        while (end >= start && text.charAt(end) == ' ')
            end--;

        return new int[]{start, end + 1};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        int[] indexes = findTrimIndexes(text);
        String custom = text.substring(indexes[0], indexes[1]);
        String builtIn = text.trim();

        System.out.println("Custom: '" + custom + "'");
        System.out.println("Built-in: '" + builtIn + "'");
        System.out.println("Same: " + custom.equals(builtIn));
    }
}
