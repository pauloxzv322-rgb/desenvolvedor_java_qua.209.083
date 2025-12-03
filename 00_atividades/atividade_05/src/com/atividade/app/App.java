package com.atividade.app;

import javax.swing.JOptionPane;

import com.atividade.models.Pessoa;

public class App {
    public static void main(String[] args) throws Exception { 
        // instancia as classe
        Pessoa pessoa = new Pessoa();

        // array
        int opcao;
        
        // entrada de dados
        pessoa.setNome(JOptionPane.showInputDialog("Informe seu nome:"));
        pessoa.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Informe seu peso:").replace(",",".")));
        pessoa.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura").replace(",",".")));

        // cálculo do IMC
        double imc = pessoa.calcularIMC();
        String diagnostico = pessoa.getDiagnostico();

        // saída de dados
        String mensagem = String.format(
                "Nome: %s\nPeso: %.2f kg\nAltura: %.2f m\n\nIMC: %.2f\nDiagnóstico: %s",
                pessoa.getNome(), pessoa.getPeso(), pessoa.getAltura(), imc, diagnostico
            );

            JOptionPane.showMessageDialog(null, mensagem, "Resultado do IMC", JOptionPane.INFORMATION_MESSAGE);

            // Pergunta se o usuário quer continuar
             {opcao = JOptionPane.showConfirmDialog(
                null,
                "Deseja calcular de novo?",
                "Continuar",
                JOptionPane.YES_NO_OPTION
            );

        } while (opcao == JOptionPane.YES_OPTION);

        JOptionPane.showMessageDialog(null, "Programa encerrado.", "Saída", JOptionPane.INFORMATION_MESSAGE);
    }
}
