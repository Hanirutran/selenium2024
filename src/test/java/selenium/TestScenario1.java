package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScenario1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shiva\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://omayo.blogspot.com/");

		driver.manage().window().maximize();

		String actualTitle = driver.getTitle();

		String expectedTitle = "omaya (QAFox.com)";

		if (actualTitle.equals(expectedTitle)) {

			System.out.println("PASS");
		} else {

			System.out.println("FAIL");

			String currentURL = driver.getCurrentUrl();

			System.out.println("Current Page URL: " + currentURL);

			driver.close();
		}
	}

}
