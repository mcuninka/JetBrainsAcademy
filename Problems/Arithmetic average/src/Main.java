import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        int max = sc.nextInt();
        double sum = 0;
        double count = 0;
        for (int i = min; i <= max; i++) {
            if (i % 3 == 0) {
                count++;
                sum += i;
            }
        }
        System.out.println(sum / count);
    }
}
