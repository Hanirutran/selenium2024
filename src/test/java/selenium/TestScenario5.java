package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScenario5 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shiva\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/delete_customer.php");

		driver.manage().window().maximize();

		WebElement customerIdInput = driver.findElement(By.xpath("//input[@name='cusid']"));
		customerIdInput.sendKeys("12345");

		WebElement submitButton = driver.findElement(By.xpath("//input[@name='submit']"));
		submitButton.click();

		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		System.out.println("Alert text: " + alertText);

		alert.accept();

		Thread.sleep(4000);

		driver.quit();
	}

}
