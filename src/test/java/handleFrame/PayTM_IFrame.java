package handleFrame;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.testng.Assert;

import org.testng.annotations.Test;

public class PayTM_IFrame extends BaseTest2 {

	@Test

	public void verifyFrameTest() throws Exception {

		// click on SIgn-In button/link

		driver.findElement(By.xpath("//span[text()='Sign In']")).click();

		Thread.sleep(5000);

		// validation

		// perform action

		// driver.switchTo() ----- alert/frame/window

		// Swtich To Frame

		// ---- Index ------ Indexing start from 0

		// ---- Name / Id

		// ---- WebElement ------ identify frame using locator

		// driver.switchTo().frame(0);

		WebElement myFrame = driver.findElement(By.xpath("//iframe[contains(@src,'login')]"));

		driver.switchTo().frame(myFrame);

		String actualHeading = driver.findElement(By.cssSelector(".heading")).getText();

		System.out.println("Heading text: " + actualHeading);

		Assert.assertTrue(actualHeading.contains("Paytm Web account"));

		driver.findElement(By.xpath("//span[contains(text(),'Watch')]")).click();

	}

}
