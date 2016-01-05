package staticMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Payment 
{
	 public static WebElement credit(WebDriver driver)
	  {

	    WebElement element=driver.findElement(By.id("ccnum"));
	    
	    return element;
	    
	  }
	  
	  public static void card1(WebDriver driver,String num)
	  {

		  WebElement element=credit(driver);
		  
		  element.sendKeys(num);
	    
	  }
	  
	  public static WebElement name(WebDriver driver)
	  {

	    WebElement element=driver.findElement(By.id("ccname"));
	    
	    return element;
	    
	  }
	  
	  public static void name1(WebDriver driver,String num)
	  {

		  WebElement element=name(driver);
		  
		  element.sendKeys(num);
	    
	  }
	  
	  public static void expiry(WebDriver driver)
	  {

	 
	    Select month = new Select(driver.findElement(By.id("ccmonth")));
		month.selectByVisibleText("May");
	   
	    
	  }
	  
	  public static void exp(WebDriver driver)
	  {

	 
	    Select year = new Select(driver.findElement(By.id("ccyear")));
		year.selectByValue("2018");
	   
	    
	  }
	  
	  public static WebElement cvc(WebDriver driver)
	  {

	    WebElement element=driver.findElement(By.id("ccvc"));
	    
	    return element;
	    
	  }
	  
	  public static void num(WebDriver driver,String num)
	  {

		  WebElement element=cvc(driver);
		  
		  element.sendKeys(num);
	    
	  }
	  public static WebElement paynow(WebDriver driver)
		{
			
		    WebElement element=driver.findElement(By.id("paynow"));
		    
		    return element;
		  
		}
		public static void pay(WebDriver driver)
		{
			WebElement element=paynow(driver);
			
			element.click();
		}
	  
	  

}
