

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class login {

	
	@Test
	public void checktitle()
	{	  
		System.setProperty("webdriver.chrome.driver",	
				"/home/qainfotech/Downloads/chromedriver");
		 WebDriver driver = new ChromeDriver();

		 driver.get("https://gmail.com");
		 driver.manage().window().maximize();
		 
		 String expectedtitle="Gmail";
		  
		 String actualtitle = driver.getTitle();
		 Assert.assertEquals(actualtitle,expectedtitle);
		 System.out.println("successfully checked");
		 System.out.println("INSIDE THE CODE");
		 
		 WebElement username = driver.findElement(By.xpath("//input[@type='email']"));
		 username.clear();
		 username.sendKeys("mahimasachdeva97@gmail.com");
		 
		 driver.findElement(By.xpath("//span[text()='Next']")).click();
		 
		 driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		// driver.findElement(By.xpath("//input[@type='password']")).click();
		 //driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1234");
		
		 WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
		 jse.executeScript("arguments[0].value='1234';", password);
		 
		 //password.sendKeys("1234");
		 
		 driver.findElement(By.xpath("//span[text()='Next']")).click();
		 
		 driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		// WebElement Signin = driver.findElement(By.id("signin"));
		 
		 //Signin.click();
		 
		 driver.close();
		 
	}
}

