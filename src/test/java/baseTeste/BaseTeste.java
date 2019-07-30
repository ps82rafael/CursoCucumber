package baseTeste;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import cucumber.api.java.Before;

public class BaseTeste {
	protected static WebDriver driver;
	protected static WebDriverWait wait;
	
	public BaseTeste() {
		iniciaDriver(true);
	}
	
	protected static void iniciaDriver(boolean maximizar) { 
		if(driver == null) {
			System.setProperty("webdriver.chrome.driver",
		    	"./drivers/Chrome01/chromedriver.exe");
		    driver = new ChromeDriver();
		    wait = new WebDriverWait(driver,20000000);
		    
		    if (maximizar == true) {
		    	driver.manage().window().maximize();
		    }  
		}
	}
	
	// Finalizar o chrome
	protected static void  finalizar() {
		driver.close();
		
	}
	
	
}
