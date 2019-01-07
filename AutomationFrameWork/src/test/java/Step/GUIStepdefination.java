package Step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;


public class GUIStepdefination {
	public WebDriver driver;
	
	@Before
	public void initialize(){
		System.out.println("This is before class");
		System.setProperty("webdriver.chrome.driver", "/Users/rajive/Documents/Automation/workspace/AutomationFrameWork/Driver/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		System.out.println("fullscreen");
		driver.get("https://www.facebook.com/");
		System.out.println("Lounched");
		
		}
	@Given("^user at facebook home page$")
	public void user_at_facebook_home_page(){
	}
	

}
