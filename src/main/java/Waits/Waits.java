
package Waits;

import Driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waits {

    public static WebElement WaitstoPresent(By locator) {
        return new WebDriverWait(
                DriverManager.GetDriver(),
                Duration.ofSeconds(10)
        ).until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public static WebElement WaittoBeVisible(By locator) {
        return new WebDriverWait(
                DriverManager.GetDriver(),
                Duration.ofSeconds(10)
        ).until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static WebElement WaittoBeClickable(By locator) {
        return new WebDriverWait(
                DriverManager.GetDriver(),
                Duration.ofSeconds(10)
        ).until(ExpectedConditions.elementToBeClickable(locator));
    }
    public static boolean WaitForNumberOfWindows(int windows) {
        return new WebDriverWait(
                DriverManager.GetDriver(),
                Duration.ofSeconds(10)
        ).until(ExpectedConditions.numberOfWindowsToBe(windows));
    }
}
