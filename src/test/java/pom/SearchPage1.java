package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchPage1 {

    private WebDriver driver;

    @CacheLookup
    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    private WebElement textsearch;

    @CacheLookup
    @FindBy(id = "nav-search-submit-button")
    private WebElement searchbutton;

    @CacheLookup
    @FindBy(xpath = "//h2[@class='a-size-medium a-spacing-none a-color-base a-text-normal']")
    private List<WebElement> productList;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'results for')]")
    private WebElement resulttext;


    @CacheLookup
    @FindBy(xpath = "(//span[@data-a-color='base'])[3]")
    private WebElement price;

    public SearchPage1(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String enterproductName(String productname) {
       textsearch.clear();
        textsearch.sendKeys(productname);


        return productname;
    }


    public void clickSearchButton() {
        searchbutton.click();
    }

   /* public String getproductNameText() {
        return textsearch.getDomAttribute("value");
    }*/

    public String getResultText() {
        return resulttext.getText();
    }

    public List<WebElement> getProductlist() {
        return productList;
    }


    public void clickFirstProduct() {
        if (productList.size() > 0) {
            productList.get(0).click();
        }
    }

    public String getPriceText() {
        return price.getText();
    }
}
