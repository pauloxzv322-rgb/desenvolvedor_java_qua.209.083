package com.entrada.app;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        // declaraco de variavel
        String nome;
        String resultado;
        int idade;


        //entrada de dados
        nome = JOptionPane.showInputDialog("Informe seu nome:");
        idade = Integer.parseInt(JOptionPane.showInputDialog("informe sua idade:"));




        //verifica maioridade
        resultado = (idade >= 18)? "é maio de idade" : "é menor de idade";

        //saida de sados
        JOptionPane.showMessageDialog(null, nome + " " + resultado + ".");
    }
}
