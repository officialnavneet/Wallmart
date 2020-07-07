package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserAccess_recommendations {
 WebDriver driver;
  By MyRecom = By.xpath("/html/body/div[1]/div[2]/div[1]/section/div/nav/section[1]/ul/li[1]/a");
   
  public UserAccess_recommendations(WebDriver driver) {
	  this.driver=driver;
  }
	  public void ClickMyRcom() {
		  driver.findElement(MyRecom).click();
	  }
	  
  } 
  
  
 
