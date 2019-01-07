package seleniumTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class UnitedAirlines_RoundTrip{

	public static void main(String[] args) {
String os = System.getProperty("os.name").toLowerCase();
		
		WebDriver driver = new ChromeDriver();
		
		if (os.contains("mac")){
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver");
		}else{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
			}
			driver.get("https://www.united.com/en/us/");
			System.out.println("Web site lunched");
			driver.manage().window().maximize();
			System.out.println("Web site Maximised");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			driver.findElement(By.xpath("//input[@name='bookFlightModel.Origin']")).sendKeys("WAS");
			driver.findElement(By.xpath("//span[@id='topLine3']")).click();
			
			driver.findElement(By.xpath("//input[@name='bookFlightModel.Destination']")).sendKeys("DHA");
			driver.findElement(By.xpath("//span[@id='topLine0']")).click();
			Actions act = new Actions(driver);
			
			act.moveToElement(driver.findElement(By.xpath("//input[@id='DepartDate']"))).click().build().perform();
			
			driver.findElement(By.xpath("(//div[@id='passengersSlidingInputContainer']//td[@class='CalendarDay CalendarDay_1 CalendarDay__default CalendarDay__default_2'])[9]")).click();
			Thread.yield();
			driver.findElement(By.xpath("//span[@class='app-components-BookCalendarRoundtrip-bookCalendarRoundtrip__nextIcon--3MHAQ']")).click();
			driver.findElement(By.xpath("(//table/tbody/tr/td[@class='CalendarDay CalendarDay_1 CalendarDay__default CalendarDay__default_2'])[40]")).click();
			
			driver.findElement(By.xpath("//input[@name='bookFlightModel.passengers']")).click();
			driver.findElement(By.id("NumOfAdults plusBtn")).click();
			driver.findElement(By.id("NumOfChildren04 plusBtn")).click();
			driver.findElement(By.id("NumOfChildren04 minusBtn")).click();
			System.out.println("Children removed from the Passenger list");
			driver.findElement(By.id("NumOfLapInfants plusBtn")).click();
			System.out.println("Infent added into the Passenger list");
			//public static String readexcel (WebDriver driver,int rownum,int colnum) through IOException
			
	}
	
	

}
