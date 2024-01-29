package resumeAnalyzer.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import resumeAnalyzer.Base.Base;
import resumeAnalyzer.pages.AdhocPage;

public class AdhocTest extends Base {
    
	AdhocPage adhocPage;

	public AdhocTest() {
        super();
    }

    public WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = initializeBrowserAndOpenApplicationURL(prop.getProperty("browserName"));
        adhocPage = new AdhocPage(driver);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void AdhocPageTest() throws InterruptedException {
    	adhocPage.adhocPageFillup();
		Assert.assertTrue(adhocPage.retriveAdhocSuccessMessage().contains(dataProp.getProperty("adhocSuccessfullyHeading")), "Adhoc page success is not displayed in the results");

    }
}