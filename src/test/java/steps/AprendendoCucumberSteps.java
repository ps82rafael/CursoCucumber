package steps;
import static org.junit.Assert.assertTrue;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Assert;

import com.sun.jna.platform.unix.X11.XClientMessageEvent.Data;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class AprendendoCucumberSteps {

	@Dado("^que eu criei o arquivo coretamente$")
	public void queEuCrieiOArquivoCoretamente() throws Throwable {

	}

	@Quando("^executa-lo$")
	public void executaLo() throws Throwable {

	}

	@Entao("^a especificacao deve finalizar com sucesso$")
	public void aEspecificacaoDeveFinalizarComSucesso() throws Throwable {

	}

	private int contador = 0;

	@Dado("^que o valor do contador e (\\d+)$")
	public void que_o_valor_do_contador_e(int arg1) throws Throwable {

		contador = arg1;

	}

	@Quando("^eu incementar em (\\d+)$")
	public void eu_incementar_em(int arg1) throws Throwable {

		contador = contador + arg1;

	}

	@Entao("^o valor do contador sera (\\d+)$")
	public void o_valor_do_contador_sera(int arg1) throws Throwable {
		System.out.println(arg1);
		System.out.println(contador);
		assertTrue(arg1 == contador);
	}

	Date entrega = new Date();

	@Dado("^que o prazo e dia (\\d+)/(\\d+)/(\\d+)$")
	public void queOPrazoEDia(int dia, int mes, int ano) throws Throwable {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, dia);
		cal.set(Calendar.MONTH, mes - 1);
		cal.set(Calendar.YEAR, ano);
		entrega = cal.getTime();

	}

	@Quando("^a entrega a atrasar em (\\d+) (.+)$")
	public void aEntregaAAtrasarDias(int arg1, String tempo) throws Throwable {
		Calendar cal = Calendar.getInstance();
		cal.setTime(entrega);
		if (tempo.equals("dias")) {
			cal.add(Calendar.DAY_OF_MONTH, arg1);
		}
		if (tempo.equals("meses")) {
			cal.add(Calendar.MONTH, arg1);
		}
		entrega = cal.getTime();
	}

	@Entao("^a entrega se efetuada em (\\d{2}\\/\\d{2}\\/\\d{4})$")
	public void aEntregaSeEfetuadaEm(String data) throws Throwable {
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		String dataFormatada = format.format(entrega);
		Assert.assertEquals(data, dataFormatada);
	}
	
	@Dado("^que o ticket ? AF(\\d+)$")
	public void queOTicketAF(int arg1) throws Throwable {
	    	
	}

	@Dado("^que o valor da passagem ? R\\$ (\\d+),(\\d+)$")
	public void queOValorDaPassagemR$(int arg1, int arg2) throws Throwable {
	    
	}

	@Dado("^que o nome do passageiro ? \"([^\"]*)\"$")
	public void queONomeDoPassageiro(String arg1) throws Throwable {
	    
	}

	@Dado("^que o telefone do passageiro ? (\\d+)-(\\d+)$")
	public void queOTelefoneDoPassageiro(int arg1, int arg2) throws Throwable {
	   
	}

}
