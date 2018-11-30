package Com.Test;


import Com.Wrapermethods.Reuseablemethods;
import Com.browser.Driver_Setup;

public class TC_01 extends Driver_Setup
{
	
	public static void main(String[] args) 
	{ 
		Driver_Setup d=new Driver_Setup();
		
		d.setDriver("CHROME", "https://www.facebook.com/");
		
		Reuseablemethods r=new Reuseablemethods(driver);
		
		r.SendKeys("//*[@id='email']","pathakamuriashok@gmail.com");
		r.SendKeys("//input[@id='pass']","jkalsdfkjldsjjfsl");
		r.Click("//input[@id='pass']//following::input[1]");  
		 
	}
}