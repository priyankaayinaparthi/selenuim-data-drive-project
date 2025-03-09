package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import pom.SearchPage1;
import org.testng.annotations.BeforeMethod;
import utils.Common;

import java.time.Duration;
import java.util.List;


import static org.testng.Assert.assertTrue;

public class SearchPage extends BaseTest {
    String SearchName;


    @Test
    public void searchProductName() {
        searchPage1 = new SearchPage1(driver);
        SearchName = searchPage1.enterproductName("iphone 16e");
        searchPage1.clickSearchButton();
    }

    @Test(dependsOnMethods = {"searchProductName"})
    public void searchProductNamelistvalidate() throws InterruptedException {

        String expectedResult = "iphone 16e";
        // String actualResult = searchPage1.getproductNameText();
        String actualResult = SearchName;


        Reporter.log("expected Result : " + expectedResult);
        Reporter.log("actual Result : " + actualResult);

        assertTrue(actualResult.equals(expectedResult), "Search the Product is mismatch,");

    }

    @Test(dependsOnMethods = {"searchProductName"})
    public void testSearchForValidate() throws InterruptedException {
        int expectedCount = 20;
        searchPage1 = new SearchPage1(driver);
        List<WebElement> actualProducts = searchPage1.getProductlist();

        int actualCount = actualProducts.size();

        Reporter.log("expected Result : " + expectedCount);
        Reporter.log("actual Result : " + actualCount);
        assertTrue(actualCount == expectedCount, "The number of products displayed does not match the expected count.");

    }

}
