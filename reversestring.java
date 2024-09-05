import java.util.Scanner;

class reversestring {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string.");
        String str = sc.nextLine();
        String rstr = "";
        for (int i = str.length() - 1; i >= 0; i--)
            rstr = rstr + str.charAt(i);
        System.out.println(rstr);
        sc.close();
    }
}
