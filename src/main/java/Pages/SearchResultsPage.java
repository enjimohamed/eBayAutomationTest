package Pages;

import Driver.DriverManager;
import Waits.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class SearchResultsPage {
    private By SearchResult= By.id("srp-results-heading");
    private By ResultCount=By.cssSelector(".s-card.s-card--horizontal.s-card--pagination-below");
    private By FirstProduct=By.cssSelector("span.su-styled-text.primary.default");
   public Boolean isSearchResultsPageDisplayed(){
           return Waits.WaittoBeVisible(SearchResult).isDisplayed();
       }


   public int NoofSearchResult(){

       Waits.WaitstoPresent(ResultCount);
       return DriverManager.GetDriver().findElements(ResultCount).size();
       }

   public void OpenFirstResult(){
       for (WebElement product : DriverManager.GetDriver().findElements(FirstProduct)) {
           if (product.isDisplayed()) {
               product.click();
               break;
           }
       }

       String currentwindow=DriverManager.GetDriver().getWindowHandle();
      Waits.WaitForNumberOfWindows(2);
       Set<String> allwindows=DriverManager.GetDriver().getWindowHandles();
           for(String window:allwindows){
               if(!window.equals(currentwindow)){
                   DriverManager.GetDriver().switchTo().window(window);
                   break;
               }
           }
   }

}
