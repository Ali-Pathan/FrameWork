package FrameTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameTest {

	public static void main(String[] args) {
String os = System.getProperty("os.name").toLowerCase();
		
		WebDriver driver = new ChromeDriver();
		
		if (os.contains("mac")){
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver");
		}else{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
			}
			driver.get("http://toolsqa.com/iframe-practice-page/");
			System.out.println("Web site lunched");
			driver.manage().window().maximize();
			System.out.println("Web site Maximized");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.switchTo().frame("IF1");
			System.out.println(driver.findElement(By.xpath("//strong[.='PERSONAL INFORMATION']")).getText());

	}

}
