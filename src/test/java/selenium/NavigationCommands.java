package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationCommands {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiva\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("http://leaftaps.com/opentaps/control/main");

		driver.manage().window().maximize();

		WebElement emailitxtbox = driver.findElement(By.id("username"));

		emailitxtbox.sendKeys("demosalesmanager");

		Thread.sleep(3000);

		WebElement passwordtextbox = driver.findElement(By.id("password"));

		passwordtextbox.sendKeys("crmsfa");

		Thread.sleep(3000);

		driver.findElement(By.className("decorativeSubmit")).click();

		driver.navigate().back();

		Thread.sleep(3000);

		driver.navigate().forward();

		Thread.sleep(3000);

		driver.navigate().refresh();

		driver.close();

	}

}
