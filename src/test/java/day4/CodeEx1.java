package day4;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CodeEx1 {

    // given a string
    // check if string is a Palyndrom
    // madam

    @DataProvider(name = "test1")
    public Object[][] createData1() {
        return new Object[][] {
                { "madam" },
                { "asdfadsf"},
        };
    }

    @Test(dataProvider = "test1")
    public void testPalyndromeWithDP(String input) {
        Boolean result = isPalyndrom(input);
        Assert.assertTrue(result);
    }


    @Test()
    public void testPalyndrome001() {
        String input = "madam";
        Boolean result;

        result = isPalyndrom(input);
        Assert.assertTrue(result);
    }

    @Test
    public void testPalyndrome002() {
        String input = "asdfadsf";
        Boolean result;

        result = isPalyndrom(input);
        Assert.assertFalse(result);
    }




    private Boolean isPalyndrom(String input) {
        boolean result;
        String reversedInput = reverseInput(input);
        int resultInt = input.compareToIgnoreCase(reversedInput);

        if(resultInt == 0){
            result = true;
        } else {
            result = false;
        }

        return result;
    }

    private String reverseInput(String input) {
        return new StringBuffer(input).reverse().toString();
    }


}
