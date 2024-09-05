import java.util.Scanner;

class reverse_array {
    reverse_array() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        System.out.println("Enter array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
        rev(a, b, n - 1);
    }

    void rev(int a[], int b[], int n) {
        if (n >= 0) {
            b[b.length - n - 1] = a[n];
            rev(a, b, n - 1);
        } else {
            System.out.print("Reversed Array: ");
            output(b, b.length - 1);
        }
    }

    void output(int b[], int n) {
        if (n >= 0) {
            System.out.print(b[n] + " ");
            output(b, n - 1);
        }
    }

    public static void main(String[] args) {
        new reverse_array();
    }
}
