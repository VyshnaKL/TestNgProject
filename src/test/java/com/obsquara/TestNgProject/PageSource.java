package com.obsquara.TestNgProject;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class PageSource extends Base {
	@Test
	public void getPageSource() {
		String actualPageSource = " var ue_err_chan = 'jserr-rw'd";
		String pageSource = driver.getPageSource();
		assertTrue(pageSource.contains(actualPageSource));
	}

}
