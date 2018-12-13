package day5;

import day4.BaseTest;
import org.testng.annotations.Test;

public class XpathTests extends BaseTest {

    @Test
    public void test001() {
        String restID_CSS = "div.MuiFormControl-root-96:nth-child(2) > div:nth-child(2) > input:nth-child(1)";
        String restID_XPath = "/html/body/div/div/form/div/div[1]/div/input";
        String restID_XPath2 = "//form/div/div[1]/div/input";
        String restID_XPath3 = "//input[@name='restaurant_id']";
        String restID_XPath4 = "//*[@name='restaurant_id']";
        String restID_XPath5 = "//*[@name='restaurant_id'][@type='text']";
        String restID_XPath6 = "//*[@name='restaurant_id' and @type='text']";
        String restID_XPath7 = "//*[@name='restaurant_id' or @type='text334234234']";
        String restID_XPath8 = "//*[contains(@name,'rest')]";
        String restID_XPath9 = "//*[starts-with(@name,'rest')]";
        String restID_XPath10 = "//*[text()='Log In']";
        String restID_XPath11 = "(//input[@type='text'])[last()-1]";
        String restID_XPath12 = "(//*[@type='text'])[position()=1]";


        String url = "http://52.9.182.211:3001/v1/log-in";

        openPage(url);



    }
}
