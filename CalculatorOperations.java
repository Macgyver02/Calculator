import java.util.Scanner;

public class CalculatorOperations {
    public static void performAddition(Scanner scanner) {
        double a = InputHelper.getDoubleInput(scanner, "Enter first number: ");
        double b = InputHelper.getDoubleInput(scanner, "Enter second number: ");
        System.out.printf("Addition result: %.4f%n", a + b);
    }

    public static void performSubtraction(Scanner scanner) {
        double a = InputHelper.getDoubleInput(scanner, "Enter first number: ");
        double b = InputHelper.getDoubleInput(scanner, "Enter second number: ");
        System.out.printf("Subtraction result: %.4f%n", a - b);
    }

    public static void performMultiplication(Scanner scanner) {
        double a = InputHelper.getDoubleInput(scanner, "Enter first number: ");
        double b = InputHelper.getDoubleInput(scanner, "Enter second number: ");
        System.out.printf("Multiplication result: %.4f%n", a * b);
    }

    public static void performDivision(Scanner scanner) {
        double a = InputHelper.getDoubleInput(scanner, "Enter first number: ");
        double b = InputHelper.getDoubleInput(scanner, "Enter second number: ");
        if (b == 0) {
            System.out.println("Error: Division by zero");
        } else {
            System.out.printf("Division result: %.4f%n", a / b);
        }
    }

    public static void performSine(Scanner scanner) {
        double a = InputHelper.getDoubleInput(scanner, "Enter angle in radians: ");
        System.out.printf("Sine result: %.4f%n", Math.sin(a));
    }

    public static void performCosine(Scanner scanner) {
        double a = InputHelper.getDoubleInput(scanner, "Enter angle in radians: ");
        System.out.printf("Cosine result: %.4f%n", Math.cos(a));
    }

    public static void performTangent(Scanner scanner) {
        double a = InputHelper.getDoubleInput(scanner, "Enter angle in radians: ");
        System.out.printf("Tangent result: %.4f%n", Math.tan(a));
    }

    public static void performSquareRoot(Scanner scanner) {
        double a = InputHelper.getDoubleInput(scanner, "Enter number: ");
        System.out.printf("Square root result: %.4f%n", Math.sqrt(a));
    }

    public static void performCubeRoot(Scanner scanner) {
        double a = InputHelper.getDoubleInput(scanner, "Enter number: ");
        System.out.printf("Cube root result: %.4f%n", Math.cbrt(a));
    }

    public static void performPower(Scanner scanner) {
        double base = InputHelper.getDoubleInput(scanner, "Enter base: ");
        double exponent = InputHelper.getDoubleInput(scanner, "Enter exponent: ");
        System.out.printf("Power result: %.4f%n", Math.pow(base, exponent));
    }

    public static void performDifferentiation(Scanner scanner) {
        System.out.println("Enter coefficients of the polynomial (ax^2 + bx + c):");
        double a = InputHelper.getDoubleInput(scanner, "a: ");
        double b = InputHelper.getDoubleInput(scanner, "b: ");
        double c = InputHelper.getDoubleInput(scanner, "c: ");
        System.out.printf("Derivative: %.2fx + %.2f%n", 2 * a, b);
    }

    public static void performIntegration(Scanner scanner) {
        System.out.println("Enter coefficients of the polynomial (ax + b):");
        double a = InputHelper.getDoubleInput(scanner, "a: ");
        double b = InputHelper.getDoubleInput(scanner, "b: ");
        System.out.printf("Integral: %.2fx^2 + %.2fx + C%n", a / 2, b);
    }
}