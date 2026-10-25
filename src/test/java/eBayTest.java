import Driver.DriverManager;
import Pages.ItemDetailsPage;
import Pages.HomePage;
import Pages.SearchResultsPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class eBayTest {
    HomePage homepage=new HomePage();
    SearchResultsPage searchresultspage=new SearchResultsPage();
    ItemDetailsPage searchresult=new ItemDetailsPage();
    @BeforeMethod
    public void setup(){
        DriverManager.GetInstance("chrome");
        homepage.NavigatetoeBay();
    }
    @AfterMethod
    public void teardown(){
        DriverManager.QuitDriver();
    }
    @Test
    public void TestingeBay(){
        //Verify that the home page is displayed.
        Assert.assertTrue(homepage.GetHomePageTitle().contains("eBay"),"HOMEPAGE FAILED");
        //Verify that search results are displayed.
        homepage.SearchForText("mazda mx-5");
        Assert.assertTrue(searchresultspage.isSearchResultsPageDisplayed(),"SEARCH RESULT FAILED");
        //Print the number of search results.
        System.out.println("The Number of Search Results "+searchresultspage.NoofSearchResult());
        //Verify that the item details page is displayed.
        searchresultspage.OpenFirstResult();
        Assert.assertTrue(searchresult.isitempagedisplayed());

    }
}
