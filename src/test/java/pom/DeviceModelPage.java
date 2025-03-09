package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeviceModelPage {

    WebDriver driver;


    @CacheLookup
    @FindBy(xpath = "(//span[contains(@class,'a-size-base po-break-word')])[1]")
    private WebElement brandElement;

    @CacheLookup
    @FindBy(xpath = "(//span[contains(@class,'a-size-base po-break-word')])[2]")
    private WebElement osElement;

    @CacheLookup
    @FindBy(xpath = "(//span[contains(@class,'a-size-base po-break-word')])[3]")
    private WebElement memoryStorageElement;

    @CacheLookup
    @FindBy(xpath = "(//span[contains(@class,'a-size-base po-break-word')])[4]")
    private WebElement screenSizeElement;
    @CacheLookup
    @FindBy(xpath = "(//span[contains(@class,'a-size-base po-break-word')])[5]")
    private WebElement modelNameElement;

    public DeviceModelPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    // Method to get device details from the page
    public String getBrand() {
        return brandElement.getText();
    }

    public String getOperatingSystem() {
        return osElement.getText();
    }

    public String getMemoryStorage() {
        return memoryStorageElement.getText();
    }

    public String getScreenSize() {
        return screenSizeElement.getText();
    }

    public String getModelName() {
        return modelNameElement.getText();
    }


}
