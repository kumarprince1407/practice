package com.bridgelabz.classwork;

import java.util.*;

class Calculator {
    private double num1;
    private double num2;

    public Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double ArithmeticOperation(String choice) {
        double result;

        switch (choice) {
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

public class Arithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the 1st number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter the 2nd number: ");
        double num2 = sc.nextDouble();

        System.out.print("Select the operation that you want to perform: Available choices- add, sub, mul, div: ");
        String choice = sc.next();

        Calculator calculator = new Calculator(num1, num2);
        double result = calculator.ArithmeticOperation(choice);

        System.out.println("Result: " + result);
    }
}
