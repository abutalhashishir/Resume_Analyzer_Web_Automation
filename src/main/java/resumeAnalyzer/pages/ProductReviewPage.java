package resumeAnalyzer.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProductReviewPage {
	WebDriver driver;
	
	@FindBy(xpath="//h3[@class='text-reset fw-bolder']")
	private WebElement scroll1;
	
	@FindBy(xpath="//a[normalize-space()='Product Review']")
	private WebElement productReviewBtn;
	
	@FindBy(xpath="//select[@id='id_product_liked']")
	private WebElement productLikeBtn;
	
	@FindBy(xpath = "//textarea[@id='id_feedback']")
	private WebElement frrdbackField;
	
	@FindBy(xpath = "//h4[normalize-space()='Section 2: About you']")
	private WebElement scroll2;
	
	@FindBy(xpath="//input[@id='id_first_name']")
	private WebElement fristNameField;
	
	@FindBy(xpath = "//input[@id='id_last_name']")
	private WebElement lastNameField;
	
	@FindBy(xpath = "//input[@id='id_email_address']")
	private WebElement emailField;
	
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement submitBtn;

	@FindBy(xpath = "//div[contains(text(),'Your message submitted successfully!')]")
	private WebElement reviewSuccessHeading;
	
	public ProductReviewPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver,this);	
	}
	public void review(String feedbackText, String firstNameText, String lastNameText, String emailText) throws InterruptedException {
		

		JavascriptExecutor js = (JavascriptExecutor) driver;
	    WebElement elementToScrollTo = scroll1;
	    js.executeScript("arguments[0].scrollIntoView(true);", elementToScrollTo);
	    Thread.sleep(2000);
	    productReviewBtn.click();
	    Thread.sleep(2000);
	    Select productLikedDropdown = new Select(productLikeBtn);
	    productLikedDropdown.selectByVisibleText("Exp180");
	    Thread.sleep(2000);
	    frrdbackField.sendKeys(feedbackText);
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
	    submitBtn.click();
	    Thread.sleep(5000);
	    
	}
	public String retriveReviewSuccessMessage() {
		
		String reviewSuccessfullyHeadingText = reviewSuccessHeading.getText();
		return reviewSuccessfullyHeadingText;

	}
}