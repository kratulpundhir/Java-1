import java.util.Scanner;

public class sumcheck {
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 integers.");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        sc.close();
        check(x, y, z);
    }

    void check(int x, int y, int z) {
        int c = 0, c1 = 0, c2 = 0, c3 = 0;
        if ((x + y) == z)
            c1 = 1;
        else if ((y + z) == x)
            c2 = 1;
        else if ((x + z) == y)
            c3 = 1;
        else
            c = 1;
        output(c, c1, c2, c3, x, y, z);
    }

    void output(int c, int c1, int c2, int c3, int x, int y, int z) {
        if (c == 1)
            System.out.println("Sum of any two integers is not equals to third integer.");
        else if (c1 == 1)
            System.out.println("Sum of " + x + " & " + y + " is equals to " + z);
        else if (c2 == 1)
            System.out.println("Sum of " + y + " & " + z + " is equals to " + x);
        else if (c3 == 1)
            System.out.println("Sum of " + x + " & " + z + " is equals to " + y);
    }

    public static void main(String[] args) {
        sumcheck S = new sumcheck();
        S.input();
    }
}