package myselenium;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import junit.framework.Assert;

public class NewTest {

	
	private WebDriver driver;		
	@Test				
	public void testEasy() {	
		
		//System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32-83\\chromedriver.exe");	// <-- Change this path
	    System.setProperty("webdriver.chrome.driver","/home/edureka/chromedriver");
		//System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32-83\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://172.17.0.2/");  
		String title = driver.getTitle();
		Assert.assertTrue(title.contains("Home"));
		if (title.contains("Home")) { 
		//Assert.assertFalse(false);
		driver.quit();
		}
	}	
	@BeforeTest
	public void beforeTest() {	
	    //driver = new ChromeDriver();  
	}		
	@AfterTest
	public void afterTest() {
		driver.quit();			
	}
}
/*   public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32-83\\chromedriver.exe");	// <-- Change this path
       //System.setProperty("webdriver.chrome.driver","/home/edureka/chromedriver");
       WebDriver driver = new ChromeDriver();
		/*
		 * String baseUrl = "https://google.co.in"; String expectedTitle = "google";
		 */
	/* String baseUrl = "https://google.com/";
       driver.get(baseUrl);
       String title = driver.getTitle();
       Assert.assertTrue(title.contains("Google"));
   } */
	
