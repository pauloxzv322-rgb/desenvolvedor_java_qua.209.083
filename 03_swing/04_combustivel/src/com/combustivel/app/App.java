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
                0,
                null,
                opcoes,
                opcoes[0]
                );

            
            combustivel.setGasolina(
                Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da gasolina:"
                ).replace(",",".")
                )
                );
                combustivel.setEtanol(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do etanol:")));
                
                //saida de dados
                JOptionPane.showMessageDialog(null, combustivel.calcularCombustivel());
                
                if (opcao != "Sair do programa") {
                    }
        } while (opcao != "Sair do programa");
    }
}
