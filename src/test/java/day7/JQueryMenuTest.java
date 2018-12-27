package day7;

import day4.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class JQueryMenuTest extends BaseTest {

    @Test
    public void test001() {
        driver.get("http://the-internet.herokuapp.com/jqueryui/menu");

        Actions builder = new Actions(driver);

        Action dragAndDrop = builder.moveToElement(driver.findElement(By.id("ui-id-2"))) //move to second avadar

                .moveToElement(driver.findElement(By.id("ui-id-4")))
                .click(driver.findElement(By.id("ui-id-8")))
                .build();

        dragAndDrop.perform();
    }
}
