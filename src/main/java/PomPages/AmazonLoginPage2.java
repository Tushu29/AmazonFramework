package PomPages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonLoginPage2 {
	 WebDriver driver;
	 
	@FindBy(xpath = "//input[@type='email'] ")
	private WebElement Email;
	
	@FindBy(xpath = "//input[@id='continue']")
	private WebElement ContinueBTN;
	
	public AmazonLoginPage2(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void EnterAmazonLoginPage2Email(String s) {
		
		Email.sendKeys(s);
	}
	
	public void ClickAmazonLoginPage2ContinueBTN() {
		
		ContinueBTN.click();
	}
}
