package page;

import baseTeste.BaseTeste;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseTeste {

    public HomePage (WebDriver driver) {
        HomePage.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy (xpath = "//input[@id='search']")
    private WebElement inputBusca;
    
    @FindBy (xpath = " //div[@class='col-md-3 clpfeatureddesc']/descendant-or-self::a[@href='https://www.pontoslivelo.com.br/produto/caixa-de-som-portatil-jbl-charge-3-conexao-bluetooth-a-prova-dagua-vermelha-20w-LIVPTF8096933?search=Caixa JBL']")
    private WebElement ClickProduto;
    
    @FindBy (xpath = "//div[@class='col-md-12']/descendant-or-self::select[@id='option-0']")
    private WebElement selectBivolt;
    
    @FindBy (id = "option-0")
    private WebElement clickBivolt;
    
    @FindBy (xpath = "//input[@id='btn-add-to-cart']")
    private WebElement btnAdicionar;
    
    @FindBy (xpath = "//div[@id='headerCartDesk']/descendant-or-self::span[@class='item-cart']")
    private WebElement cartIcon;


	public WebElement getCartIcon() {
		return cartIcon;
	}

	public WebElement getBtnAdicionar() {
		return btnAdicionar;
	}

	public WebElement getSelectBivolt() {
		return selectBivolt;
	}

	public WebElement getClickBivolt() {
		return clickBivolt;
	}

	public WebElement getClickProduto() {
		return ClickProduto;
	}

	public WebElement getInputBusca() {
		return inputBusca;
	}
    
    

    
}
