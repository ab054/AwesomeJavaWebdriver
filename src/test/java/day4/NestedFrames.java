package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NestedFrames extends BaseTest {

    By iframeById = By.id("mce_0_ifr");
    By editorById = By.id("tinymce");
    By middleFrameContent = By.id("content");

    String frameTop = "frame-top";
    String frameMiddle = "frame-middle";


    @Test
    public void testIframe() {
        String url = "http://the-internet.herokuapp.com/tinymce";
        String inputMessageToType = "Text from Selenium";

        openPage(url);
        switchToIframe();
        clearEditor();
        sendKeysTo(editorById, inputMessageToType);

        String actualTextFromEditor = getTextFromElement(editorById);
        Assert.assertEquals(actualTextFromEditor, inputMessageToType);
    }

    @Test
    public void testNestedFrames() {
        String url = "http://the-internet.herokuapp.com/nested_frames";

        openPage(url);
        switchToIframeByName(frameTop);
        switchToIframeByName(frameMiddle);

        String actualTextOfMiddleElement = getTextFromElement(middleFrameContent);
        String expectedTextMiddleElement = "MIDDLE";

        Assert.assertEquals(actualTextOfMiddleElement, expectedTextMiddleElement);
    }

    private void clearEditor() {
        WebElement editor = driver.findElement(editorById);
        editor.clear();
    }

    public void switchToIframe() {
        WebElement iframeEl = driver.findElement(iframeById);
        driver.switchTo().frame(iframeEl);
    }

    public void switchToIframeByName(String frameName) {
        driver.switchTo().frame(frameName);
    }
}
