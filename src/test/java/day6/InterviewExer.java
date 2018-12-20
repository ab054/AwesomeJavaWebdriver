package day6;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class InterviewExer {

    @Test
    public void test_001() {
        for (int i = 1; i <= 10; i++) {
            if (i%2==0) System.out.println(i);
        }
    }

    @Test
    public void swapTwoNumbersInArray() {
        int[] array = {1,2,3,4};
        swap(array, 1, 2);
        System.out.println(Arrays.toString(array));
    }
    private void swap(int[] array, int indexL, int indexR) {
        int temp = array[indexL];
        array[indexL] = array[indexR];
        array[indexR] = temp;
    }

    @Test
    public void testCountLetters() {
        String input = "hello world";

        int actualResult = getNumberOfLetters(input, 'l');
        int expectedResult = 4;

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCountLetters_001() {
        String input = "$hello world";

        int actualResult = getNumberOfLetters(input, '$');
        int expectedResult = 1;

        Assert.assertEquals(actualResult, expectedResult);
    }

    private int getNumberOfLetters(String input, char letter) {
        int result = 0;

        char[] inputAsArray = input.toCharArray();

        for(char eachChar : inputAsArray){
            if(eachChar== letter) result++;
        }
        return result;
    }


}
