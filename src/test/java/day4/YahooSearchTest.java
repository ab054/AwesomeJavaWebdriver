package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class YahooSearchTest extends BaseTest{

    @Test
    public void testSearch() {
        String queryString = "Portnov School";
        String url = "https://www.yahoo.com/";


        openPage(url);
        sendKeysTo(YahooMainPage.searchBox, queryString);
        submitSearch(YahooMainPage.searchBox);
        assertResults();
    }

    //refactor with usage of BaseTest/PageObjectModel
    private void assertResults() {
       By resultsByCSS = By.cssSelector("#yui_3_10_0_1_1543460928491_407");
       By resultXPath = By.xpath("//*[@id=\"yui_3_10_0_1_1543460928491_407\"]");

       WebElement resultSpanElement = driver.findElement(By.id("results"))
                .findElement(By.className("compPagination")).findElement(By.tagName("span"));


       String xpathValue = "//*[@class='compPagination']/span";
       String cssValue = "div.compPagination span";
       By resultsElement = By.xpath(xpathValue);

       explicitWait(driver, By.cssSelector(cssValue));
       Assert.assertTrue(resultSpanElement.isDisplayed());
    }

    public void submitSearch(By element) {
       // gbdgfhndfgndgfnd
    }


}
