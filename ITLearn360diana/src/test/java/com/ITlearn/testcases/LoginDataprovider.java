package com.ITlearn.testcases;
import java.util.concurrent.TimeUnit;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.ITlearn.pages.BaseTest;
import com.ITlearn.utilitites.ReadExcelFile;

public class LoginDataprovider {
	public class LoginDataProvider extends BaseTest
	{
		String fileName=System.getProperty("user.dir")+"\\TestData\\ITlearn360.xlsx";
		@Test(dataProvider = "LoginDataProvider")
		
		void verify(String user,String pass)
			{
				LoginPage lp= new LoginPage(driver);
				lp.loginPortal(user, pass);
		if(user.equals("Demo12") && pass.equals("Test123456$"))
		{
		
			System.out.println("test passed");
			lp.logout();
			Assert.assertTrue(true);
		}
			
		else {
			Assert.assertTrue(false);
		}
	}
		
		
		@DataProvider()
		public String[][] LoginDataProvider()
		{
			
			
	int ttlRows= ReadExcelFile.getRowCount(fileName, "Login");
	int ttlColumns= ReadExcelFile.getColCount(fileName, "Login");
			
	String data[][]= new String[ttlRows-1][ttlColumns];
			
	for(int i=1;i<ttlRows;i++)
	{
	for(int j=0;j<ttlColumns;j++)
	{
	data[i-1][j]=ReadExcelFile.getCellValue(fileName, "Login", i, j);
	}
	}
	return data;
	
	
	//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
		}}


		


}
