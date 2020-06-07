import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int max = 0;
        for (int i = 0; i < length; i++) {
            int num = sc.nextInt();
            max = num % 4 == 0 && max < num ? num : max;
        }
        System.out.println(max);
    }
}
