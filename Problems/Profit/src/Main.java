import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double m = scanner.nextInt();
        double p = scanner.nextInt();
        double k = scanner.nextInt();
        int year = 0;
//        int year = (int) Math.ceil(Math.log10(k / m) / Math.log10(1 + p / 100));
        while (m < k) {
            m *= 1 + p / 100;
            year++;
        }
        System.out.println(year);
    }

}