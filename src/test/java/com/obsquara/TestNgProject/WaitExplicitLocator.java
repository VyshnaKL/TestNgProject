package com.obsquara.TestNgProject;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WaitExplicitLocator extends Base {

	@Test

	public void getTextShowmessageButton() {
		String inputText = "Show Message";
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='button-one']")));
		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		showMessageButton.getText();

	}

	@Test

	public void femaleRadioButton() {
		String Gender = "'Female'";
		SelectCategory SelectCategoryObject = new SelectCategory(driver);
		SelectCategoryObject.listFindElements("Radio Buttons Demo");
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='inlineRadio2']")));
		WebElement femaleRadioButton = driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		femaleRadioButton.click();

	}

	@Test

	public void checkBoxDemoResponse() {
		SelectCategory SelectCategoryObject = new SelectCategory(driver);
		SelectCategoryObject.listFindElements("Checkbox Demo");
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='button-two']")));
		WebElement selectAllButton = driver.findElement(By.xpath("//input[@id='button-two']"));
		selectAllButton.isEnabled();

	}

	@Test

	public void selectInputDemo() {
		String inputColor = "Green";
		String expectedColor = "Selected Color : " + inputColor;
		SelectCategory SelectCategoryObject = new SelectCategory(driver);
		SelectCategoryObject.listFindElements("Select Input");
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='single-input-field']")));
		WebElement selectColor = driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select selectObject = new Select(selectColor);
		selectObject.selectByIndex(2);
	}

}
