package com.ITlearn.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
WebDriver driver;

public SearchPage (WebDriver driver)
{
this.driver= driver;
PageFactory.initElements(driver, this);
}

public SearchPage() {
	// TODO Auto-generated constructor stub
}

@FindBy(name="search_course") WebElement searchInput;
@FindBy(xpath="//*[@id=\"primary_menu\"]/nav[1]/form/button") WebElement searchbtn;

public void searchCourse (String courseName) throws InterruptedException
{
	System.out.println(courseName);
	Thread.sleep(5000);
	searchInput.sendKeys(courseName);
	Thread.sleep(5000);
	searchbtn.submit();
	
}}
