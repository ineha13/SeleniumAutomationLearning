package handleFrame;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

import utility.ConfigRead4;

public class BaseTest {

	public WebDriver driver;

	@BeforeTest

	public void launchApp() throws Exception {

		System.out.println("launch app.....");

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");

	}

	@AfterTest

	public void closeApp() throws Exception {

		Thread.sleep(4000);

		driver.close();

		System.out.println("closing app.....");

	}

}
