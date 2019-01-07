package CaptureScreenShot;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Library.Utility;

public class FacebookScreenShot {
	WebDriver driver;
	@Test
	public void captureScreenShot() throws Exception
	{
			driver = new ChromeDriver();
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver");
			driver.get("https://www.facebook.com/");
			System.out.println("Web site lunched");
			driver.manage().window().maximize();
			System.out.println("Web site Maximized");
			Utility.CaptureScreenShot(driver);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.id("email")).sendKeys("selenium1016@gmail.com");
			System.out.println("Email address entered");
			driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("testuser1234");
			System.out.println("Password entered");
//			driver.findElement(By.xpath("//input[@value='Log In']")).click();
//			System.out.println("Login Button Clicked");
//			System.out.println(driver.getTitle());
			// ****witout using library***
//			TakesScreenshot ts = (TakesScreenshot)driver;
//			File src = ts.getScreenshotAs(OutputType.FILE);
//			FileUtils.copyFileToDirectory(src, new File ("./ScreenShot/Facebook.jpg"));
//			System.out.println("Screenshot taken");
			//*************************************
			// ****using library***
			
		
	}
	

}