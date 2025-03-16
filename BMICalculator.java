public class BMICalculator {
    public double calculateBmiMetric(double weight, double height) {
        return weight / (height * height);
    }

    public double calculateBmiImperial(double weight, double height) {
        return (weight / (height * height)) * 703; // 703 is the conversion factor for imperial BMI
    }

    public String getBMICategory(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}
