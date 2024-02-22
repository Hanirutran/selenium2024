package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScenario2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shiva\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.manage().window().maximize();

		WebElement usernameTextBox = driver.findElement(By.xpath("//input[@id='username']"));

		usernameTextBox.sendKeys("DemoSalesManager");

		usernameTextBox.clear();

		usernameTextBox.sendKeys("DemoSalesManager");

		WebElement passwordTextBox = driver.findElement(By.xpath("//input[@id='password']"));

		passwordTextBox.sendKeys("crmsfa");

		WebElement loginButton = driver.findElement(By.xpath("//input[@value='Login']"));
		loginButton.click();

		WebElement crmLink = driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]"));

		String homePageTitle = driver.getTitle();

		WebElement loggedInUser = driver.findElement(By.xpath("//div[@id='label']/a"));
		String usernameText = loggedInUser.getText();

		if (usernameText.equals("DemoSalesManager")) {
			System.out.println("Test case passed.");

		} else {
			System.out.println("Test case failed.");
		}

		driver.quit();
	}
}
