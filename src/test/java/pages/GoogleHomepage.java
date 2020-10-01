package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class GoogleHomepage {
    public GoogleHomepage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "input[name='q']")
    public WebElement searchBox;

    @FindBy(xpath = "//div[@class='uEierd']//a[@class='Krnil']/div[@role='heading']/span[1]")
    public WebElement firstResult;
}
