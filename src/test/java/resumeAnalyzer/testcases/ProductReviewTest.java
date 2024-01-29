package resumeAnalyzer.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import resumeAnalyzer.Base.Base;
import resumeAnalyzer.pages.ProductReviewPage;

public class ProductReviewTest extends Base {
    
	ProductReviewPage productReviewPage;

	public ProductReviewTest() {
        super();
    }

    public WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = initializeBrowserAndOpenApplicationURL(prop.getProperty("browserName"));
        productReviewPage = new ProductReviewPage(driver);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void productReviewTest() throws InterruptedException {
    	productReviewPage.review(dataProp.getProperty("feedback"), dataProp.getProperty("firstName"), dataProp.getProperty("lastName"), dataProp.getProperty("email"));
		Assert.assertTrue(productReviewPage.retriveReviewSuccessMessage().contains(dataProp.getProperty("reviewSuccessfullyHeading")), "review success is not displayed in the search results");
    }
}