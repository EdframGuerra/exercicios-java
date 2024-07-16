package exercicio10;

import java.util.Locale;
import java.util.Scanner;

public class ProgramExec010 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = leitor.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = leitor.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = leitor.nextDouble();

        Avaliacao notaFinal = new Avaliacao();

      double media=  notaFinal.media(nota1, nota2, nota3);
        System.out.printf("A média do aluno é %.2f",media);

        leitor.close();
    }
}
