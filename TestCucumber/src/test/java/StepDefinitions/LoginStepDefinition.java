package StepDefinitions;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {	

	public WebDriver driver;
	@Given("^user at login page$")
	public void user_at_login_page(){
		System.setProperty("webdriver.chrome.driver", "/Users/rajive/Documents/Automation/workspace/TestCucumber/Driver/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 
	}
	
	@When("^title of the page is Facebook$")
	public void title_of_the_page_is_Facebook(){
		String tittle = driver.getTitle();
		Assert.assertEquals("Facebook - Log In or Sign Up", tittle);
	}

	@Then("^user enter username and password$")
	public void user_enter_username_and_password(){
		driver.findElement(By.id("email")).sendKeys("selenium1016@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("testuser1234");
	}

	@Then("^user click on login$")
	public void user_click_on_login() {
		WebElement loginBtn = driver.findElement(By.xpath("//input[@value='Log In']"));
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", loginBtn);
		}


}
