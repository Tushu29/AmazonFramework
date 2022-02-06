package BaseClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base {
	
	
	WebDriver driver;
	
	public void initializeBrowser() 
	{
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sai\\eclipse-workspace\\AmazonFramework\\Browsers\\chromedriver.exe");

		driver=new ChromeDriver(options);
		driver.manage().window().maximize();	
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);				
	}
}
	


