package com.obsquara.TestNgProject;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.List;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

public class WebElementsCommandsObsquara extends Base {
	@Test

	public void sendKeys() {
		String inputmessage = "Hello Everyone";
		String expectedmessage = "Your Message : " + inputmessage;
		WebElement searchbar = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver);
		((FluentWait<WebDriver>) fluentWait).withTimeout(Duration.ofSeconds(30));
		((FluentWait<WebDriver>) fluentWait).pollingEvery(Duration.ofSeconds(5));
		((FluentWait<WebDriver>) fluentWait).ignoring(NoSuchElementException.class);
	WebElement foo = (WebElement) fluentWait.until(ExpectedConditions.visibilityOfAllElements(searchbar));
		searchbar.sendKeys(inputmessage);
		WebElement showmessage = driver.findElement(By.xpath("//button[@id='button-one']"));
		showmessage.click();
		WebElement yourmessage = driver.findElement(By.cssSelector("div#message-one"));
		String yourmessagetext = yourmessage.getText();
		assertEquals(expectedmessage, yourmessagetext, "Enter mesage wrong");
	}

	@Test

	public void getTextShowmessageButton() {
		String expectedText = "Show Message";
		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		String showMessageText = showMessageButton.getText();
		assertEquals(expectedText, showMessageText, " message are different");

	}

	@Test
	public void webelementmethod() {
		String inputMessage = "Hello Everyone";
		WebElement singleinputFieldTextBox = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		boolean isSingleInputFieldTextboxDisplayed = singleinputFieldTextBox.isDisplayed();
		assertTrue(isSingleInputFieldTextboxDisplayed, " single input field is not displayed");
		singleinputFieldTextBox.sendKeys(inputMessage);
		singleinputFieldTextBox.clear();
		String tagName = singleinputFieldTextBox.getTagName();
		String placeHolder = singleinputFieldTextBox.getAttribute("placeholder");
		String className = singleinputFieldTextBox.getAttribute("class");
		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		String backgroundColor = showMessageButton.getCssValue("background-color");
		WebElement enterValueB = driver.findElement(By.xpath("//input[@id='value-b']"));
		Point locationshowMessagebutton = showMessageButton.getLocation();
		int showMessageButtonX = locationshowMessagebutton.getX();
		int showMessageButtonY = locationshowMessagebutton.getY();
		Dimension sizeofShowMessagebutton = showMessageButton.getSize();
		int height = sizeofShowMessagebutton.getHeight();
		int width = sizeofShowMessagebutton.getWidth();
		List<WebElement> inputformCategories = driver.findElements(By.xpath("//li[@class='list-group-item']"));

	}

	@Test

	public void showMessageFontColor() {
		String expectedFontcolor = "rgba(255, 255, 255, 1)";
		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		String fontColor = showMessageButton.getCssValue("color");
		assertEquals(expectedFontcolor, fontColor, "font color not matching");
	}

	@Test
	public void showMessageFontSize() {
		String expectedFontSize = "16px";
		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		String fontSize = showMessageButton.getCssValue("font-size");
		assertEquals(expectedFontSize, fontSize, " font size not matching");

	}

	@Test
	public void getValueBackgroundColor() {
		String expectedBackgroundColor = "rgba(0, 123, 255, 1)";
		WebElement getValueButton = driver.findElement(By.xpath("//button[@id='button-two']"));
		String backGroundColor = getValueButton.getCssValue("background-color");
		assertEquals(expectedBackgroundColor, backGroundColor, " backgroung color is not same");

	}

	@Test

	public void shapeShowMessage() {
		String expectedShape = "4px";
		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		String shape = showMessageButton.getCssValue("border-radius");
		assertEquals(expectedShape, shape, " shape is oval");

	}

	@Test
	public void testTwoInputFields() {
		String input1 = "5";
		String input2 = "4";
		int expectedTotal = Integer.parseInt(input1) + Integer.parseInt(input2);
		String expectedMessage = "Total A + B : " + expectedTotal;
		WebElement enterValueA = driver.findElement(By.xpath("//input[@id='value-a']"));
		boolean isEnterValueADisplayed = enterValueA.isDisplayed();
		assertTrue(isEnterValueADisplayed, " not displayed");
		enterValueA.sendKeys(input1);
		WebElement enterValueB = driver.findElement(By.xpath("//input[@id='value-b']"));
		boolean isEnterValueBDisplayed = enterValueB.isDisplayed();
		assertTrue(isEnterValueBDisplayed, " not displayed ");
		enterValueB.sendKeys(input2);
		WebElement getValue = driver.findElement(By.xpath("//button[@id='button-two']"));
		boolean isGetValueEnabled = getValue.isEnabled();
		assertTrue(isGetValueEnabled, " not enabled");
		getValue.click();
		WebElement getValueResponse = driver.findElement(By.cssSelector("div#message-two"));
		String actualMessage = getValueResponse.getText();
		assertEquals(expectedMessage, actualMessage, " error");

	}

}
