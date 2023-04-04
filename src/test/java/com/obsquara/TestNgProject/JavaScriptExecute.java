package com.obsquara.TestNgProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JavaScriptExecute extends Base {
	@Test
	
	public void singleInputDemo() {
		//String inputmessage = "Hello";
		WebElement searchbar = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		//searchbar.sendKeys(inputmessage);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value = 'Hello'", searchbar);
	}
	
	@Test
	
	public void showmessage() {
	
	WebElement showmessage=driver.findElement(By.xpath("//button[@id='button-one']"));
	//clickCheckBox.click();
	JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", showmessage);
	
}
	 
}
