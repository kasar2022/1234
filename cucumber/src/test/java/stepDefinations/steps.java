package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pageobjects.Loginpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class steps {
     public  WebDriver driver;
     public Loginpage lp;
	@Given("When user launch chromebrowser")
	public void when_user_launch_chromebrowser() {
		System.setProperty("WebDriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
		lp=new Loginpage(driver);
		 driver=new ChromeDriver();
	    
	}

	@When("User opens url\\({string})")
	public void user_opens_url(String url) {
	    driver.get(url);
	}

	@When("Enter user Id as {string}\" and Password as \"Pass@{int}\"")
	public void enter_user_id_as_and_password_as_pass(String userId, String Password) {
	  lp.enterUserId(userId);
	  lp.enterPassword(Password);
	}

	@Then("Click on the login button")
	public void click_on_the_login_button() {
		lp.ClickOnLoginButton();
	   
	}

	@Then("when user is on Pin page")
	public void when_user_is_on_pin_page() {
	    
	}


}
