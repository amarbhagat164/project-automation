 package maven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomClass.ForgotPasswordPage;
import pomClass.LoginOrSignUpPage;


public class TestClass {
	public static void main (String[]args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91845\\java automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driverTest =new ChromeDriver();
driverTest.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
driverTest.manage().window().maximize();
driverTest.get("https:https://www.facebook.com/");
LoginOrSignUpPage loginOrSignUpPage = new LoginOrSignUpPage(driverTest);
loginOrSignUpPage.SendEmailOrPhoneNo();
loginOrSignUpPage.sendPassword();
loginOrSignUpPage.clickOnForgotPassword();
ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage(driverTest);
forgotPasswordPage.sendEmailID();
forgotPasswordPage.clickOnSearchButton();
 }
}