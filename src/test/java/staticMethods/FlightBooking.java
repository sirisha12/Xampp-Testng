package staticMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FlightBooking 
{
	public static void departure(WebDriver driver)
	  {

	    Select city = new Select(driver.findElement(By.xpath(".//*[@id='depart']/select")));
		city.selectByValue("London");
	    
	   }
	  
	 
	  
	  public static WebElement passDeparturedate(WebDriver driver)
		{
		
			WebElement element=driver.findElement(By.id("datepicker"));
		
			return element;
		
		}
		
		public static void passDeparturedateSendKeys(WebDriver driver,String passDeparture1)
		{
			WebElement element=passDeparturedate(driver);
		 
			element.sendKeys(passDeparture1);
		
		}
		
		public static void arrival(WebDriver driver)
		  {

		 
		    Select place = new Select(driver.findElement(By.xpath(".//*[@id='arrive']/select")));
			place.selectByValue("Sydney");
		   
		    
		  }
		  
		 
		  
		  public static WebElement passReturndate(WebDriver driver)
			{
			
				WebElement element=driver.findElement(By.id("datepicker1"));
			
				return element;
			
			}
			
			public static void passReturndateSendKeys(WebDriver driver,String passReturn1)
			{
				WebElement element=passReturndate(driver);
			 
				element.sendKeys(passReturn1);
			
			}
		  
			 public static WebElement passengers(WebDriver driver)
			  {

			    WebElement element=driver.findElement(By.xpath(".//*[@id='passengers']/input"));
			    
			    return element;
			    
			  }
			  
			  public static void number(WebDriver driver,String num)
			  {

				  WebElement element=passengers(driver);
				  
				  element.sendKeys(num);
			    
			  }
			  
			  public static WebElement roundtrip(WebDriver driver)
				{
				    
				    WebElement element=driver.findElement(By.id("tripcheckbox"));
				    
				    return element;
					
				}
				
				
				public static void roundtripClick(WebDriver driver)
				{
					WebElement element=roundtrip(driver);
					
					element.click();
					
				}
			  public static WebElement seating(WebDriver driver)
				{
				    
				    WebElement element=driver.findElement(By.id("aisle"));
				    
				    return element;
					
				}

				public static void seatingClick(WebDriver driver)
				{
					WebElement element=seating(driver);
					
					element.click();
					
				}
				
				  public static WebElement type(WebDriver driver)
					{
					    
					    WebElement element=driver.findElement(By.id("business"));
					    
					    return element;
						
					}

					public static void ticketClick(WebDriver driver)
					{
						WebElement element=type(driver);
						
						element.click();
						
					}
					public static WebElement confirm(WebDriver driver)
					{
						
					    WebElement element=driver.findElement(By.id("confirm"));
					    
					    return element;
					  
					}
					public static void button(WebDriver driver)
					{
						WebElement element=confirm(driver);
						
						element.click();
					}

}
