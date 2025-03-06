package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage1 {
    private WebDriver driver;
    @CacheLookup
    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    private WebElement textsearch;

    @CacheLookup
    @FindBy(id = "nav-search-submit-button")
    private WebElement searchbutton;

@CacheLookup
@FindBy(xpath = "//span[contains(text(),'1-16 of 962 results for')]")
private WebElement result;

    public SearchPage1(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterproductName(String productname) {
        textsearch.clear();
        textsearch.sendKeys(productname);
    }


    public void clickSearchButton() {
        searchbutton.click();
    }

    public String getproductNameText() {
        return textsearch.getText();
    }
    public String getResultText() {
        return result.getText();
    }
}
