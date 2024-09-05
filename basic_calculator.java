import java.util.Scanner;

class basic_calculator {

    basic_calculator() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter the operation(+, -, *, /): ");
        String op = sc.next();
        System.out.print("Enter the second number: ");
        double b = sc.nextDouble();
        sc.close();
        if (op.equals("+") == true && op.equals("-") == true && op.equals("*") == true && op.equals("/") == true)
            operation(a, b, op);
        else
            System.out.println("Invalid operation");
    }

    void operation(double a, double b, String op) {
        switch (op) {
            case "+":
                output(a + b);
                break;
            case "-":
                output(a - b);
                break;
            case "*":
                output(a * b);
                break;
            case "/":
                output(a / b);
                break;
            default:
                break;
        }
    }

    void output(double n) {
        System.out.println("Answer = " + n);
    }

    public static void main(String[] args) {
        new basic_calculator();
    }
}
