package utilities;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class BrowserControl extends WebConnector{
	
	

	// Create method to open browser
	@Before
	public void openBrowser() {
		
		if(browserType.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "../AsdaSupermarket/src/test/java/resources/chromedriver.exe");
			driver = new ChromeDriver();
			
		}else if(browserType.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "../AsdaSupermarket/src/test/java/resources/geckodriver.exe");
			driver = new FirefoxDriver();
			
		}else if (browserType.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "../AsdaSupermarket/src/test/java/resources/MicrosoftWebDriver.exe");
			driver = new EdgeDriver();
			
		}else if (browserType.equalsIgnoreCase("opera")) {
			System.setProperty("webdriver.opera.driver", "../AsdaSupermarket/src/test/java/resources/operadriver.exe");
			driver = new OperaDriver();
		}

		driver.manage().window().maximize();
		
	}
	
	@After
	public void closeBrowser() {
		
		driver.quit();
		
	}

}
