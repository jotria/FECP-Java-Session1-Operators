package org.example;

import java.util.*;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static float convertToFahrenheit(float celsius){
        return (celsius*((float)9 /5))+32;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        float celsius = scanner.nextFloat();

        float fahrenheitTemp = convertToFahrenheit(celsius);
        System.out.printf("Temperature in Fahrenheit: %.2f%n", fahrenheitTemp);
    }
}