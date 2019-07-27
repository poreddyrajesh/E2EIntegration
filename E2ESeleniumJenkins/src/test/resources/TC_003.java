package test.resources;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_003 {
	
			@Test
			public void testCaseOne() 
			{
				System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();
				driver.get("https://www.facebook.com");
				driver.findElement(By.id("email")).sendKeys("Hello");
				driver.findElementById("pass").sendKeys("HelloPass");
				driver.quit();
			}
}

