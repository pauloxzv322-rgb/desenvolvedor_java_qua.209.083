package com.abstracao.app;

import java.util.Scanner;

import com.abstracao.models.Carro;
import com.abstracao.models.Moto;


public class App {
    public static void main(String[] args) throws Exception {
        //instancia objeto de entrada de dados
        Scanner leia = new Scanner(System.in);

        
        // instancia as classes
        Carro carro = new Carro();
        Moto moto = new Moto();

        //declaracao de variaveis
        String combustivel;

        //entrada de dados
        System.out.println("informe os dados do carro");
        System.out.println("informe o fabricante");
        carro.fabricante = leia.nextLine();
        System.out.println("informe o modelo");
        carro.modelo = leia.nextLine();
        System.out.println("informe a cor");
        carro.cor = leia.nextLine();
        System.out.println("informe o ano");
        carro.ano = leia.nextLine();
        System.out.println("informe a placa");
        carro.placa = leia.nextLine();

        //padrao de combustivel
        carro.motorFlex = false;
        carro.motorEletrico = false;
        carro.motorDiesel = false;
        carro.motorGasolina = false;
        carro.motorEtanol = false;

        //usuario informa o tipo de combustivel
        System.out.println("\ninforme o tipo de combustivel:\n");
        System.out.println("1 - Gasolina ");
        System.out.println("2 - Etanol ");
        System.out.println("3 - Tanto Gasolina como Etanol");
        System.out.println("4 - Diesel");
        System.out.println("5 - Elétrico");
        combustivel = leia.nextLine();


        switch (combustivel){
            case "1":
                carro.motorGasolina = true;
                break;
            case "2":
                carro.motorEtanol = true;
                break;
            case "3":
                carro.motorFlex = true;
                break;
            case "4":
                carro.motorDiesel = true;
                break; 
            case "5":
                carro.motorEletrico = true;
                break;
            default:
            System.out.println("Motor Inexitente.");
           

        }

        //entrada de dados da moto
        System.out.println("Informe os Dados Da Moto");
        System.out.println("Informe os Dados do Fabricante");
        moto.fabricante = leia.nextLine();
        System.out.println("Informe o Modelo");
        moto.modelo = leia.nextLine();
        System.out.println("Informe a Cor");
        moto.cor = leia.nextLine();
        System.out.println("Informe o ano");
        moto.ano = leia.nextLine();
        System.out.println("Informe a Placa");
        moto.placa = leia.nextLine();
        System.out.println();
    
        //saida de dados
        System.out.println("\nDados do Carro:\n");
        carro.exibirDados();
        System.out.println("\nDAdos da Moto:\n");
        moto.exibirDados();

        //fecha objeto objeto Leia
        leia.close();
    }
}
