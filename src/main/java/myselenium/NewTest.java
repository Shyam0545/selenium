package myselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
 
public class NewTest
{
 
@Test
public void testgooglesearch(){

System.setProperty("webdriver.chrome.driver","/home/edureka/chromedriver");
WebDriver driver = new ChromeDriver();
//it will open the goggle page
driver.get("http://172.17.0.2"); 
//we expect the title “Google “ should be present 
String Expectedtitle = "Home";
//it will fetch the actual title 
String Actualtitle = driver.getTitle();
System.out.println("Before Assetion " + Expectedtitle + Actualtitle);
//it will compare actual title and expected title
Assert.assertEquals(Actualtitle, Expectedtitle);
//print out the result
System.out.println("After Assertion " + Expectedtitle + Actualtitle + " Title matched ");
 }
}