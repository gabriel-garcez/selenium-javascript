package alerts;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class alerts {
	
	@Test
	public void manage() throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			WebDriver driver  = new ChromeDriver();	
		 
			 driver.get("http://demo.guru99.com/test/delete_customer.php");
		     driver.manage().window().maximize();
		     
		     //Click to appear alert
		     driver.findElement(By.name("cusid")).sendKeys("53920");					
		     driver.findElement(By.name("submit")).submit();	
		 
		     
			  // Switching to Alert        
			  Alert alert = driver.switchTo().alert();		
			        		
			   // Capturing alert message.    
			  String alertMessage= driver.switchTo().alert().getText();		
		        		
		      // Displaying alert message		
		      System.out.println(alertMessage);	
		      Thread.sleep(5000);
		        		
		      // Accepting alert		
		      alert.accept();
		      //or alert.cancel();
	     
	 
}
}
