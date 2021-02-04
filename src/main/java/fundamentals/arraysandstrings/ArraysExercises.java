package fundamentals.arraysandstrings;

//Write a Java program to find maximum product of two integers in a given array of integers.
//Example: nums = { 2, 3, 5, 7, -7, 5, 8, -5 } => Pair is (7, 8), Maximum Product: 56
//Write a Java program to test if an array of strings contains a specific value.
//Write a Java program to remove a specific element from an array.
//Write a Java program to find the max number (harder: the second max number) in an array of integers.
//Write a Java program to find the duplicate values of an array of string values.


import java.util.Arrays;
import java.util.Scanner;

public class ArraysExercises {

    public static void maxProductOfTwoIntegers() {
        int[] arrayNums = {2, 3, 5, 7, -7, 5, 8, -5};
        int n = arrayNums.length;
        Arrays.sort(arrayNums);

        if ((arrayNums[0] * arrayNums[1]) > (arrayNums[n - 1] * arrayNums[n - 2])) {
            System.out.println("Maximum product is: " + arrayNums[0] * arrayNums[1]);
        } else {
            System.out.println("Maximum product is: " + arrayNums[n - 1] * arrayNums[n - 2]);
        }
    }

    public void specificValue() {

        String[] arrays = {"Java", "Fundamentals", "Exercises", "Arrays", "Homework"};
        boolean found = false;
        String searchedValue = "Java";
        for (String s : arrays) {
            if (s.equals(searchedValue)) ;
            found = true;
            break;
        }
        System.out.println(found);
    }

    public void removeElement() {
        String[] array = {"Java", "Fundamentals", "Exercises", "Arrays", "Homework"};
        int size = 4;
        String[] newArray = new String[size];
        int position = 1;

        for (int i = position; i < size; i++) {
            array[i] = array[i + 1];
        }
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
            System.out.println(newArray[i]);
        }
    }

    public void maxAndSecondMaxNumber() {
        int[] arrayNums = {2, 3, 5, 7, -7, 5, 8, -5};
        int max = arrayNums[0];
        int secondmax = arrayNums[0];

        for (int i = 1; i < arrayNums.length; i++) {
            if (arrayNums[i] > max) {
                secondmax = max;
                max = arrayNums[i];
            } else if (arrayNums[i] > secondmax) {
                secondmax = arrayNums[i];
            }

        }
        System.out.println("Max number is: " + max);
        System.out.println("Second max number is: " + secondmax);
    }

    public void duplicateValues() {
        String[] array = {"Java", "Fundamentals", "Exercises", "Arrays", "Homework", "Java", "Arrays"};
        System.out.println("The duplicate value is: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].equals(array[j])) {
                    System.out.println(array[j]);
                }
            }
        }
    }
}


