package testnggpackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Autosearchresult {
 
WebDriver driver;
	
	
	
	
	@Test
  public void f() {
  
		String url="https://www.google.com/?gws_rd=ssl";
		driver.navigate().to(url);
	    
		driver.manage().window().maximize();
	
	driver.findElement(By.name("q")).sendKeys("Bestheaters in hyderabad");
	
	// autoSearchcount=driver.findElements(By.xpath("//*[@id='myInputautocomplete-list']/div"));
	
	
	
	
	
	
	
	}

	
	
	
	
	
	
	
	
	
	
	
  @BeforeTest
  public void openbrowser() {
	  
	  System.setProperty("webdriver.gecko.driver", "/home/A10569/Desktop/RajAutomationFiles/geckodriver");

	  	  driver=new FirefoxDriver();
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
