package com.obsquara.TestNgProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ListSingleInput extends Base {
	 public ListSingleInput(WebDriver driver) {
		this.driver=driver;
	}
	public void verifySelectInputDemoUsingFindElements(String selectInput)
	{
		
		List<WebElement> inputDemoCategories=driver.findElements(By.xpath("//select[@id='single-input-field']"));
		for(WebElement category:inputDemoCategories)
		{
			if(category.getAttribute("value").equals(selectInput))
			{
				category.click();
				break;
			}
			
		}
	}
}
