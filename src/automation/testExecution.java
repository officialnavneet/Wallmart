package automation;

import java.io.File;

import org.openqa.selenium.WebDriver;

import library.BrowserSelectionUtil;
import library.Constant;
import library.ExcelUtil;
import testcases.Signup_Action;

public class testExecution {

	public static void main(String[] args) throws Exception {
		
		
ExcelUtil.ExcelData(Constant.File_TestData, "sheet1");
	//ExcelUtil.ExcelData(Constant.path_TestData + Constant.File_TestData,"sheet1");

		
		BrowserSelectionUtil browser = new BrowserSelectionUtil();
		WebDriver driver =browser.FirefoxBrowser(); 
		driver.get(Constant.URL);
		 
	
		// File file=new File("‪‪Wallmarttest.xlsx"); String a=file.getAbsolutePath();
		// System.out.println(a); System.out.println(file.exists());
		 
	Signup_Action.Execute(driver);
System.out.println("login successfull");
	}

	
}
