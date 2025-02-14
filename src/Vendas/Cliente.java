package Vendas;

public class Cliente extends Pessoa {
	private int idCliente;

	public Cliente(String nome, String endereco, int contato, int cpf, int idCliente) {
		super(nome, endereco, contato, cpf);
		this.idCliente = idCliente;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nome=" + getNome() + "]";
	}
}