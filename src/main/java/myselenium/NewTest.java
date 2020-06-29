package myselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
 
public class NewTest
{
 
@Test
public void testgooglesearch(){

System.setProperty("webdriver.chrome.driver","/home/edureka/chromedriver");

ChromeOptions options = new ChromeOptions();
options.addArguments("--no-sandbox");
options.addArguments("--disable-dev-shm-usage");
options.addArguments("--headless");
WebDriver driver = new ChromeDriver(options);
//it will open the goggle page
driver.get("http://172.17.0.2"); 
//we expect the title “Google “ should be present 
String Expectedtitle = "Home | Simple PHP Website";
//it will fetch the actual title 
String Actualtitle = driver.getTitle();
System.out.println("Before Assetion " + Expectedtitle + Actualtitle);
//it will compare actual title and expected title
Assert.assertEquals(Actualtitle, Expectedtitle);
//print out the result
System.out.println("After Assertion " + Expectedtitle + Actualtitle + " Title matched ");
 }
}