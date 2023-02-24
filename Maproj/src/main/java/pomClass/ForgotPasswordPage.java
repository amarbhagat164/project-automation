package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPage {
	@FindBy (xpath="xpath xpression")
	private WebElement forgotMessage;
	
	@FindBy (xpath="xpath xpression")
	private WebElement emailOrMobile;
	
	@FindBy (xpath="xpath xpression")
	private WebElement search;
	
	@FindBy (xpath="xpath xpression")
	private WebElement cancel;
	//constructor;initialization of webElement;login or Sign Up Page
	public ForgotPasswordPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void getForgotWindowMessage() {
		String text = forgotMessage.getText();
		System.out.println(text);
	}
//	public void sendEmailID() {
	//	emailOrMobile.sendKeys("amarbhagat@gmail.com");
//	}
	public void clickOnCancel() {
		cancel.click();
	}
	public void clickOnSearchButton() {
		search.click();
	}
	public void sendEmailID() {
	emailOrMobile.sendKeys("amarbhagat");	
		
	}

		
	}
}
