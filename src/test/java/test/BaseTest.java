package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pom.SearchPage1;
import utils.Common;

import static org.testng.Assert.assertTrue;

public class BaseTest {
    public static WebDriver driver;
    Common common;
    String browser = "chrome";
    String url = "https://www.amazon.in/";
    SearchPage1 searchPage1;

    @BeforeTest
    public void beforeTest() throws InterruptedException {
        common = new Common();
        common.setuBrowser(browser, url);
        driver = common.getBrowser();


    }

    @AfterTest
    public void afterTest() {
        common.quitBrowser();
    }

}
