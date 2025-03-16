import java.util.Scanner;

public class UserInput {
    private final Scanner scanner;

    public UserInput() {
        scanner = new Scanner(System.in);
    }

    public double obtainWeight(String unitSystem) {
        System.out.print("Enter your weight in " + (unitSystem.equalsIgnoreCase("METRIC") ? "kilograms" : "pounds") + ": ");
        return scanner.nextDouble();
    }

    public double obtainHeight(String unitSystem) {
        System.out.print("Enter your height in " + (unitSystem.equalsIgnoreCase("METRIC") ? "meters" : "inches") + ": ");
        return scanner.nextDouble();
    }

    public void closeScanner() {
        scanner.close();
    }
}
