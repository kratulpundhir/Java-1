import java.util.*;

class lowerstr {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to lowercase.");
        String S = sc.nextLine();
        System.out.println("String in lowercase: " + S.toLowerCase());
        sc.close();
    }
}
