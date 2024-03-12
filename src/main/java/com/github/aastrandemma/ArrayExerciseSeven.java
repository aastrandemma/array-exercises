package com.github.aastrandemma;

import java.util.Arrays;

public class ArrayExerciseSeven {
    public static void getArrayExerciseSeven() {
        getExerciseSeven();
    }
    private static void getExerciseSeven() {
        /* 7. Write a program which will set up an array to hold 10 numbers
        and print out only the uneven numbers. Expected output: Array: 1 2 4 7 9 12 Odd Array: 1 7 9 */
        int[] numbers = {1, 2, 4, 7, 9, 12, 15, 18, 19, 20};
        int totalOfOdd = 0;

        for (int number : numbers) {
            if (number %2 != 0) {
                totalOfOdd++;
            }
        }

        int[] oddArray = new int[totalOfOdd];
        int i = 0;
        for (int number : numbers) {
            if (number % 2 != 0) {
                oddArray[i] = number;
                i++;
            }
        }

        System.out.println("7. Array: " + Arrays.toString(numbers) + " Odd Array: " + Arrays.toString(oddArray));
    }
}