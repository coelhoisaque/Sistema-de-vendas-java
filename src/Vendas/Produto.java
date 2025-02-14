package Vendas;

public class Produto {
	private int idProduto;
	private String nome;
	private String modelo;
	private String descricao;

	public Produto(int idProduto, String nome, String modelo, String descricao) {
		this.idProduto = idProduto;
		this.nome = nome;
		this.modelo = modelo;
		this.descricao = descricao;
	}

	// Getters e Setters
	public int getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Produto [idProduto=" + idProduto + ", nome=" + nome + ", modelo=" + modelo + ", descricao=" + descricao
				+ "]";
	}
}