package test;

import org.testng.Reporter;
import org.testng.annotations.Test;
import pom.SearchPage1;
import utils.Common;

import static org.testng.Assert.assertTrue;

public class ProductPrice extends BaseTest {

    String SearchName;


    @Test
    public void searchProductName() {
        searchPage1 = new SearchPage1(driver);
        SearchName = searchPage1.enterproductName("iphone 16e");
        searchPage1.clickSearchButton();
        searchPage1.clickFirstProduct();
    }
    @Test(dependsOnMethods = {"searchProductName"})
    public void ClicFirstLink() {
        Object[] windowHandles = driver.getWindowHandles().toArray();
        driver.switchTo().window((String) windowHandles[1]);

        String expectedResult = "₹57,900";
        String actualResult = searchPage1.getPriceText();

        Reporter.log("expected Result : " + expectedResult);
        Reporter.log("actual Result : " + actualResult);

        assertTrue(actualResult.equals(expectedResult), "Mismatch in the price,");

    }

}
