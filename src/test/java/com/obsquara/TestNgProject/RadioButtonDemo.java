package com.obsquara.TestNgProject;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class RadioButtonDemo extends Base {
	@Test
	public void verifyFemaleRadioButtonDemo()
	{
		String Gender="'Female'";
		String expectedShowSelectedText="Radio button "+Gender+" is checked";
		SelectCategory SelectCategoryObject=new SelectCategory(driver);
		SelectCategoryObject.listFindElements("Radio Buttons Demo");
		WebElement femaleRadioButton=driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		boolean femaleRadioButtonSelected=femaleRadioButton.isSelected();
		assertFalse(femaleRadioButtonSelected,"Female Button is not selected");
		WebElement maleRadioButton=driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		boolean maleRadioButtonSelected=maleRadioButton.isSelected();
		assertFalse(maleRadioButtonSelected,"Male Button is not selected");
		femaleRadioButton.click();
		boolean femaleButtonSelected=femaleRadioButton.isSelected();
		assertTrue(femaleButtonSelected,"Female Button is not Selected");
		boolean maleButtonSelected= maleRadioButton.isSelected();
	    assertFalse(maleButtonSelected,"Male Radio Button is selected");
	    WebElement showSelectedValueButton=driver.findElement(By.xpath("//button[@id='button-one']"));
		boolean selectedValueButtonEnabled=showSelectedValueButton.isEnabled();
		assertTrue(selectedValueButtonEnabled,"Selected Value Button is not Enabled");
    	showSelectedValueButton.click();
    	WebElement showSelectedValueText=driver.findElement(By.xpath("//div[@id='message-one']"));
    	String actualShowSelectedText=showSelectedValueText.getText();
    	assertEquals(expectedShowSelectedText,actualShowSelectedText,"Show Selected Text Messages are not same");
    					
    	}
	@Test
	
	public void verifyMaleRadioButtonDemo()
	{
		String Gender="'Male'";
		String expectedShowSelectedText="Radio button "+Gender+" is checked";
		SelectCategory SelectCategoryObject=new SelectCategory(driver);
		SelectCategoryObject.listFindElements("Radio Buttons Demo");
		WebElement femaleRadioButton=driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		boolean femaleRadioButtonSelected=femaleRadioButton.isSelected();
		assertFalse(femaleRadioButtonSelected,"Female Button is not selected");
		WebElement maleRadioButton=driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		boolean maleRadioButtonSelected=maleRadioButton.isSelected();
		assertFalse(maleRadioButtonSelected,"Male Button is not selected");
		maleRadioButton.click();
		boolean femaleButtonSelected=femaleRadioButton.isSelected();
		assertFalse(femaleButtonSelected,"Female Button is Selected");
	    boolean maleButtonSelected= maleRadioButton.isSelected();
	    assertTrue(maleButtonSelected,"Male Radio Button is not selected");
	    WebElement showSelectedValueButton=driver.findElement(By.xpath("//button[@id='button-one']"));
		boolean selectedValueButtonEnabled=showSelectedValueButton.isEnabled();
		assertTrue(selectedValueButtonEnabled,"Selected Value Button is not Enabled");
    	showSelectedValueButton.click();
    	WebElement showSelectedValueText=driver.findElement(By.xpath("//div[@id='message-one']"));
    	String actualShowSelectedText=showSelectedValueText.getText();
    	assertEquals(expectedShowSelectedText,actualShowSelectedText,"Show Selected Text Messages are not same");
		
	}
	@Test
	public void verifyGroupRadioButtonsDemoGenderAndAgeGroup()
	{
		SelectCategory SelectCategoryObject=new SelectCategory(driver);
		SelectCategoryObject.listFindElements("Radio Buttons Demo");
		String gender1="Male";
		String gender2="Female";
		String ageGroup1="1 to 18";
		String ageGroup2="19 to 44";
		String ageGroup3="45 to 60";
		String expectedGetResult="Gender : "+gender1+"\n"+"Age group: "+ageGroup2;
		WebElement malePatientGender=driver.findElement(By.xpath("//input[@id='inlineRadio11']"));
		boolean malePatientGenderSelected=malePatientGender.isSelected();
		WebElement femalePatientGender=driver.findElement(By.xpath("//input[@id='inlineRadio21']"));
		boolean femalePatientGenderSelected=femalePatientGender.isSelected();
		malePatientGender.click();
		boolean malePatientGenderAfterClick=malePatientGender.isSelected();
		boolean femalePatientGenderAfterClick=femalePatientGender.isSelected();
		WebElement onetoEighteenAgeGroup=driver.findElement(By.xpath("//input[@id='inlineRadio22']"));
		boolean oneToNineteenAgeGroupSelected=onetoEighteenAgeGroup.isSelected();
		WebElement nineteenToFortyFourAgeGroup=driver.findElement(By.xpath("//input[@id='inlineRadio23']"));
		boolean nineteenToFortyFourAgeGroupSelected=nineteenToFortyFourAgeGroup.isSelected();
		WebElement fortyFiveToSixty=driver.findElement(By.xpath("//input[@id='inlineRadio24']"));
		boolean fortyToSixtyAgeGroupSelected=fortyFiveToSixty.isSelected();
		assertFalse(oneToNineteenAgeGroupSelected&&nineteenToFortyFourAgeGroupSelected&&fortyToSixtyAgeGroupSelected,"None of the Age Groups are selected");
		nineteenToFortyFourAgeGroup.click();
		boolean ninetttenToFortyFourGroup=nineteenToFortyFourAgeGroup.isSelected();
		assertTrue(ninetttenToFortyFourGroup,"19 to 44 is not Selected");
		WebElement getResultsButton=driver.findElement(By.xpath("//button[@id='button-two']"));
		boolean getResultButtonEnabled=getResultsButton.isEnabled();
		assertTrue(getResultButtonEnabled,"Get Result Button is not Enabled");
		getResultsButton.click();
		WebElement getResultFieldText=driver.findElement(By.xpath("//div[@id='message-two']"));
		String actualGetResult=getResultFieldText.getText();
		assertEquals(expectedGetResult,actualGetResult,"Get Result Text are not same");
	}
}