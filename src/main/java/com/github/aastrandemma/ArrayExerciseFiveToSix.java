package com.github.aastrandemma;

public class ArrayExerciseFiveToSix {
    public static void getArrayExerciseFiveToSix() {
        getArrayExerciseFive();
        getArrayExerciseSix();
    }
    private static void getArrayExerciseFive() {
        /* 5. Create a two-dimensional string array [2][2]. Assign values to the
        2-dimentional array containing any Country and City.
        Expected output: France Paris
                         Sweden Stockholm */
        String[][] capitalCountry = new String[2][2];
        capitalCountry[0][0] = "France";
        capitalCountry[0][1] = "Paris";
        capitalCountry[1][0] = "Sweden";
        capitalCountry[1][1] = "Stockholm";

        System.out.println("5. ");

        for (int i = 0; i < capitalCountry.length; i++) {
            for (int j = 0; j < capitalCountry[i].length; j++) {
                System.out.print(capitalCountry[i][j] + " ");
            }
            System.out.println("\n");
        }
    }

    private static void getArrayExerciseSix() {
        /* 6. Write a program which will set up an array to hold the next values
        in this order: 43, 5, 23, 17, 2, 14 and print the average of these 6 numbers.
        Expected output: Average is: 17.3 */
        int[] values = {43, 5, 23, 17, 2, 14};
        int numberOfValues = values.length;
        int sum = 0;

        for (int value : values) {
            sum += value;
        }

        double average = (double) sum / numberOfValues;
        System.out.println("6. Average is: " + String.format("%.1f", average));
    }
}