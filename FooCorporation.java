import java.util.Scanner;

class FooCorporation {
    FooCorporation() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hour(s): ");
        double hour = sc.nextDouble();
        sc.close();
        wage(hour);
    }

    void wage(double hour) {
        double pay;
        if (hour > 40) {
            if (hour >= 60)
                hour = 60;
            pay = (40 * 8) + ((hour - 40) * 8 * 1.5);
        } else
            pay = hour * 8;
        output(pay);
    }

    void output(double pay) {
        System.out.println("\nWage: $" + pay);
    }

    public static void main(String args[]) {
        new FooCorporation();
    }
}