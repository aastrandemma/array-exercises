package com.github.aastrandemma;
import java.util.Arrays;

public class ArrayExerciseOneToFour {
    public static void getArrayExerciseOneToFour() {
        getArrayExerciseOne();
        getArrayExerciseTwo();
        getArrayExerciseThree();
        getArrayExerciseFour();
    }
    private static void getArrayExerciseOne() {
        /* 1. Write a program which will store elements in an array of type ‘int’ and print it out.
        Expected output: 11 23 39 etc. */
        int[] numbers = new int[]{11, 23, 39};
        System.out.println("1. " + Arrays.toString(numbers));
    }

    private static void getArrayExerciseTwo() {
        /* 2. Create a program and create a method with name ‘indexOf’ which will find and
        return the index of an element in the array. If the element doesn’t exist
        your method should return -1 as value. Expected output: Index position of number 5 is: 2. */
        int[] numbers = {11, 4500, 39, 157, 326};
        Arrays.sort(numbers);
        int findIndex = 39;
        int index = indexOf(numbers, findIndex);

        if (index >= 0) {
            System.out.println("2. Index position of number " + numbers[index] + " is: " + index);
        } else {
            System.out.println("2. " + findIndex + " is not in the array.");
        }
    }

    private static int indexOf(int[] numbers, int findIndexOf) {
        return Arrays.binarySearch(numbers, findIndexOf);
    }

    private static void getArrayExerciseThree() {
        /* 3. Write a program which will sort string array.
        Expected output: String array: [Paris, London, New York, Stockholm]
        Sort string array: [London, New York, Paris, Stockholm] */
        String[] capitalCities = {"Paris", "London", "New York", "Stockholm"};
        Arrays.sort(capitalCities);
        System.out.println("3. " + Arrays.toString(capitalCities));
    }

    private static void getArrayExerciseFour() {
        /* 4. Write a program which will copy the elements of one array into another array.
        Expected output: Elements from first array: 1 15 20
        Elements from second array: 1 15 20 */
        int[] numbers = {1, 15, 20};
        int[] copyOfNumbers = Arrays.copyOf(numbers,numbers.length);
        System.out.println("4. Original Array: " + Arrays.toString(numbers) + " Copy Of The Original Array: " + Arrays.toString(copyOfNumbers));
    }
}