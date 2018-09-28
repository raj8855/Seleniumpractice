package Excel;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class FramesinGMAIL {
//	WebDriver
 
	
  @Test
  public void f() {
	  
	  
	//  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  
	  //driver.get("https://accounts.google.com/signin/v2/sl/pwd?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	 
	  //driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div[2]")).click();
	  
//List<WebElement> frames= driver.findElements(By.tagName("iframe"));

//System.out.println(frames.size());
	
	  
  }
  @BeforeClass
  public void openbrowser() {
	  
	  	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Raj\\Desktop\\Automationfiles\\geckodriver-v0.19.0-win64\\geckodriver.exe");
	  	
	  	
	//  	driver = new FirefoxDriver();
	  			
	  	
	  	
	  	
  }

  @AfterClass
  public void afterClass() {
  }

}
