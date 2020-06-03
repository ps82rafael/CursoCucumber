package steps;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.junit.Assert;

import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import entidades.Filme;
import entidades.NotaAluguel;
import entidades.TipoAluguel;
import utils.AluguelService;
import utils.DateUtils;

public class AlugarFilmeSteps {

	private Filme filme;
	private AluguelService aluguel = new AluguelService();
	private NotaAluguel nota;
	private String Erro;
	private TipoAluguel tipoAluguel;

	@Dado("^um filme com estoque com (\\d+) unidades$")
	public void um_filme_com_estoque_com_unidades(int arg1) throws Throwable {
		filme = new Filme();
		filme.setEstoque(arg1);

	}

	@Dado("^que o preco de aluguel seja R\\$ (\\d+)$")
	public void que_o_preco_de_aluguel_seja_R$(int arg1) throws Throwable {
		filme.setAluguel(arg1);
	}

	@Quando("^Alugar$")
	public void alugar() throws Throwable {
		try {
			nota = aluguel.alugar(filme, tipoAluguel);
		} catch (RuntimeException e) {
			Erro = e.getMessage();
		}

	}

	@Entao("^o preco do aluguel sera R\\$ (\\d+)$")
	public void o_preco_do_aluguel_sera_R$(int arg1) throws Throwable {
		Assert.assertEquals(arg1, nota.getPreco());
	}

	@Entao("^o estoque do filme sera (\\d+) unidade$")
	public void o_estoque_do_filme_sera_unidade(int arg1) throws Throwable {
		Assert.assertEquals(arg1, filme.getEstoque());

	}

	@Entao("^nao sera possivel por falta de estoque$")
	public void nao_sera_possivel_por_falta_de_estoque() throws Throwable {
		Assert.assertEquals("Filme Sem Estoque", Erro);

	}

	@Dado("^que o tipo do aluguel seja (.*)$")
	public void que_o_tipo_do_aluguel_seja_extendido(String tipo) throws Throwable {
		tipoAluguel = tipo.equals("semanal") ? TipoAluguel.SEMANAL
				: tipo.equals("extendido") ? TipoAluguel.EXTENDIDO : TipoAluguel.COMUM;

	}

	@Entao("^a data de entrega sera em (\\d+) dias$")
	public void a_data_de_entrega_sera_em_dias(int arg1) throws Throwable {
		Date dataEsperada = DateUtils.obterdataDiferencaDias(arg1);
		Date dataReal = nota.getDataEntrega();

		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");

		Assert.assertEquals(format.format(dataEsperada), format.format(dataReal));
	}

	@Entao("^a pontuacao sera de (\\d+) pontos$")
	public void a_pontuacao_sera_de_pontos(int arg1) throws Throwable {
		Assert.assertEquals(arg1, nota.getPontuacao());
	}
	
	@Dado("^um filme$")
	public void um_filme(DataTable table) throws Throwable {
	    Map<String, String> map = table.asMap(String.class, String.class);
	    filme = new Filme();
	    filme.setEstoque(Integer.parseInt(map.get("estoque")));
	    filme.setAluguel(Integer.parseInt(map.get("preco")));
	    String tipo = map.get("tipo");
	    tipoAluguel = tipo.equals("semanal") ? TipoAluguel.SEMANAL
				: tipo.equals("extendido") ? TipoAluguel.EXTENDIDO : TipoAluguel.COMUM;

	}


}
