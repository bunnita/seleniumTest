package seneniumTest;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class TestNG {
	public WebDriver driver = new FirefoxDriver();
	String appUrl ="https://forums.somethingawful.com/";
	
  @Test
  public void saLogin() {
	  driver.get(appUrl);
	  
	  driver.manage().window().maximize();
	  
	  String expectedTitle = "The Something Awful Forums";
	  
	  String actualTitle = driver.getTitle();
	  System.out.println(actualTitle);
	  Assert.assertEquals(expectedTitle, actualTitle);
	  

	 driver.findElement(By.cssSelector("a[href*='loginform']")).click();
	  //driver.findElement(By.xpath("//a[@href='loginform']")).click();
	  
	  driver.findElement(By.xpath("//input[@name='username']")).sendKeys("bunnita");
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Rory2013Lia");
	  
	  driver.findElement(By.xpath("//input[@value='Login!']")).click();
	  
	  driver.findElement(By.cssSelector("a[href*='logout']")).click();
	  
	  driver.findElement(By.cssSelector("a[href*='index']")).click();
	  
	  driver.quit();
	  
  }
  public void f() {
  }
}
