package handleWindow;

import java.util.Set;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.testng.Assert;

import org.testng.annotations.Test;

public class IRCTCAPP_Window extends BaseTest {

	@Test

	public void verifyFrameTest() throws Exception {

		Thread.sleep(5000);

		// click on OK button

		WebElement btn_OK = driver.findElement(By.xpath("//button[text()='OK']"));

		btn_OK.click();

		String parentWindow = driver.getWindowHandle(); // return single window

		System.out.println("mainWindow : " + parentWindow);

		System.out.println("click on Hotel link");
		Thread.sleep(4000);
		WebElement link_Hotel = driver.findElement(By.linkText("HOTELS"));

		link_Hotel.click();

		System.out.println("-------------------------------------");

		Set<String> allwindow = driver.getWindowHandles(); // multiple window

		System.out.println("window count: " + allwindow.size());

		String mainWindow = (String) allwindow.toArray()[0];

		String hotelWindow = (String) allwindow.toArray()[1];

		System.out.println("main Window: " + mainWindow);

		System.out.println("hotelWindow: " + hotelWindow);

		Thread.sleep(4000);

		System.out.println("Switching to hotel window.........");

		driver.switchTo().window(hotelWindow);

		Thread.sleep(4000);

		System.out.println("Switching to main window.........");

		driver.switchTo().window(mainWindow);

		Thread.sleep(4000);

		System.out.println("Switching to hotel window.........");

		driver.switchTo().window(hotelWindow);

		driver.findElement(By.linkText("Login")).click();

		Thread.sleep(4000);

		System.out.println("Switching to main window.........");

		driver.switchTo().window(mainWindow);

		driver.findElement(By.linkText("CONTACT US")).click();

		Thread.sleep(4000);

		System.out.println("Switching to hotel window.........");

		driver.switchTo().window(hotelWindow);

		driver.findElement(By.xpath("//button[text()='Login']")).click();

	}

}
