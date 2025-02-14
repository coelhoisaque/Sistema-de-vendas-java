package Vendas.ui;

import Vendas.Cliente;
import Vendas.dao.ClienteDAO;
import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;

public class CadastroClienteFrame extends JFrame {
    private JTextField nomeField, enderecoField, contatoField, cpfField;

    public CadastroClienteFrame() {
        setTitle("Cadastro de Cliente");
        setLayout(new GridLayout(5, 2));
        setSize(400, 300);

        add(new JLabel("Nome:"));
        nomeField = new JTextField();
        add(nomeField);

        add(new JLabel("Endereço:"));
        enderecoField = new JTextField();
        add(enderecoField);

        add(new JLabel("Contato:"));
        contatoField = new JTextField();
        add(contatoField);

        add(new JLabel("CPF:"));
        cpfField = new JTextField();
        add(cpfField);

        JButton salvarButton = new JButton("Salvar");
        salvarButton.addActionListener(e -> salvarCliente());
        add(salvarButton);

        setVisible(true);
    }

    private void salvarCliente() {
        Cliente cliente = new Cliente(
            nomeField.getText(),
            enderecoField.getText(),
            Integer.parseInt(contatoField.getText()),
            Integer.parseInt(cpfField.getText()),
            0 // ID será gerado pelo banco
        );
        try {
            new ClienteDAO().inserir(cliente);
            JOptionPane.showMessageDialog(this, "Cliente salvo!");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}