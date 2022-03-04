import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.SignInPage;
import pages.WikipediaMainPage;

public class SignInTest extends BaseTest{

    private WikipediaMainPage wikipediaMainPage;
    private SignInPage signInPage;

    @BeforeMethod
    public void beforeMethod() {
        wikipediaMainPage = new WikipediaMainPage(webDriver);
        signInPage = new SignInPage(webDriver);
    }

    @Test(description = "Sign in with invalid credentials")
    public void testInvalidCredentials() {
        login("teo", "test132324");
        Assert.assertEquals(signInPage.getErrorMessage() , "Incorrect username or password entered. Please try again.");
    }

    @Test(description = "sign in with valid credentisls")
    public void testValidCredentials() {
        login("teovermesan", "Test123456789");
        Assert.assertEquals(wikipediaMainPage.getUsernameText(), "Teovermesan");
    }

    public void login(String username, String password) {
        wikipediaMainPage.loadMainPage();
        wikipediaMainPage.clickOnLogInButton();
        signInPage.enterEmail(username);
        signInPage.enterPassword(password);
        signInPage.clickOnLoginButton();
    }
}
