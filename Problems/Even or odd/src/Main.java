import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int number = sc.nextInt();
            if (number == 0) {
                break;
            }
            System.out.println(number % 2 == 0 ? "even" : "odd");
        }
    }
}