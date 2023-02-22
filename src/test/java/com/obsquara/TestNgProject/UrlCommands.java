package com.obsquara.TestNgProject;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class UrlCommands extends Base {
	@Test

	public void getUrlCommand() {
		String ExpectedUrl = "https://www.amazon.in/";
		String ActualUrl = driver.getCurrentUrl();
		assertEquals(ExpectedUrl, ActualUrl, " URL not same");

	}
}
