package lesson2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner input = new Scanner(System.in);

        System.out.println("Multiplication Table");

        System.out.print("Enter the start number: ");
        int start = input.nextInt();
        System.out.print("Enter the end number: ");
        int end = input.nextInt();

        for (; start <= end; start++) {
            System.out.println("Multiples of " + start);
            for (int i = 1; i <= 12; i++) {
                System.out.println(start + " X " + i + " = " + start * i);
            }
        }
    }
}