package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonLoginPage3 {
	 WebDriver driver;
	@FindBy(xpath = "//input[@type='password'] ")
	private WebElement PWD;

	
	@FindBy(xpath = "//input[@id='signInSubmit']")
	private WebElement SigninBtn;
	
	
	public AmazonLoginPage3(WebDriver driver ) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void EnterAmazonLoginPage3PWD(String s1) {
		
		PWD.sendKeys(s1);
	}
	
	public void ClickAmazonLoginPage3SigninBtn() {
		
		SigninBtn.click();
	}
}
