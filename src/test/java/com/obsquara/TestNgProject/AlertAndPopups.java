package com.obsquara.TestNgProject;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AlertAndPopups extends Base {
	
	@Test

	public void simpleAlert() {
		driver.navigate().to(" https://selenium.obsqurazone.com/javascript-alert.php");
		WebElement clickMeButton = driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		clickMeButton.click();
		driver.switchTo().alert().accept();
	}
	
	@Test
	public void cancelAlert() {
		driver.navigate().to(" https://selenium.obsqurazone.com/javascript-alert.php");
		WebElement  clickConfirmButton= driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
		clickConfirmButton.click();
		driver.switchTo().alert().dismiss();
		driver.switchTo().alert().accept();
	}
	
	@Test	
	
 public void promptBoxAlert() {
		 driver.navigate().to(" https://selenium.obsqurazone.com/javascript-alert.php");
	 WebElement clickForPromptBoxButton= driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
	 clickForPromptBoxButton.click();
	  driver.switchTo().alert().sendKeys("Vyshna");
	  
	 
  }
	@Test
	
	public void getTextValue() {
		String expectedMessage="I am a Javascript alert box!";
		driver.navigate().to(" https://selenium.obsqurazone.com/javascript-alert.php");
		WebElement clickMeButton = driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		clickMeButton.click();
		String actualMessage=driver.switchTo().alert().getText();
		assertEquals(expectedMessage, actualMessage," message are different");
	}
}
