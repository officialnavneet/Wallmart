package automation;

import org.openqa.selenium.WebDriver;

import library.BrowserSelectionUtil;
import library.Constant;
import library.ExcelUtil;
import testcases.LoginAction;
import testcases.UserAccess_recommendations_Actions;

public class UserAccess_recommendations_Execution {

	public static void main(String[] args) throws Exception {
		  ExcelUtil.ExcelData(Constant.File_TestData, "sheet1");

        BrowserSelectionUtil browser = new BrowserSelectionUtil();
         WebDriver driver =browser.FirefoxBrowser(); 
      driver.get(Constant.URL2);
    LoginAction.Execute(driver);
    UserAccess_recommendations_Actions.execute(driver);

	}

}
