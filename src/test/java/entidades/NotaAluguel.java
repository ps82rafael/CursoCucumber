package entidades;

import java.util.Date;

public class NotaAluguel {
	
	private int preco;
	private Date dateEntrega;
	private int pontuacao;

	public int getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}

	public Date getDataEntrega() {
		
		return dateEntrega;
	}

	public void setDataEntrega(Date time) {
		dateEntrega = time;
		
	}

	public Object getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}
	
	

}
