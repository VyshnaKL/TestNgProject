package com.obsquara.TestNgProject;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnotations extends Base  {
	@BeforeMethod
	public void beforeMethod(){
		System.out.println(" Before Method");
		}
	@AfterMethod
	public void afterMethod() {
		System.out.println(" After Method");
	}
	@Test
	public void test() {
		System.out.println(" Test ");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println(" BeforeClass ");
	}
	@AfterClass
	public void afterClass() {
		System.out.println(" AftereClass ");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("BeforeTest ");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("AfterTest ");
	}
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite ");
	}
	@AfterSuite
	public void aftereSuite() {
		System.out.println("After Suite ");
	}
	
	}
