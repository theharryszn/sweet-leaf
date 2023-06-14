package lesson6;

import java.util.Scanner;

public class Assignment {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to the arithmetic calculator");

        System.out.println("What would you like to do?");
        System.out.println("1. Addition \n2. Subtraction \n3. Division \n4. Multiplication");

        System.out.print("Select an Option: ");
        int option = input.nextInt();

        System.out.println("Now enter the operands");
        System.out.print("Enter first operand: ");
        double operand1 = input.nextInt();
        System.out.print("Enter second operand: ");
        double operand2 = input.nextInt();

        double result = 0;

        switch (option) {
            case 1 -> result = add(operand1, operand2);
            case 2 -> result = sub(operand1, operand2);
            case 3 -> result = divide(operand1, operand2);
            case 4 -> result = mult(operand1, operand2);
            default -> {
                System.out.println("Invalid Option");
                System.exit(0);
            }
        }

        System.out.println("The result of the operation is " + result);
    }

    public static double add(double a, double b) {
        System.out.println("Addition +");
        return a + b;
    }

    public static double sub(double a, double b) {
        System.out.println("Subtraction - ");
        return a - b;
    }

    public static double divide(double a, double b) {
        System.out.println("Division /");
        return a / b;
    }

    public static double mult(double a, double b) {
        System.out.println("Multiplication * ");
        return a * b;
    }
}
