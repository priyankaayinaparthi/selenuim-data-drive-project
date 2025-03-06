package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Common {
    private WebDriver driver;


    public void setuBrowser(String browser, String url) {
        //browser
        if(browser.equalsIgnoreCase("chrome"))
            driver = new ChromeDriver();
        else if(browser.equalsIgnoreCase("firefox"))
            driver = new FirefoxDriver();
        else if(browser.equalsIgnoreCase("edge"))
            driver = new EdgeDriver();
        else {
            System.out.println("valid browser is not provided, hence quitting the automation run");
            System.exit(0);
        }

        //url
        if(url != "Blank")
            driver.get(url);
        else
            driver.get("about:blank");
    }

    public WebDriver getBrowser() {
        return this.driver;
    }

    public void closeTab() {
        this.driver.close();
    }

    public void quitBrowser() {
        this.driver.quit();
    }
}
