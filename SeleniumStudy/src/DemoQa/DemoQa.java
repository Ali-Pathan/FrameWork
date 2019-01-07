package DemoQa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoQa {

	public static void main(String[] args) throws Throwable {
		
String os = System.getProperty("os.name").toLowerCase();
		
		if (os.contains("mac")){
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver");
		}else{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
			}
		WebDriver driver = new ChromeDriver();
			driver.get("http://store.demoqa.com/");
			System.out.println("Web site lunched");
			Thread.sleep(5000);
			driver.manage().window().maximize();
			System.out.println("Web site Maximized");
			Thread.sleep(5000);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Actions act = new Actions(driver);
	
			act.moveToElement(driver.findElement(By.xpath("//input[@value='Search Products']"))).click().sendKeys("iPhone"+Keys.ENTER).build().perform();
			Thread.sleep(5000);
			System.out.println("iPhone search result showing");
			driver.findElement(By.xpath("(//div[@id='grid_view_products_page_container']//input[@name='Buy'])[1]")).click();
			System.out.println("Clicked to Add to cart");
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//span[.='Cart']")).click();
			System.out.println("Clicked to cart");
			Thread.sleep(5000);
			Thread.activeCount();
			
			driver.findElement(By.xpath("//input[@value='Remove']")).click();
			System.out.println("Removed from Cart");

	}

}
