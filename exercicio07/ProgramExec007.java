package exercicio07;

import java.util.Scanner;

public class ProgramExec007 {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o primeiro valor booleano (true/false):");
        boolean valor1 = leitor.nextBoolean();

        System.out.print("Digite o segundo valor booleano (true/false):");
        boolean valor2 = leitor.nextBoolean();

        
        if (valor1 && valor2) {
            System.out.print("VERDADEIRO");
        } else if (!valor1 && !valor2) {
            System.out.println("FALSO");
        } 
        else if (!valor1 && valor2) {
            System.out.println("Um é FALSO e o outro é VERDADEIRO");
        } 
        else {
            System.out.println("Um é VERDADEIRO e o outro é FALSO");
        }

        leitor.close();
    }
}
