package com.obsquara.TestNgProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsCommand extends Base {
	@Test
	
	
	public void doubleClick() {
		
		WebElement tittleSingleInputDemo=driver.findElement(By.xpath("//button[@id='button-two']"));
		Actions action=new Actions(driver);
		action.doubleClick(tittleSingleInputDemo).perform();
	}
@Test
	
	public void mouseHover() {
		
		WebElement menuSingleInput = driver.findElement(By.xpath("//a[text()='Simple Form Demo']"));
		Actions action=new Actions(driver);
		action.moveToElement(menuSingleInput ).build().perform();
	}
	@Test

	public void clickAction() {
		WebElement showmessage = driver.findElement(By.xpath("//button[@id='button-one']"));
		Actions action= new Actions(driver);
		action.moveToElement(showmessage).click().perform();		

	}
	@Test
	
	public void rightClick() {
		WebElement selectAllButton=driver.findElement(By.xpath("//input[@id='button-two']"));
		Actions action=new Actions(driver);
		action.contextClick(selectAllButton).perform();
	
	
	
}
	@Test
	public void clickAndHold() {
		
		WebElement getAllButton=driver.findElement(By.xpath("//button[@id='button-two']"));
		Actions action=new Actions(driver);
		action.clickAndHold(getAllButton).perform();
	}
	
	@Test
	public void dragAndDrop() {
		driver.navigate().to("https://selenium.obsqurazone.com/drag-drop.php");
		WebElement source=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		WebElement destination=driver.findElement(By.xpath("//div[@id='mydropzone']"));
		Actions action=new Actions(driver);
		action.dragAndDrop(source, destination).build().perform();
		action.clickAndHold(source).moveToElement(destination).release(destination).build().perform();
	}
	
}
