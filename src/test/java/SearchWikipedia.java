import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.ResultWikiPage;
import pages.WikipediaMainPage;
import util.Data;

public class SearchWikipedia extends BaseTest {
    private WikipediaMainPage wikipediaMainPage;
    private ResultWikiPage resultWikiPage;

    @BeforeMethod
    public void beforeMethod() {
        wikipediaMainPage = new WikipediaMainPage(webDriver);
        resultWikiPage = new ResultWikiPage(webDriver);
    }

    @Test(description = "Search word in search text box")
    public void searchTest() {
        wikipediaMainPage.typeKeyword(Data.SEARCH_KEYWORD);
        wikipediaMainPage.clickOnSearchButton();
        Assert.assertEquals(resultWikiPage.checkTitle(), "War");
    }

    @Test(description = "Change wiki language")
    public void changeToEnglish() {
        wikipediaMainPage.clickOnEnglish();
        Assert.assertTrue(resultWikiPage.checkLanguage().contains("English"));
    }
}
