package library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BrowserSelectionUtil {

public static WebDriver EdgeBrowser() {
	System.setProperty("webdriver.edge.driver", "./Wallmart/Resources/MicrosoftWebDriver.exe");
	EdgeOptions options =new EdgeOptions ();
	return new EdgeDriver(options);
}

public static WebDriver ChromeBrowser() {
	System.setProperty("WebDriver.Chrome.driver", "‪C:\\Users\\User\\eclipse-workspace\\browser\\chrome driver\\chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
  return new ChromeDriver(options);
	
}
 public static WebDriver FirefoxBrowser() {
	 System.setProperty("Webdriver.Firefox.driver", "‪C:\\Users\\User\\eclipse-workspace\\browser\\firefox driver\\geckodriver.exe");
	 FirefoxOptions options = new FirefoxOptions();
	 //options.setAcceptInsecureCerts(true);
	return new FirefoxDriver (options);
 }
}





