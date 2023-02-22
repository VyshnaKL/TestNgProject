package com.obsquara.TestNgProject;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Locators extends Base {
	@Test
	public void locatorById() {
		driver.findElement(By.id("twotabsearchtextbox"));
		driver.findElement(By.id("desktop-grid-2"));
		driver.findElement(By.id("nav-cart-count-container"));
		driver.findElement(By.id("desktop-btf-grid-3"));
		driver.findElement(By.id("nav-main"));
		driver.navigate().to("https://www.amazon.com/b?node=16225009011&pf_rd_r=NDMTR0PHFEV7DG5TVA8E&pf_rd_p=9423ec2b-661b-4bff-badb-11576810540b&pd_rd_r=575abce7-4ec2-4d5f-8b0e-d31cf40ecc45&pd_rd_w=maY5j&pd_rd_wg=lA00L&ref_=pd_gw_unk");
	driver.findElement(By.id("a-page"));
	driver.findElement(By.id("nav-iss-attach"));
	driver.findElement(By.id("nav-upnav"));
	driver.findElement(By.id("nav-flyout-iss-anchor"));
	driver.findElement(By.id("nav-subnav-toaster"));
	
	}

	@Test
	public void locatorsbyName() {
		driver.findElement(By.name("glow-validation-token"));
		driver.findElement(By.name("dropdown-selection-ubb"));
	
	}

	@Test
	public void locateByClass() {
		driver.findElement(By.className("skip-link"));
		driver.findElement(By.className("nav-search-field"));
		driver.findElement(By.className("nav-logo-locale"));
		driver.findElement(By.className("layoutToolbarPadding"));
	}
	@Test
	
	public void locateByLinkText() {
		driver.findElement(By.linkText("Gift Cards"));
		driver.findElement(By.linkText("Sell"));
		driver.findElement(By.linkText("Registry"));
		driver.findElement(By.linkText("Customer Service"));
		
	}
	@Test
	
	public void locateByPartialLinkText() {
		driver.findElement(By.partialLinkText("Service"));
		driver.findElement(By.partialLinkText("Deals"));
		driver.findElement(By.partialLinkText("Hub"));
		driver.findElement(By.partialLinkText("Converter"));
		driver.findElement(By.partialLinkText("Balance"));
	}
	@Test
	public void locateByTagName() {
		driver.findElement(By.tagName("a"));
		driver.findElement(By.tagName("div"));
		driver.findElement(By.tagName("form"));
		driver.findElement(By.tagName("span"));
		driver.findElement(By.tagName("label"));
	}
	@Test
	public void locateByCssselector() {
		driver.findElement(By.cssSelector(" input#twotabsearchtextbox"));
		driver.findElement(By.cssSelector("div#nav-cart-count-container"));
		driver.findElement(By.cssSelector("div#nav-main"));
		driver.findElement(By.cssSelector("a.skip-link"));
		driver.findElement(By.cssSelector("div.layoutToolbarPadding"));
		driver.findElement(By.cssSelector("input[id=twotabsearchtextbox]"));
		driver.findElement(By.cssSelector("div.layoutToolbarPadding[id=nav-tools]"));
		driver.findElement(By.cssSelector("a.skip-link[id=skiplink]"));
		

		
		}
	@Test
	
	public void locateByXPath()
	{
		driver.findElement(By.xpath("//input[@name='glow-validation-token']"));
		driver.findElement(By.xpath("//input[@name='dropdown-selection-ubb']"));
		driver.findElement(By.xpath("//a[@id='skiplink']"));
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		driver.findElement(By.xpath("//div[@id='nav-tools']"));
		driver.findElement(By.xpath("//span[@class='nav-sprite nav-logo-base']"));
		driver.findElement(By.xpath("//span[@class='nav-logo-locale']"));
		
		driver.findElement(By.xpath("//a[text()='Gift Cards']"));
		driver.findElement(By.xpath("//div[text()='EN']"));
		driver.findElement(By.xpath("//a[text()='Registry']"));
		driver.findElement(By.xpath("//a[text()='Sell']"));
		driver.findElement(By.xpath("//a[text()='Customer Service']"));
	}
}
