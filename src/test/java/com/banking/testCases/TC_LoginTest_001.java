package com.banking.testCases;

import org.testng.Assert;

import org.testng.annotations.Test;
import com.banking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass
{
	@Test
	public void loginTest()
	{
	driver.get(baseURL);
	
	logger.info("URL is opened");
	
  LoginPage lp = new LoginPage(driver);
   lp.setUserName(username);
   logger.info("Enter Username");
   
   lp.setPassword (password);
   logger.info("Enter password");
   lp.clickSubmit();
 
   if(driver.getTitle().equals("Guru99 Bank Manger HomePage"));
   {
	   Assert.assertTrue(true);
	   logger.info("Login test passed");
   }
   
  {
	   Assert.assertTrue(false);
	   logger.info("Login test failed");
  }
}
	
}