import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //creating a error nextDouble() -> yy
        System.out.print("Geben Sie die erste Zahl ein: ");
        double num1 = scanner.nextDoubleyy;

        System.out.print("Geben Sie die zweite Zahl ein: ");
        double num2 = scanner.nextDouble();

        System.out.print("Geben Sie die Operation ein (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        double result;

        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Division durch Null ist nicht erlaubt.");
                    return;
                }
                break;
            default:
                System.out.println("Ungültige Operation.");
                return;
        }

        System.out.println("Ergebnis: " + result);

        scanner.close();
    }
}
