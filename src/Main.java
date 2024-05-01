//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 88;
        double height = 1.8;
        double bmiIndex = service.calculateBmi(height, weight);

        System.out.printf("Ваш индекс массы тела:" + bmiIndex);

    }
}