package resumeAnalyzer.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyCartPage {
	WebDriver driver;
	
	@FindBy(xpath="//a[@class='fw-bolder nav-link ms-n3 text-white']")
	private WebElement exp180Btn;
	
	@FindBy(xpath="//a[@class='btn btn-white shadow']")
	private WebElement seeTheServiceListBtn;
	
	@FindBy(xpath="//a[normalize-space()='Format your resume']")
	private WebElement productBtn;
	
	@FindBy(xpath="//h2[@class='fs-sm fs-3']")
	private WebElement scrolling;
	
	@FindBy(xpath = "//p[@class='mb-0 fw-bold']//input[@id='1']")
	private WebElement serviceOption1;
	
	@FindBy(xpath = "//p[@class='mb-0 fw-bold']//input[@id='2']")
	private WebElement serviceOption2;
	
	@FindBy(xpath = "//section[@class='py-6 py-md-6 bg-gray-200']//input[2]")
	private WebElement deliveryOption2;
	
	@FindBy(xpath = "//button[@class='card-link btn btn-primary btn-xs rounded-1']")
	private WebElement addToCartBtn;
	
	@FindBy(xpath = "//a[@class='link-white px-2 h6 text-decoration-none'][normalize-space()='Promo Offers']")
	private WebElement scrolling2;
	
	@FindBy(xpath = "//a[@class='navbar-btn btn btn-primary btn-sm ms-auto fs-sm']")
	private WebElement myCartBtn;
	
	@FindBy(xpath = "//h1[@class='py-3 fw-bolder mb-0']")
	private WebElement addToCartSuccessHeading;
	
	public MyCartPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver,this);	
	}
	public void AddtoCart() throws InterruptedException {
		
		exp180Btn.click();
		Thread.sleep(2000);
		seeTheServiceListBtn.click();
		Thread.sleep(2000);
		productBtn.click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    WebElement elementToScrollTo = scrolling;
	    js.executeScript("arguments[0].scrollIntoView(true);", elementToScrollTo);
	    Thread.sleep(2000);
	    serviceOption1.click();
	    Thread.sleep(2000);
	    serviceOption2.click();
	    Thread.sleep(2000);
	    deliveryOption2.click();
	    Thread.sleep(2000);
	    addToCartBtn.click();
	    Thread.sleep(5000);
	    JavascriptExecutor js1 = (JavascriptExecutor) driver;
	    WebElement elementToScrollTo1 = scrolling2;
	    js1.executeScript("arguments[0].scrollIntoView(true);", elementToScrollTo1);
	    Thread.sleep(5000);
	    myCartBtn.click();
	    Thread.sleep(2000);		
	}
	public String retriveAddToCartSuccessMessage() {
		
		String addToCartSuccessfullyHeadingText = addToCartSuccessHeading.getText();
		return addToCartSuccessfullyHeadingText;

	}
}
