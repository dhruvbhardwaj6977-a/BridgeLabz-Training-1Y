import java.util.Scanner;

public class BMIProgram {

    // Method to calculate BMI and Status
    public static String[][] calculateBMI(double[][] data) {
        String[][] result = new String[10][4];

        for (int i = 0; i < 10; i++) {
            double weight = data[i][0];
            double heightMeter = data[i][1] / 100.0;
            double bmi = weight / (heightMeter * heightMeter);

            String status;
            if (bmi < 18.5)
                status = "Underweight";
            else if (bmi < 24.9)
                status = "Normal";
            else if (bmi < 29.9)
                status = "Overweight";
            else
                status = "Obese";

            result[i][0] = String.valueOf(data[i][1]);
            result[i][1] = String.valueOf(weight);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = status;
        }
        return result;
    }

    // Display Method
    public static void display(String[][] result) {
        System.out.printf("%10s %10s %10s %15s\n", "Height(cm)", "Weight(kg)", "BMI", "Status");
        for (String[] person : result) {
            System.out.printf("%10s %10s %10s %15s\n", person[0], person[1], person[2], person[3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2];

        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1));
            System.out.print("Enter Weight (kg): ");
            data[i][0] = sc.nextDouble();
            System.out.print("Enter Height (cm): ");
            data[i][1] = sc.nextDouble();
        }

        String[][] result = calculateBMI(data);
        display(result);
    }
}
