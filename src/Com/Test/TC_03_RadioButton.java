package Com.Test;

import Com.Wrapermethods.Reuseablemethods;
import Com.browser.Driver_Setup;

public class TC_03_RadioButton extends Driver_Setup{

	public static void main(String[] args) {
	
		Driver_Setup d=new Driver_Setup();		
		d.setDriver("CHROME", "https://www.facebook.com/");
		Reuseablemethods r=new Reuseablemethods(driver);
		r.Click("(//input[@name='sex'])[2]");   
		r.Click("(//input[@name='sex'])[1]");
		

	}

}
