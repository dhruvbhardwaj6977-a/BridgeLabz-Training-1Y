import java.util.*;

public class RockPaperScissors {

    public static String computerChoice() {
        String[] options = {"rock", "paper", "scissors"};
        return options[(int)(Math.random() * 3)];
    }

    public static int findWinner(String user, String comp) {
        if (user.equals(comp)) return 0;
        if ((user.equals("rock") && comp.equals("scissors")) ||
            (user.equals("paper") && comp.equals("rock")) ||
            (user.equals("scissors") && comp.equals("paper")))
            return 1;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of games: ");
        int n = sc.nextInt();

        int userWins = 0, compWins = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter choice: ");
            String user = sc.next();
            String comp = computerChoice();

            int result = findWinner(user, comp);

            if (result == 1) userWins++;
            if (result == -1) compWins++;
        }

        System.out.println("User Wins: " + userWins);
        System.out.println("Computer Wins: " + compWins);
        System.out.println("User Win %: " + (userWins * 100.0 / n));
        System.out.println("Computer Win %: " + (compWins * 100.0 / n));
    }
}
