package TestPackage;


import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.Base;
import PomPages.AmazonHomePage;
import PomPages.AmazonLoginPage2;
import PomPages.AmazonLoginPage3;
import PomPages.AmazonLoginpage1;
import UtilityClass.Utility;

public class Testclass1 extends Base {
	
	
	WebDriver driver;
	AmazonLoginpage1 Login1;
    AmazonLoginPage2 Login2;
    AmazonLoginPage3 Login3;
	AmazonHomePage home;
	org.apache.poi.ss.usermodel.Sheet sh;
	
	
	@BeforeClass
	public void openbrowser() throws EncryptedDocumentException, IOException {
		
		 initializeBrowser();
		 Login1 = new  AmazonLoginpage1(driver);
		 Login2 = new AmazonLoginPage2(driver);
		 Login3 = new AmazonLoginPage3(driver);
		 home = new AmazonHomePage(driver);
	}
	
	@BeforeMethod
	public void loginToApp() throws EncryptedDocumentException, IOException{
	
		
		Login1.Clickonsignin();
		Login2.EnterAmazonLoginPage2Email(Utility.getTD(0, 0));
		Login2.ClickAmazonLoginPage2ContinueBTN();
		Login3.EnterAmazonLoginPage3PWD(Utility.getTD(0, 1));
		Login3.ClickAmazonLoginPage3SigninBtn();
		
		
	}
	
	@Test
	public void VerifyPin() {
		
		home.VerifyAmazonHomePageVerifyAccount();
		
		
	}
	
	@AfterMethod
	public void logoutFromApp() 
	{
		
	}
	
	
	@AfterClass
	public void closeBrowser() 
	{
		driver.close();
		Login1=null;
		Login2=null;
		Login3=null;
		sh=null;
		driver=null;
		home = null;
	}
	
	
	
	}

