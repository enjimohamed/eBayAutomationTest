package Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BrowserFactory {

    public static WebDriver GetBrowser(String Browser){
        switch (Browser.toLowerCase()){
            case ("chrome"):
                ChromeOptions ChromeOptions=new ChromeOptions();
                ChromeOptions.addArguments("--start-maximized");
                return new ChromeDriver(ChromeOptions);
            case("edge"):
                EdgeOptions EdgeOptions =new EdgeOptions();
                EdgeOptions.addArguments("--start-maximized");
                return new EdgeDriver(EdgeOptions);
            default:
                return new FirefoxDriver();
        }
    }
}
