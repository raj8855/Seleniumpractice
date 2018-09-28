package testnggpackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.AfterClass;

public class NewTest1 {
	
	WebDriver  driver;
	
  @Test
  public void verifyloginpage() throws InterruptedException {
	  
	  System.out.println("NewTest1.verifyloginpage()");
	
	  //Navigate the application URl
	  
	  driver.get("http://www.kosmiktechnologies.com/seleniumLiveProject/eKart/admin/");
	  
	  
	  
	  //Wait command 
	  
	  Thread.sleep(1000);
	  
	  //Get the Title of the WebPage
	  
	  String webpagetitle= driver.getTitle();
	  
	  //Print the title of the webpage
	  
	  System.out.println(webpagetitle);
	  
	//Verify Title of the WebPage
	  
	  if(webpagetitle.equals("Administration")){
		  
		  System.out.println("Web page tittle verified");
	  }else
	  {
		  System.out.println("Wep page tittle not verified successfully");
	  }
	
	   // Enter the User name
		
			driver.findElement(By.name("username")).sendKeys("Kadmin");
			
			// Enter the password
			
			driver.findElement(By.name("password")).sendKeys("K@admin");
			
			// Clicking On Login Button
			
			driver.findElement(By.xpath("//*[@id='content']/div/div/div/div/div[2]/form/div[3]/button")).click();
  
     //Identify and get the Dashboard Text 
			
		String	dashboardtext= driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/h1")).getText();
			
	    //Print the text 		
  
       System.out.println(dashboardtext);
       
       //To verify whether the welcome page successfully opened or not
  
       if(dashboardtext.equals("Dashboard")){
    	   
    	   System.out.println("Login page verified successfullay");
    	   
       }
       else{
    	   
    	   System.out.println("Login page notverified successfully");    
             
       
      }
       
       //Clicking On Logout Button
       
      driver.findElement(By.xpath("/html/body/div[1]/header/ul/li[3]/a/span")).click();
       
       
    
  }
  
  
 @BeforeClass
  
  public void openbrowser() {
	  
	 //Geko driver path for new browsers
	 
	 System.setProperty("webdriver.gecko.driver", "/home/A10569/Desktop/RajAutomationFiles/geckodriver");
	  
	//  Open the Fire fox browser
	 
	 driver= new FirefoxDriver();
	 
	 
  }

  @AfterClass
  public void closebrowser() {
 System.out.println("NewTest1.closebrowser()");

	  
	  //driver.close();

}


}


