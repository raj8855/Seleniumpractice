package testnggpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Avenuesignuptest {
	
  WebDriver driver;
  @Test
  public void Brokersignup() {
  
 

    driver.get("https://dashboard-avenue2.askavenue.com/signup");
    
    driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
    driver.findElement(By.id("firstName")).sendKeys("Automated");
    driver.findElement(By.id("lastName")).sendKeys("brokerage");
    driver.findElement(By.id("email")).sendKeys("testcyt+automatedbrokerage@cytrion.com");
    driver.findElement(By.id("password")).sendKeys("oxalic");
    driver.findElement(By.id("phone")).sendKeys("9849022339");

    
  } 
    
    

//driver.quit();


  
  @BeforeTest
  public void openbrowser() throws InterruptedException {
	  
		 //Geko driver path for new browsers
		 
		 System.setProperty("webdriver.gecko.driver", "/home/A10569/Desktop/RajAutomationFiles/geckodriver");
		  
		//  Open the Fire fox browser
		 
		 driver= new FirefoxDriver();
		 
		
		 
		 
	  }
  
  
  
  @AfterTest
  public void afterTest() {
	  
	  
	  
	  
  }

}
