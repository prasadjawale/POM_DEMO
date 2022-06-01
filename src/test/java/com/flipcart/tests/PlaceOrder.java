package com.flipcart.tests;

import org.testng.annotations.Test;

import com.flipcart.base.TestBase;
import com.flipcart.pages.LoginPage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class PlaceOrder extends TestBase {
  @Test(priority=1)
  public void LoginTest() {
	  LoginPage loginPage = new LoginPage();
	  String actResult = loginPage.validateLogin("8624075060", "Pra@9325");
	  Assert.assertEquals(actResult, "Prasad");
  }
  
  @Test(priority=2)
  public void searchPage() {
	  SearchProduct searchProduct = new SearchProduct();
	  String actResult =searchProduct.searchOne("Laptop");
	  Assert.assertEquals(actResult, "Flights");
  }
  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeClass
  public void beforeClass() {
	  launchBrowser();
	  navigateToURL();
  }

  @AfterClass
  public void afterClass() {
  }

}
