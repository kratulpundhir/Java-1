import java.util.Scanner;

class matrixsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows in matrix.");
        int n = sc.nextInt();
        System.out.println("Enter the number of columns in matrix.");
        int m = sc.nextInt();
        int a[][] = new int[n][m];
        int b[][] = new int[n][m];
        int s[][] = new int[n][m];
        System.out.println("Enter first matrix.");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                a[i][j] = sc.nextInt();
        }
        System.out.println("Enter second matrix.");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                b[i][j] = sc.nextInt();
                s[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("Sum of matrices:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                System.out.print(s[i][j] + " ");
            System.out.println();
        }
        sc.close();
    }
}
