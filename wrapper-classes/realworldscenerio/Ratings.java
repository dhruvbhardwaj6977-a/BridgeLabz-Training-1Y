import java.util.*;

public class Ratings {
    public static void main(String[] args) {
        int[] arr = {4, 5, 3};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, null, 4));

        ArrayList<Integer> merged = new ArrayList<>();

        for (int i : arr) merged.add(i);
        merged.addAll(list);

        int sum = 0, count = 0;

        for (Integer r : merged) {
            if (Objects.nonNull(r)) {
                sum += r;
                count++;
            }
        }

        System.out.println("Average: " + (sum / (double) count));
    }
}