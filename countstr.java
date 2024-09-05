import java.util.Scanner;

public class countstr {

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String.");
        String str = sc.nextLine();
        sc.close();
        count(str);
    }

    void count(String str) {
        char[] ch = str.toCharArray();
        int letter = 0;
        int space = 0;
        int num = 0;
        int other = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(ch[i])) {
                letter++;
            } else if (Character.isDigit(ch[i])) {
                num++;
            } else if (Character.isSpaceChar(ch[i])) {
                space++;
            } else {
                other++;
            }
        }
        output(letter, space, num, other);
    }

    void output(int letter, int space, int num, int other) {
        System.out.println("letter: " + letter);
        System.out.println("space: " + space);
        System.out.println("number: " + num);
        System.out.println("other: " + other);
    }

    public static void main(String[] args) {
        countstr C = new countstr();
        C.input();
    }
}