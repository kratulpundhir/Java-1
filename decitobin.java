import java.util.Scanner;

public class decitobin {

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer.");
        int n = sc.nextInt();
        sc.close();
        decToBinary(n);
    }

    void decToBinary(int n) {
        int[] binaryNum = new int[1000];
        int i = 0;
        while (n > 0) {
            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }
        for (int j = i - 1; j >= 0; j--)
            System.out.print(binaryNum[j]);
    }

    public static void main(String[] args) {
        decitobin D = new decitobin();
        D.input();
    }

}
