package com.test.com;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class annotation {
	
	
@BeforeClass
public void configBC() {
	System.out.println("----------Launch Browser-------------");
}

@BeforeMethod
public void configBM() {
	System.out.println("login");
}

@Test
public void CreateCustomerTest() {
	System.out.println("Execute Create Customer Test");
}

@Test
public void ModifyCustomerTest() {
	System.out.println("Execute Modify Customer Test");
}

@Test
public void DeleteCustomerTest() {
	System.out.println("Execute Delete Customer Test");
}
@AfterMethod
public void ConfifAM() {
	System.out.println("logout");
}
@AfterClass
public void configAC() {
	System.out.println("------------------Close Browser-------------");
}
}
