public class AgeValidation {
    public static boolean isValidAge(String age) {
        try {
            int a = Integer.parseInt(age);
            return a >= 18;
        } catch (Exception e) {
            return false;
        }
    }
}