import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n1; i++) {
            int n2 = sc.nextInt();
            sum += (n2 % 6 == 0) ? n2 : 0;
        }
        System.out.println(sum);
    }
}