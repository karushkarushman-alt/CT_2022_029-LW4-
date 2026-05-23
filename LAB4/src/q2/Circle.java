package q2;
import java.util.Scanner;

class Temperature {
    private double fahrenheit;
    private double celsius;

    // Method to set Fahrenheit temperature
    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
        this.celsius = (fahrenheit - 32) * 5 / 9;
    }

    // Method to get Celsius temperature
    public double getCelsius() {
        return celsius;
    }
}

