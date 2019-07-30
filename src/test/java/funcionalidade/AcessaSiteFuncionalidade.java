package funcionalidade;

import baseTeste.BaseTeste;

public class AcessaSiteFuncionalidade extends BaseTeste {

	String url = "https://www.pontoslivelo.com.br/";

	public void AcessarSite() {
		driver.get(url);

	}
}