package com.ITLearn.pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import com.ITLearn.utilities.BrowserData;
import com.ITLearn.utilities.ConfigData;
import com.ITLearn.utilities.ReadExcelFile;

	public class BaseTest {
		public WebDriver driver;
		public ConfigData config = new ConfigData();
		public ReadExcelFile excel;
			
	
	@BeforeSuite
public void setUpSuite()
{
config=new ConfigData();
excel =new ReadExcelFile();
}
@BeforeClass
public void setUp()
{
	System.out.println(config.getBrowser());
	driver=BrowserData.startApplication(driver,config.getBrowser(),config.geturl());
}

@AfterClass
public void tearDown()
{
	driver.close();
}

public void captureScreenshots(WebDriver driver,String testName) throws IOException
{
 // Convert webdriver object to TakesScreenshot interface
 TakesScreenshot screenshot= ((TakesScreenshot)driver);
 
 // Step 2 :call getScreenshotAs method to capture image file
 
 File src= screenshot.getScreenshotAs(OutputType.FILE);
 File srcpath=new File("."+"//Screenshots//"+ testName + ".png");
 
 // Step 3 : copy image file to destination 
 FileUtils.copyFile(src, srcpath);
 
}

}
