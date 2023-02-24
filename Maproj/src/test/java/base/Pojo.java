package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Pojo {
public static WebDriver openChromeBrowser() {
System.setProperty("webdriver.chrome.driver","C\\Users\\91845\\java\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
return driver;
}
public static WebDriver openFirefocBrowser() {
System.setProperty("webdriver.gecko.driver","C\\Users\\91845\\java\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new FirefoxDriver();
return driver;
}
public static WebDriver openOperaBrowser() {
	
System.setProperty("webdriver.gecko.driver","C\\Users\\91845\\java\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new OperaDriver();
return driver;
}
}
