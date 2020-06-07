import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int number;
        do {
            number = sc.nextInt();
            count++;
        } while (number != 0);
        System.out.println(count-1);
    }
}
