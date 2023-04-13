package com.obsquara.TestNgProject;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AutoITTest extends Base {
	@Test
	public void checkBoxDemo() throws IOException
	{
		driver.navigate().to("https://www.ilovepdf.com/word_to_pdf");
		WebElement SelectWordFiles=driver.findElement(By.xpath("//span[text()='Select WORD files']"));
		SelectWordFiles.click();
		Runtime.getRuntime().exec("D:\\AutoIT\\FileUpload.exe");
	}
	
	

}


