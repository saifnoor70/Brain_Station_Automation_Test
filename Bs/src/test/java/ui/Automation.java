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
			
			String email = "saifalnoor70@gmail.com";
			String pass =  "12345abc";
			
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://automationpractice.com/index.php ");
			
			driver.manage().deleteAllCookies(); 
			
			WebElement signIn = driver.findElementByXPath("//a[@class='login']");
			signIn.click();
			
		    WebElement signInEmail =driver.findElementByXPath("//input[@name='email_create']");
		    signInEmail.sendKeys(email);
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
	      
	      WebElement firstName =driver.findElement(By.id("customer_firstname"));
	      firstName.sendKeys("SAIF");
	      
	      WebElement lastName =driver.findElement(By.id("customer_lastname"));
	      lastName.sendKeys("NOOR");
	      
	      WebElement password =driver.findElementByXPath("//input[@type='password']");
	      password.sendKeys(pass);
	      
	      Select daysDropDown =new Select(driver.findElementByXPath("//select[@id='days']"));
	      daysDropDown.selectByValue("10");
	      
	      Select monthsDropDown =new Select(driver.findElementByXPath("//select[@id='months']"));
	      monthsDropDown.selectByValue("8");
	      
	      Select yearsDropDown =new Select(driver.findElementByXPath("//select[@id='years']"));
	      yearsDropDown.selectByValue("1985");
	      
	      WebElement newsLetterCheckBox = driver.findElementByXPath("//input[@name='newsletter']");
	      newsLetterCheckBox.click();
	      
	      WebElement company = driver.findElementByXPath("//input[@id='company']");
	      company.sendKeys("Brain Station23");
	      
	    
	      
	      WebElement address1 = driver.findElementByXPath("//input[@id='address1']");
	      address1.sendKeys("66, Mohakhali, Dhaka ");
	      
	    
	      WebElement address2 = driver.findElementByXPath("//input[@id='address2']");
	      address2.sendKeys("GP-CHHA BLOCK ");
	   
	      WebElement city = driver.findElementByXPath(" //input[@id='city']");
	      city.sendKeys("Dhaka");
	    
	      
	      Select stateDropDown =new Select(driver.findElementByXPath("//select[@id='id_state']"));
	      stateDropDown.selectByValue("3");
	      
	   
	      WebElement postCode = driver.findElementByXPath("//input[@id='postcode']");
	      postCode.sendKeys("85027");
	    
	      
	      WebElement additionalInfo = driver.findElementByXPath("//textarea[@name='other']");
	      additionalInfo.sendKeys("Brain Station23 is a Software Development Company");
	      
	      WebElement homePhone =driver.findElementByXPath("//input[@id='phone']");
	      homePhone.sendKeys("01913594372");
	      
	    
	      
	      WebElement mobilePhone =driver.findElementByXPath("//input[@id='phone_mobile']");
	      mobilePhone.sendKeys("01571306571");
	   
	      WebElement aliasAddress =driver.findElementByXPath(" //input[@id='alias']");
	      aliasAddress.clear(); 
	      aliasAddress.sendKeys("Mohakhali");
	    
	      WebElement submitAccount =driver.findElementByXPath("//button[@id='submitAccount']");
	      submitAccount.click();
	      
	      try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	      
	      WebElement logOut= driver.findElementByXPath("//a[@title='Log me out']");
	      logOut.click();
	      
	      WebElement logInEmail =driver.findElementByXPath("//input[@id='email']");
	      logInEmail.sendKeys(email);
	      
	      WebElement logInPassword =driver.findElementByXPath("//input[@id='passwd']");
	      logInPassword.sendKeys(pass);
	      
	      WebElement signInButton =driver.findElementByXPath("//button[@id='SubmitLogin']");
	      signInButton.click();
	      
	      String customerAccountName = driver.findElementByXPath("//a[@title='View my customer account']").getText();
	      
	      if(customerAccountName.equals("SAIF NOOR")) {
	   	  System.out.println("The Account Has been Created Successfully");
	      }
	     
	    
	     
		}
	
	}
