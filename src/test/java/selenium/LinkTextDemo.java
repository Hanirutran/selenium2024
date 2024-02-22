
	package selenium;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

	public class LinkTextDemo {

		@Test
		public void linktextDemo() throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiva\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("http://omayo.blogspot.com/");
			
			driver.manage().window().maximize();
			
			driver.findElement(By.partialLinkText("Selenium")).click();
			
			Thread.sleep(4000);

		 driver.quit();
			

		}

	}


