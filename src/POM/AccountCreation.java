package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountCreation {

	
WebDriver driver;
By Email           =       By.id("email");
By Phone           =       By.id("phone");
By FirstName       =       By.id("firstName");
By LastName        =       By.id("lastName");
By Password        =       By.id("password");
By ConfPassword    =       By.id("confirmPassword");
By Checkbox        =       By.id("tnc");
By CreateAcc       =       By.id("create-account-btn");
	public AccountCreation(WebDriver driver) {
		this.driver= driver;
	}


public void  typeEmail(String uemail) {
	driver.findElement(Email).sendKeys(uemail);
}
public void typePhone(String pnumber) {
	driver.findElement(Phone).sendKeys(pnumber);
}
public void typeFirstName(String fname) {
	driver.findElement(FirstName).sendKeys(fname);
}
public void typeLastname(String lname) {
	driver.findElement(LastName).sendKeys(lname);
}
public void typePassword(String pwd) {
	driver.findElement(Password).sendKeys(pwd);
}
public void typeConPassword(String cpwd) {
	driver.findElement(ConfPassword).sendKeys(cpwd);
}
public void clickCheckbox(){
	driver.findElement(Checkbox).click();
}
public void CreateButton() {
	driver.findElement(CreateAcc).click();
	
}
}




























