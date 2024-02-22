package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestScenario11 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shiva\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

		driver.manage().window().maximize();

		WebElement button = driver.findElement(By.id("newWindowBtn"));

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		wait.until(ExpectedConditions.elementToBeClickable(button));

		((JavascriptExecutor) driver).executeScript("arguments[0].click();", button);

		Thread.sleep(5000);

		String parentHandle = driver.getWindowHandle();

		System.out.println("The Window Id" + parentHandle);

		for (String handle : driver.getWindowHandles()) {
			driver.switchTo().window(handle);
		}

		String childWindowTitle = driver.getTitle();

		String expectedTitle = "Practice Window";

		if (childWindowTitle.equals(expectedTitle)) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}

		driver.close();

		driver.switchTo().window(parentHandle);

		driver.close();

	}
}
