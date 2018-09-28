package testnggpackage;

import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.testng.annotations.BeforeClass;

import java.util.ArrayList;
import java.util.List;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class exceldrop2ndprogram {
	
	WebDriver driver;
	
	
	
	
	
  @Test
  public void f() throws BiffException, IOException {
	  
	  
	  
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
	 //Navigate to Url
	 
	 driver.get("http://www.tizag.com/htmlT/htmlselect.php");
	 //find drop down element 
	 
	  WebElement dropdownitem=driver.findElement(By.name("selectionField"));
	  
	  List<WebElement> dropdowncount=dropdownitem.findElements(By.tagName("option"));
	  
	  System.out.println("dropdown size:"+dropdowncount.size());
	 
	  //Get the list of all options
		for(WebElement e:dropdowncount){
		
				System.out.println("dropdown value: "+e.getText());
		}
				
      
	  FileInputStream ff= new FileInputStream("/home/A10569/Desktop/testdata1.xls");
	  
	  Workbook wb=Workbook.getWorkbook(ff);
	  

	  Sheet s=wb.getSheet(0);
	  
	  
	  int row= s.getRows();
	  
	 
	System.out.println("excelsheetsize:"+row);
	
     List xlvalues= new ArrayList<>();
	
     //Using for loop, we can iterate till the i value is true
     
     for(int i=0; i<row;i++){
    	 
    	 
     //read the data from excel sheet
    	 
    	 xlvalues.add(s.getCell(0,i).getContents()); 
    	 
    	
     }
	
	
    //  Creating arraylist for to store the drodown values 
     
     
     
    List ddvalues= new ArrayList<>();
     
     for(int j=0;j<dropdowncount.size();j++){
    	 
    	 
    	
    	 
    	ddvalues.add(dropdowncount.get(j).getText());
    	 
     }
     
   //Check for the required elements by Text and display matched elements and unmatched elements
     
     if(row!=dropdowncount.size())
  	{	         		
  		System.out.println("Size Not matched");
  	}
  	else{
  		for(int k=0;k<row;k++)
  		{
  			if(xlvalues.get(k).equals(ddvalues.get(k)))
  			{
  				System.out.println("Excel Data is Matching with Application Data");
  					}
  			else
  			{
  				System.out.println("Excel Data is not Matching with Application Data");
  			}
  	
         }
  }
}

  @AfterClass
  public void tearDown() 
  {
    
      driver.quit();
  }



  
  
  
  @BeforeClass
  public void openbrowser () {
	  
	  System.setProperty("webdriver.gecko.driver", "/home/A10569/Desktop/RajAutomationFiles/geckodriver");
	  driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  
	 

 }

  @AfterClass
  public void afterClass() {
  }

}
