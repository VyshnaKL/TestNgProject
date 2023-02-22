package com.obsquara.TestNgProject;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionCommands extends Base {
	@Test
	public void testHardAsserts() {
		String expectedUrl1 = "https://www.flipkart.com/";
		String actualUrl1 = "https://www.snapdeal.com/";
		assertFalse(expectedUrl1.equals(actualUrl1));
		
		String expectedUrl2 = "https://www.snapdeal.com/";
		String actualUrl2 = "https://www.snapdeal.com/";
		assertTrue(expectedUrl2.equals(actualUrl2));

		String expectedUrl3 = "https://www.flipkart.com/";
		String actualUrl3 = "https://www.snapdeal.com/";
		assertNotEquals(expectedUrl3, actualUrl3, "Urls are same");

		String expectedUrl4 = "https://www.snapdeal.com/";
		String actualUrl4 = "https://www.snapdeal.com/";
		assertEquals(expectedUrl4, actualUrl4, "Urls not  same");

		String expectedUrl = null;
		assertNull(expectedUrl);
		assertNotNull(actualUrl4);
	}
	
	@Test
	public void testSoftAsserts() {
		SoftAssert softAssert= new SoftAssert();
		String expectedUrl1 = "https://www.flipkart.com/";
		String actualUrl1 = "https://www.flipkart.com/";
		softAssert.assertFalse(expectedUrl1.equals(actualUrl1));
		
		String expectedUrl2 = "https://www.snapdeal.com/";
		String actualUrl2 = "https://www.snapdeal.com/";
		softAssert.assertTrue(expectedUrl2.equals(actualUrl2));

		String expectedUrl3 = "https://www.flipkart.com/";
		String actualUrl3 = "https://www.snapdeal.com/";
		softAssert.assertNotEquals(expectedUrl3, actualUrl3, "Urls are same");

		String expectedUrl4 = "https://www.snapdeal.com/";
		String actualUrl4 = "https://www.snapdeal.com/";
		softAssert.assertEquals(expectedUrl4, actualUrl4, "Urls not  same");

		String expectedUrl = null;
		softAssert.assertNull(expectedUrl);
		softAssert.assertNotNull(actualUrl4);
		System.out.println("Hello");
		softAssert.assertAll();
	}
}
