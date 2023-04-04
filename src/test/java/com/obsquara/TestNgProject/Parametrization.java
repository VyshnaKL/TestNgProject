package com.obsquara.TestNgProject;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Parametrization extends Base {
@Test

	@Parameters({"author","searchKey"})
	public void parametersWithTest(String author, String searchKey)
{
	System.out.println( author);
		System.out.println( searchKey);
	}
@Test(dataProvider="LoginProvider")

public void dataProviderParameterization(String username, String Password) 
{
	System.out.println(username);
	System.out.println(Password);
	
}
@DataProvider(name="LoginProvider")
public Object[][] getDataFromDataprovider(){
    return new Object[][] 
    	{
            { "Vyshna", "V123" },
            { "Renju", "R456" },
            { "Anu", "A789" }
        };

    }
}
