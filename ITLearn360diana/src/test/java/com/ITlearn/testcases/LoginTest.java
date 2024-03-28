package com.ITlearn.testcases;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.ITlearn.pages.BaseTest;
import com.ITlearn.utilitites.ReadExcelFile;

public class LoginTest extends BaseTest
{
	String fileName=System.getProperty("user.dir")+"\\TestData\\ITlearn360.xlsx";
	
	@Test(priority =1,dataProvider="LoginDataProvider")
	public void verifyLogin(String userEmail, String userPwd) 
	{
		LoginTest lp=new LoginTest();
		String username = "Demo12";
		String password = "Test123456$";
		lp.loginPortal(userEmail, userPwd);
	
	}
	private void loginPortal(String userEmail, String userPwd) {
		// TODO Auto-generated method stub
		
	}
	@DataProvider()
	public String[][] LoginDataProvider()
	{
		
		System.out.println(fileName);
		int ttlRows= ReadExcelFile.getRowCount(fileName, "Login");
		System.out.println(ttlRows);
		int ttlColumns= ReadExcelFile.getColCount(fileName, "Login");
		System.out.println(ttlColumns);
		
		String data[][]= new String[ttlRows-1][ttlColumns];
		
		for(int i=1;i<ttlRows;i++)
		{
		for(int j=0;j<ttlColumns;j++)
			{
				data[i-1][j]=ReadExcelFile.getCellValue(fileName, "Login", i, j);
			
			}
		}
		return data;
		
	
		
	}
	
	
	
	
}