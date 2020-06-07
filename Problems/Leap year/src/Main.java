// import java.time.Year;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

//        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
//            System.out.println("Leap");
//        } else {
//            System.out.println("Regular");
//        }
        System.out.println(year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? "Leap" : "Regular");

//        Year year = Year.parse(sc.nextLine());
//        System.out.println(year.isLeap() ? "Leap" : "Regular");
    }
}
