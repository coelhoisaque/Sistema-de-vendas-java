package Vendas;

public class Funcionario extends Pessoa {
	private int idFuncionario;

	public Funcionario(String nome, String endereco, int contato, int cpf, int idFuncionario) {
		super(nome, endereco, contato, cpf);
		this.idFuncionario = idFuncionario;
	}

	public int getIdFuncionario() {
		return idFuncionario;
	}

	public void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

	@Override
	public String toString() {
		return "Funcionario [idFuncionario=" + idFuncionario + ", nome=" + getNome() + "]";
	}
}