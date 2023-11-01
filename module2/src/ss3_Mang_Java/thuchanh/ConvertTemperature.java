package ss3_Mang_Java.thuchanh;

import java.util.Scanner;

public class ConvertTemperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Fahrenheit to Celcius");
            System.out.println("2. Celcius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice:");
            choice = input.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Enter fahrenheit:");
                    fahrenheit = input.nextDouble();
                    System.out.println("Fahrenheit to Celsius:" + fahrenheitToCelCius(fahrenheit));
                    break;
                }
                case 2: {
                    System.out.println("Enter celcius:");
                    celsius = input.nextDouble();
                    System.out.println("Celcius to Fahrenheit:" + celsiusToFahrenheit(celsius));
                    break;
                }
                case 0:
                    System.exit(0);

            }
        } while (choice != 0);
        
    }

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius +32;
        return fahrenheit;
    }

    public  static double fahrenheitToCelCius(double fahrenheit) {
        double celcius = (5.0 / 9) * (fahrenheit - 32);
        return celcius;
    }
}
