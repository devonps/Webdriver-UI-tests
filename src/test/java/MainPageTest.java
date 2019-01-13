import org.testng.Assert;
import org.testng.annotations.Test;
import webpages.MainPage;

public class MainPageTest extends baseTest {

    @Test
    public void enterSearchTerms(){
        driver.get("https://www.totaljobs.com/");

        MainPage mainPage = new MainPage(driver);
        Assert.assertTrue(mainPage.isInitialized());

        mainPage.enterSearchTerms("QA", "Nottingham");

    }
}
