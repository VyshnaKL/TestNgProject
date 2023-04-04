package com.obsquara.TestNgProject;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WindowHandles extends Base {
	@Test

	public void popUpWindow() {
		driver.navigate().to("https://demo.guru99.com/popup.php");
		WebElement clickHere = driver.findElement(By.xpath("//a[text()='Click Here']"));
		clickHere.click();
		String MainWindow = driver.getWindowHandle();
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();

		while (i1.hasNext()) {

			String ChildWindow = i1.next();
			if (!MainWindow.equalsIgnoreCase(ChildWindow)) {

				// Switching to Child window
				driver.switchTo().window(ChildWindow);
				WebElement email = driver.findElement(By.xpath("//input[@name='emailid']"));
				WebElement submit = driver.findElement(By.xpath("//input[@name='btnLogin']"));
				email.sendKeys("abc12@gmail.com");
				submit.click();
				driver.close();
			}
		}
	}

	@Test

	public void verifyPopUpWindow() {

		driver.navigate().to("https://selenium.obsqurazone.com/window-popup.php");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions
				.presenceOfAllElementsLocatedBy(By.xpath("//a[@title='Follow @obsqurazone on Facebook']")));
		WebElement likeUsOnFacebookClick = driver
				.findElement(By.xpath("//a[@title='Follow @obsqurazone on Facebook']"));
		wait.until(ExpectedConditions.visibilityOf(likeUsOnFacebookClick));
		likeUsOnFacebookClick.click();
		String MainWindow = driver.getWindowHandle();
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();

		while (i1.hasNext()) {

			String ChildWindow = i1.next();
			if (!MainWindow.equalsIgnoreCase(ChildWindow)) {
				driver.switchTo().window(ChildWindow);
				driver.manage().window().maximize();
			
				WebElement emailTextField = driver.findElement(By.xpath("//input[@name='email']"));
				wait.until(ExpectedConditions.visibilityOf(emailTextField));
				emailTextField.sendKeys("vyshnakl@gmail.com");
				// WebElement passwordTextField =
				// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='pass']")));
				WebElement passwordTextField = driver.findElement(By.xpath("//input[@name='pass']"));
				wait.until(ExpectedConditions.visibilityOf(passwordTextField));
				passwordTextField.sendKeys("Qwerty@777");
				// WebElement faceBookClickButton =
				// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='x1lliihq
				// x6ikm8r x10wlt62 x1n2onr6 xlyipyv xuxw1ft']")));
				// WebElement faceBookClickButton =
				// driver.findElement(By.xpath("//span[@class='x1lliihq x6ikm8r x10wlt62
				// x1n2onr6 xlyipyv xuxw1ft']"));
				WebElement faceBookClickButton = driver
						.findElement(By.xpath("//div[@aria-label='Accessible login button']"));

				faceBookClickButton.click();

				driver.close();
			}
		}
		driver.switchTo().window(MainWindow);
	}
}
