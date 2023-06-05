// Arrays

package lesson3;

import java.util.Arrays ;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] scores = {60, 40, 50};

        Scanner input = new Scanner(System.in);

        System.out.println(Arrays.toString(scores));
//        Arrays.fill(scores, 0);
//        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));

//        for (int i = 0; i < scores.length ;i++) {
//            if(scores[i] < 60) {
//                System.out.println(scores[i]);
//            }
//        }

        for (int score: scores) {
            System.out.println(score);
        }

        String[] names = {"James", "Wisdom", "Emmanuel", "Nike", "Blessing"};

        names[0] = "Bond";

//        names[9] = "Tola"; Array index out of bounds


//        for (String name: names) {
//            System.out.println(name);
//        }

//        String[] students = new String[5];
//
//        System.out.println(Arrays.toString(students));
//
//        int i = 0;
//        while (i < students.length) {
//            students[i] = input.nextLine();
//            i++;
//        }
//
//        System.out.println(Arrays.toString(students));


        // Multidimensional Arrays
        int[][][] matrix = new int[3][3][3];

        matrix[0][0][0] = 3;
        matrix[0][0][1] = 2;
        matrix[0][0][2] = 2;
        matrix[0][1][0] = 2;
        matrix[0][1][1] = 2;
        matrix[0][1][2] = 2;
        matrix[1][1][0] = 2;
        matrix[1][1][1] = 2;
        matrix[1][1][2] = 2;
        matrix[1][2][0] = 2;
        matrix[1][2][1] = 2;
        matrix[1][2][2] = 2;
        matrix[2][0][0] = 2;

    }
}
