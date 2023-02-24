package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginOrSignUpPage {
	// Variable:WebElement:Login Or SignUp page
	// constructor : Initialization of WebElement:Public
	//Method:Action on webElement:public
	
	@FindBy (xpath="xpath xpression")
	private WebElement emailorphoneNo;
	
	@FindBy (xpath="xpath xpression")
	private WebElement Password;
	
	@FindBy (xpath="xpath xpression")
	private WebElement LoginButton;
	
	@FindBy (xpath="xpath xpression")
	private WebElement forgotpasswordlink;
	
	@FindBy (xpath="xpath xpression")
	private WebElement CreatNewAccountButton;
	
	//Constructor: Initialization of WebElement:login or sign up page
	public LoginOrSignUpPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void SendEmailOrPhoneNo() {
	emailorphoneNo.sendKeys("ghkhkh");	
	}
	public void sendPassword() {
		Password.sendKeys("12345");
	}
	public void clickOnLoginButton() {
		LoginButton.click();
	}
	public void clickOnForgotPassword() {
		forgotpasswordlink.click();
	}
	public void openSignUpForm() {
		CreatNewAccountButton.click();
	}
}
