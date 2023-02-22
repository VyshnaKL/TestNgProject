package com.obsquara.TestNgProject;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class BrowserCommands extends Base {
	@Test
	public void getTitlecommand() {
		String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String actualTitle = driver.getTitle();
		assertEquals(expectedTitle, actualTitle, " title not same ");
	}
}
