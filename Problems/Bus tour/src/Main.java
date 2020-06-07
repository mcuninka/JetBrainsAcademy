import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int heightOfBus = scanner.nextInt();
        int numberOfBridges = scanner.nextInt();
        boolean result = false;
        int index = 0;

        for (int i = 0; i < numberOfBridges; i++) {
            int heightOfBridge = scanner.nextInt();
            if (heightOfBus >= heightOfBridge) {
                result = true;
                index = i + 1;
                break;
            }
        }
//        if (result) {
//            System.out.println("Will crash on bridge " + index);
//        } else {
//            System.out.println("Will not crash");
//        }
        System.out.println(result ? "Will crash on bridge " + index : "Will not crash");
    }
}