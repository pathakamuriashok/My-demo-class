package Com.Test;

import Com.Wrapermethods.Reuseablemethods;
import Com.browser.Driver_Setup;

public class TC_02_DynamicElements extends Driver_Setup{

	public static void main(String[] args) 
	{
		
		Driver_Setup d=new Driver_Setup();
		d.setDriver("CHROME", "https://www.facebook.com/");
		Reuseablemethods r=new Reuseablemethods(driver);
		r.Click("//input[starts-with(@id,'u_0_')]");
	}

}
