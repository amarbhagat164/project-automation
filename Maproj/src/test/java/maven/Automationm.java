package maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automationm {

	public static void main(String[] args) {
		//System.out.println("hello");
System.setProperty("webdriver.chrome.driver","C:\\Users\\91845\\java automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	}

}
//"C:\Users\91845\java automation\chromedriver_win32\chromedriver.exe"