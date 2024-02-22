package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScenario3 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shiva\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://demoqa.com/text-box");

		driver.manage().window().maximize();

		WebElement FullNameTextbox = driver.findElement(By.id("userName"));

		FullNameTextbox.sendKeys("Siva Kumar");

		Thread.sleep(4000);

		driver.findElement(By.id("userName")).clear();

		WebElement emailTextbox = driver.findElement(By.id("userEmail"));

		emailTextbox.sendKeys("Test@gmil.com");

		WebElement CurrentAddressTextbox = driver.findElement(By.id("currentAddress"));

		CurrentAddressTextbox.sendKeys("No.44,3rd main road Thirumalai Balaji Nagar Thiruverkadu chennai-77");

		WebElement PermanentAddressTextbox = driver.findElement(By.id("permanentAddress"));

		PermanentAddressTextbox.sendKeys("No.44,3rd main road Thirumalai Balaji Nagar Thiruverkadu chennai-77");

		WebElement SubmitButton = driver.findElement(By.id("submit"));

		SubmitButton.click();

		Thread.sleep(4000);

		driver.close();

	}

}
