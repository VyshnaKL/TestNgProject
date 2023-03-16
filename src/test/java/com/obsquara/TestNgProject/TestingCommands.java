package com.obsquara.TestNgProject;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestingCommands extends Base {

	@Test
	public void singleCheckboxDemo() {
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		String expectedMessage = "Success - Check box is checked";
		WebElement singleCheckbox = driver.findElement(By.xpath("//input[@id='gridCheck']"));
		singleCheckbox.click();
		WebElement successResponse = driver.findElement(By.cssSelector("div#message-one"));
		String actualResponse = successResponse.getText();
		assertEquals(expectedMessage, actualResponse, " Message do not match");
		assertTrue(singleCheckbox.isEnabled(), "Checkbox is not clicked");
	}

	@Test
	public void multipleCheckboxDemo() {
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		String expectedMessage = "Unselect All";
		WebElement checkBox1 = driver.findElement(By.xpath("//input[@id='check-box-one']"));
		checkBox1.click();
		WebElement checkBox2 = driver.findElement(By.xpath("//input[@id='check-box-two']"));
		checkBox2.click();
		WebElement checkBox3 = driver.findElement(By.xpath("//input[@id='check-box-three']"));
		checkBox3.click();
		WebElement checkBox4 = driver.findElement(By.xpath("//input[@id='check-box-four']"));
		checkBox4.click();
		WebElement selectButton = driver.findElement(By.xpath("//input[@id='button-two']"));
		String actualMessage = selectButton.getAccessibleName();
		assertEquals(expectedMessage, actualMessage, " error");

	}

}
