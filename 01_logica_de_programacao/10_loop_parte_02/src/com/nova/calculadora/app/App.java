package com.nova.calculadora.app;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {     
        //instancia o Scanner
        Scanner leia = new Scanner(System.in);

        //declaração de variáveis
        double x;
        double y;
        double resultado = 0.0;
        int opcao = 0;
        String operacao;

        // fixme: loop
        do {

            //menu
            System.out.println("1 - soma");
            System.out.println("2 - subtraçao");
            System.out.println("3 - multiplicação");
            System.out.println("4 - divisão");
            System.out.println("5 - resto da divisão");
            System.out.println("6 - potência");
            System.out.println("7 -sair da programação");
            System.out.println("informe a opção desejada");
            operacao = leia.nextLine();

            if (operacao != "7") {
                // entrada de dados
                System.out.println("informe o valor de x");
                x= leia.nextDouble();
                System.out.println("informe o valor de y");
                y= leia.nextDouble();

                switch (operacao) {
                    case"1":
                        resultado = x+y;
                        break;
                    case"2":
                        resultado = x-y;
                        break;
                    case"3":
                        resultado = x*y;
                        break;
                    case"4":
                        resultado = x/y;
                        break;
                    case"5":
                        resultado = x%y;
                        break;
                        case"6":
                        resultado = Math.pow(x,y);
                        break;
                    default:
                        System.out.println("opcao invalido");


                }
                //mostrar o resultado
                System.out.println("resultado: " + resultado);
            }
            else {
                opcao = Integer.parseInt(operacao);
            }

            //limpeza de buffer
            leia.nextLine();

        } while(opcao != 7);


        //fecha objeto leia
        leia.close();
    }
}
