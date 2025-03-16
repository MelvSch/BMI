package com.BMI;
import java.util.Scanner;

public class BMIrechner_mit_Kontrolle {

    public static void main(String[] args) {

        while (true) {
            try {
                Scanner enter = new Scanner(System.in);

                System.out.println("Größe in Metern, im Format 0,00:");
                double height = enter.nextDouble();
                if (height <= 0 || height > 3) {
                throw new IllegalArgumentException("falsches Format oder Tippfehler.");  }
                
                System.out.println("Gewicht in kg, im Format 0,00:");
                double weight = enter.nextDouble();
                if (weight <= 0 || weight > 650) {
                throw new IllegalArgumentException("falsches Format oder Tippfehler.");  }
               
                double bmi = weight / (height * height);
                double summrun = Math.round(bmi * 100.0) / 100.0;
                System.out.println("Ihr BMI beträgt: " + summrun + "!");
                break; } 
                
                catch (Exception e) {
                System.out.println("Fehler: " + e.getMessage());
                System.out.println("Bitte geben Sie alle Werte richtig ein.");
                System.out.println();
            }
        }
    }
}
