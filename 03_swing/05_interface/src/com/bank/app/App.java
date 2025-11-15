package com.bank.app;

import javax.swing.JOptionPane;

import com.bank.models.Conta;;
public class App {
    public static void main(String[] args) throws Exception {
        Conta cc = new Conta(null, null, "12345-6", "1234-5",0.0);

        String[] opcoes = {
            "consultar dados",
            "depositar", 
            "sacar",
            "sair"
        };

        Object opcao;

        double valor;

        cc.setTitula(JOptionPane.showInputDialog("Informe o nome do titular da conta:"));
        cc.setCpf(JOptionPane.showInputDialog("Informe o cpf do titular da conta:"));

        do {
            opcao = JOptionPane.showInputDialog(
            null,
            "escolha a opcao desejada",
            null,
            JOptionPane.QUESTION_MESSAGE,
            null,
            opcoes,
            opcoes[0]
            );
            if (opcao == "consultar dados")
            {
                JOptionPane.showMessageDialog(null, cc.consultarDados());
            }
            else if (opcao == "depositar"){
                valor = Double.parseDouble(JOptionPane.showInputDialog("informe o valor do deposito em R$: ").replace("," , "."));
                JOptionPane.showMessageDialog(null, "deposito efetuado com sucesso.\nvalor do saldo/;r$ "+ String.format("%2f" , cc.depositar(valor))
                );
                valor = Double.parseDouble(JOptionPane.showInputDialog("informe o valor do saque em r$:").replace(",", ","));
                if (cc.getSaldo()>= valor){
                   JOptionPane.showMessageDialog( null,
                    "saque efetuado com sucesso"+
                    "\nvalor do saldo:r$ " + 
                    String.format("%.2f" , cc.sacar(valor))
                    );
                }
                else {
                    JOptionPane.showMessageDialog(
                        null,
                        "saldo insuficiente." +
                        "\nsaldo atual : r$" +
                        String.format("%.2f" , cc.getSaldo())
                    );
                }
            }
        } while (opcao != "sair");

    }
}
