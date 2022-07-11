package com.jbk;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GrupsOfMethods {
	
	
  @Test(groups = "log")
  public void test01() 
  {
	  System.out.println(01);
	  Assert.assertTrue(false);
  }
  
  @Test(groups = "log")
  public void test02() 
  {
	  System.out.println(02);
  }
  
  @Test(groups = "log", dependsOnMethods="test01")
  public void test03() 
  {
	  System.out.println(03);
  }
  
  @Test(groups = "log", dependsOnMethods="test01", alwaysRun=true)
  public void test04() 
  {
	  System.out.println(04);
  }
  
  @Test(groups = "unlog")
  public void test05() 
  {
	  System.out.println(05);
  }
  
  @Test(groups = "unlog", enabled = false)
  public void test06() 
  {
	  System.out.println(06);
  }
}
