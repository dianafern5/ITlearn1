package com.ITLearn.pages;
import static org.testng.Assert.assertEquals;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	WebDriver driver;
	 public LoginPage(WebDriver ldriver) {
		 this.driver=ldriver;
		 PageFactory.initElements(driver, this);
	}


	 @FindBy(xpath="//*[@id=\"loginlabel\"]") WebElement loginclick;
	 @FindBy(name="log") WebElement uname;
	 @FindBy(name="pwd") WebElement pass;
	 @FindBy(name="wp-submit") WebElement loginButton;
	 @FindBy(xpath="//*[@id=\"gk-login-toggle\"]/i") WebElement logoutimage;
	 @FindBy(xpath="//*[@id=\"login_drop_panel\"]/div/ul/li[3]/a") WebElement logoutclick;
			
		public void loginPortal(String username,String password)
		{
			System.out.println(username);
			System.out.println(password);
		    loginclick.click();
			uname.sendKeys(username);
			pass.sendKeys(password);
			loginButton.click();
			
			
		}	
		
		public void logout()
		{
			logoutimage.click();
			logoutclick.click();	
			}

	}
		
			
		



	
	
	