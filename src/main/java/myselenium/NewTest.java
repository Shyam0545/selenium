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
driver.get("https://www.google.com/"); 
//we expect the title “Google “ should be present 
String Expectedtitle = "Google";
//it will fetch the actual title 
String Actualtitle = driver.getTitle();
System.out.println("Before Assetion " + Expectedtitle + Actualtitle);
//it will compare actual title and expected title
Assert.assertEquals(Actualtitle, Expectedtitle);
//print out the result
System.out.println("After Assertion " + Expectedtitle + Actualtitle + " Title matched ");
 }
}