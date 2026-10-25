package Driver;

import org.openqa.selenium.WebDriver;
import static org.testng.Assert.fail;
public class DriverManager {
    private static ThreadLocal<WebDriver> Threadlocal = new ThreadLocal<>();

    public static void SetDriver(WebDriver driver) {
        Threadlocal.set(driver);
    }

    public static WebDriver GetDriver() {
        if (Threadlocal.get() == null) {
            fail("Driver is null");
        }
        return Threadlocal.get();
    }

    public static void GetInstance(String browser) {
        WebDriver driver = BrowserFactory.GetBrowser(browser);
        SetDriver(driver);
    }

    public static void QuitDriver() {
        WebDriver driver = Threadlocal.get();
        if (driver != null) {
            driver.quit();
            Threadlocal.remove();
        }
    }
}