package resumeAnalyzer.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import resumeAnalyzer.Base.Base;
import resumeAnalyzer.pages.MyCartPage;



public class MyCartTest extends Base {
    
	MyCartPage myCartPage;

	public MyCartTest() {
        super();
    }

    public WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = initializeBrowserAndOpenApplicationURL(prop.getProperty("browserName"));
        myCartPage = new MyCartPage(driver);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void AddToCart() throws InterruptedException {
    	myCartPage.AddtoCart();
		Assert.assertTrue(myCartPage.retriveAddToCartSuccessMessage().contains(dataProp.getProperty("addToCartSuccessfullyHeading")), "Add to Cart Product is not displayed in the search results");
    }
}