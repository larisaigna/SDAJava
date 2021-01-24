package fundamentals;

import java.util.Scanner;

public class TaskExercises {
    public static final float pi = (float) Math.PI; // nu se poate folosi ceva nestatic intr-un context static, adica nu se poate apela din metoda circlePerimeter fara apelativul static
    int x = 10;
    static int y = 1;

    //Write an application that will read diameter of a circle (variable of type float) and
    //calculate perimeter of given circle.
    //Firstly, assume π = 3.14. Later, use value of π from built-in Math class
    public static void circlePerimeter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert diameter: ");
        float diameter = scanner.nextFloat();
        System.out.println("The perimeter has the following value: " + diameter * pi);

    }

    //Write an application calculating BMI (Body Mass Index) and checking if itЀs optimal or not. Your application should read two variables:
    // weight (in kilograms, type float) and height (in centimeters, type int). BMI should be calculated given following formula:
    // weight/height(m)^2 The optimal BMI range is from 18.5 to 24.9, smaller or larger values are non-optimal values.
    // Your program should write "BMI optimal" or "BMI not optimal", according to the assumptions above.
    public static void bodyMassIndex() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert your height (centimeters): ");
        int height = scanner.nextInt();
        System.out.println("Insert your weight (kilograms): ");
        float weight = scanner.nextFloat();
        float bmi = weight / ((float) height * (float) height / 10000);
        System.out.println(bmi);
        if ((bmi >= 18.5) && (bmi <= 24.9)) {
            System.out.println("BMI optimal");
        } else
            System.out.println("BMI not optimal");

    }

    //Write an application that takes a positive number from the user (type int) and writes all numbers from 1
    // to the given number, each on the next line, with the following changes:
    //● in place of numbers divisible by 3, instead of a number the program should print "Fizz"
    // ● in place of numbers divisible by 7, instead of a number the program should write "Buzz"
    // ● if the number is divisible by both 3 and 7, the program should print "Fizz buzz"
    public static void fizzBuzz() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a positive number: ");
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            if ((i % 3 == 0) && (i % 7 == 0)) {
                System.out.println("Fizz buzz");
            } else if (i % 3 == 0) {
                System.out.println("Buzz");
            } else if (i % 7 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }

    // Write an application that takes a positive number from the user (type int) and prints all prime numbers greater
    // than 1 and less than the given number.
    public static void primeNumbers1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a positive number: ");
        int number = scanner.nextInt();
        System.out.println("The prime numbers are: ");
        for(int i = 2; i < number; i++) {
            int counter = 0;
            for (int k = 1; k<=i; k++) {
                if (i % k == 0) {
                  counter++;
                }
            }
            if (counter <= 2){
                System.out.println(i);
            }
        }

    }
    public static void primeNumbers2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a positive number: ");
        int number = scanner.nextInt();
        System.out.println("The prime numbers are: ");
        for (int i = 2; i < number; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0){
                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}
