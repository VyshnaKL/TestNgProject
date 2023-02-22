package com.obsquara.TestNgProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Base {
	public WebDriver driver;
	@BeforeMethod
	public void intialisebrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Manu\\eclipse-workspace-obsquara\\TestNgProject\\src\\main\\java\\Resource\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.amazon.com/");
		}
@AfterMethod
public void browserQuit() {
	driver.quit();
}


}