import java.util.Scanner;

public class Main {

    public static long factorial(long n) {
        long result = -1;
        if (n == 0 || n == 1) {
            result = 1;
        } else {
            for (int i = 2; i <= n; i++) {
                result = Math.abs(result * i);
            }
        }
        return result;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = Integer.parseInt(scanner.nextLine().trim());
        System.out.println(factorial(n));
    }
}