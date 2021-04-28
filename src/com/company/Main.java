package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi! Please input the Exchange Rate:");
        double rate = scanner.nextDouble();

        System.out.println("Please input the sum:");
        double sum = scanner.nextDouble();

        double result = rate * sum;
        System.out.println("Result: " + result);
    }
}
