package com.obsquara.TestNgProject;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DynamicTable extends Base {
	@Test
	public void tableWithPagination1() {
		String expectedName = "Ashton Cox";
		driver.navigate().to("https://selenium.obsqurazone.com/table-pagination.php");
		WebElement table = driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		List<WebElement> tableHeaders = table.findElements(By.xpath("//tr[@role='row']//th"));
		for (WebElement header : tableHeaders) {
			System.out.print(header.getText());
		}
		System.out.println();
		for (WebElement row : rows) {
			List<WebElement> columns = row.findElements(By.tagName("td"));
			for (WebElement column : columns) {
				if (column.getText().equals(expectedName)) {
					// System.out.println(column.getText());
					assertTrue(column.getText().equals(expectedName));

					break;
				}
			}

		}

	}

}
