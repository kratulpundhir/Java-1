import java.util.Scanner;

class factorial {

    factorial() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        if (n > 0)
            solve(n, n);
        else
            output(1);
    }

    void solve(int n, int f) {
        if (n > 1)
            solve((n - 1), (f * (n - 1)));
        else
            output(f);
    }

    void output(int f) {
        System.out.println("The factorial = " + f);
    }

    public static void main(String[] args) {
        new factorial();
    }
}
