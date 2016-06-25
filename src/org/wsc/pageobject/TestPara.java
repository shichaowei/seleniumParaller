package org.wsc.pageobject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestPara {
  @Test
  public void TestFF() {
	  testpagetwo tl = new testpagetwo();
	  tl.chaxunFF("firefox");
  }
  
  @Test
  public void TestChrome() {
	  testpage tl = new testpage();
  	  tl.chaxunChrome("chrome");
  }
  
  @Test
  public void TestIE() {
	  testpagetwo tl = new testpagetwo();
	  tl.chaxunIE("IE");
  }
  

  
  
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
