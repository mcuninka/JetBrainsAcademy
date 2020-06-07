import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean asc = true;
        boolean desc = true;
        int number = scanner.nextInt();
        while (scanner.hasNext()) {
            int nextNumber = scanner.nextInt();
            if (number == 0 || nextNumber == 0) {
                break;
            } else if (nextNumber >= number){
                desc = false;
            } else {
                asc = false;
            }
            number = nextNumber;
        }
        System.out.println(desc || asc);
    }
}
