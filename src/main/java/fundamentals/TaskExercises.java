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

    public static void fizzBuzz1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a positive number: ");
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            if ((i % 3 == 0) && (i % 7 == 0)) {
                System.out.println("Fizz buzz");
                continue;// nu lasa sa mearga la instructiunile de sub, continua la urmatoarea iteratie din for
            }
            if (i % 3 == 0) {
                System.out.println("Buzz");
                continue;
            }
            if (i % 7 == 0) {
                System.out.println("Fizz");
                continue;
            }
            System.out.println(i);

        }
    }


    // Write an application that takes a positive number from the user (type int) and prints all prime numbers greater
    // than 1 and less than the given number.
    public static void primeNumbers1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a positive number: ");
        int number = scanner.nextInt();
        System.out.println("The prime numbers are: ");
        for (int i = 2; i < number; i++) {
            int counter = 0;
            for (int k = 1; k <= i; k++) {
                if (i % k == 0) {
                    counter++;
                }
            }
            if (counter <= 2) {
                System.out.println(i);
            }
        }

    }

    public static void primeNumbers2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a positive number: ");
        int number = scanner.nextInt();
        System.out.println("The prime numbers are: ");
        for (int i = 2; i < number; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }
    }

    // Write an application that will take a positive number from the user (type int) and calculate the Fibonacci number
    // at the indicated index. For example, if the number equals 5, your program should print the fifth Fibonacci number.
    // In Fibonacci sequence, each number is the sum of the two preceding ones.
    public static void fibonacciNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number: ");
        int number = scanner.nextInt();
        int[] myArray = new int[number + 1];

        System.out.println("Fibonnaci sequence is: ");
        for (int i = 0; i < myArray.length; i++) {
            if (i > 1) {
                myArray[i] = myArray[i - 1] + myArray[i - 2];
                System.out.print(myArray[i] + " ");
            } else {
                myArray[i] = i;
                System.out.print(myArray[i] + " ");
            }
        }
        System.out.println("\nFibonacci number at " + number + " index is: " + myArray[number]);
    }

    // Write an application that gets one positive number (type int) from the user and calculates a sum of digits of the
    // given number. Hint: to make some operations on every single digit of the number (digit by digit), you can
    // calculate the remainder of dividing the number by 10 (to get the value of the last digit) and divide the number
    // by 10 (to "move" to the next digit).
    public static void sumOfDigits() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input positive number: ");
        int num = scanner.nextInt();
        int sum = 0;
        do {
            sum = sum + num % 10;
            num = num / 10;

        } while (num > 0);

        System.out.println("The sum of digits is: " + sum);
    }

    // Write an application that will read texts (variables of the String type) until the user gives the text "Enough!"
    // and then writes the longest of the given texts (not including the text "Enough!"). If the user does not provide
    // any text, write "No text provided".
    public static void readTexts() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input text: ");
        String text = " ";
        StringBuilder wholeText = new StringBuilder();

        while (!(text.equals("Enough!"))) {
            text = scanner.next();
            if (!(text.equals("Enough!"))) {
                wholeText.append(text);
                wholeText.append(" ");
            }
        }

        System.out.println("Text: " + wholeText);
        StringBuilder word = new StringBuilder();
        boolean newWord = false;
        int charCounter = 0;
        int max = 0;
        StringBuilder maxWord = new StringBuilder();
        for (int i = 0; i < wholeText.length(); i++) {

            if (wholeText.charAt(i) != ' ') {
                word.append(wholeText.charAt(i));
                charCounter++;
            } else newWord = true;

            if ((newWord == true) || (i == (wholeText.length() - 1))) {
                if (charCounter > max) {
                    max = charCounter;
                    maxWord = word;
                }
                charCounter = 0;
                word = new StringBuilder();
                newWord = false;
            }
        }

        if (max == 0) System.out.println("No text provided ");
        else
            System.out.println("The longest of the given text is: " + maxWord);

    }

    //Write an application that reads a text from the user (type String) and counts a percentage of occurrences of a space
    // character.
    public static void percentageOfOccurrences() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input text: ");
        String text = scanner.nextLine();
        int totalChars = text.length();
        int spaces = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == ' ') {
                ++spaces;
            }
        }
        float spacePercentage = (spaces * (float) 100) / totalChars;
        System.out.println("White spaces: " + spaces);
        System.out.println("Percentage of ocurrences of a space character: " + spacePercentage + " %");

    }
    // Write an application that "stutters", that is, reads the user's text (type String), and prints the given text,
    // in which each word is printed twice. For example, for the input: "This is my test" the application should print
    // "This This is is my my test test".
    public static void stuttersString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input text: ");
        String text = scanner.nextLine();
        StringBuilder wholeText = new StringBuilder();
        StringBuilder word = new StringBuilder();

        boolean newWord = false;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ') {
                word.append(text.charAt(i));
            } else newWord = true;

            if ((newWord == true) || (i == (text.length() - 1))) {
                wholeText.append(word + " " + word + " ");

                word = new StringBuilder("");
                newWord = false;
            }
        }

        System.out.println(wholeText);

    }

    //Write an application that takes a positive number from the user (type int) and prints all prime numbers greater
    // than 1 and less than the given number.
    public static void printAllPrimeNumbers() {
        System.out.println("Input number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number <= 1) {
            System.out.println("The number is not greater than 1 ");
            return; // intrerupem executia metodei, dar nu returnam nimic
        }
        for (int i = 2; i < number; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }

    }

    private static boolean isPrime(int nr) {// private = poate fi folosit doar in clasa respectiva;

        for (int i = 2; i < nr; i++) { // i<=nr/2
            int rest = nr % i;
            if (rest == 0) { // if(nr % i == 0) si nu mai declaram variabila rest
                return false;
            }
        }
        return true;
    }

    private static boolean isPrime1(int nr) {
        boolean isPrimeNo = true;
        for (int i = 2; i <= nr / 2; i++) {
            if (nr % i == 0) {
                isPrimeNo = false;
                break; //cand gaseste un divizor iese din for
            }
        }
        return isPrimeNo;

    }

    private static boolean isPrime2(int nr) {
        boolean isPrimeNo = true;
        for (int i = 2; i <= nr / 2; i++) {
            if (nr % i != 0) {
                continue;
            }
            isPrimeNo = false;
            break;
        }
        return isPrimeNo;

    }
}








