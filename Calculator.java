public class Calculator {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        int result1 = add(5, 3);
        int result2 = subtract(10, 4);

        System.out.println("Addition result: " + result1);
        System.out.println("Subtraction result: " + result2);
    }
}
