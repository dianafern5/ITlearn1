package com.ITlearn.testcases;
import org.testng.annotations.Test;
import com.ITlearn.pages.BaseTest;
import com.ITlearn.pages.SearchPage;
import com.ITlearn.utilitites.ReadExcelFile;

public class SearchTest extends BaseTest {
	
	String fileName=System.getProperty("user.dir")+"\\TestData\\ITlearn360.xlsx";
	
	
	@Test(priority=1)
	void searchCourseTesr() throws InterruptedException
	{
	LoginPage lp= new LoginPage(driver);
	//String username= "Demo12";
	//String password= "Test123456$";

	String username=ReadExcelFile.getCellValue(fileName, "SearchBar", 1, 0);
	String password=ReadExcelFile.getCellValue(fileName, "SearchBar", 1, 1);
    lp.loginPortal(username, password);
    
    SearchPage sp= new SearchPage(driver);
	String searchCourse=ReadExcelFile.getCellValue(fileName, "searchCourse", 0, 0);
	sp.searchCourse(searchCourse);
	}
	
	
        
		
		
		
		
	
		

	}

	
		
	

