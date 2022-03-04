package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.Log;

public class BaseActionPage {

    protected WebDriver driver;

    protected BaseActionPage(WebDriver driver) {
        this.driver = driver;
    }

    protected void sendKeys(String cssLocator, String text) {
        Log.info("Sending: " + text + " to element: " + cssLocator);
        driver.findElement(By.cssSelector(cssLocator)).sendKeys(text);
    }

    protected void clickElement(String cssLocator) {
        Log.logStart("Waiting until element is clickable " + cssLocator);
        driver.findElement(By.cssSelector(cssLocator)).click();
        Log.logEnd("Waited until element was clickable " + cssLocator);
    }

    protected String getTextForElement(String cssLocator) {
        Log.info("Getting text for element: " + cssLocator);
        return driver.findElement(By.cssSelector(cssLocator)).getText();
    }

    protected void loadUrl(String url) {
        driver.get(url);
    }
}
