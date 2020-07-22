package Helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class BasePage {
    public static WebDriver driver;
    public String testURL = "http://www.swtestacademy.com/";

    public static void SelectDriver(String driverName) {
        switch (driverName)
        {
            case "Firefox":
                driver = new FirefoxDriver();
                break;
            case "IE":
                driver = new InternetExplorerDriver();
                break;
            case "Chrome":
            default:
                driver = new ChromeDriver();
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--enable-popup-blocking");
                break;
        }
        driver.manage().window().maximize();
    }

    public static void OpenWebSite(String driverName)
    {
        driver.navigate().to(driverName);
    }

    public static void Action(WebElement target)
    {
        Actions actions = new Actions(driver);
        actions.moveToElement(target).perform();
    }

    public static void QuitDriver()
    {
        driver.quit();
    }
}
