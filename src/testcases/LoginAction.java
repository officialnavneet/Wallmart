package testcases;

import org.openqa.selenium.WebDriver;

import POM.Signin_Page;
import library.ExcelUtil;

public class LoginAction {
 public static void Execute(WebDriver driver) {
	 
	Signin_Page login = new Signin_Page(driver);
	
	String uemail=ExcelUtil.GetData(1,0);
	String pwd =ExcelUtil.GetData(1, 1);
	
	login.typeEmailLogin(uemail);
	login.typePassword(pwd);
	login.SigninButton();
	
	
	
	
}
}