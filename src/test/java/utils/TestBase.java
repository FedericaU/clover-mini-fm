package utils;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase {

    public static WebDriver driver;

    @BeforeTest
    public void setUp(){
        driver=Driver.getDriver();
        driver.manage().window().maximize();
        driver.get(ConfigurationReader.getProperty("url"));
    }

  /*  @AfterTest
    public void tearDown(){
        Driver.closeDriver();
    }
*/}
