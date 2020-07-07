package testcases;

import org.openqa.selenium.WebDriver;

import POM.AccountCreation;
import library.ExcelUtil;

public class Signup_Action {
 public static void Execute(WebDriver driver) {

AccountCreation Login = new AccountCreation( driver);
     String uemail = ExcelUtil.GetData(1, 0);
     String pnumber = ExcelUtil.GetData(1, 1);
      String fname = ExcelUtil.GetData(1, 2);
      String lname = ExcelUtil.GetData(1,3);
      String pwd = ExcelUtil.GetData(1, 4);
      String cpwd = ExcelUtil.GetData(1, 5);


		Login.typeEmail(uemail);
		Login.typePhone(pnumber);
		Login.typeFirstName(fname);
		Login.typeLastname(lname);
		Login.typePassword(pwd);
		Login.typeConPassword(cpwd);
		Login.clickCheckbox();
		Login.CreateButton();
				
	}
}