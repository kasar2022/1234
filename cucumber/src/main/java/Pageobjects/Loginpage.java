package Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	public WebDriver driver;
	
	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="userid") private WebElement UserID;
	@FindBy(id="password") private WebElement Password;
	@FindBy(xpath="//button[@class='button-orange wide']") private WebElement LoginButton;
	
	public void enterUserId(String Userid)
	{
		UserID.sendKeys(Userid);
		
	}
	
	public void enterPassword(String PWD)
	{
		Password.sendKeys(PWD);
	}
	
	public void ClickOnLoginButton()
	{
		LoginButton.click();
	}
}
