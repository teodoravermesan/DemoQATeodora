package pages;

import org.openqa.selenium.WebDriver;

public class SignInPage extends BaseActionPage {

    private static final String USERNAME = "#wpName1";
    private static final String PASSWORD = "#wpPassword1";
    private static final String LOGIN_BUTTON = "#wpLoginAttempt";
    private static final String ERROR_MESSAGE = "[class='errorbox']";

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public void enterEmail(String email) {
        sendKeys(USERNAME, email);
    }

    public void enterPassword(String password) {
        sendKeys(PASSWORD, password);
    }

    public void clickOnLoginButton() {
        clickElement(LOGIN_BUTTON);
    }

    public String getErrorMessage() {
        return getTextForElement(ERROR_MESSAGE);
    }
}
