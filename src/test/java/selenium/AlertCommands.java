package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertCommands {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiva\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://omayo.blogspot.com/");

		driver.manage().window().maximize();

		// To click the alert button

	   driver.findElement(By.id("prompt")).click();
	 
		Thread.sleep(5000);

		// Without handling the alert ur tring to print the current URL so you will be
		// ended up with UnhandledAlertException
		
		/*
		 * TargetLocator tc= driver.switchTo();
		 * 
		 * Alert at = tc.alert();
		 */

		// To move to the alert popup

		Alert promtalert = driver.switchTo().alert();

		// To get the text from alert

		Thread.sleep(5000);

		String prompttxt = promtalert.getText();

		System.out.println("The Prompt text is " + prompttxt);

		promtalert.sendKeys("Kanna");

		promtalert.accept();

	String currenturl = driver.getCurrentUrl();

		System.out.println("The Prompt text is " + currenturl);

		Thread.sleep(5000);

		driver.close();

	}

}
