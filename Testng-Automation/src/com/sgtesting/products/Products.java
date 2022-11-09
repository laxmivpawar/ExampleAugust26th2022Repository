package com.sgtesting.products;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Products {
	
	@Test
	public void createusers()
	{
		System.out.println("User demoProduct1 has created successfully.....");
	}
	@Test
	public void modifyUser()
	{
		System.out.println("User demoProduct1 has modified successfully..");
		
	}
	@Test
	public void deleteUser()
	{
		System.out.println("User demoProduct1 has deleted successfullty..");
	}
	@BeforeClass
	public void setup()
	{
		System.out.println("Launch Browser,Navigate URL and Login into the application");
	}
	@AfterClass
	public void teardown()
	{
		System.out.println("Logout from the Application and close Application");
		System.out.println("------------------");
	}

}


