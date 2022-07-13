package Vendas;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Produto p = new Produto(001, "Arroz", "Comida", "Quente com carne");
		Produto p1 = new Produto(002, "Macarrão", "Comida", "Com Molho");
		Cliente c = new Cliente("joão", "Rua dos bobos n° 0", 34321456, 456271754, 226);
		Funcionario f = new Funcionario("Maria", "Rua dos Alfineiros", 88888888, 603660462, 1002);
		Venda v = new Venda(f, c, Arrays.asList(p, p1));
		System.out.println(v);
		 
		

	}

}
