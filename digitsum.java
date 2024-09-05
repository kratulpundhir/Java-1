import java.util.Scanner;

public class digitsum {

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer.");
        int n = sc.nextInt();
        sc.close();
        sumdigit(n);
    }

    void sumdigit(int n) {
        int sum = 0;
        while (n > 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        output(sum);
    }

    void output(int sum) {
        System.out.println("Sum of digits of integer = " + sum);
    }

    public static void main(String[] args) {
        digitsum D = new digitsum();
        D.input();
    }
}
