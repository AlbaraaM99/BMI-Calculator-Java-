import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserInput userInput = new UserInput();
        BMICalculator bmiCalculator = new BMICalculator();

        // Ask user for the measurement system
        System.out.print("Do you want to use METRIC or IMPERIAL units? ");
        String unitSystem = scanner.nextLine().toUpperCase();

        double weight = userInput.obtainWeight(unitSystem);
        double height = userInput.obtainHeight(unitSystem);
        double bmi;

        // Calculate BMI based on unit system
        if (unitSystem.equals("METRIC")) {
            bmi = bmiCalculator.calculateBmiMetric(weight, height);
        } else if (unitSystem.equals("IMPERIAL")) {
            bmi = bmiCalculator.calculateBmiImperial(weight, height);
        } else {
            System.out.println("Invalid unit system! Please choose either METRIC or IMPERIAL.");
            return;
        }

        // Get BMI Category
        String category = bmiCalculator.getBMICategory(bmi);

        // Display the result
        System.out.printf("Your BMI is: %.2f%n", bmi);
        System.out.println("BMI Category: " + category);

        userInput.closeScanner();
    }
}
