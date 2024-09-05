import java.util.Scanner;

public class sqsum {
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer.");
        int n = sc.nextInt();
        sc.close();
        check(n);
    }

    void check(int n) {
        int c = 0;
        int x = 0, y = 0;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if ((i * i) + (j * j) == n && i != j) {
                    c = 1;
                    x = i;
                    y = j;
                }
            }
        }
        output(c, x, y, n);
    }

    void output(int c, int x, int y, int n) {
        if (c == 1)
            System.out.println("Sum of squares x=" + x + " & y=" + y + " is equals to " + n);
        else
            System.out.println("There are no 2 numbers whose sum of squares is equals to " + n);
    }

    public static void main(String[] args) {
        sqsum S = new sqsum();
        S.input();
    }
}