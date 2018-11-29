package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class YahooSearch {

    WebDriver driver;

    @BeforeSuite
    public void suiteSetup(){
        System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\src\\test\\resources\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Test
    public void testSearch() {
        String queryString = "Portnov School";

        openMainPage();
        typeQuery(queryString);
        submitSearch();
        assertResults();
    }

    private void assertResults() {
       By resultsByCSS = By.cssSelector("#yui_3_10_0_1_1543460928491_407");
       By resultXPath = By.xpath("//*[@id=\"yui_3_10_0_1_1543460928491_407\"]");

       WebElement resultSpanElement = driver.findElement(By.id("results"))
                .findElement(By.className("compPagination")).findElement(By.tagName("span"));


       //waitFor Element to be visible
        Assert.assertTrue(resultSpanElement.isDisplayed());
    }

    private void submitSearch() {
        driver.findElement(By.id("uh-search-box")).submit();
    }

    private void typeQuery(String queryString) {
        driver.findElement(By.id("uh-search-box")).sendKeys(queryString);
    }

    private void openMainPage() {

        driver.get("https://www.yahoo.com/");
    }


}
