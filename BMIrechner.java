import java.util.Scanner;

public class BMIrechner {

    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);

        System.out.println("Größe in Metern, im Format 0,00:");
        double height = enter.nextDouble();
        System.out.println("Gewicht in kg, im Format 0,00:");
        double weight = enter.nextDouble();

        double summary = (weight / (height * height));
        double summrun = Math.round(summary);
        System.out.println("Ihr BMI beträgt: " + summrun + "!");
    }
}
