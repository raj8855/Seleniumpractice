package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Dropdownvalues {
	Web
	
	
	
  @Test
  public void f() {
	  
	  driver.get("http://www.nischint.com/secure/account.html#/sign-up");

	  Thread.sleep(10000);


	  WebElement dropdown=driver.findElement(By.name("country"));

	  //del= dropdown element list, dvl=dropdownvalueslist 

	  List<WebElement> del= dropdown.findElements(By.tagName("option"));


	  List<String> dvl= new ArrayList();

	  //ee is the web element name ,del is the which list we are retrieving

	  for(WebElement ee:del){

	  // adding values o dvl arraylist


	  dvl.add(ee.getText());

	  System.out.println(ee.getText());
	  } 

	  //here int is the data type declaration, drop down size is the name of all dropdown values 

	  int dropdownsize= dvl.size();

	  System.out.println(dropdownsize);

	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  
	  
	  System.setProperty("webdriver.gecko.driver", "/home/A"
			  + "top/RajAutomationFiles/geckodriver")
	  
	  driver=new FirefoxDriver();
	  driver.manage().window().maximize();

	  driver.get("https://dashboard-avenue2.askavenue.com/signin.");

	  Thread.sleep(5000);

	  
  }

  @AfterTest
  public void afterTest() {
  }

}











}










@BeforeTest
public void Openbrowser() throws InterruptedException {


System.setProperty("webdriver.gecko.driver", "/home/A"
  + "top/RajAutomationFiles/geckodriver");

}

@AfterTest
public void afterTest() {
}

}