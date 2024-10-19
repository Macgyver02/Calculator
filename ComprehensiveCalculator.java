import java.util.Scanner;

public class ComprehensiveCalculator {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the Comprehensive Calculator!");

        while (true) {
            displayMenu();
            int choice = InputHelper.getIntInput(scanner, "Enter your choice: ");

            if (choice == 0) {
                System.out.println("Thank you for using the Comprehensive Calculator. Goodbye!");
                break;
            }

            performOperation(choice);
        }

        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("\nAvailable operations:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Sine");
        System.out.println("6. Cosine");
        System.out.println("7. Tangent");
        System.out.println("8. Square Root");
        System.out.println("9. Cube Root");
        System.out.println("10. Power");
        System.out.println("11. Differentiation (simple polynomial)");
        System.out.println("12. Integration (simple polynomial)");
        System.out.println("0. Exit");
    }

    private static void performOperation(int choice) {
        switch (choice) {
            case 1:
                CalculatorOperations.performAddition(scanner);
                break;
            case 2:
                CalculatorOperations.performSubtraction(scanner);
                break;
            case 3:
                CalculatorOperations.performMultiplication(scanner);
                break;
            case 4:
                CalculatorOperations.performDivision(scanner);
                break;
            case 5:
                CalculatorOperations.performSine(scanner);
                break;
            case 6:
                CalculatorOperations.performCosine(scanner);
                break;
            case 7:
                CalculatorOperations.performTangent(scanner);
                break;
            case 8:
                CalculatorOperations.performSquareRoot(scanner);
                break;
            case 9:
                CalculatorOperations.performCubeRoot(scanner);
                break;
            case 10:
                CalculatorOperations.performPower(scanner);
                break;
            case 11:
                CalculatorOperations.performDifferentiation(scanner);
                break;
            case 12:
                CalculatorOperations.performIntegration(scanner);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
}