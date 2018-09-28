package kosmicfunctioalities;



import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.support.ui.WebDriverWait;

public class BrokerSignup {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.gecko.driver", "/home/A10569/Desktop/RajAutomationFiles/geckodriver");

		FirefoxDriver driver= new FirefoxDriver();
		
		//driver.manage().timeouts().implicitlyWait(10,Timeuinti(Seconds));
		
		driver.manage().timeouts().implicitlyWait(10, Seconds());
		driver.get("https://dashboard-avenue2.askavenue.com/signup");
		driver.findElement(By.id("firstName")).sendKeys("Automated");
		driver.findElement(By.id("lastName")).sendKeys("brokerage");
		driver.findElement(By.id("email")).sendKeys("testcyt+automatedbrrokerage@cytrion.com");
		driver.findElement(By.id("password")).sendKeys("oxalic");
		driver.findElement(By.id("phone")).sendKeys("9849022339");


		//Click on the check box

		List<WebElement> k=  driver.findElements(By.xpath("//input[@id='checkbox105']"));
  

		//System.out.println(k.size());

		for (int i=0;i<=k.size();i++){
	
			k.get(i).click();
		}
		//Point point= driver.findElement(By.id("checkbox105")).getLocation();
		//wait.until(ExpectedConditions.elementToBeClickable(By.id("checkbox105")));


		//driver.quit();









		//Select S= new Select(driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/section/div/div/div/div/div/div[2]/form/div[6]/div/label")));

		//driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/section/div/div/div/div/div/div[2]/form/div[6]/div/label")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/section/div/div/div/div/div/div[2]/form/div[7]/button")).click();
		
		//html/body/div[2]/div/div/div[1]/section/div/div/div/div/div/div[2]/form/div[6]/div/label

		//int i = driver.findElements(By.tagName("iframe")).size();
		//System.out.println(i);

		//driver.findElementById("avenueAppContent");
		//driver.switchTo().frame(0);
		//driver.findElement(By.xpath("/html/body/div/div/div/div[1]/img")).click();


			}

		private static TimeUnit Seconds() {
		// TODO Auto-generated method stub
		return null;
	}

}
////*[@id=\"checkbox105\"]