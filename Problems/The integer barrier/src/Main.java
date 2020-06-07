import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int limit = 1_000;
        while (sc.hasNext()) {
            int number = sc.nextInt();
            if (sum >= limit) {
                sum -= limit;
                break;
            } else if (number == 0) {
                break;
            }
            sum += number;
        }
        System.out.println(sum);
    }
}