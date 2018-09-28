package Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Excellogin1 {
	
	WebDriver driver;
	
	
  @Test
  public void f() throws BiffException, IOException {
	  
	  
	  FileInputStream fexcel=new FileInputStream("E:\\excelfiles\\Book1.xls");
  
       Workbook wb=Workbook.getWorkbook(fexcel);
  
       Sheet s=wb.getSheet(0);
       String  username=s.getCell(0,1).getContents();

      String Password=s.getCell(1,1).getContents();
      
     
      driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
      
      driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/section/div/div/div/div/div[2]/form/div[1]/input")).sendKeys(username);
      
      driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(Password);
      
      driver.findElement(By.xpath("//*[@id=\"password\"]")).click();
     // driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/section/div/div/div/div/div[2]/form/div[3]/div/div[1]/div/label")).click();
      driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/section/div/div/div/div/div[2]/form/div[4]/button")).click();
      
      

    String  title= driver.getTitle();
    
    System.out.println(title);
    
    if(title.equals("avenue")){
    	
    	System.out.println("Title verified");
    	
    }else {
    	
    	System.out.println("Title verified");
    }
      
	List<WebElement> total_links= driver.findElements(By.tagName("a"));
	
	System.out.println(total_links.size());
	
	//To get the links text 
	
	for(int i=0;i<=total_links.size();i++) {
		
		//To print all the links and get the text of those links below,
		
		System.out.println(total_links.get(i).getText()+i);
		
		
	}
	  
	  
  }
  
  
  
   
 
  @BeforeClass
  public void openbrowser() throws FileNotFoundException {
	  
	  
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Raj\\Desktop\\Automationfiles\\geckodriver-v0.19.0-win64\\geckodriver.exe");

	  driver=new FirefoxDriver();
	  
	  driver.get("http://dashboard.askavenue.com/signin");
	
	  

	  
//	  driver.get("http://www.nischint.com/secure/account.html#/sign-up");
  
  }

  @AfterClass
  public void afterClass() {
  }

}

