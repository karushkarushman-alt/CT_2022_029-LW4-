package Q1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Celsius :");
        double celsius = scanner.nextDouble();

        Temperature temperature = new Temperature(celsius);

        System.out.println("The Temperature in degrees Fahrenheit is :" + temperature.toFahrenheit());
    }
}
