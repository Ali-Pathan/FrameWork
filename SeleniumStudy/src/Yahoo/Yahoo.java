package Yahoo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoo {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.yahoo.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[.='Finance']")).click();
		driver.getTitle();
		System.out.println(driver.getTitle());
		
		

	}

}
