package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestSenario12 {

	public static void main(String args[]) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shiva\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get(" https://www.hyrtutorials.com/p/basic-controls.html");

		driver.manage().window().maximize();

		// Get the title of the page and validate
		String expectedTitle = "Basic Controls";
		String actualTitle = driver.getTitle();

		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Page title validation passed.");
		} else {
			System.out.println("Page title validation failed.");
		}

		// Enter First Name
		WebElement firstNameInput = driver.findElement(By.id("firstName"));
		firstNameInput.sendKeys("John");

		// Enter Last Name
		WebElement lastNameInput = driver.findElement(By.id("lastName"));
		lastNameInput.sendKeys("Doe");

		// Choose Gender
		WebElement genderRadioButton = driver.findElement(By.id("male"));
		genderRadioButton.click();

		// Click Languages Known
		WebElement languagesKnownInput = driver.findElement(By.id("languagesKnown"));
		languagesKnownInput.click();

		// Enter Email
		WebElement emailInput = driver.findElement(By.id("email"));
		emailInput.sendKeys("test@example.com");

		// Enter Password
		WebElement passwordInput = driver.findElement(By.id("password"));
		passwordInput.sendKeys("password123");

		// Click Register button
		WebElement registerButton = driver.findElement(By.id("registerButton"));
		registerButton.click();

	}

}
