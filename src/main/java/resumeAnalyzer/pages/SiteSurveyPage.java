package resumeAnalyzer.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SiteSurveyPage {
	WebDriver driver;
	
	@FindBy(xpath="//a[@class='btn btn-secondary']")
	private WebElement scroll1;
	
	@FindBy(xpath="//a[normalize-space()='Site Survey']")
	private WebElement siteSurveyBtn;
	
	@FindBy(xpath="//input[@id='id_site_used_0']")
	private WebElement Btn1;
	
	@FindBy(xpath="//input[@id='id_site_used_1']")
	private WebElement Btn2;
	
	@FindBy(xpath="//input[@id='id_hmpg_design_0']")
	private WebElement Btn3;
	
	@FindBy(xpath="//input[@id='id_hmpg_design_1']")
	private WebElement Btn4;
	
	@FindBy(xpath="//input[@id='id_hmpg_design_2']")
	private WebElement Btn5;
	
	@FindBy(xpath="//input[@id='id_userfriendly_0']")
	private WebElement Btn6;
	
	@FindBy(xpath="//input[@id='id_userfriendly_1']")
	private WebElement Btn7;
	
	@FindBy(xpath="//input[@id='id_userfriendly_2']")
	private WebElement Btn8;
	
	@FindBy(xpath="//input[@id='id_promo_offers_0']")
	private WebElement Btn9;
	
	@FindBy(xpath="//input[@id='id_promo_offers_1']")
	private WebElement Btn10;
	
	@FindBy(xpath="//input[@id='id_service_lineup_0']")
	private WebElement Btn11;
	
	@FindBy(xpath="//input[@id='id_service_lineup_1']")
	private WebElement Btn12;
	
	@FindBy(xpath="//input[@id='id_service_lineup_2']")
	private WebElement Btn13;
	
	@FindBy(xpath="//input[@id='id_overall_exp_0']")
	private WebElement Btn14;
	
	@FindBy(xpath="//input[@id='id_overall_exp_1']")
	private WebElement Btn15;
	
	@FindBy(xpath="//input[@id='id_overall_exp_2']")
	private WebElement Btn16;
	
	@FindBy(xpath="//input[@id='id_recommend_0']")
	private WebElement Btn17;
	
	@FindBy(xpath="//input[@id='id_recommend_1']")
	private WebElement Btn18;
	
	@FindBy(xpath="//textarea[@id='id_message']")
	private WebElement messageFiled;
	
	@FindBy(xpath="//input[@id='id_name']")
	private WebElement nameField;
	
	@FindBy(xpath="//input[@id='id_email']")
	private WebElement emailField;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement submitBtn;

	@FindBy(xpath = "//li[@class='px-3']")
	private WebElement messageSuccessHeading;
	
	public SiteSurveyPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver,this);	
	}
	public void SiteSurveyPageprocess(String messageText, String fullNameText, String emailText) throws InterruptedException {
		

		JavascriptExecutor js = (JavascriptExecutor) driver;
	    WebElement elementToScrollTo = scroll1;
	    js.executeScript("arguments[0].scrollIntoView(true);", elementToScrollTo);
	    Thread.sleep(2000);
	    siteSurveyBtn.click();
	    Thread.sleep(2000);
	    Btn1.click();
	    Thread.sleep(2000);
	    Btn2.click();
	    Thread.sleep(2000);
	    Btn3.click();
	    Thread.sleep(2000);
	    Btn4.click();
	    Thread.sleep(2000);
	    Btn5.click();
	    Thread.sleep(2000);
	    Btn6.click();
	    Thread.sleep(2000);
	    Btn7.click();
	    Thread.sleep(2000);
	    Btn8.click();
	    Thread.sleep(2000);
	    Btn9.click();
	    Thread.sleep(2000);
	    Btn10.click();
	    Thread.sleep(2000);
	    Btn11.click();
	    Thread.sleep(2000);
	    Btn12.click();
	    Thread.sleep(2000);
	    Btn13.click();
	    Thread.sleep(2000);
	    Btn14.click();
	    Thread.sleep(2000);
	    Btn15.click();
	    Thread.sleep(2000);
	    Btn16.click();
	    Thread.sleep(2000);
	    Btn17.click();
	    Thread.sleep(2000);
	    Btn18.click();
	    Thread.sleep(2000);
	    messageFiled.sendKeys(messageText);
	    Thread.sleep(2000);
	    nameField.sendKeys(fullNameText);
	    Thread.sleep(2000);
	    emailField.sendKeys(emailText);
	    Thread.sleep(2000);
	    submitBtn.click();
	    Thread.sleep(5000);
	   
	}
	public String surveySuccessMessage() {
		
		String messageSuccessfullyHeadingText = messageSuccessHeading.getText();
		return messageSuccessfullyHeadingText;

	}
}