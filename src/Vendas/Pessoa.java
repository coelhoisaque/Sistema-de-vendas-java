package Vendas;

public abstract class Pessoa {
	private String nome;
	private String endereco;
	private int contato;
	private int cpf;

	public Pessoa(String nome, String endereco, int contato, int cpf) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.contato = contato;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getContato() {
		return contato;
	}

	public void setContato(int contato) {
		this.contato = contato;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", endereco=" + endereco + ", contato=" + contato + ", cpf=" + cpf + "]";
	}

}
