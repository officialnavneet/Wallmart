package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Signin_Page {

	WebDriver driver;
	By EmailLogin = By.id("login-form-email");
	By Password =   By.xpath("/html/body/div[1]/div[2]/div[1]/section/section/div[1]/section[3]/form/fieldset/label[3]/input");
	By Signin   =  By.id("account-signin-btn");
	  
	
	public Signin_Page(WebDriver driver) {
		this.driver=driver;
		
	}
	public void typeEmailLogin(String uemail) {
		driver.findElement(EmailLogin).sendKeys(uemail);
	}
	public void typePassword(String pwd) {
		driver.findElement(Password).sendKeys(pwd);
	}
	
	public void SigninButton() {
		driver.findElement(Signin).click();
	}
	
	
	
	
	
	
}
