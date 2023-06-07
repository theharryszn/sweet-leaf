package lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Labels
//        Scanner input = new Scanner(System.in);

//        outer:
//        while(true) {
//            int num = input.nextInt();
//            int i = 0;
//            inner:
//            while(i < num) {
//                System.out.println(i);
//                if(i == 4) {
//                    break outer;
//                }
//                i++;
//            }
//        }

//        int result = sum(20, 40); // 60
//        int result2 = sum(67, 12); // 79
//
//        System.out.println(result);

        int[] arr = {5, 6, 18, 2, 8, 19, 7, 8, 12, 16, 1, 5, 9, 2, 5,  2};

        System.out.println("Mean: " + mean(arr));
        System.out.println("Median: " + median(arr));
        System.out.println("Mode: " + mode(arr));

    }

    static int sum(int a, int b) {
        return a + b;
    }

    static double mean(int[] arr) {
        double total = 0;

        for (int num: arr) {
            total+= num;
        }

        return  total / arr.length;
    }

    static double median(int[] arr) {
        Arrays.sort(arr);

        if(arr.length % 2 == 0) {
            // if there's two middle numbers
            int mid = arr.length / 2;
            int f = arr[mid - 1];
            int s = arr[mid];

            return  (double) (f + s) / 2;
        }else {
            // if there's only one middle number
            int mid = (int) arr.length / 2;

            return  arr[mid];
        }
    }

    static String mode(int[] arr) {
        String mostOccured = ""; int maxCount = 0;

        for (int searchEl : arr) {
            int count = 0;

            for (int i : arr) {
                if (searchEl == i) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                mostOccured = String.valueOf(searchEl);
            }else if(count == maxCount && !mostOccured.contains(String.valueOf(searchEl))) {
                mostOccured += "," + searchEl;
            }
        }

        return mostOccured;
    }
}

// Assignment
// Multiplication
// Division
// Addition
// Subtraction
