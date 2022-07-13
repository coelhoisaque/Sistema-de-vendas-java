package Vendas;

import java.util.ArrayList;
import java.util.List;

public class Venda {
	Funcionario funcionario;

	Cliente cliente;

	List<Produto> produtos = new ArrayList();

	public Venda(Funcionario funcionario, Cliente cliente, List<Produto> produtos) {
		super();
		this.funcionario = funcionario;
		this.cliente = cliente;
		this.produtos = produtos;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(funcionario + " \n");
		sb.append(cliente + " \n");
		for (Produto p : produtos) {
			sb.append(p + "\n");
		}
		return sb.toString();
	}

}
