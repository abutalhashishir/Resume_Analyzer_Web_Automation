package resumeAnalyzer.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import resumeAnalyzer.Base.Base;
import resumeAnalyzer.pages.MyCartPage;
import resumeAnalyzer.pages.PaymentPage;

public class CustomerServicesTest extends Base {
    
	PaymentPage paymentPage;
	public CustomerServicesTest() {
        super();
    }

    public WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = initializeBrowserAndOpenApplicationURL(prop.getProperty("browserName"));
        paymentPage = new PaymentPage(driver);
       
    }

    @AfterClass
    public void tearDown() {
    }

    @Test(priority = 1)
    public void Payment() throws InterruptedException, IOException {
    	MyCartPage myCartPage= new MyCartPage(driver);
    	myCartPage.AddtoCart();
    	Thread.sleep(2000);
    	paymentPage.PaymentOption();
    	paymentPage.paymentProcessUsingRegisterEail();
		Assert.assertTrue(paymentPage.retrivePaymentsuccessMessage().contains(dataProp.getProperty("paymentSuccessfullyHeading")), "payment success is not displayed in the search results");

    }
 
    @Test(priority = 2)
    public void CustomerServiceDashboardContactUs() throws InterruptedException {
    	paymentPage.CustomerServiceProcess();
		Assert.assertTrue(paymentPage.retriveMessagesuccess().contains(dataProp.getProperty("serviceMessageSuccessfullyHeading")), "message success is not displayed in the search results");
    }
    @Test(priority = 3)
    public void messageHistoryTest() throws InterruptedException {
		paymentPage.messageHistoryCheck();
    }
    
}