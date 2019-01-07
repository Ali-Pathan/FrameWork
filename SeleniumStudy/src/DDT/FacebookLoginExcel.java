package DDT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FacebookLoginExcel {
	WebDriver driver;
	@Test(dataProvider="excel")
	public void LoginToFacebook(String username, String password) throws InterruptedException
	{
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver");
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println("Web site lunched");
		driver.findElement(By.id("email")).sendKeys(username);
		System.out.println("Email address entered");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
		System.out.println("Password entered");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		System.out.println("Login Button Clicked");
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		Assert.assertTrue(driver.getTitle().contains("Facebook"),"User is unable to logedin");
		System.out.println("Page title varified--User Properly Logedin");
		
	}
	
	@AfterMethod
	public void tearDown()
	{	driver.manage().deleteAllCookies();
		driver.quit();
		
	}
	
	
	@DataProvider(name="excel")
	public Object [][] passData(){
		ExceldataConfig config = new ExceldataConfig("/Users/rajive/Documents/Automation/workspace/SeleniumStudy/TestData/InputData.xlsx");
		int rows = config.getRowCount(0);
		Object [][] data = new Object [rows][2];
		for(int i=0;i<rows;i++)
		{
			data[i][0]=config.getData(0, i, 0);
			data[i][1]=config.getData(0, i, 1);
		}
		return data;
//		data[0][0]="abcd@gmail.com";
//		data[0][1]="abcd1234";
//		data[1][0]="selenium1016@gmail.com";
//		data[1][1]="testuser1234";
//		data[2][0]="abcdef@gmail.com";
//		data[2][1]="abcdef1234";
//		return data;
	}


}
