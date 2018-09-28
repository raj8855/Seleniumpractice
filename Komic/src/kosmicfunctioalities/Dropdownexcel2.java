package Excel;

import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.testng.annotations.BeforeClass;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.testng.annotations.AfterClass;

public class Dropdownexcel2 {
	WebDriver driver;
	
	
  @Test
  public void f() throws BiffException, IOException, InterruptedException {
	  
	/*  FileInputStream ff=new FileInputStream("E:\\excelfiles\\Book1.xls");
	  
	  Workbook wb=Workbook.getWorkbook(ff);
	  
	  Sheet s=wb.getSheet(0);
	  
	  String username=s.getCell(0,1).getContents();
	  
	  String password= s.getCell(1,1).getContents();
	  
	  
	  

		// navigate the application url

	  driver.get("http://www.kosmiktechnologies.com/seleniumLiveProject/eKart/admin/");
	  
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  
	  driver.findElement(By.name("username")).sendKeys(username);
		
		// Enter the password
		
		driver.findElement(By.name("password")).sendKeys(password);
		
		// Clicking On Login Button
		
		driver.findElement(By.xpath("//*[@id='content']/div/div/div/div/div[2]/form/div[3]/button")).click();
	  
		if(driver.getTitle().equalsIgnoreCase("Dashboard")){
			
			System.out.println("Tittle Verified");
			
			
		}
		
		
		driver.findElement(By.xpath("/html/body/div[1]/nav/ul/li[2]/a")).click();
	
	
	
    
	  //To perform mouse hover action first we need to create Action class
		
		Actions act= new Actions(driver);
		
		act.moveToElement(hoveritem).build().perform();
		*/
     
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  driver.get("http://www.tizag.com/htmlT/htmlselect.php");
	  
	  Thread.sleep(10000);
	  
	  WebElement dropdownitem=driver.findElement(By.name("selectionField"));
	  
	  //display total elements from dropdownitem
	  
	  List<WebElement> dropdownCount=dropdownitem.findElements(By.tagName("option"));
	
	    
	   // Get the size of the List.
	    System.out.println("dropdown sise :"+dropdownCount.size());
	    //Get the list of all options
		for(WebElement e:dropdownCount){
			
			//Drop downlo values nkanuka text tho match ithe print in console
			
			System.out.println("dropdownitems:"+e.getText());
			
			
			FileInputStream ff=new FileInputStream("E:\\excelfiles\\Book1.xls");
			  
			  Workbook wb=Workbook.getWorkbook(ff);
			  
			  Sheet s=wb.getSheet(1);
			  
	         //count the rows from excel sheet
			
			int rows=s.getRows();
			System.out.println("Xlsheetrowites:"+rows);
			
			
			List xlvalues=new ArrayList<>();
		}
		
		
		
		
	  
	  
	  
	
	  
	  
	  
	  
	  
  }
  
  
  
  
  
  
  
  
  
  
 
  
  
  
  @BeforeClass
  public void beforeClass() {
	  
	  	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Raj\\Desktop\\Automationfiles\\geckodriver-v0.19.0-win64\\geckodriver.exe");
	  	
	 driver= new FirefoxDriver();
	 
	
  }

  
  
  
  
  @AfterClass
  public void afterClass() {
	  
   driver.quit();
  }

}
