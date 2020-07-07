package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserAccess_MyAccount {
	WebDriver driver;
	By MyAcc = By.xpath("/html/body/div[1]/div[2]/div[1]/section/section/div/nav/section[1]/ul/li[2]/a");
    By Search = By.name("search-form-input");
    By SearchBtn = By.xpath("/html/body/div[1]/header/div[2]/div/div[4]/form/button/span");
	
	public UserAccess_MyAccount(WebDriver driver) {
   this.driver =driver;

}
public void ClickMyAcc() {
	driver.findElement(MyAcc).click();
}
public void typeSearch() {
	driver.findElement(Search).sendKeys("tshirt");
}
public void ClickSearchBtn() {
	driver.findElement(SearchBtn).click();
}
}
