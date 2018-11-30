package Com.browser;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


public class Driver_Setup {
	
	public static WebDriver driver;  
    
	 public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(String browserType, String appURL) {
		switch (browserType) {
		case "IE":
			driver = initIEDriver(appURL);
			break;
		case "CHROME":
			driver = initChromeDriver(appURL);
			break;
		case "FIREFOX":
			driver = initFirefoxDriver(appURL);
			break;
		}
	}
	
	private WebDriver initChromeDriver(String appURL) {
		System.out.println("Launching google chrome with new profile..");		
		System.setProperty("webdriver.chrome.driver","D:\\Softwares\\Selenium jar files and softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(appURL);
		return driver;
	}

	private WebDriver initFirefoxDriver(String appURL) {
		System.out.println("Launching Firefox browser..");
		System.setProperty("webdriver.gecko.driver","D:\\Softwares\\Selenium jar files and softwares\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to(appURL);
		return driver;
	}
	public WebDriver initIEDriver(String appURL) {
		System.out.println("Launching Internet Explorer with new profile..");
		System.setProperty("webdriver.ie.driver", "C:\\Users\\p c\\Downloads\\IEDriverServer_x64_3.14.0 (1)//IEDriverServer.exe");
		DesiredCapabilities cap = DesiredCapabilities.internetExplorer();
		cap.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
		cap.setCapability("nativeEvents", false);    
		cap.setCapability("unexpectedAlertBehaviour", "accept");
		cap.setCapability("ignoreProtectedModeSettings", true);
		cap.setCapability("disable-popup-blocking", true);
		cap.setCapability("enablePersistentHover", true);
		cap.setCapability("ignoreZoomSetting", true);
		cap.setJavascriptEnabled(true);	
		driver = new InternetExplorerDriver(cap);
		driver.manage().window().maximize();
		driver.navigate().to(appURL);
		return driver;
	}
}