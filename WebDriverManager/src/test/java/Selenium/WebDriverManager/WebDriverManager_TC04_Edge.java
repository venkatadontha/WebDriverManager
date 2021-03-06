package Selenium.WebDriverManager;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManager_TC04_Edge {
	
	public static WebDriver driver;
	
	@BeforeTest
	public static void Initialise()
	{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver(); 
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
