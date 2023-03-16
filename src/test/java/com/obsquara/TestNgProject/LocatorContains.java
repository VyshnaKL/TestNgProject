package com.obsquara.TestNgProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class LocatorContains extends Base {
	@Test

	public void xpathContains() {
		driver.findElement(By.xpath("//button[contains(@class,'btn btn-primary')]"));
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		driver.findElement(By.xpath("//input[contains(@name,'inlineRadioOptions')]"));
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		driver.findElement(By.xpath("//input[contains(@id,'gridCheck')]"));
		driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
		driver.findElement(By.xpath("//select[contains(@class,'form-control')]"));
		driver.navigate().to("https://selenium.obsqurazone.com/form-submit.php");
		driver.findElement(By.xpath("//button[contains(@type,'submit')]"));
	}

	@Test

	public void xpathOr() {
		driver.findElement(By.xpath("//a[@href='simple-form-demo.php' or text()='Simple Form Demo']"));
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		driver.findElement(By.xpath("//button[@id=button-one or text()='Show Selected Value']"));
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		driver.findElement(By.xpath("//input[@id=button-two or @class='btn btn-primary']"));
		driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
		driver.findElement(By.xpath("//button[@type='button' or text()='Get First']"));
		driver.navigate().to("https://selenium.obsqurazone.com/form-submit.php");
		driver.findElement(By.xpath("//label[@for='validationCustom01' or text()='First']"));

	}
	@Test
	

	public void xpathAnd() {
		driver.findElement(By.xpath("//button [@class='btn btn-primary' and @id='button-two']"));
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		driver.findElement(By.xpath("//button [@class='btn btn-primary' and text()='Get Results']"));
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		driver.findElement(By.xpath("//label [@class='form-check-label' and @for='check-box-three']"));
		driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
		driver.findElement(By.xpath("//div[@id='message-one' and @class='my-2']"));
		driver.navigate().to("https://selenium.obsqurazone.com/form-submit.php");
		driver.findElement(By.xpath("//input[@id='validationCustom05' and @placeholder='Zip']"));

	}
	@Test
	
	public void xpathStartsWith() {
		
	driver.findElement(By.xpath("//div[starts-with(@id,'message-two')]"));
	driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
	driver.findElement(By.xpath("//input[starts-with(@id,'inlineRadio24')]"));
	driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
	driver.findElement(By.xpath("//label[starts-with(@for,'gridCheck')]"));
	driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
	driver.findElement(By.xpath("//button[starts-with(@id,'button-all')]"));
	driver.navigate().to("https://selenium.obsqurazone.com/form-submit.php");
	driver.findElement(By.xpath("//div[starts-with(@id,'message')]"));
	

		
		
	
	}

	@Test
	
	public void xpathParent() {
		driver.findElement(By.xpath("//label[@for='inputEmail4']//parent::div[@class='form-group']"));
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		driver.findElement(By.xpath("//input[@id='inlineRadio1']//parent::div[@class='form-check form-check-inline']"));
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		driver.findElement(By.xpath("//label[@for='check-box-one']//parent::div[@class='form-check']"));
		driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
		driver.findElement(By.xpath("//select[@id='single-input-field']//parent::option[@value='Green']"));
		driver.navigate().to("https://selenium.obsqurazone.com/form-submit.php");
		driver.findElement(By.xpath("//input[@id='invalidCheck']//parent::div[@class='form-check']"));
	}
	@Test
	
	public void xpathChild() {
		driver.findElement(By.xpath("//div[@class='form-group']//child::label[@for='inputEmail4']"));
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		driver.findElement(By.xpath("//div[@class='form-check form-check-inline']//child::input[@id='inlineRadio1']"));
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		driver.findElement(By.xpath("//div[@class='card']//child::input[@id='check-box-two']"));
		driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
		driver.findElement(By.xpath("//div[@class='form-group']//child::select[@id='single-input-field']"));
		driver.navigate().to("https://selenium.obsqurazone.com/form-submit.php");
		driver.findElement(By.xpath("//div[@class='form-check']//child::input[@class='form-check-input']"));
	}
	@Test
	
	public void xPathSibiling() {
		driver.findElement(By.xpath("//button[@id='button-one']//following::div[@id='message-one']"));
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		driver.findElement(By.xpath("//input[@class='form-check-input']//following::label[@for='inlineRadio1']"));
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		driver.findElement(By.xpath("//input[@type='checkbox']//following::label[@for='gridCheck']"));
		driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
		driver.findElement(By.xpath("//button[@id='button-first']//following::button[@id='button-all']"));
		driver.navigate().to("https://selenium.obsqurazone.com/form-submit.php");
		driver.findElement(By.xpath("//input[@class='form-check-input']//following::label[@class='form-check-label']"));
	}
	@Test
	
	public void xPathAncestor()
{
		driver.findElement(By.xpath("//button[@id='button-one']//ancestor::form[@method='POST']"));
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		driver.findElement(By.xpath("//input[@id='inlineRadio1']//ancestor::div[@class='card-body']"));
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		driver.findElement(By.xpath("//input[@id='is_checked']//ancestor::div[@class='example my-3']"));
		driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
		driver.findElement(By.xpath("//button[@id='button-first']//ancestor::div[@class='example my-3']"));
		driver.navigate().to("https://selenium.obsqurazone.com/form-submit.php");
		driver.findElement(By.xpath("//form[@class='needs-validation']//ancestor::div[@class='col-lg-9 col-md-9 col-sm-12 col-xs-12']"));
		
		}
	@Test
	
	public void xPathPreceding() {
		driver.findElement(By.xpath("//button[@id='button-one']//preceding::input[@id='single-input-field']"));
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		driver.findElement(By.xpath("//label[@for='inlineRadio2']//preceding::input[@id='inlineRadio1']"));
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		driver.findElement(By.xpath("//label[@class='form-check-label']//preceding::input[@id='check-box-one']"));
		driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
		driver.findElement(By.xpath("//button[@id='button-all']//preceding::button[@class='btn btn-primary']"));
		driver.navigate().to("https://selenium.obsqurazone.com/form-submit.php");
		driver.findElement(By.xpath("//input[@placeholder='Last name']//preceding::label[@for='validationCustom02']"));
	}
	@Test
	
	public void xPathFollowingSibiling() {
		driver.findElement(By.xpath("//button[@id='button-one']//following-sibling::div[@id='message-one']"));
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		driver.findElement(By.xpath("//input[@type='radio']//following-sibling::label[@for='inlineRadio1']"));
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		driver.findElement(By.xpath("//input[@id='check-box-two']//following-sibling::label[@class='form-check-label']"));
		driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
		driver.findElement(By.xpath("//button[@id='button-first']//following-sibling::button[@id='button-all']"));
		driver.navigate().to("https://selenium.obsqurazone.com/form-submit.php");
		driver.findElement(By.xpath("//button[@type='submit']//following-sibling::div[@class='my-2']"));
	}
	@Test
	
	
	public void xpathDescendant() {
		driver.findElement(By.xpath("//div[@class='card-body']//descendant::button[@id='button-one']"));
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		driver.findElement(By.xpath("//div[@class='example my-3']//descendant::label[@for='inlineRadio21']"));
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		driver.findElement(By.xpath("//section[@class='clearfix']//descendant::div[@class='row']"));
		driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
		driver.findElement(By.xpath("//div[@class='col-lg-9 col-md-9 col-sm-12 col-xs-12']//descendant::select[@id='multi-select-field']"));
		driver.navigate().to("https://selenium.obsqurazone.com/form-submit.php");
		driver.findElement(By.xpath("//div[@class='card']//descendant::div[@class='my-2']"));
	}
	@Test
	public void xpathSelf() {
		driver.findElement(By.xpath("//button[@id='button-one']//self::button"));
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		driver.findElement(By.xpath("//input[@id='inlineRadio1']//self::input"));
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		driver.findElement(By.xpath("//label[@class='form-check-label']//self::label"));
		driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
		driver.findElement(By.xpath("//ul[@class='list-group list-group-flush']//self::ul"));
		driver.navigate().to("https://selenium.obsqurazone.com/form-submit.php");
		driver.findElement(By.xpath(""));
		
		
	}
	
}
