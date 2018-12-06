package day4;

import day2.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class YahooSearchTest {

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


       String xpathValue = "";
       String cssValue = "div.compPagination span";
       By resultsElement = By.xpath(xpathValue);

       explicitWait(driver, By.cssSelector(cssValue));
       Assert.assertTrue(resultSpanElement.isDisplayed());
    }

    public void explicitWait(WebDriver driver, By element){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    private void submitSearch() {
        driver.findElement(By.id("uh-search-box")).submit();
    }

    private void typeQuery(String queryString) {
        driver.findElement(By.id("uh-search-box")).sendKeys(queryString);
    }

    private void openMainPage() {
        driver.get("https://www.yahoo.com/");
        Tools.waitForPageLoaded(driver);
    }
}
