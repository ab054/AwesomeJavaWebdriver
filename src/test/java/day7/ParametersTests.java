package day7;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTests {

    @Parameters({ "browserName" })
    @Test
    public void testSingleString(String browserName) {
        System.out.println("Invoked testString " + browserName);

    }

    @Parameters({ "browserName" })
    @Test
    public void testSingleString002(String browserName) {
        System.out.println("Invoked testString " + browserName);

    }

}
