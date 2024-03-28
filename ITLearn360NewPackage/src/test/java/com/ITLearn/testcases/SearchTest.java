package com.ITLearn.testcases;
import org.testng.annotations.Test;
import com.ITLearn.pages.BaseTest;
import com.ITLearn.pages.LoginPage;
import com.ITLearn.pages.SearchPage;
import com.ITLearn.utilities.ReadExcelFile;

public class SearchTest extends BaseTest {
	String fileName=System.getProperty("user.dir")+"\\TestData\\ITlearn360.xlsx";
	
	@Test
	public void verifyLogin()
	{
		LoginPage lp= new LoginPage(driver);
		String username = "Demo12";
		String password = "Test123456$";
			
		lp.loginPortal(username, password);
	}
	@Test (dependsOnMethods="VerifyLogin")
	public void verifySearch() throws InterruptedException
	{
	System.out.println(fileName);
	SearchPage sp= new SearchPage(driver);
	String course= ReadExcelFile.getCellValue(fileName,"Login", 0, 0);
	System.out.println(course);
	sp.searchCourse(course);
	}

}

