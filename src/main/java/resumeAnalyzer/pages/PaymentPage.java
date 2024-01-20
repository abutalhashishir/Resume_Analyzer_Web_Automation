package resumeAnalyzer.pages;


import java.io.IOException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;



public class PaymentPage {
	//D:\\\\SQA\\\\CV\\\\cvformat.docx
	WebDriver driver;

	@FindBy(xpath = "//span[normalize-space()='Item Tax']")
	private WebElement scrolling1;

	@FindBy(xpath = "//a[@id='cart_go_to_fileupload_btn']")
	private WebElement continueBtn;

	@FindBy(xpath = "//input[@id='id_document']")
	private WebElement docUploadOpt;

	@FindBy(xpath = "//button[@value='submit']")
	private WebElement uploadBtn;

	@FindBy(xpath = "//p[normalize-space()='Continue as Registered User']")
	private WebElement scrolling2;

	@FindBy(xpath = "//a[@id='list-profile-list']")
	private WebElement clickUserGuestBtn;

	@FindBy(xpath = "//form[@method='POST']//input[@id='id_email']")
	private WebElement inputEmailField;

	@FindBy(xpath = "//input[@id='id_password']")
	private WebElement inputPasswordField;

	@FindBy(xpath = "//button[normalize-space()='Login & Continue']")
	private WebElement submitAndContinueBtn;

	@FindBy(xpath = "//span[@class='position-absolute top-0 start-50 translate-middle badge rounded bg-primary']")
	private WebElement scrolling3;

	@FindBy(xpath = "//p[@class='fw-bolder']")
	private WebElement scrolling4;
/////////////////
	@FindBys({
		 @FindBy(xpath="//iframe[@class='component-frame visible']"),
		 
	 })
	 
	WebElement paymentFrame1;
	 
	 
	@FindBys({
	     @FindBy(xpath="//div[@aria-label='Debit or Credit Card']"),
	 })
	 WebElement paymentOptionBtn;
	
	
	@FindBys({
	@FindBy(xpath = "//iframe[@class='zoid-visible']"),
	 })
    WebElement paymentFrame2;
	
	@FindBys({
	@FindBy(xpath = "//input[@name='cardnumber']"),
	})
	 WebElement cartNumberField;
	@FindBys({
	@FindBy(xpath = "//input[@name='expiry-date']"), 
	})
	 WebElement expDateField;
	@FindBys({
	@FindBy(xpath = "//input[@name='credit-card-security']"), 
	})
	 WebElement CSCField;
	
	@FindBys({
  	  @FindBy(xpath = "//input[@name='givenName']"), 
	})
	 WebElement bFristNameField;
	
	@FindBys({
	  @FindBy(xpath = "//input[@name='familyName']"), 
	})
	 WebElement bLasstNameField;
	
	@FindBys({
	  @FindBy(xpath = "//input[@name='postcode']"), 
	})
     WebElement bPostalCodeField;
	
	@FindBys({
	  @FindBy(xpath = "//input[@name='phone']"), 
	})
	 WebElement bPhoneNumberField;
	
	@FindBys({
	  @FindBy(xpath = "//input[@name='email']"), 
	})
	 WebElement bEmailField;
	@FindBys({
	  @FindBy(xpath = "//button[@class='css-aezqgw-button-Button']"), })
	 WebElement payNowBtn;
	
	@FindBy(xpath = "//h4[@class='display-3 fw-bolder']")
	private WebElement paymentSuccessHeading;
	
	
	//GuistIfo.
	
	@FindBy(xpath = "//div[@data-bs-target='#helpSix']//p[@class='btn btn-sm btn-outline-primary'][normalize-space()='Continue']")
	private WebElement gustContiueBtn;
	
	@FindBy(xpath ="//form[@action='/cart/checkout/sign-in/mmh/guestlogin']//input[@id='id_email']")
	private WebElement gustEmailField;
	
	@FindBy(xpath ="//button[@value='Submit']")
	private WebElement submitAndContinueGustBtn;
	
	///////////////
	
	@FindBy(xpath ="//a[@class='btn btn-black']")
	private WebElement doneBtn;
	
	@FindBy(xpath ="//span[@class='fs-sm fw-bolder text-primary']")
	private WebElement myAccountDropMenu;
	
	@FindBy(xpath ="//h6[normalize-space()='Profile Home']")
	private WebElement profileBtn;
	
	@FindBy(xpath ="//a[@class='text-reset'][normalize-space()='Contact Us']")
	private WebElement contractUsBtn;
	
	@FindBy(xpath ="//input[@id='id_subject']")
	private WebElement subjectField;
	
	@FindBy(xpath ="//textarea[@id='id_msg']")
	private WebElement messageField;
	
	@FindBy(xpath ="//button[@type='submit']")
	private WebElement submitBtn;
	
	@FindBy(xpath = "//body/main[@class='py-8 py-md-11 bg-gray-200']/div[@class='container-md']/div[@class='row']/div[@class='col-12 col-md-8']/div[@class='card']/div[@class='card-body']/div[@class='row']/div[@class='col']/div[1]")
	private WebElement messageSuccessHeading;
	
	@FindBy(xpath = "//a[normalize-space()='My Message History']")
	private WebElement messagehistoryBtn;
	
	@FindBy(xpath = "//div[@class='list-group list-group-flush']//div[1]//div[1]//div[2]//a[1]")
	private WebElement detailsBtn;

	public PaymentPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	
	public void PaymentOption() throws InterruptedException, IOException {
		 
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement elementToScrollTo = scrolling1;
		js.executeScript("arguments[0].scrollIntoView(true);", elementToScrollTo);
		Thread.sleep(2000);
		continueBtn.click();
		Thread.sleep(2000);
		docUploadOpt.sendKeys("D:\\SQA\\CV\\cvformat.docx");
		Thread.sleep(2000);
		uploadBtn.click();
		Thread.sleep(2000);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		WebElement elementToScrollTo1 = scrolling2;
		js1.executeScript("arguments[0].scrollIntoView(true);", elementToScrollTo1);
		Thread.sleep(2000);
		//clickUserGuestBtn.click();
		//Thread.sleep(2000);
		inputEmailField.sendKeys("abutalhashishir02@gmail.com");
		Thread.sleep(2000);
		inputPasswordField.sendKeys("shishir123");
		Thread.sleep(2000);
		submitAndContinueBtn.click();
		Thread.sleep(2000);
		
		
		
		
		 try {
			 if(paymentFrame1.isDisplayed()) {
					driver.switchTo().frame(paymentFrame1);
					Thread.sleep(2000);
					paymentOptionBtn.click();
					Thread.sleep(2000);
					JavascriptExecutor js2 = (JavascriptExecutor) driver;
			        js2.executeScript("arguments[0].scrollIntoView(true);", paymentFrame2);
			        Thread.sleep(2000);
					driver.switchTo().frame(paymentFrame2);
					Thread.sleep(2000);
				 
			 }
		 }
		 catch(Exception e) {

		 }
}
	public void paymentProcessUsingRegisterEail() throws InterruptedException, IOException {
	 
	 
	 
	 
	 try {
		 if(cartNumberField.isDisplayed()&&expDateField.isDisplayed()) {
			    cartNumberField.sendKeys("4032031956134851");
			    Thread.sleep(2000);
			    expDateField.sendKeys("03/27");
			    Thread.sleep(2000);
			    CSCField.sendKeys("123");
			    Thread.sleep(2000);
			    bFristNameField.sendKeys("Thana");
			    Thread.sleep(2000);
			    bLasstNameField.sendKeys("tos");
			    Thread.sleep(2000);
			    bPostalCodeField.sendKeys("94588");
			    Thread.sleep(2000);
			    bPhoneNumberField.sendKeys("4083516772");
			    Thread.sleep(2000);
			    bEmailField.sendKeys("magumathanatos838@gmail.com");
			    Thread.sleep(2000);
			    payNowBtn.click();
				Thread.sleep(15000);
			    driver.switchTo().defaultContent();
			    Thread.sleep(2000);
			 
		 }
	 }
	 catch(Exception e) {
	
	 }
	}
	
	
	public String retrivePaymentsuccessMessage() {
		
		String paymentSuccessfullyHeadingText = paymentSuccessHeading.getText();
		return paymentSuccessfullyHeadingText;

	}
	
	
	public void CustomerServiceProcess() throws InterruptedException {
		 Thread.sleep(2000);
		 doneBtn.click();
		 Thread.sleep(2000);
		 myAccountDropMenu.click();
		 Thread.sleep(2000);
		 profileBtn.click();
		 Thread.sleep(2000);
		 contractUsBtn.click();
		 Thread.sleep(2000);
		 subjectField.sendKeys("delivery issue");
		 Thread.sleep(2000);
		 messageField.sendKeys("I can't delivery my product. product ID kfdi122sdfd122");
		 Thread.sleep(2000);
		 submitBtn.click();
		 Thread.sleep(2000);
		
	}
	public String retriveMessagesuccess() {
		
		String messageSuccessfullyHeadingText = messageSuccessHeading.getText();
		return messageSuccessfullyHeadingText;
	}
	
	public void messageHistoryCheck() throws InterruptedException {
		 messagehistoryBtn.click();
		 Thread.sleep(2000);
		 detailsBtn.click();
		 Thread.sleep(2000);
		
	}
	
}

