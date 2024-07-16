package exercicio11;

import java.util.Locale;
import java.util.Scanner;

public class Avalicao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digitte o nome do Aluno: ");
        String aluno = leitor.nextLine();
        System.out.println();

        System.out.print("Digite a primeira nota: ");
        double nota1 = leitor.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = leitor.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = leitor.nextDouble();

        System.out.print("Digite a quarta nota: ");
        double nota4 = leitor.nextDouble();

        Aluno notas = new Aluno();

        double media = notas.media(nota1, nota2, nota3, nota4);
        System.out.printf("Média %.2f%n ", media);

        if (media >= 7.00) {
            System.out.println("O aluno " + aluno + " foi APROVADO");
        } else {
            System.out.println("O aluno " + aluno + " foi REPROVADO");
        }

        leitor.close();
    }
}
