package fundamentals;

import java.util.Scanner;

// declararea unei constante = i se atribuie public static final
//  TaskExercises.circlePerimeter(); daca tine de clasa se poate accesa prin inermediul clasei, ex. public static void circlePerimeter
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        //static vs non-static fields and methods
      /*  TaskExercises taskExercises1 = new TaskExercises();// nestatic tine de obiect, atunci folosim new
        TaskExercises taskExercises2 = new TaskExercises();
        System.out.println("x = " + taskExercises1.x);
        System.out.println("y = " + taskExercises1.y);
        System.out.println("y = " + taskExercises2.y);
        taskExercises1.x = 22;
        TaskExercises.y = 3;
        System.out.println("x = " + taskExercises1.x);
        System.out.println("x = " + taskExercises2.x);
        System.out.println("y = " + taskExercises1.y);
        System.out.println("y = " + taskExercises2.y);

        //Task1
        taskExercises1.circlePerimeter();

        //Task2
        TaskExercises.bodyMassIndex();

        //Task 3
        TaskExercises.fizzBuzz();
        TaskExercises.fizzBuzz1();

        //Task 4
        TaskExercises.primeNumbers1();
        TaskExercises.primeNumbers2();

        //Task 5
        TaskExercises.fibonacciNumber();

        //Task 6
        TaskExercises.sumOfDigits();

        //Task 7
        TaskExercises.readTexts();

        TaskExercises.readTexts2();


        TaskExercises.readTexts3();
/*
        //Task 8
        TaskExercises.percentageOfOccurrences();

        //Task 9
        TaskExercises.stuttersString();
        TaskExercises.stuttersString2();

        //Task 10
        TaskExercises.printAllPrimeNumbers();


        TaskExercises.testStrings();

       */
        TaskExercises.testObjects();


    }
}
