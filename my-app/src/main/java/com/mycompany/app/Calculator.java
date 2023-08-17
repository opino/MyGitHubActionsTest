import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geben Sie die erste Zahl ein: ");
        double num1 = scanner.nextDoubleyyy();

        System.out.print("Geben Sie die zweite Zahl ein: ");
        double num2 = scanner.nextDouble();

        System.out.print("Geben Sie die Operation ein (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        double result = calculate(num1, num2, operation);

        if (Double.isNaN(result)) {
            System.out.println("Ungültige Operation oder Division durch Null.");
        } else {
            System.out.println("Ergebnis: " + result);
        }

        scanner.close();
    }

    public static double calculate(double num1, double num2, char operation) {
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
                    result = Double.NaN; // Spezieller Wert für ungültige Berechnung
                }
                break;
            default:
                result = Double.NaN;
        }

        return result;
    }
}
