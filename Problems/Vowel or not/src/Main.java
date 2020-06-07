import java.util.Scanner;

public class Main {

    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = Character.toLowerCase(scanner.nextLine().charAt(0));
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}
