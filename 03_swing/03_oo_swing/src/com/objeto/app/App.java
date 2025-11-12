package com.objeto.app;

import javax.swing.JOptionPane;

import com.objeto.models.Pessoa;
public class App {
    public static void main(String[] args) throws Exception {
        Pessoa usuario = new Pessoa();

        // entrada de dados
        usuario.setNome(JOptionPane.showInputDialog("Informe seu nome:"));
        usuario.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade")));
        usuario.setCpf(JOptionPane.showInputDialog("informe o cpf"));
        usuario.setEmail(JOptionPane.showInputDialog("informe o email"));
        usuario.setTelefone(JOptionPane.showInputDialog("informe o telefone"));

        //saida de dados
        JOptionPane.showMessageDialog(null, 
        
        "\nDADOS DO USUARIO:\nNome: " + usuario.getNome()+
        "\nidade: " + usuario.getIdade()+
        "\nCpf: " + usuario.getCpf()+
        "\nEmail: " + usuario.getEmail()+
        "\nTelefone: " + usuario.getTelefone()
        );

    }
}
