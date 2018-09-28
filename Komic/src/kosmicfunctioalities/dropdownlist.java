package kosmicfunctioalities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class dropdownlist {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// open the firefox browser
		System.setProperty("webdriver.gecko.driver", "/home/A10569/Desktop/RajAutomationFiles/geckodriver");

		
				WebDriver driver = new FirefoxDriver();
			
				// navigate the application url

				driver.get("http://www.kosmiktechnologies.com/seleniumLiveProject/eKart/admin/");
				
				//enter the user name and password
			       
				
				driver.findElement(By.name("username")).sendKeys("Kadmin");
				
				// Enter the password
				
				driver.findElement(By.name("password")).sendKeys("K@admin");
				
				// Clicking On Login Button
				
				driver.findElement(By.xpath("//*[@id='content']/div/div/div/div/div[2]/form/div[3]/button")).click();
	     
              //IDENTIFY THE DASHBOARD TEXT
				
			String	text= driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/h1")).getText();
				
				//Print the Dashboard text
				
				System.out.println(text);
				
				
				//verify the dashboard text 
				
				if (text.equals("D")){
					
					System.out.println("Login page header text verified successfully");
				}else {
					
					
					System.out.println("Login page header text not verified successfully");
				}
				
				
             
	       
	        
	        	        
	   
	   
	        
}

		
	

