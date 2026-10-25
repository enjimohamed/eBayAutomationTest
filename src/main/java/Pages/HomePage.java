package Pages;

import Driver.BrowserFactory;
import Driver.DriverManager;
import Waits.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
   private By Homepagetitle= By.cssSelector(".gh-logo");
   private By SearchBar= By.id("gh-ac");
   private By SearchButton=By.id("gh-search-btn");
public void NavigatetoeBay(){
   DriverManager.GetDriver().get("https://www.ebay.com/");
}
public String GetHomePageTitle(){
   return Waits.WaittoBeVisible(Homepagetitle).getText();
}
public void SearchForText(String text){
WebElement search=Waits.WaittoBeVisible(SearchBar);
search.clear();
search.sendKeys(text);
Waits.WaittoBeVisible(SearchButton).click();
}

}
