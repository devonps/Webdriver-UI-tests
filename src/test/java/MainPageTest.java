import org.testng.Assert;
import org.testng.annotations.Test;
import webpages.MainPage;

public class MainPageTest extends baseTest {

    public static final String basePageURL = "https://www.totaljobs.com/";
    @Test
    public void enterSearchTerms(){

        driver.get(basePageURL);

        MainPage mainPage = new MainPage(driver);
        Assert.assertTrue(mainPage.isInitialized());

        mainPage.enterSearchTerms("QA", "Nottingham");

        String pageTitle = driver.getTitle();

        Assert.assertTrue(pageTitle.contains("QA Jobs in Nottingham"));

    }
}
