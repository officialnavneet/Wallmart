package testcases;

import org.openqa.selenium.WebDriver;

import POM.UserAccess_MyAccount;

public class UserAccess_MyAccount_Actions {

	
	public static void execute(WebDriver driver) {
		UserAccess_MyAccount MyAccClick = new UserAccess_MyAccount(driver);
		MyAccClick.ClickMyAcc();
		MyAccClick.typeSearch();
		MyAccClick.ClickSearchBtn();
		
	}
	
	
	
	
	
	
}
