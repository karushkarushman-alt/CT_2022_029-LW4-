package q2;
import Q1.Temperature;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the fahrenheit :");
        double fahrenheit = scanner.nextDouble();

        Temperature temperature = new Temperature();

        temperature.setFahrenheit(fahrenheit);

        System.out.println("The temperature is celsius is :"+temperature.toCelsius());
    }
}
