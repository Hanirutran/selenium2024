package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IDandNameLocator {


	@Test
	public void IdandNameDemo() throws InterruptedException {
		
	// TODO Auto-generated method stub

	//	WebDriverManager.chromedriver().setup();

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiva\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		
		driver.manage().window().maximize();
		
		
		/*
		 * WebElement emailTextBox = driver.findElement(By.id("email"));
		 * emailTextBox.clear();
		 * 
		 * emailTextBox.sendKeys("Kannathasane@gmail.com");
		 */
		Thread.sleep(4000);
		
		/*
		 * List<WebElement> txts= driver.findElements(By.tagName("a"));
		 */		
		driver.findElement(By.cssSelector("input[id=\"username\"]")).sendKeys("Kannathasane@gmail.com");
		
		driver.findElement(By.cssSelector(".form-control.private-form__control.login-password.m-bottom-3")).sendKeys("123456");
		
		driver.findElement(By.id("loginBtn")).click();
		
		
		
		driver.navigate().back();

		Thread.sleep(3000);

		driver.navigate().forward();

		Thread.sleep(3000);

		driver.navigate().refresh();
		Thread.sleep(3000);

		
		driver.close();
		
		
		
		
	}

}
