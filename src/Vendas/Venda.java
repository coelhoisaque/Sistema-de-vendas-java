package Vendas;

import java.util.List;

public class Venda {
	private Funcionario funcionario;
	private Cliente cliente;
	private List<Produto> produtos;

	public Venda(Funcionario funcionario, Cliente cliente, List<Produto> produtos) {
		this.funcionario = funcionario;
		this.cliente = cliente;
		this.produtos = produtos;
	}

	@Override
	public String toString() {
		return "Venda [funcionario=" + funcionario + ", cliente=" + cliente + ", produtos=" + produtos + "]";
	}
}