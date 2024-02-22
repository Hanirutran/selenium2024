package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScenario7 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shiva\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/");

		driver.manage().window().maximize();

		System.out.println("Current URL: " + driver.getCurrentUrl());

		Thread.sleep(3000);

		driver.findElement(By.className("card-up")).click();

		Thread.sleep(3000);

		driver.navigate().back();

		System.out.println("Current URL after going back: " + driver.getCurrentUrl());

		driver.navigate().refresh();

		Thread.sleep(3000);

		System.out.println("Current URL after refresh: " + driver.getCurrentUrl());

		Thread.sleep(3000);

		driver.navigate().forward();

		System.out.println("Current URL after forward: " + driver.getCurrentUrl());

		driver.quit();
	}
}
