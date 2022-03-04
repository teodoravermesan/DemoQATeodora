package pages;

import org.openqa.selenium.WebDriver;

public class ResultWikiPage extends BaseActionPage {

    private static final String PAGE_TITLE = "#firstHeading";
    private static final String HEADER = "#mp-topbanner";

    public ResultWikiPage(WebDriver driver) {
        super(driver);
    }

    public String checkTitle() {
        return getTextForElement(PAGE_TITLE);
    }

    public String checkLanguage() {
        return getTextForElement(HEADER);
    }
}
