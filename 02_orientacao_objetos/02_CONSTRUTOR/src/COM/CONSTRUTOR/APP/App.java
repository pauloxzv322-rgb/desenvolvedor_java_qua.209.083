package COM.CONSTRUTOR.APP;

import java.util.Scanner;
import COM.CONSTRUTOR.models.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        
        //instancias
        Scanner leia = new Scanner(System.in);
        Pessoa usuario = new Pessoa("", "", "", "", 0);
        //entrada de dados
        System.out.println("informe seu nome");
        usuario.nome = leia.nextLine();
        System.out.println("informe seu cpf");
        usuario.cpf = leia.nextLine();
        System.out.println("informe seu email");
        usuario.email = leia.nextLine();
        System.out.println("informe seu telefone");
        usuario.telefone = leia.nextLine();
        System.out.println("informe sua idade");
        usuario.idade = leia.nextInt();

        //saida de dados

        System.out.println(usuario.apresentar());

        // fecha objeto leia
        leia.close();
    }
}
