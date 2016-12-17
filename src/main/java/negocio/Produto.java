package negocio;

import java.util.Date;

public class Produto {

	private String nome;
	private double preco;
	private double desconto;
	private Date validade;

	public Date getValidade() {
		return validade;
	}

	public void setValidade(Date validade) {
		this.validade = validade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	
	public boolean isDescontoValido() {
		return getDesconto() >= 0 && getDesconto() < 1;
	}
}
