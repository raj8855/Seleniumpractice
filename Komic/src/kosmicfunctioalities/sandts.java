package kosmicfunctioalities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sandts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "/home/A10569/Desktop/RajAutomationFiles/geckodriver");

		
		WebDriver driver = new FirefoxDriver();
	
		// navigate the application url

		driver.get("https://www.sand.telangana.gov.in/TSSandPortal/Masters/Home.aspx");

		
		

	}

}
