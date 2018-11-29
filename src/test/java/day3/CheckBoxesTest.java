package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CheckBoxesTest {

    WebDriver driver;

    By checkBox1 = By.cssSelector("#checkboxes > input:nth-child(1)");


    @BeforeSuite
    public void suiteSetup(){
        System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\src\\test\\resources\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }


    @Test
    public void testCheckBoxes() {
        String windowsPageURL = "http://the-internet.herokuapp.com/checkboxes";

        navigateToURL(windowsPageURL);
        clickOnFirstCheckBox();
        assertCheckBoxChecked();
    }

    private void assertCheckBoxChecked() {
        WebElement checkBoxElement = driver.findElement(checkBox1);
        Boolean isSelected = checkBoxElement.isSelected();
        String checkedAttribute = checkBoxElement.getAttribute("checked");

        Assert.assertNotNull(checkedAttribute);
        Assert.assertTrue(checkedAttribute.equals("true"));
        Assert.assertTrue(isSelected);
    }

    private void clickOnFirstCheckBox() {
        driver.findElement(checkBox1).click();
    }

    private void navigateToURL(String URL) {
        driver.get(URL);
    }
}