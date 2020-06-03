package runner;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(plugin = "json:target/cucumber.json",
				
				features = {"src/test/resources/features/inserir_conta.feature"},
				glue = {"steps"},
			    tags = {"~@ignore"},
				//plugin = {"pretty", "html:target/report-html", "json:target/report.json"},
			    
			    

				monochrome = true,
				//snippets = SnippetType.CAMELCASE,
				dryRun = false,
				strict = false
				)
public class Runner {
	
	@BeforeClass
	public static void reset() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://srbarriga.herokuapp.com");
		driver.findElement(By.id("email")).sendKeys("ps.rafael@gmail.com");
		driver.findElement(By.id("senha")).sendKeys("baratao");
		driver.findElement(By.tagName("button")).click();
		driver.findElement(By.linkText("reset")).click();
		driver.quit();
		
		
	}
	
}
