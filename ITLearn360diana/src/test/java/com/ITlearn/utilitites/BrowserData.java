package com.ITlearn.utilitites;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserData {
public static WebDriver startApplication(WebDriver driver, String browserName, String url)
	{
	if (browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./Drivers/ChromeDriver.exe");
			driver=new ChromeDriver();
		}
    else if (browserName.equals("Firefox"))
{
  System.setProperty("webdriver.gecko.driver","C://program Files//geckodriver.exe");
  driver = new FirefoxDriver();
}
     else if (browserName.equals("Edge")) 
{
  System.setProperty("WebDriver.edge.driver", "C://msEdgeDriver.exe)");
  driver = new EdgeDriver();
}
     else
  {
    System.out.println("Browser is not supported");
	  }
		
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		return driver;
}
public static void quitBrowser(WebDriver driver)	
{	
		driver.quit();
}
}

