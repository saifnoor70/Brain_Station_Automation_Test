package ui;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Cookie;

//import org.testng.Assert;
//import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\browser_driver\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php ");
		
		driver.manage().deleteAllCookies(); 
		
		WebElement signin = driver.findElementByXPath("//a[@class='login']");
		signin.click();
		
	driver.findElementByXPath("//input[@name='email_create']").sendKeys("ieee.ieacon2021@gmail.com");
		//give_email
       
		driver.findElementByXPath("//button[@id=\'SubmitCreate\']").click();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        WebElement radio1 = driver.findElementByXPath("//input[@id='id_gender1']");
        
      radio1.click();
      
      WebElement firstname =driver.findElement(By.id("customer_firstname"));
      firstname.sendKeys("SAIF");
      
      WebElement lastname =driver.findElement(By.id("customer_lastname"));
      lastname.sendKeys("NOOR");
      
      WebElement password =driver.findElementByXPath("//input[@type='password']");
      password.sendKeys("12345");
      
      Select days_dropdown =new Select(driver.findElementByXPath("//select[@id='days']"));
      days_dropdown.selectByValue("10");
      
      Select months_dropdown =new Select(driver.findElementByXPath("//select[@id='months']"));
      months_dropdown.selectByValue("8");
      
      Select years_dropdown =new Select(driver.findElementByXPath("//select[@id='years']"));
      years_dropdown.selectByValue("1985");
      
      WebElement newsletter_checkbox = driver.findElementByXPath("//input[@name='newsletter']");
      newsletter_checkbox.click();
      
      WebElement company = driver.findElementByXPath("//input[@id='company']");
      company.sendKeys("Brain Station23");
      
    
      
      WebElement address1 = driver.findElementByXPath("//input[@id='address1']");
      address1.sendKeys("66, Mohakhali, Dhaka ");
      
    
      WebElement address2 = driver.findElementByXPath("//input[@id='address2']");
      address2.sendKeys("GP-CHHA BLOCK ");
   
      WebElement city = driver.findElementByXPath(" //input[@id='city']");
      city.sendKeys("Dhaka");
    
      
      Select state_dropdown =new Select(driver.findElementByXPath("//select[@id='id_state']"));
      state_dropdown.selectByValue("3");
      
   
      WebElement postcode = driver.findElementByXPath("//input[@id='postcode']");
      postcode.sendKeys("85027");
    
      
      WebElement additional_info = driver.findElementByXPath("//textarea[@name='other']");
      additional_info.sendKeys("Brain Station23 is a Software Development Company");
      
      WebElement home_phone =driver.findElementByXPath("//input[@id='phone']");
      home_phone.sendKeys("01913594372");
      
    
      
      WebElement mobile_phone =driver.findElementByXPath("//input[@id='phone_mobile']");
      mobile_phone.sendKeys("01571306571");
   
      WebElement alias_address =driver.findElementByXPath(" //input[@id='alias']");
      alias_address.sendKeys("Mohakhali");
    
      WebElement submit_account =driver.findElementByXPath("//button[@id='submitAccount']");
      submit_account.click();
      
      try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      
         
      String customer_account_name = driver.findElementByXPath("//a[@title='View my customer account']").getText();
      
     if(customer_account_name.equals("SAIF NOOR")) {
   	 System.out.println("The Account Has been Created Successfully");
     }
     
    // System.out.println(customer_account_name);
     
    
      
      
      
      
      
      
      
    
     
	}

}
