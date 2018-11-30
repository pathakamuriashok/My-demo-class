package Com.Wrapermethods;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

public class Reuseablemethods 
{
	 	/**
       * @author p c
       * Following method will be used to enter the text
       */
	static WebDriver driver =null;
	public Reuseablemethods(WebDriver d)
    {
	this.driver = d;
    }
      public void SendKeys(String xpath,String text)
      {
    	  try {
    	   	  driver.findElement(By.xpath(xpath)).sendKeys(text);
 		} catch (Exception e) {
     System.out.println("-------"+e.getMessage());  
     e.printStackTrace();
		}
       }
      /**
       * @author p c
       * Following method will be used to click on web element
       * @param xpath
       */
      public void Click(String xpath){
    	  try {
    	 	  driver.findElement(By.xpath(xpath)).click();		
    	} catch (Exception e) {
			System.out.println("in click method   :: "+e.getMessage());  
			e.printStackTrace();
		}
      }
}
