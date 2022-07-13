package Vendas;

public class Produto {

	private int idProduto;
	private String nome;
	private String modelo;
	private String descricaoProduto;

	public Produto(int idProduto, String nome, String modelo, String descricaoProduto) {
		super();
		this.idProduto = idProduto;
		this.nome = nome;
		this.modelo = modelo;
		this.descricaoProduto = descricaoProduto;
	}

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

	public String getDescricaoProduto() {
		return descricaoProduto;
	}

	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}

	@Override
	public String toString() {
		return "Produto [idProduto=" + idProduto + ", nome=" + nome + ", modelo=" + modelo + ", descricaoProduto="
				+ descricaoProduto + "]";
	}

}
