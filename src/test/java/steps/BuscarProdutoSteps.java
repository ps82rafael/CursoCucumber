package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import funcionalidade.AcessaSiteFuncionalidade;
import funcionalidade.HomeFuncionalidade;

public class BuscarProdutoSteps {
	
	
	AcessaSiteFuncionalidade acessar = new AcessaSiteFuncionalidade();
	HomeFuncionalidade home = new HomeFuncionalidade();

	
	@Dado("^acessar o site da Livelo$")
	public void acessar_o_site_da_Livelo() throws Throwable {
	   this.acessar.AcessarSite();
	}

	@Quando("^Digitar em busca Caixa JBL$")
	public void digitar_em_busca_Caixa_JBL() throws Throwable {
		this.home.inserirBusca();

	}

	@Quando("^Clicar em Enter$")
	public void clicar_em_Enter() throws Throwable {

	}

	@Dado("^Clicar em Caixa de Som Portatil JBL Charger$")
	public void clicar_em_Caixa_de_Som_Portatil_JBL_Charger() throws Throwable {
	    
	}

	@Quando("^Clicar em Selecione a Voltagem$")
	public void clicar_em_Selecione_a_Voltagem() throws Throwable {

	}

	@Quando("^Clicar e BIVOLT$")
	public void clicar_e_BIVOLT() throws Throwable {

	}

	@Entao("^Clicar em ADICIONAR AO CARRINHO$")
	public void clicar_em_ADICIONAR_AO_CARRINHO() throws Throwable {

	}

}
