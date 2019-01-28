package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Exercise 2.1 Temperature Converter v2

        Scanner temperature = new Scanner(System.in);

        System.out.println("What is the temperature in Fahrenheit?");
        double tempInFahrenheit = temperature.nextInt();

        double tempInCelsius = (tempInFahrenheit - 32) / 1.8;

        System.out.println("The temperature converted to Celsius is " + tempInCelsius);
    }
}
