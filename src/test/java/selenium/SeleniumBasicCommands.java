package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasicCommands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shiva\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://omayo.blogspot.com/");

		driver.manage().window().maximize();

		driver.manage().window().fullscreen();

		String pageTitle = driver.getTitle();

		System.out.println("The title is" + pageTitle);

		String pageURL = driver.getCurrentUrl();

		System.out.println("The title is" + pageURL);

		String pageSoucre = driver.getPageSource();

		System.out.println("The page source is" + pageSoucre);

		/*
		 * Options opt= driver.manage(); Window win = opt.window(); win.maximize();
		 */

		driver.findElement(By.partialLinkText("Selenium")).click();

		Thread.sleep(4000);

		driver.quit();

	}

}
