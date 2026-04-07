public class Scoreboard {
    public static void main(String[] args) {
        Integer[] scores = {100, null, 200, null, 50};

        int total = 0, notPlayed = 0;

        for (Integer s : scores) {
            if (s == null)
                notPlayed++;
            else
                total += s;
        }

        System.out.println("Not played: " + notPlayed);
        System.out.println("Total score: " + total);
    }
}