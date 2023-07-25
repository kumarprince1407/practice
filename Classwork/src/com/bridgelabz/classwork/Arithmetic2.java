package com.bridgelabz.classwork;

import java.util.Scanner;

class CalculatorClass {
    double num1;
    double num2;

    public double performOperation(String operation) {
        double result;

        switch (operation) {
            case "add":
                result = num1 + num2;
                break;
            case "sub":
                result = num1 - num2;
                break;
            case "mul":
                result = num1 * num2;
                break;
            case "div":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    return Double.NaN;
                }
                break;
            default:
                System.out.println("Error: Invalid operation.");
                return Double.NaN;
        }

        return result;
    }
}

public class Arithmetic2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the operation (add, sub, mul, div): ");
        String operation = scanner.next();

        Calculator calculator = new Calculator(num1, num2);
        double result = calculator.ArithmeticOperation(operation);

        System.out.println("Result: " + result);
    }
}
