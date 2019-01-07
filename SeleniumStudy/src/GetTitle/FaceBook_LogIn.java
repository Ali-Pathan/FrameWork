package GetTitle;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook_LogIn {

	public static void main(String[] args) {
		String os = System.getProperty("os.name").toLowerCase();
		
		WebDriver driver = new ChromeDriver();
		
		if (os.contains("mac")){
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver");
		}else{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
			}
			driver.get("https://www.facebook.com/");
			System.out.println("Web site lunched");
			driver.manage().window().maximize();
			System.out.println("Web site Maximized");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
			driver.getTitle();
			System.out.println("Tittle is on this page(" +driver.getTitle()+")");
			
	}

}