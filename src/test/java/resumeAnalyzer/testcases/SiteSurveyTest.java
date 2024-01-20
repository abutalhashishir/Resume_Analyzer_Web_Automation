package resumeAnalyzer.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import resumeAnalyzer.Base.Base;
import resumeAnalyzer.pages.SiteSurveyPage;

public class SiteSurveyTest extends Base {
	
	SiteSurveyPage siteSurveyPage;

	public SiteSurveyTest() {
        super();
    }

    public WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = initializeBrowserAndOpenApplicationURL(prop.getProperty("browserName"));
        siteSurveyPage = new SiteSurveyPage(driver);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void productReviewTest() throws InterruptedException {
    	siteSurveyPage.SiteSurveyPageprocess(dataProp.getProperty("message"), dataProp.getProperty("fullName"), dataProp.getProperty("email"));
		Assert.assertTrue(siteSurveyPage.surveySuccessMessage().contains(dataProp.getProperty("surveySuccessfullyHeading")), "survey success is not displayed in the search results");

    }
}