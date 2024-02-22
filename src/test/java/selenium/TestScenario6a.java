package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScenario6a {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shiva\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/alerts");

		driver.manage().window().maximize();

		WebElement lastButtonClickMeButton = driver.findElement(By.id("confirmButton"));
		lastButtonClickMeButton.click();

		Alert confirmAlert = driver.switchTo().alert();
		confirmAlert.dismiss();

		Thread.sleep(4000);

		driver.quit();
	}
}
