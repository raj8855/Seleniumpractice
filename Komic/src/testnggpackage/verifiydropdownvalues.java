package testnggpackage;

import org.testng.annotations.Test;

import jxl.Workbook;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class verifiydropdownvalues {
	
	WebDriver driver;
 
	
	
	
	
	@Test
  public void checkdropdownvalues() throws InterruptedException, IOException {
		
		
		driver.get("http://www.nischint.com/secure/account.html#/sign-up");

			Thread.sleep(10000);
      
			
			WebElement dropdown=driver.findElement(By.name("country"));
			
			//del= dropdown element list, dvl=dropdownvalueslist 
        
      List<WebElement> dropdownelementlist= dropdown.findElements(By.tagName("option"));
      
      System.out.println(dropdownelementlist);
     
      List<String> dropdownvalueslist = new ArrayList();
      
      //ee is the web element name ,del is the which list we are retrieving
      
      for(WebElement ee:dropdownelementlist){
    	  
    	  // adding values o dvl arraylist
    	
    	  
    	  dropdownvalueslist.add(ee.getText());
    	  
    	  System.out.println(ee.getText());
      } 
      
      //here int is the data type declaration, drop down size is the name of all dropdown values 
      
      int dropdownsize= dropdownvalueslist.size();
        
System.out.println(dropdownsize);
      
      
      
      
      
     
      
     

  }
	@BeforeTest
  public void Openbrowser() throws InterruptedException {
	  
	  
	  System.setProperty("webdriver.gecko.driver", "/home/A10569/Desktop/RajAutomationFiles/geckodriver");
	  driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	
    // driver.get("https://dashboard-avenue2.askavenue.com/signin.");
	  
	 // Thread.sleep(5000);
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
