package resumeAnalyzer.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOrderStatusPage {
	WebDriver driver;
	
	@FindBy(xpath="//a[@class='btn btn-secondary']")
	private WebElement scroll1;
	
	@FindBy(xpath="//a[normalize-space()='Check Order Status']")
	private WebElement checkOrderStatusBtn;
	
	@FindBy(xpath="//input[@id='id_tracking_id']")
	private WebElement inputTrackingIdField;
	
	@FindBy(xpath="//input[@id='id_email_add']")
	private WebElement emailField;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement submitBtn;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement scroll2;

	@FindBy(xpath = "//div[contains(text(),'You message has been received successfully')]")
	private WebElement messageSuccessHeading;
	
	public CheckOrderStatusPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver,this);	
	}
	public void CheckOrderStatusPageprocess(String trackingIdText, String emailText) throws InterruptedException {
		

		JavascriptExecutor js = (JavascriptExecutor) driver;
	    WebElement elementToScrollTo = scroll1;
	    js.executeScript("arguments[0].scrollIntoView(true);", elementToScrollTo);
	    Thread.sleep(2000);
	    checkOrderStatusBtn.click();
	    Thread.sleep(2000);
	    inputTrackingIdField.sendKeys(trackingIdText);
	    Thread.sleep(2000);
	    emailField.sendKeys(emailText);
	    Thread.sleep(2000);
	    submitBtn.click();
	    Thread.sleep(2000);
	    JavascriptExecutor js1 = (JavascriptExecutor) driver;
	    WebElement elementToScrollTo1 = scroll2;
	    js1.executeScript("arguments[0].scrollIntoView(true);", elementToScrollTo1);
	    Thread.sleep(5000);
	    
	   
	}
	public String retriveMessageSuccessMessage() {
		
		String messageSuccessfullyHeadingText = messageSuccessHeading.getText();
		return messageSuccessfullyHeadingText;

	}
}