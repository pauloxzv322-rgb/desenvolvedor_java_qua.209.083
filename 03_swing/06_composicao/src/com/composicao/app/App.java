package com.composicao.app;

import javax.swing.JOptionPane;

import com.composicao.models.Pessoa;
import com.composicao.models.Veiculo;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa motorista = new Pessoa();
        Veiculo carro = new Veiculo();

        //entrada de dados do motorista
        motorista.setNome(JOptionPane.showInputDialog("informe o nome do motorista"));
        motorista.setCpf(JOptionPane.showInputDialog("informe o cpf do motorista"));
        motorista.setTelefone(JOptionPane.showInputDialog("informe o do telefone do motorista"));

        //entrada de dados 
        carro.setMarca(JOptionPane.showInputDialog("informe a marca do carro"));
        carro.setModelo(JOptionPane.showInputDialog("informe o modelo do carro"));
        carro.setAno(JOptionPane.showInputDialog("informe o ano do carro"));
        carro.setCor(JOptionPane.showInputDialog("informe a cor do carro"));
        carro.setPlaca(JOptionPane.showInputDialog("informe a placa do carro"));

        carro.setProprietario(motorista);
        
        //saida de dados
        JOptionPane.showMessageDialog(
            null,
             "marca: " + carro.getMarca() +
              "\nmodelo: " + carro.getModelo() +
              "\nano: " + carro.getAno() +
              "\ncor: " + carro.getCor() +
              "\nmodelo: " + carro.getPlaca() +
              "\ndono do veiculo: " + carro.getProprietario().getNome() +
              "\ncpf do dono do veiculo: " + carro.getProprietario().getCpf() +
              "\ntelefone do dono do veiculo: " + carro.getProprietario().getTelefone()


        );

    }
}
