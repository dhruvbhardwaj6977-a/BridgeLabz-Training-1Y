public class WrapperMethods {
    public static void main(String[] args) {
        int a = Integer.parseInt("123");
        double b = Double.parseDouble("3.14");
        boolean c = Boolean.parseBoolean("true");
        String binary = Integer.toBinaryString(10);
        boolean isDigit = Character.isDigit('5');
        char upper = Character.toUpperCase('a');

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(binary);
        System.out.println(isDigit);
        System.out.println(upper);
    }
}