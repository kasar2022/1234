package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginstepDefinations {
	WebDriver driver;
	
	@Given("User is already on Login page")
	public void user_is_already_on_login_page() {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	}

	@When("title of login page is Facebook-log in or sign up")
	public void title_of_login_page_is_facebook_log_in_or_sign_up() {
	   String title = driver.getTitle();
	   System.out.println(title);
	   
	}
	@Then("user enters Email address and Password")
	public void user_enters_email_address_and_password() {
	   driver.findElement(By.id("email")).sendKeys("kasar.ankita3@gmail.com");
	   driver.findElement(By.id("pass")).sendKeys("amol1011");
	}

	@Then("user clicks on login button")
	public void user_clicks_on_login_button() {
	    driver.findElement(By.name("login")).click();
	}

	@Then("user is on homepage")
	public void user_is_on_homepage() {
	   String title1 = driver.getTitle();
	   System.out.println("homepage title is "+title1);
	}

	
	
	
	
	
	
	
	
	
	

}
