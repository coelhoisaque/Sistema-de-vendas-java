package Vendas;

public class Cliente extends Pessoa {

	int idCliente;

	public Cliente(String nome, String endereco, int contato, int cpf, int idCliente) {
		super(nome, endereco, contato, cpf);
		this.idCliente = idCliente;
	}

	int getIdCliente() {
		return idCliente;
	}

	void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + "]";
	}

}
