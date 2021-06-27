package com.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase02 {
  @Test
 
	  public void verifyCorrectCredentials() {
		  System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("file:///C:/Users/shilp/Downloads/Offline%20Website/Offline%20Website/index.html");
			driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
			driver.findElement(By.id("password")).sendKeys("123456");
			driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
			String actTitle=driver.getTitle();
			String expTitle="JavaByKiran | Dashboard";
			Assert.assertEquals(actTitle, expTitle);
	  
  }
}
