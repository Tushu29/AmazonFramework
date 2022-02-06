package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePage {
	WebDriver driver;
	@FindBy(xpath = " (//span[@class='nav-line-1 nav-progressive-content'])[2]")
	private WebElement VerifyAccount ;
	
	
	public AmazonHomePage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void VerifyAmazonHomePageVerifyAccount() {
		
		String ExpecText = "Hello, Tushar";
		
	String actText =	VerifyAccount.getText();
	
	if(actText.equals(ExpecText)) {
		
		System.out.println("Test Case Pass Account Verified ");
	}
	else {
		
		System.out.println("Test Case fail Account Verified ");
	}
	}

}
