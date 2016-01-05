package staticMethods;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SignUp
{
	
	
	public static WebElement passForename(WebDriver driver)
	{
	
		WebElement element=driver.findElement(By.id("forenames")); //
	
		return element;
	
	}
	
	public static void passForenameSendKeys(WebDriver driver,String passForename1)
	{
		WebElement element=passForename(driver);
	 
		element.sendKeys(passForename1);
	
	}

	public static WebElement passSurname(WebDriver driver)
	{
	
		WebElement element=driver.findElement(By.id("surename"));
	
		return element;
	
	}
	
	public static void passSurnameSendKeys(WebDriver driver,String passSurname1)
	{
		WebElement element=passSurname(driver);
	 
		element.sendKeys(passSurname1);
	
	}
	
	public static WebElement applyRadio(WebDriver driver)
	{
	    
	    WebElement element=driver.findElement(By.id("radiof"));
	    
	    return element;
		
	}

	public static void radioClick(WebDriver driver)
	{
		WebElement element=applyRadio(driver);
		
		element.click();
		
	}
	
	public static WebElement passAddress(WebDriver driver)
	{
	
		WebElement element=driver.findElement(By.id("address1"));
	
		return element;
	
	}
	
	public static void passAddressSendKeys(WebDriver driver,String passAddress1)
	{
		WebElement element=passAddress(driver);
	 
		element.sendKeys(passAddress1);
	
	}
	
	public static WebElement passAddress2(WebDriver driver)
	{
	
		WebElement element=driver.findElement(By.id("address2"));
	
		return element;
	
	}
	
	public static void passAddress2SendKeys(WebDriver driver,String passAddress3)
	{
		WebElement element=passAddress2(driver);
	 
		element.sendKeys(passAddress3);
	
	}
	
	
	public static WebElement passCity(WebDriver driver)
	{
	
		WebElement element=driver.findElement(By.id("city"));
	
		return element;
	
	}
	
	public static void passCitySendKeys(WebDriver driver,String passCity1)
	{
		WebElement element=passCity(driver);
	 
		element.sendKeys(passCity1);
	
	}
	

	  public static WebElement postalCode(WebDriver driver)
	  {

	    WebElement element=driver.findElement(By.id("postalcode"));
	    
	    return element;
	    
	  }
	  
	  public static void code(WebDriver driver,String num)
	  {

		  WebElement element=postalCode(driver);
		  
		  element.sendKeys(num);
	    
	  }
	  
	  public static WebElement number(WebDriver driver)
	  {

	    WebElement element=driver.findElement(By.id("telephone"));
	    
	    return element;
	    
	  }
	  
	  public static void phone(WebDriver driver,String num)
	  {

		  WebElement element=number(driver);
		  
		  element.sendKeys(num);
	    
	  }
	  

	  public static void county(WebDriver driver)
	  {

		  Select country = new Select(driver.findElement(By.name("country")));
		  country.selectByVisibleText("India");
	    
	  }
	  
	  
	  
	  public static WebElement submit(WebDriver driver)
		{
			
		    WebElement element=driver.findElement(By.xpath("//input[@id='submit']"));
		    
		    return element;
		  
		}
		public static void pageNext1(WebDriver driver)
		{
			WebElement element=submit(driver);
			
			element.click();
		}
		
}
