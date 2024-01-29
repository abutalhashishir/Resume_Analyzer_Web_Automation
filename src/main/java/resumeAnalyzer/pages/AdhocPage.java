package resumeAnalyzer.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdhocPage {
    
	WebDriver driver;
	
	@FindBy(xpath="//a[@class='fw-bolder nav-link text-white'][normalize-space()='Adhoc']")
	private WebElement adhocBtn;
	
	@FindBy(xpath="//a[@class='btn btn-black text-white text-decoration-none']")
	private WebElement getSartBtn;
	
	@FindBy(xpath="//textarea[@id='id_target_JD_1']")
	private WebElement jobdescriptionsampleField1;
	
	@FindBy(xpath="//textarea[@id='id_target_JD_2']")
	private WebElement jobdescriptionsampleField2;
	
	@FindBy(xpath = "//input[@id='id_resume']")
	private WebElement uploadResume;
	
	@FindBy(xpath = "//textarea[@id='id_ques_details']")
	private WebElement aboutEnquiry;
	
	@FindBy(xpath = "//select[@id='id_why_needed']")
	private WebElement needDropDown;
	
	@FindBy(xpath = "//input[@id='id_f_name']")
	private WebElement fristName;
	
	@FindBy(xpath = "//input[@id='id_l_name']")
	private WebElement lastName;
	
	@FindBy(xpath = "//input[@id='id_email']")
	private WebElement email;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement submitBtn;
	
	@FindBy(xpath = "//li[@class='px-3']")
	private WebElement adhocSuccessHeading;
	
	public AdhocPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver,this);	
	}
	public void adhocPageFillup() throws InterruptedException {
		
		adhocBtn.click();
		Thread.sleep(2000);
		getSartBtn.click();
		Thread.sleep(2000);
		jobdescriptionsampleField1.sendKeys("It job SQA");
		Thread.sleep(2000);
		jobdescriptionsampleField2.sendKeys("SQA Engineer");
	    Thread.sleep(2000);
	    uploadResume.sendKeys("D:\\SQA\\CV\\cvformat.docx");
	    Thread.sleep(2000);
	    aboutEnquiry.sendKeys("how can i get this job");
	    Thread.sleep(2000);
	    Select dropdown = new Select(needDropDown);
	    dropdown.selectByValue("cd02");
	    Thread.sleep(2000);
	    fristName.sendKeys("Abu");
	    Thread.sleep(5000);
	    lastName.sendKeys("Talha");
	    Thread.sleep(2000);
	    email.sendKeys("abutalhashishir02@gmail.com");
	    Thread.sleep(2000);
	    submitBtn.click();
	    Thread.sleep(2000);
	    
	}
	public String retriveAdhocSuccessMessage() {
		
		String adhocSuccessfullyHeadingText = adhocSuccessHeading.getText();
		return adhocSuccessfullyHeadingText;

	}
	
}