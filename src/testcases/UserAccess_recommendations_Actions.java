package testcases;

import org.openqa.selenium.WebDriver;

import POM.UserAccess_recommendations;

public class UserAccess_recommendations_Actions {

	
	public static void execute(WebDriver driver) {
		UserAccess_recommendations  MyRecomClick = new UserAccess_recommendations(driver);
		MyRecomClick.ClickMyRcom();
	}
}
