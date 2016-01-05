package staticMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home 
{

	
	public static WebElement checkBox(WebDriver driver)
	{
	    
	    WebElement element=driver.findElement(By.id("checkbox")); //here allocating an element
	    
	    return element;
		
	}
	
	
	public static void checkboxClick(WebDriver driver)
	{
		WebElement element=checkBox(driver);        //performing an operation in webelement //creating a object in web element
				
		element.click();							//webelement is a interface // element is object.
		
	}
	public static WebElement next(WebDriver driver)
	{
		
	    WebElement element=driver.findElement(By.id("next"));
	    
	    return element;
	  
	}
	public static void pageNext(WebDriver driver)
	{
		WebElement element=next(driver);
		
		element.click();
	}
	
}
