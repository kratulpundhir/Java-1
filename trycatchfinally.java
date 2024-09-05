import java.util.Scanner;

class trycatchfinally {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 integers to perform a / (b - c)");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result;
        try {
            result = a / (b - c);
        } catch (ArithmeticException ae) {
            System.out.println("Cannot divided by zero." + ae);
        } finally {
            System.out.println("finally block");
        }
        result = a / (b + c);
        System.out.println("Result: " + result);
        sc.close();
    }
}