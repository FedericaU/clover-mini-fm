package tests;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.GoogleHomepage;
import utils.ConfigurationReader;
import utils.TestBase;

public class SearchTest extends TestBase {

    GoogleHomepage googleHomepage=new GoogleHomepage();
    String firstResult="Clover POS System Deals (2020) - Free Clover System with Signup";

    @Test
    public void search(){
        googleHomepage.searchBox.sendKeys(ConfigurationReader.getProperty("searchItem"));
        googleHomepage.searchBox.sendKeys(Keys.ENTER);
        Assert.assertEquals(googleHomepage.firstResult.getText(),firstResult);

    }
}
