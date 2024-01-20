package resumeAnalyzer.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import resumeAnalyzer.Base.Base;
import resumeAnalyzer.pages.CheckOrderStatusPage;

public class CheckOrderStatusTest extends Base {
	CheckOrderStatusPage checkOrderStatusPage;

	public CheckOrderStatusTest() {
        super();
    }

    public WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = initializeBrowserAndOpenApplicationURL(prop.getProperty("browserName"));
        checkOrderStatusPage = new CheckOrderStatusPage(driver);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void productReviewTest() throws InterruptedException {
    	checkOrderStatusPage.CheckOrderStatusPageprocess(dataProp.getProperty("trackingId"), dataProp.getProperty("email"));
    }
}