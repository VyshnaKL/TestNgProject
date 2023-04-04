package com.obsquara.TestNgProject;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TableFilter extends Base

{
	@Test

	public void searchTable() {
		String inputMessage = "London";
		driver.navigate().to("https://selenium.obsqurazone.com/table-filter.php");
		WebElement searchbar = driver.findElement(By.xpath("//input[@type='search']"));
		searchbar.sendKeys(inputMessage);
		WebElement table = driver.findElement(By.xpath("//table[@id='example']//tbody"));

		List<WebElement> rows = table.findElements(By.tagName("tr"));

		for (WebElement row : rows) {
			// System.out.println(" row: " + row.getText());
			assertTrue(row.getText().contains(inputMessage)," search not found");
		}
	}

}
