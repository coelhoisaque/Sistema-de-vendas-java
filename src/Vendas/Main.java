package Vendas;

import Vendas.ui.CadastroClienteFrame;
import Vendas.ui.CadastroFuncionarioFrame;
import Vendas.ui.CadastroProdutoFrame;
import Vendas.ui.VendaFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        // Cria a janela principal
        JFrame frame = new JFrame("Sistema de Vendas");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        // Botões do menu
        JButton btnCadastrarCliente = new JButton("Cadastrar Cliente");
        JButton btnCadastrarFuncionario = new JButton("Cadastrar Funcionário");
        JButton btnCadastrarProduto = new JButton("Cadastrar Produto");
        JButton btnRealizarVenda = new JButton("Realizar Venda");

        // Adiciona os botões à janela
        frame.add(btnCadastrarCliente);
        frame.add(btnCadastrarFuncionario);
        frame.add(btnCadastrarProduto);
        frame.add(btnRealizarVenda);

        // Ações dos botões
        btnCadastrarCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new CadastroClienteFrame(); // Abre a tela de cadastro de cliente
            }
        });

        btnCadastrarFuncionario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new CadastroFuncionarioFrame(); // Abre a tela de cadastro de funcionário
            }
        });

        btnCadastrarProduto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new CadastroProdutoFrame(); // Abre a tela de cadastro de produto
            }
        });

        btnRealizarVenda.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new VendaFrame(); // Abre a tela de realização de venda
            }
        });

        // Exibe a janela
        frame.setVisible(true);
    }
}