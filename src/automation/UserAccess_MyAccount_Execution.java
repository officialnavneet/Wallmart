package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import library.BrowserSelectionUtil;
import library.Constant;
import library.ExcelUtil;
import testcases.LoginAction;
import testcases.UserAccess_MyAccount_Actions;

public class UserAccess_MyAccount_Execution {

	public static void main(String[] args) throws Exception {


		 ExcelUtil.ExcelData(Constant.File_TestData, "sheet1");

	        BrowserSelectionUtil browser = new BrowserSelectionUtil();
	         WebDriver driver =browser.FirefoxBrowser(); 
	      driver.get(Constant.URL2);
	    LoginAction.Execute(driver);
	   UserAccess_MyAccount_Actions.execute(driver);
	    

	}

}
