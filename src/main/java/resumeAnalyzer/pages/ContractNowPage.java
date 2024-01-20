package resumeAnalyzer.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContractNowPage {
	WebDriver driver;
	
	@FindBy(xpath="//a[@class='btn btn-primary']")
	private WebElement scroll1;
	
	@FindBy(xpath="//a[@class='btn btn-dark rounded-0']")
	private WebElement contractNowBtn;
	
	@FindBy(xpath="//h2[@class='fw-bolder mb-0']")
	private WebElement scroll2;
	
	@FindBy(xpath="//input[@id='id_f_name']")
	private WebElement fristNameField;
	
	@FindBy(xpath = "//input[@id='id_l_name']")
	private WebElement lastNameField;
	
	@FindBy(xpath = "//input[@id='id_email']")
	private WebElement emailField;
	
	@FindBy(xpath = "//textarea[@id='id_msg']")
	private WebElement quesField;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement submitBtn;

	@FindBy(xpath = "//div[contains(text(),'You message has been received successfully')]")
	private WebElement messageSuccessHeading;
	
	public ContractNowPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver,this);	
	}
	public void Message(String firstNameText, String lastNameText, String emailText, String quesText) throws InterruptedException {
		

		JavascriptExecutor js = (JavascriptExecutor) driver;
	    WebElement elementToScrollTo = scroll1;
	    js.executeScript("arguments[0].scrollIntoView(true);", elementToScrollTo);
	    Thread.sleep(2000);
	    contractNowBtn.click();
	    Thread.sleep(2000);
	    JavascriptExecutor js1 = (JavascriptExecutor) driver;
	    WebElement elementToScrollTo1 = scroll2;
	    js1.executeScript("arguments[0].scrollIntoView(true);", elementToScrollTo1);
	    Thread.sleep(2000);
	    fristNameField.sendKeys(firstNameText);
	    Thread.sleep(2000);
	    lastNameField.sendKeys(lastNameText);
	    Thread.sleep(2000);
	    emailField.sendKeys(emailText);
	    Thread.sleep(2000);
	    quesField.sendKeys(quesText);
	    Thread.sleep(2000);
	    submitBtn.click();
	    Thread.sleep(5000);
	    
	   
	}
	public String retriveMessageSuccessMessage() {
		
		String messageSuccessfullyHeadingText = messageSuccessHeading.getText();
		return messageSuccessfullyHeadingText;

	}
}