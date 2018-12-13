package day5;

import day4.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ListsTests extends BaseTest {

    @Test
    public void test001() {
        List<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
    }


    @Test
    public void test002() {
        String url = "http://52.9.182.211:3001/v1/log-in";
        openPage(url);

        String restID_XPath4 = "//*[@name='restaurant_id']";
        String restID_XPath5 = "//*[@name='email']";


        WebElement element1 = driver.findElement(By.xpath(restID_XPath4));
        WebElement element2 = driver.findElement(By.xpath(restID_XPath5));

        List<WebElement> listOfElements = new ArrayList<WebElement>();

        listOfElements.add(element1);
        listOfElements.add(element2);
    }


    @Test
    public void test003() {
        driver.findElements(By.tagName("input")).get(0).sendKeys("123123");
    }
}
