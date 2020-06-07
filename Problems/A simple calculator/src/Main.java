import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long firstNumber = sc.nextLong();
        String operator = sc.next();
        long secondNumber = sc.nextLong();

        switch (operator) {
            case "+":
                System.out.println(firstNumber + secondNumber);
                break;
            case "-":
                System.out.println(firstNumber - secondNumber);
                break;
            case "*":
                System.out.println(firstNumber * secondNumber);
                break;
            case "/":
                try {
                    System.out.println(firstNumber / secondNumber);
                } catch (ArithmeticException ae) {
                    System.out.println("Division by 0!");
                }
                break;
            default:
                System.out.println("Unknown operator");
                break;
        }
    }
}