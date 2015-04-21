package seneniumTest;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;




public class TestCase {
	
	@Test(invocationCount=5)
	public static void loadTestThisWebsite()
	{
		WebDriver driver = new FirefoxDriver();		
		//driver.get("http://www.google.com");
		driver.navigate().to("http://google.com");
		System.out.println("Page Title is " + driver.getTitle());
		Assert.assertEquals("Google", driver.getTitle(), "Bad Title");
		driver.quit();
	}
	
	@Test(invocationCount=10, threadPoolSize=3)
	public static void testThreadPools() {
		System.out.printf("Thread Id: %s%n", Thread.currentThread().getId());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws Exception {

		loadTestThisWebsite();
		//testThreadPools();
    }
	
	

}
