package com.obsquara.TestNgProject;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class NavigateCommands extends Base {
	//@Test
	public void navigateCommands() {
		String expectedUrl1 = "https://www.flipkart.com/";
		String expectedUrl2 = "https://www.amazon.in/";
		driver.navigate().to("https://www.flipkart.com/");
		String actualUrl1 = driver.getCurrentUrl();

		assertEquals(expectedUrl1, actualUrl1, "Url1 not same");
		driver.navigate().back();
		String actualUrl2 = driver.getCurrentUrl();

		assertEquals(expectedUrl2, actualUrl2, "Url2 not same");
		driver.navigate().forward();
		String actualUrl3 = driver.getCurrentUrl();
		String expectedUrl3 = "https://www.flipkart.com/";
		assertEquals(expectedUrl3, actualUrl3, "Url3 not same");

		driver.navigate().refresh();
	}
	
	
	@Test
	public void softAssertCommands() {
		String expectedUrl1 = "https://www.flipkart.com/com";
		String expectedUrl2 = "https://www.amazon.in/";
		SoftAssert softAssert= new SoftAssert();
		driver.navigate().to("https://www.flipkart.com/");
		String actualUrl1 = driver.getCurrentUrl();

		softAssert.assertEquals(expectedUrl1, actualUrl1, "Url1 not same");
		driver.navigate().back();
		String actualUrl2 = driver.getCurrentUrl();

		softAssert.assertEquals(expectedUrl2, actualUrl2, "Url2 not same");
		driver.navigate().forward();
		String actualUrl3 = driver.getCurrentUrl();
		String expectedUrl3 = "https://www.flipkart.com/";
		softAssert.assertEquals(expectedUrl3, actualUrl3, "Url3 not same");

		driver.navigate().refresh();
		softAssert.assertAll();
	}
}
