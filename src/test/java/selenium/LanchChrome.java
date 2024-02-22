package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LanchChrome {

	public static void main(String[] args) throws InterruptedException {
		
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiva\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
	
		/*
		 * WebElement emailTextbox = driver.findElement(By.id("email"));
		 * 
		 * emailTextbox.sendKeys("Kannathasansdet@gmail.com");
		 */
		
		driver.findElement(By.id("email")).sendKeys("Kannathasansdet@gmail.com");
		
		Thread.sleep(4000);
		
		driver.findElement(By.id("email")).clear();
		
		Thread.sleep(4000);
		
		driver.findElement(By.id("pass")).sendKeys("Password");
		
		Thread.sleep(4000);
		
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(4000);


	 driver.close();
		

	}

}
