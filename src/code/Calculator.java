package code;

import java.util.Scanner;

public class Calculator {

    // Method for addition
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    // Method for subtraction
    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Method for multiplication
    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // Method for division
    public double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return num1 / num2;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Calculator");
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double result;

        try {
            switch (operator) {
                case '+':
                    result = calculator.add(num1, num2);
                    break;
                case '-':
                    result = calculator.subtract(num1, num2);
                    break;
                case '*':
                    result = calculator.multiply(num1, num2);
                    break;
                case '/':
                    result = calculator.divide(num1, num2);
                    break;
                default:
                    System.out.println("Invalid operator!");
                    return;
            }

            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
