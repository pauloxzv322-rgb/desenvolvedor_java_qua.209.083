package com.bank.app;

import javax.swing.JOptionPane;

import com.bank.models.Conta;;
public class App {
    public static void main(String[] args) throws Exception {
        Conta cc = new Conta(null, null, "12345-6", "1234-5",0.0);

        String[] opcoes = {
            "consultar dados",
            "depositar ", 
            "sacar",
            "sair"
        };

        Object opcao;

        cc.setTitula(JOptionPane.showInputDialog("informe o nome do titular da conta:"));
        cc.setCpf(JOptionPane.showInputDialog("informe o cpf do titular da conta:"));

        //TODO - terminar o codigo



    }
}
