package UtilityClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Utility {
	
	

	//Author name: @Tushar Turkane
	//this method is use to get test data from excel sheet
	//need to pass 2 parameters: 1. rowIndex 2. colIndex
	public static String getTD(int rowIndex,int cellIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\sai\\eclipse-workspace\\AmazonFramework\\TestData\\Excel.xlsx");
		 org.apache.poi.ss.usermodel.Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		String value = sh.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
		return value;
	}
	
	//Author name: @Tushar Turkane
	//this method is use to capture Screenshot of a webpage
	//need to pass 2 parameters: 1. driver 2. TestCaseID
	public static void captureScreenshot(WebDriver driver,int TestCaseID) throws IOException 
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("//AmazonFramework//Screenshot"+TestCaseID+".jpg");		
		org.openqa.selenium.io.FileHandler.copy(src, dest);		
	}
	
	
     public static void click(WebDriver driver, WebElement ele) {
		
		Actions act = new Actions(driver);
		act.moveToElement(ele).click().build().perform();

	}

}
