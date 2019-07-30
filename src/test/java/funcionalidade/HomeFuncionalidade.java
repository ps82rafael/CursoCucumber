package funcionalidade;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import baseTeste.BaseTeste;
import baseTeste.Utils;
import page.HomePage;

public class HomeFuncionalidade extends BaseTeste {

	HomePage homePage = new HomePage(driver);
	Utils utils = new Utils();

	public void inserirBusca(){
		
		this.utils.preencheCampoTexto(this.homePage.getInputBusca(),"Caixa JBL");
		this.homePage.getInputBusca().sendKeys(Keys.ENTER);
		this.homePage.getClickProduto().click();
		this.homePage.getSelectBivolt().click();
		this.utils.selectByValue(this.homePage.getClickBivolt(), "BIVOLT");
		this.homePage.getBtnAdicionar().click();
		this.utils.mouseHover(this.homePage.getCartIcon());
		
		
		
	}

}
