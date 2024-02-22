package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScenario4 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shiva\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/radio-button");

		driver.manage().window().maximize();

		WebElement yesRadioButton = driver.findElement(By.xpath("//label[@for='yesRadio']"));
		yesRadioButton.click();

		String selectedText = yesRadioButton.getText();

		System.out.println("You have selected: " + selectedText);

		Thread.sleep(4000);

		driver.close();

	}

}
