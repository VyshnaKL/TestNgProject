package com.obsquara.TestNgProject;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestingLocators  extends Base{
	@Test
	
	public void locatingID() {
		driver.findElement(By.id("twotabsearchtextbox"));
		
		
	}
	@Test
	
	public void linkText() {
		driver.findElements(By.linkText("Search Amazon"));
	}
	@Test
	
public void partialLinktext() {
	//driver.findElement(By.partialLinkText("Search" ));

}
	@Test
	
	public void locateCssselector() {
		driver.findElement(By.cssSelector(" input#twotabsearchtextbox"));
}
	@Test
	public void locateXPath() {
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	}
}
