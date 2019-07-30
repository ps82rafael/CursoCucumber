package testes;

import org.junit.Test;
import steps.BuscarProdutoSteps;
public class AddProdutoTeste {
	
	BuscarProdutoSteps produtosSteps = new BuscarProdutoSteps();

	@Test
	public void TesteCompras() throws Throwable {
		produtosSteps.acessar_o_site_da_Livelo();
		produtosSteps.digitar_em_busca_Caixa_JBL();
	}
	
}
