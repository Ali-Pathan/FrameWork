package com.qa.TestProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
		
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver");
	
			driver.get("https://www.facebook.com/");
			System.out.println(driver.getTitle());
			driver.manage().window().maximize();
			System.out.println("Web site Maximized");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		

	}

}
