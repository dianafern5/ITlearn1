package com.ITLearn.testcases;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ITLearn.pages.LoginPage;
import com.ITLearn.utilities.ReadExcelFile;

public class LoginTest {
	String fileName=System.getProperty("user.dir")+"\\TestData\\Search.xlsx";
	
	@Test(priority =1,dataProvider="LoginDataProvider")
	
	public void verifyLogin(String username, String password) 
	{
		WebDriver driver = null;
		LoginPage lp=new LoginPage(driver);
		String uname = "Demo12";
		String pwd = "Test123456$";
	
		lp.loginPortal(uname, pwd);
	
	}
	@DataProvider()
	public String[][] LoginDataProvider()
	{
		
		System.out.println(fileName);
		int ttlRows= ReadExcelFile.getRowCount(fileName, "SearchCourse");
		System.out.println(ttlRows);
		int ttlColumns= ReadExcelFile.getColCount(fileName, "SearchCourse");
		System.out.println(ttlColumns);
		
		String data[][]= new String[ttlRows-1][ttlColumns];
		
		for(int i=1;i<ttlRows;i++)
		{
		for(int j=0;j<ttlColumns;j++)
			{
				data[i-1][j]=ReadExcelFile.getCellValue(fileName, "SearchCourse", i, j);
			
			}
		}
		return data;
		
	
		
	}
	
	
	
	
}

