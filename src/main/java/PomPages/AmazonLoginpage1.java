package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilityClass.Utility;

public class AmazonLoginpage1 {
	
    WebDriver driver;
	
   
    
    // space added
	@FindBy(xpath ="(//a[@class='nav-a nav-a-2   nav-progressive-attribute'])[1]")
	private WebElement Hellosignin;
	
	
	public AmazonLoginpage1( WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver , this );
	}
	
	public void Clickonsignin() {
		
		
		
		Utility.click(driver, Hellosignin);
	
	 
	}

}
