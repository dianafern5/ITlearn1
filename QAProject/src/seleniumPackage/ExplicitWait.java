package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver1.exe");
			// 2. Initialize WebDriver object through ChromeDriver class.
		        WebDriver browserObject = new ChromeDriver();
		      
			// 3. In Explicit Wait we will use WebDriverWait class .This class object is created and the the browserObject and time is initialized to the object
			// Explicit Wait is applied to element in the webpage
		      	WebDriverWait wait=new WebDriverWait(browserObject, 10);
	
		      	browserObject.get("http://google.com");
		      	WebElement("http://www.google.com");
		      	
		      	WebElement gmailLink;
		      	
		      	gmailLink.click();
		      	 gmailLink= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//a[contains(text(),'Gmail')]")));
			      gmailLink.click();
		     //close the browser 
			      
			      browserObject.quit();
	}

		private static void WebElement(String string) {
			// TODO Auto-generated method stub
			
		}

			
		}

}
