package pages;

import org.openqa.selenium.WebDriver;
import util.Log;

public class WikipediaMainPage extends BaseActionPage {

    private static final String SEARCH_INPUT = "#searchInput";
    private static final String SEARCH_BUTTON = "[class='pure-button pure-button-primary-progressive']";
    private static final String ENGLISH_LANGUAGE_BUTTON = "#js-link-box-en";

    public WikipediaMainPage(WebDriver driver) {
        super(driver);
    }

    public void typeKeyword(String key) {
        Log.info("Enter " + " " + key + " " + "keyword in the search field");
        sendKeys(SEARCH_INPUT, key);
    }

    public void clickOnSearchButton() {
        Log.info("Click on the search button");
        clickElement(SEARCH_BUTTON);
    }

    public void clickOnEnglish() {
        Log.info("Click on English language");
        clickElement(ENGLISH_LANGUAGE_BUTTON);
    }
}
