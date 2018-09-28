package testnggpackage;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;


public class Excelloginprogram1 {
	
	WebDriver driver;
	
	 
	 @BeforeTest
	  public void OpenBrowser() throws InterruptedException {

		  System.setProperty("webdriver.gecko.driver", "/home/A10569/Desktop/RajAutomationFiles/geckodriver");
		  driver=new FirefoxDriver();
		  driver.manage().window().maximize();
		
	     driver.get("https://dashboard-avenue2.askavenue.com/signin.");
		  
		  Thread.sleep(5000);
		  
		 
		  
	  }
	
	
	
  @Test
  public void f() throws InterruptedException, IOException, BiffException {
	  
	 
	  
	  FileInputStream fi= new FileInputStream("/home/A10569/Desktop/testdata1.xls");
	  
	  Workbook wb=Workbook.getWorkbook(fi);
	  
	  Sheet s=wb.getSheet(0);
	  
	  String username=s.getCell(0, 1).getContents();
	  String password=s.getCell(1,1).getContents();
	  
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	  driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/section/div/div/div/div/div[2]/form/div[1]/input")).sendKeys(username);
	
	  driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
	  
	 driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/section/div/div/div/div/div[2]/form/div[4]/button")).click();	  	 
	  
	 if(driver.getTitle().equals("avenue")){
		 
		 
		 System.out.println("Title verified");
		 
	 }else
	 {
		 
		 System.out.println("Title not verified");
	 }
	 
	 //clicking on drop down 
	 
	 driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/a")).click();
	 
	 //Click on logout
	 
	 driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/a[3]")).click();
	 
	 
	  }
  
 

  

  @AfterTest
  public void afterTest() {
	  
	  driver.quit();
  }

}
