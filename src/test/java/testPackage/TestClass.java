package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestClass {


    RemoteWebDriver driver = new ChromeDriver();
    @Test
    public void test()
    {


            driver.get("https://duckduckgo.com/");
            String ActualTitle = driver.getTitle();
            String ExpectedTitle = ("Google");
            Assert.assertEquals(ActualTitle, ExpectedTitle, "Page title doesn't match");

    }

    @Test
    public void VerifyingLogoisDisplayed()
    {
        driver.get("https://duckduckgo.com/");
        WebElement logo = driver.findElement(By.xpath("//section[@class='header_headerLeft__rW6nD header_headerSection___XMRI']//img"));
        Assert.assertTrue(logo.isDisplayed(),"The logo is not displayed");
    }


    @AfterMethod
    public void tearDown()
    {
        driver.quit();
    }

}
