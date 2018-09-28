package Excel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AvenueSignup {
	
	WebDriver driver;

	
  @Test
  public void f() throws InterruptedException {
	  
	  driver.manage().timeouts().implicitlyWait(19,TimeUnit.SECONDS);
	  
	 
	  driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Test");
	  
	  driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("NG");
	  
	  driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("testcyt+testNG@cytrion.com");
	  
	  driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("oxalic");
	  
	  driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("9849898498");
	  Thread.sleep(20000);
	  
	  driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/section/div/div/div/div/div/div[2]/form/div[6]/div/label")).click();
	    
	  
	  
	
}
  @BeforeClass
  public void beforeClass() {
	  
	  
  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Raj\\Desktop\\Automationfiles\\geckodriver-v0.19.0-win64\\geckodriver.exe");
	  
	  driver=new FirefoxDriver();
	  
	  driver.get("https://dashboard.askavenue.com/signup");
	  
  }

  @AfterClass
  public void afterClass() {
	  
	  //driver.close();
  }

}

