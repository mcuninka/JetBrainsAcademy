import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int i = 0;
        int max = 0;
        while (i < limit) {
            int number = sc.nextInt();
            if (number % 4 == 0 && number > max) {
                max = number;
            }
            i++;
        }
        System.out.println(Math.max(max, limit));
    }
}