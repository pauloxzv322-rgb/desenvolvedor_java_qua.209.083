package com.combustivel.app;

import javax.swing.JOptionPane;

import com.combustivel.models.Combustivel;

public class App {
    public static void main(String[] args) throws Exception {
        Combustivel combustivel = new Combustivel();

        //array
        String[] opcoes = {"Informar valores" , "Sair do programa"};
        Object opcao;

        do {

            //entrada de dados
            opcao = JOptionPane.showInputDialog(
                null,
                "selecione uma opcao:",
                "combustivel",
                JOptionPane.INFORMATION_MESSAGE,
                null,
                opcoes,
                opcoes[0]
                );
                
                if (opcao != "Sair do programa") {
                     combustivel.setGasolina(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da gasolina:").replace(",",".")));
                    combustivel.setEtanol(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do etanol:").replace(",",".")));
                
                    //saida de dados
                    JOptionPane.showMessageDialog(null, combustivel.calcularCombustivel());
                }
        } while(opcao != "Sair do programa");
    }
}
