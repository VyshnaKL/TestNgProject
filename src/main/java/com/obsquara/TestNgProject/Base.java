package com.obsquara.TestNgProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class Base {
	public WebDriver driver;

	@BeforeMethod
	public void intialisebrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Manu\\eclipse-workspace-obsquara\\TestNgProject\\src\\main\\java\\Resource\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	}

	@AfterMethod
	public void browserQuit() {
		driver.quit();
	}

}// /TestNgProject/src/main/java/Resource/chromedriver.exe