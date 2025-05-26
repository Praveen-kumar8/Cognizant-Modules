public class MethodOverloading {
    public static int sub(int a, int b) {
        return a - b;
    }
    public static int sub(int a, int b, int c) {
        return a - b - c;
    }
    public static double sub(double a, double b) {
        return a - b;
    }
    public static void main(String[] args) {
        System.out.println("Subtraction of two integers: " + sub(150, 7));
        System.out.println("Subtraction of three integers: " + sub(57, 10, 4));
        System.out.println("Subtraction of two doubles: " + sub(57.5, 50.2));
    }
}
