package testnggpackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.AfterTest;

public class newtest3 {
	
	WebDriver driver;
	

  @Test
  public void Listbox() {
	  
	  driver.get("https://apps.fas.usda.gov/esrquery/esrq.aspx");
      
      List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@type='Checkbox']"));
      System.out.println(checkBoxes.size());
      
      for(int i=0; i<checkBoxes.size(); i++)
      {
          checkBoxes.get(i).click();
          
      
          //Ti check the all checkboxes selected or not by using is slected method
          if(checkBoxes.get(i).isSelected()){
          	
          	 System.out.println("checkBox is selected ");
               
          }else{
         	 System.out.println("checkBox is not selected "); 
          }   
          
      }
	  
  
    List<WebElement> radiobutton= driver.findElements(By.xpath("//input[@type='radio']"));
    
    
    //To prinf the size of Radio buttons radio.size() method
    
    System.out.println(radiobutton.size());
    
    //index value to check the radio button by loop
    
    for(int i=0;i<radiobutton.size(); i++){
    	
    	
    	//radio button are in I then click 
    	radiobutton.get(i).click();
    	
    	if(radiobutton.get(i).isSelected()){	
    
    	
    	System.out.println("Radio buttons are selected");
    	
    	
    		
   }else
    
        {
    	System.out.println("Not slelected" );
    	
      
    
  
        }
     }
    
 }
  
  
  
  
  
 
  
  
  
  
  @BeforeTest
  public void openbrowser() throws InterruptedException {
	  
		 //Geko driver path for new browsers
		 
		 System.setProperty("webdriver.gecko.driver", "/home/A10569/Desktop/RajAutomationFiles/geckodriver");
		  
		//  Open the Fire fox browser
		 
		 driver= new FirefoxDriver();
		 
		
		 
  }
	  

  @AfterTest
  public void afterTest() throws InterruptedException {
 
  
  Thread.sleep(9000);
   
 
}
  
}
  
