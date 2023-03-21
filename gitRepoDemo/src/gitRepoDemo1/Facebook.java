package gitRepoDemo1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook 
{
	
	public static WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		
		WebDriverManager.chromedriver().setup();
		driver  = new ChromeDriver();
		driver.get("https://www.facebook.com/");
				
	}
	
	@Test
	public void login()
	{
		System.out.println("Title: = "+driver.getTitle());
		
		//driver.findElement(By.xpath("//input[@type = 'text']")).sendKeys("text");
		//driver.findElement(By.cssSelector("#pass")).sendKeys("text");
		//driver.findElement(By.name("login")).submit();
		WebElement we;
		we = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].click();", we);
		
	}
	
	@AfterTest
	public void browserClose()
	{
		driver.close();
		
	}

}
