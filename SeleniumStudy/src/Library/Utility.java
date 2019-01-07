package Library;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utility {
		
	public static void webDriver(){
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver");
		driver.manage().window().maximize();
		System.out.println("Web site Maximized");
	}
	
	public static void CaptureScreenShot(WebDriver driver){
		try {
			TakesScreenshot ts = (TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFileToDirectory(src, new File ("./ScreenShot/Facebook.jpg"));
			System.out.println("Screenshot taken");
		}catch (Exception e) {
	
		}
	}

}
