package resumeAnalyzer.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import resumeAnalyzer.Base.Base;
import resumeAnalyzer.pages.ContractNowPage;

public class ContractNowTest extends Base {
    
	ContractNowPage contractNowPage;

	public ContractNowTest() {
        super();
    }

    public WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = initializeBrowserAndOpenApplicationURL(prop.getProperty("browserName"));
        contractNowPage = new ContractNowPage(driver);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void contractNowTest() throws InterruptedException {
    	contractNowPage.Message(dataProp.getProperty("firstName"), dataProp.getProperty("lastName"), dataProp.getProperty("email"), dataProp.getProperty("ques"));
		Assert.assertTrue(contractNowPage.retriveMessageSuccessMessage().contains(dataProp.getProperty("messageSuccessfullyHeading")), "message success is not displayed in the search results");
    }
}