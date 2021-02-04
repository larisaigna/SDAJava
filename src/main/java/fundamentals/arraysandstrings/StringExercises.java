package fundamentals.arraysandstrings;

//Write a Java program to get the character at the given index within the String
//Write a Java program to test if a given string contains the specified sequence of char values (another string).
//Write a Java program to replace a specified character with another character in a string.
//Write a Java program to uppercase first letter of every word in a text(string).
//Write a Java program to compare 2 strings ignoring case consideration.  (e.g: “Dog” is equal to “dOG”)

import java.util.Scanner;

public class StringExercises {

    public void getCharacterIndex() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input text: ");
        String text = scanner.next();
        System.out.println("Input index: ");
        int index = scanner.nextInt();
        while (index > text.length() - 1) {
            System.out.println("Index doesn't exist within the text. Input another index: ");
            index = scanner.nextInt();
        }
        System.out.println("The character at index " + index + " is: " + text.charAt(index));

    }

    public void specifiedSequence() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input text: ");
        String text = scanner.next();
        System.out.println("Input sequence: ");
        String sequence = scanner.next();
        System.out.println(text.contains(sequence));

    }

    public void replaceCharacter() {
        String string = "Mouse";
        String newString = string.replace('M', 'H');

        System.out.println(newString);
    }

    public void uppercaseLetter() {
        String text = "home sweet home";
        char[] charArray = text.toCharArray();
        boolean foundSpace = true;
        for (int i = 0; i < charArray.length; i++) {
            if (Character.isLetter(charArray[i])) {
                if (foundSpace) {
                    charArray[i] = Character.toUpperCase(charArray[i]);
                    foundSpace = false;
                }
            } else {
                foundSpace = true;
            }
        }
        text = String.valueOf(charArray);
        System.out.println(text);

    }

    public void compareStringsToIgnoreCase() {
        String s1 = "Dog";
        String s2 = "dOG";
        int result = s1.compareToIgnoreCase(s2);
        if (result == 0) {
            System.out.println(s1 + " equals " + s2);
        } else if (result < 0 || result > 0) {
            System.out.println(s1 + " does not equal " + s2);
        }
    }
}

