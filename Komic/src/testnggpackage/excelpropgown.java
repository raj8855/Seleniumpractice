package testnggpackage;

import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class excelpropgown {
	
	
	WebDriver driver;
  @Test
  public void f() throws BiffException, IOException {
	  
	  
	  driver.get("http://www.tizag.com/htmlT/htmlselect.php");
  
	  WebElement dd=driver.findElement(By.name("selectionField"));
	   
	  
	  //display total elements from dropdown
	  
	  
	    List<WebElement> dv=dd.findElements(By.tagName("option"));
	    
	    int d=dv.size();
	    
	    System.out.println("Dropdownvalues :"+d);
	    
	    
	   List ddvalues =new ArrayList();
	   
	   for(int i=0;i<d;i++){
		   
		   ddvalues.add(dv.get(i).getText());
		   
		   //to print the get text values
		   
		   System.out.println(dv.get(i).getText());
	   
	   
	   }
	 
	   
	   
  
	   FileInputStream ff=new FileInputStream("/home/A10569/Desktop/testdata1.xls");
  
	   Workbook wb=Workbook.getWorkbook(ff);
  
	   Sheet s=wb.getSheet(1);
  
	   //In total rows = all row in the Excel.
  
	   int totalrows= s.getRows();
 
	   System.out.println("Filled rows size in Excel  :"+totalrows);
 
	   //Create array list to store the all excel sgheet data

	   List xlvalues= new ArrayList();

		 
 
	   for(int j=0;j<totalrows;j++){
	 
		   xlvalues.add(s.getCell(0,j).getContents()); 
		  
           System.out.println(s.getCell(0,j).getContents());
	   } 
	   
	   
	   //Compare both arraylist  values starting  with size
	   
	   //here d= dropdown size
	   
	   //here totalrows =all total rows data in excel. 

	   if(d!=totalrows){
		   
		 System.out.println("dropdown values and Client Excel sheet dat not matched");
		 
		
	   }else{
		   
		   //if matched then compare the one b=y one values on available both arraylists 
		   
		   for(int k=0;k<d;k++){
			   
			   
			   //check the both values one by one
			   if(ddvalues.get(k).equals(xlvalues.get(k))){
				   
				   System.out.println("Data matches successfully one by one");
				   
			   }else{
				   
				   System.out.println("data not matched");
			   }
			   
		   }
		   
		   
		   
		   
		   
	   }
	   
	   
	   
	   
  }
  
  
  
  
  @BeforeClass
  public void beforeClass() {
	  
	  
	  System.setProperty("webdriver.gecko.driver", "/home/A10569/Desktop/RajAutomationFiles/geckodriver");

  	  driver=new FirefoxDriver();
  	  
  	  driver.manage().window().maximize();
  
	  
	  
  }
  
  
 
  
  

  @AfterClass
  public void afterClass() {
  }

}
