package exercicio13;

import java.util.Scanner;

public class ProgramMaiorIdade {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe o nome do usuário: ");
        String nomeUsuario = leitor.nextLine();
        

        System.out.print("Informe a idade do usuário: ");
        int idadeUsuario = leitor.nextInt();

        Pessoa usuario = new Pessoa(nomeUsuario, idadeUsuario);

        if (usuario.maiorIdade()) {
            System.err.println("Usuario: " + nomeUsuario + " é MAIOR");
        } else {
            System.err.println("Usuario: " + nomeUsuario + " é MENOR");
        }

        leitor.close();
    }
}
