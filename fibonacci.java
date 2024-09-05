import java.util.Scanner;

class fibonacci {
    fibonacci() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms.");
        int n = sc.nextInt();
        sc.close();
        System.out.print("0, 1");
        solve(1, 1, 1, (n - 2));
    }

    void solve(int t1, int t2, int i, int n) {
        int s = t1 + t2;
        output(s);
        if (n != 1)
            solve(t2, s, (i + 1), (n - 1));
    }

    void output(int o) {
        System.out.print(", " + o);
    }

    public static void main(String[] args) {
        new fibonacci();
    }
}
