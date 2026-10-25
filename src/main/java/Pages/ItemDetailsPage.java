package Pages;

import Waits.Waits;
import org.openqa.selenium.By;

public class ItemDetailsPage {
private By ProductTitle= By.cssSelector("h1.x-item-title__mainTitle");
public Boolean isitempagedisplayed(){
    return Waits.WaittoBeVisible(ProductTitle).isDisplayed();
}
}
