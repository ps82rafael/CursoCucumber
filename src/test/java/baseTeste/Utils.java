package baseTeste;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils extends BaseTeste {
		
	/**
	 * Metodo ir� selecionar o elemento
	 * @param select Recebe o valor do elemento
	 * @param value Esse parametro recebe o valor do campo select que voce pretende clicar 
	 */
	public void selectByValue(WebElement select, String value) {
		Select elemento = new Select(select);
		elemento.selectByVisibleText(value);;
	}
	
	public void preencheCampoTexto(WebElement elemento, String value) {
		elemento.sendKeys(value);		
		
	}
	
	public void mouseHover(WebElement elemento) {
		
		 Actions action = new Actions(driver);
		 action.moveToElement(elemento).build().perform();
	}
	

}

