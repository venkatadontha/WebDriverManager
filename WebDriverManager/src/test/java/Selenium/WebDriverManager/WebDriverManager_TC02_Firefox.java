package Selenium.WebDriverManager;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManager_TC02_Firefox {
	
	public static WebDriver driver;
	
	@BeforeTest
	public static void Initialise()
	{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver(); 
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	 		driver.manage().window().maximize();
	}
	
	@Test
	public void bMIHealthCare() throws InterruptedException 
    {
	   	driver.get("https://www.bmihealthcare.co.uk");
	   	Thread.sleep(2500);
	   	System.out.println("BMI HealthCare Site Launched Successfully");
    }
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}

}
