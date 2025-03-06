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
        searchPage1 = new SearchPage1(driver);
        searchPage1.enterproductName("iphone 16e");
        searchPage1.clickSearchButton();
        Thread.sleep(3000);
    }

    @AfterTest
    public void afterTest() {
        common.quitBrowser();
    }





    @Test
    public void searchProductNamelistvalidate() throws InterruptedException {

        searchPage1 = new SearchPage1(driver);

      String searchProductName1 = searchPage1.getproductNameText();

        String searchProductName2 = searchPage1.getResultText();





       // String resultText1 = "1-16 of 962 results for";
     //String expectedResult =


       // String actualResult = searchProductName2 + searchProductName1;
       // System.out.println(searchProductName);
       // Reporter.log(searchProductName);
      //  Reporter.log(actualResult);
      // assertTrue(searchProductName2.equals(resultText1), "Mismatch in the result of list,");

    }
}
