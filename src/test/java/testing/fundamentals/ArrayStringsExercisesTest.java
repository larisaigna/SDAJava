package testing.fundamentals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static org.assertj.core.api.Assertions.assertThat;

public class ArrayStringsExercisesTest {
    @Test
    void shouldReplaceSpaceInString() {
// Given
        String inputText = "We are testing this text";
        String expectedResult = "We:are:testing:this:text";
        ArrayStringsExercises arrayStringsExercises = new ArrayStringsExercises();
// When
        String actualResult = arrayStringsExercises.changeSpaceInString(inputText);
// Then
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldAppendLength() {
//Given
        String inputText = "TextLength";
        String expectedResult = "TextLength10";
        ArrayStringsExercises arrayStringsExercises = new ArrayStringsExercises();
//When
        String actualResult = arrayStringsExercises.appendLength(inputText);
        System.out.println("Actual result = " + actualResult);
//Then
        assertEquals(expectedResult, actualResult);
        assertThat(actualResult).endsWith("10");
    }

    @Test
    void shouldReplaceEvenNumbers() {
//Given
        int[] array = {1, 2, 4, 5, 6};
        int[] expectedArray = {1, 1, 2, 5, 3};
        ArrayStringsExercises arrayStringsExercises = new ArrayStringsExercises();
//When
        int[] resultArray = arrayStringsExercises.replaceEvenNumbers(array);
//Then
        assertArrayEquals(expectedArray, resultArray);
    }

    @Test
    void shouldFindMinElement() {
//Given
        int[] array = {2, 3, 4, 1, 5, 6};
        int expectedResult = 3;
        ArrayStringsExercises arrayStringsExercises = new ArrayStringsExercises();
//When
        int actualResult = arrayStringsExercises.findMinPositionElement(array);
//Then
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturnDefaultValueForEmptyArray() {
//Given
        int[] array = {};
        int expectedResult = -1;
        ArrayStringsExercises arrayStringsExercises = new ArrayStringsExercises();
//When
        int actualResult = arrayStringsExercises.findMinPositionElement(array);
//Given
        assertEquals(expectedResult, actualResult);
    }
    //Daca sunt mai multe elemente egale cu min, sa ne returneeze ultima pozitie a elementului respectiv
}