package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends PageObject {

    // find by goes here
    @FindBy(id="keywords")
    private WebElement searchKeywords;

    @FindBy(id="location")
    private WebElement searchLocation;

    @FindBy(id="search-button")
    private WebElement searchButton;


    // constructor goes here
    public MainPage(WebDriver driver) {
        super(driver);
    }

    public boolean isInitialized() {
        return searchKeywords.isDisplayed();
    }

    // page methods go here
    public void enterSearchTerms(String keywords, String location){
        this.searchKeywords.clear();
        this.searchKeywords.sendKeys(keywords);

        this.searchLocation.clear();
        this.searchLocation.sendKeys(location);

        this.searchButton.click();
    }

}
