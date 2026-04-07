import java.util.ArrayList;

public class SensorLogger {
    static ArrayList<Double> data = new ArrayList<>();

    public static void addData(double value) {
        data.add(value); // auto-boxing
    }

    public static void addData(Double value) {
        data.add(value);
    }

    public static void main(String[] args) {
        addData(25.5);
        addData(Double.valueOf(30.2));

        for (double d : data) {
            System.out.println(d); // auto-unboxing
        }
    }
}