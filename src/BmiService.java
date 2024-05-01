public class BmiService {
    public double calculateBmi(double height, double weight) {
        double bmi = weight / Math.pow(height, 2);
        return (int) bmi;
    }
}
